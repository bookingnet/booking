/**
 * @author	bookingnet
 * @
 * @version	4.0.0
 */
package net.cbtltd.client.widget.route;

import java.util.ArrayList;

import net.cbtltd.client.Component;
import net.cbtltd.client.Components;
import net.cbtltd.client.GuardedRequest;
import net.cbtltd.client.HasComponents;
import net.cbtltd.client.field.AbstractField;
import net.cbtltd.client.field.AbstractField.Level;
import net.cbtltd.client.field.ListField;
import net.cbtltd.client.field.RouteField;
import net.cbtltd.client.field.TextField;
import net.cbtltd.client.widget.NameIdWidgetItems;
import net.cbtltd.client.widget.RazorWidget;
import net.cbtltd.client.widget.map.ProductWidgetItem;
import net.cbtltd.shared.Error;
import net.cbtltd.shared.JSONRequest;
import net.cbtltd.shared.License;
import net.cbtltd.shared.NameId;
import net.cbtltd.shared.NameIdAction;
import net.cbtltd.shared.Product;
import net.cbtltd.shared.Service;
import net.cbtltd.client.resource.Hosts;
import net.cbtltd.shared.product.WidgetProduct;

import com.bookingnet.config.RazorConfig;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.jsonp.client.JsonpRequestBuilder;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

