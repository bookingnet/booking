
/*
 * 
 */

package net.cbtltd.rest.interhome;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-08-09T13:20:11.772+02:00
 * Generated source version: 2.4.0
 * 
 */


@WebServiceClient(name = "WebService", 
//				wsdlLocation = "file:/C:/wsdl/interhome_test.wsdl",
				wsdlLocation = "file:/C:/wsdl/interhome_live.wsdl",
                  targetNamespace = "http://www.interhome.com/webservice") 
public class WebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.interhome.com/webservice", "WebService");
    public final static QName WebServiceSoap12 = new QName("http://www.interhome.com/webservice", "WebServiceSoap12");
    public final static QName WebServiceSoap = new QName("http://www.interhome.com/webservice", "WebServiceSoap");
    static {
        URL url = null;
        try {
//            url = new URL("file:/C:/wsdl/interhome_test.wsdl");
            url = new URL("file:/C:/wsdl/interhome_live.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WebService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/wsdl/interhome_live.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap12")
    public WebServiceSoap getWebServiceSoap12() {
        return super.getPort(WebServiceSoap12, WebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap12")
    public WebServiceSoap getWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(WebServiceSoap12, WebServiceSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap")
    public WebServiceSoap getWebServiceSoap() {
        return super.getPort(WebServiceSoap, WebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap")
    public WebServiceSoap getWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(WebServiceSoap, WebServiceSoap.class, features);
    }

}
