/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.reservation;

import java.util.Date;

public class WidgetQuote extends ReservationPrice {

	public WidgetQuote() {}
	
	public WidgetQuote(String productid, Date fromdate, Date todate, String currency) {
		setProductid(productid);
		setFromdate(fromdate);
		setTodate(todate);
		setCurrency(currency);
	}
}
