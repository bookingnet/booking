
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package net.cbtltd.rest.interhome;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-08-09T13:20:11.683+02:00
 * Generated source version: 2.4.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "WebService",
                      portName = "WebServiceSoap12",
                      targetNamespace = "http://www.interhome.com/webservice",
//                              wsdlLocation = "file:/C:/wsdl/interhome_test.wsdl",
                      wsdlLocation = "file:/C:/wsdl/interhome_live.wsdl",
                      endpointInterface = "net.cbtltd.rest.interhome.WebServiceSoap")
                      
public class WebServiceSoapImpl implements WebServiceSoap {

    private static final Logger LOG = Logger.getLogger(WebServiceSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#checkServerHealthV2(java.lang.String  type )*
     */
    public net.cbtltd.rest.interhome.CheckServerHealthResultV2 checkServerHealthV2(java.lang.String type) { 
        LOG.info("Executing operation checkServerHealthV2");
        System.out.println(type);
        try {
            net.cbtltd.rest.interhome.CheckServerHealthResultV2 _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#cancelBooking(net.cbtltd.rest.interhome.CancelBookingInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.CancelBookingReturnValue cancelBooking(net.cbtltd.rest.interhome.CancelBookingInputValue inputValue) { 
        LOG.info("Executing operation cancelBooking");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.CancelBookingReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#paymentExtInformation(net.cbtltd.rest.interhome.PaymentInformationInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.PaymentInformationReturnValue paymentExtInformation(net.cbtltd.rest.interhome.PaymentInformationInputValue inputValue) { 
        LOG.info("Executing operation paymentExtInformation");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.PaymentInformationReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#prices(net.cbtltd.rest.interhome.PricesInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.PricesRetunValue prices(net.cbtltd.rest.interhome.PricesInputValue inputValue) { 
        LOG.info("Executing operation prices");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.PricesRetunValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#newsletter(net.cbtltd.rest.interhome.NewsletterInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.NewsletterReturnValue newsletter(net.cbtltd.rest.interhome.NewsletterInputValue inputValue) { 
        LOG.info("Executing operation newsletter");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.NewsletterReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#checkBooking(net.cbtltd.rest.interhome.CheckBookingInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.CheckBookingReturnValue checkBooking(net.cbtltd.rest.interhome.CheckBookingInputValue inputValue) { 
        LOG.info("Executing operation checkBooking");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.CheckBookingReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#retailerBooking(net.cbtltd.rest.interhome.RetailerBookingInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.RetailerBookingReturnValue retailerBooking(net.cbtltd.rest.interhome.RetailerBookingInputValue inputValue) { 
        LOG.info("Executing operation retailerBooking");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.RetailerBookingReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#nearestBookingDate(net.cbtltd.rest.interhome.NearestBookingDateInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.NearestBookingDateReturnValue nearestBookingDate(net.cbtltd.rest.interhome.NearestBookingDateInputValue inputValue) { 
        LOG.info("Executing operation nearestBookingDate");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.NearestBookingDateReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#checkServerHealth(*
     */
    public net.cbtltd.rest.interhome.CheckServerHealthResult checkServerHealth() { 
        LOG.info("Executing operation checkServerHealth");
        try {
            net.cbtltd.rest.interhome.CheckServerHealthResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#search(net.cbtltd.rest.interhome.SearchInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.SearchReturnValue search(net.cbtltd.rest.interhome.SearchInputValue inputValue) { 
        LOG.info("Executing operation search");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.SearchReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#priceDetail(net.cbtltd.rest.interhome.PriceDetailInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.PriceDetailRetunValue priceDetail(net.cbtltd.rest.interhome.PriceDetailInputValue inputValue) { 
        LOG.info("Executing operation priceDetail");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.PriceDetailRetunValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#availability(net.cbtltd.rest.interhome.AvailabilityInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.AvailabilityRetunValue availability(net.cbtltd.rest.interhome.AvailabilityInputValue inputValue) { 
        LOG.info("Executing operation availability");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.AvailabilityRetunValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#accommodationDetail(net.cbtltd.rest.interhome.AccommodationDetailInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.AccommodationDetailReturnValue accommodationDetail(net.cbtltd.rest.interhome.AccommodationDetailInputValue inputValue) { 
        LOG.info("Executing operation accommodationDetail");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.AccommodationDetailReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#readBooking(net.cbtltd.rest.interhome.ReadBookingInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.ReadBookingReturnValue readBooking(net.cbtltd.rest.interhome.ReadBookingInputValue inputValue) { 
        LOG.info("Executing operation readBooking");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.ReadBookingReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#cancellationConditions(net.cbtltd.rest.interhome.CancellationConditionInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.CancellationConditionReturnValue cancellationConditions(net.cbtltd.rest.interhome.CancellationConditionInputValue inputValue) { 
        LOG.info("Executing operation cancellationConditions");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.CancellationConditionReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#ratifyBooking(net.cbtltd.rest.interhome.RatifyBookingInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.RatifyBookingReturnValue ratifyBooking(net.cbtltd.rest.interhome.RatifyBookingInputValue inputValue) { 
        LOG.info("Executing operation ratifyBooking");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.RatifyBookingReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#clientBooking(net.cbtltd.rest.interhome.ClientBookingInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.ClientBookingReturnValue clientBooking(net.cbtltd.rest.interhome.ClientBookingInputValue inputValue) { 
        LOG.info("Executing operation clientBooking");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.ClientBookingReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#additionalServices(net.cbtltd.rest.interhome.AdditionalServicesInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.AdditionalServicesReturnValue additionalServices(net.cbtltd.rest.interhome.AdditionalServicesInputValue inputValue) { 
        LOG.info("Executing operation additionalServices");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.AdditionalServicesReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#priceList(net.cbtltd.rest.interhome.PriceListInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.PriceListReturnValue priceList(net.cbtltd.rest.interhome.PriceListInputValue inputValue) { 
        LOG.info("Executing operation priceList");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.PriceListReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#trips(net.cbtltd.rest.interhome.TripsInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.TripsReturnValue trips(net.cbtltd.rest.interhome.TripsInputValue inputValue) { 
        LOG.info("Executing operation trips");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.TripsReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#voucherDetail(net.cbtltd.rest.interhome.VoucherDetailInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.VoucherDetailReturnValue voucherDetail(net.cbtltd.rest.interhome.VoucherDetailInputValue inputValue) { 
        LOG.info("Executing operation voucherDetail");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.VoucherDetailReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.cbtltd.rest.interhome.WebServiceSoap#affiliateDetail(net.cbtltd.rest.interhome.AffiliateDetailInputValue  inputValue )*
     */
    public net.cbtltd.rest.interhome.AffiliateDetailReturnValue affiliateDetail(net.cbtltd.rest.interhome.AffiliateDetailInputValue inputValue) { 
        LOG.info("Executing operation affiliateDetail");
        System.out.println(inputValue);
        try {
            net.cbtltd.rest.interhome.AffiliateDetailReturnValue _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