/** The Class RouteWidget is to display travel directions from a location to a property via a widget that can be hosted by a web page. */
public class RouteWidget
extends VerticalPanel
implements ChangeHandler, HasComponents {

	private static final RouteConstants CONSTANTS = GWT.create(RouteConstants.class);
	private static final Hosts HOSTS = GWT.create(Hosts.class);
	private static final Components COMPONENTS = new Components();
	private static final Image loader = new Image(AbstractField.BUNDLE.loader());

	private static ListField productField;
	private static TextField fromtextField;
	private static RouteField routeField;
	private boolean rpc;
	private String pos;

	/* (non-Javadoc)
	 * @see net.cbtltd.client.HasComponents#addComponent(net.cbtltd.client.Component)
	 */
	public void addComponent(Component component) {COMPONENTS.add(component);}
	
	/* (non-Javadoc)
	 * @see net.cbtltd.client.HasComponents#onRefresh()
	 */
	public void onRefresh() {COMPONENTS.onRefresh();}
	
	/* (non-Javadoc)
	 * @see net.cbtltd.client.HasComponents#hasChanged()
	 */
	public boolean hasChanged() {return COMPONENTS.hasChanged();}
	
	/* (non-Javadoc)
	 * @see net.cbtltd.client.HasComponents#onReset(java.lang.String)
	 */
	public void onReset(String state) {COMPONENTS.onReset();}
	
	/* (non-Javadoc)
	 * @see com.google.gwt.event.dom.client.ClickHandler#onClick(com.google.gwt.event.dom.client.ClickEvent)
	 */
	public void onClick(ClickEvent click) {}
	
	/* (non-Javadoc)
	 * @see com.google.gwt.event.dom.client.ChangeHandler#onChange(com.google.gwt.event.dom.client.ChangeEvent)
	 */
	public void onChange(ChangeEvent change) {getRoute();}

	/* A timer to schedule periodic refreshes of the widget. */
	private final Timer refreshTimer = new Timer() {
		public void run() {getRoute();}
	};

	/**
	 * Instantiates a new route widget.
	 * If GWT RPC is used the widget must be in an iFrame in the host HTML page to prevent cross-site problems.
	 * If JSONP is used the widget JavaScript must be served from the same site as the host HTML page.
	 *
	 * @param rpc is true if GWT RPC is to be used, else JSONP is used.
	 * @param pos the point of sale code of the organization hosting the widget.
	 * @param productid the ID of the product to be priced.
	 */
	public RouteWidget(boolean rpc, String pos, String productid) {
		try {
			if (productid == null || productid.isEmpty()) {throw new RuntimeException(Error.product_id.getMessage());}
			this.rpc = rpc;
			this.pos = pos;
			this.setStylePrimaryName("RouteWidget");

			int tab = 0;
			//-----------------------------------------------
			// Product field
			//-----------------------------------------------
			productField = new ListField(this, null,
					new NameIdAction(Service.PRODUCT),
					CONSTANTS.productLabel(),
					false,
					tab++);
			productField.setFieldStyle("Field");
			productField.setLabelStyle("Label");
			productField.setAllOrganizations(true);
			productField.setIds(NameId.getCdlist(productid));
			productField.setVisible(productid.split(",").length > 1); // multiple properties
			productField.setHelpText(CONSTANTS.productHelp());
			this.add(productField);

			//-----------------------------------------------
			// From Address field
			//-----------------------------------------------
			fromtextField = new TextField(this, null,
					CONSTANTS.fromtextLabel(),
					tab++);
			fromtextField.setFieldStyle("Field");
			fromtextField.setLabelStyle("Label");
			fromtextField.setHelpText(CONSTANTS.fromtextHelp());

			loader.setVisible(false);
			final HorizontalPanel bar = new HorizontalPanel();
			bar.add(fromtextField);
			bar.add(loader);
			this.add(bar);
			
			//-----------------------------------------------
			// Route field
			//-----------------------------------------------
			routeField = new RouteField(this, null,
					CONSTANTS.directionsLabel(),
					tab++);
			routeField.setLabelStyle("Label");
			routeField.setFieldStyle("Steps");
			routeField.setFieldVisible(isStep());
			routeField.setPrintable(RazorWidget.isRpc());
			routeField.setHelpText(CONSTANTS.directionsHelp());
			this.add(routeField);
			
			this.add(RazorWidget.getHome());

			getProduct(productid);
			refreshTimer.cancel();
			refreshTimer.schedule(RazorWidget.delay);
		}
		catch (Throwable x) {
			x.printStackTrace();
			throw new RuntimeException(Error.widget_route.getMessage() + " " + x.getMessage());
		}
	}

	/* 
	 * Checks if the widget should display the steps (directions) of the route. 
	 * 
	 * @return true, if the widget should display the steps (directions) of the route.
	 */
	private boolean isStep() {
		return !RazorWidget.hasValue("step", "false");
	}
	
	/* The request callback to refresh property position. */
	private void getRoute() {
		if (rpc) {routeWidget.execute();}
		else {getJsonpProduct();}
	}

	/* The GWT RPC request callback to refresh the property position. */
	final GuardedRequest<Product> routeWidget = new GuardedRequest<Product>() {
		protected boolean error() {return productField.noValue() || fromtextField.noValue();}
		protected void send() {super.send(new WidgetProduct(productField.getValue()));}
		protected void receive(Product response) {
			if (response == null) {AbstractField.addMessage(Level.ERROR, CONSTANTS.productError(), productField);}
			else {routeField.setValue(fromtextField.getText() + " to " + AbstractField.LF.format(response.getLatitude()) + ", " + AbstractField.LF.format(response.getLongitude()));}
		}
	};

	/* The JSONP request callback to refresh the property position. */
	private void getJsonpProduct() {
		
		if (productField.noValue() || fromtextField.noValue()) {return;}

		JsonpRequestBuilder jsonp = new JsonpRequestBuilder();
		String url = HOSTS.jsonUrl()
			+ "?service=" + JSONRequest.PRODUCT 
			+ "&pos=" + pos 
			+ "&model=" + NameId.Type.Product.name()
			+ "&id=" + productField.getValue()
		;

		loader.setVisible(true);
		jsonp.requestObject(url, new AsyncCallback<ProductWidgetItem>() {

			@Override
			public void onFailure(Throwable x) {
				loader.setVisible(false);
				AbstractField.addMessage(Level.ERROR, CONSTANTS.fromtextError(), fromtextField);
			}

			@Override
			public void onSuccess(ProductWidgetItem response) {
				loader.setVisible(false);
				if (response == null) {AbstractField.addMessage(Level.ERROR, CONSTANTS.productError(), productField);}
				else {routeField.setValue("From: " + fromtextField.getText() + " to " + AbstractField.LF.format(response.getLatitude()) + ", " + AbstractField.LF.format(response.getLongitude()));}
			}
		});
	}

	/* 
	 * The request callback to get product name ID pairs.
	 * 
	 *  @param productid the ID of the selected product.
	 */
	private void getProduct(String productid) {
		if (rpc) {productField.onRefresh();}
		else {getJsonpProductNameIds(productid);}	
	}
	
	/* The JSONP request callback to get product name ID pairs. */
	private void getJsonpProductNameIds(String productid) {

		JsonpRequestBuilder jsonp = new JsonpRequestBuilder();
		String url = HOSTS.jsonUrl()
			+ "?service=" + JSONRequest.NAMEID
			+ "&pos=" + pos 
			+ "&model=" + NameId.Type.Product.name() 
			+ "&id=" + productid 
		;

		loader.setVisible(true);
		jsonp.requestObject(url, new AsyncCallback<NameIdWidgetItems>() {

			@Override
			public void onFailure(Throwable x) {
				loader.setVisible(false);
				throw new RuntimeException(Error.product_json.getMessage() + " " + x.getMessage());
			}

			@Override
			public void onSuccess(NameIdWidgetItems response) {
				loader.setVisible(false);
				if (response != null && response.getItems() != null && response.getItems().length() > 0) {
					ArrayList<NameId> items = new ArrayList<NameId>();
					for (int index = 0; index < response.getItems().length(); index++) {
						items.add(new NameId(response.getItems().get(index).getName(), response.getItems().get(index).getId()));
					}
					productField.setItems(items);
				}
			}
		});
	}
}
