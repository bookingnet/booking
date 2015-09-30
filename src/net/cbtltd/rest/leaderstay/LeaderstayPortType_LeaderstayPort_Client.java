
package net.cbtltd.rest.leaderstay;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-08-18T06:04:24.379+02:00
 * Generated source version: 2.4.0
 * 
 */
public final class LeaderstayPortType_LeaderstayPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:leaderstay", "leaderstay");

    private LeaderstayPortType_LeaderstayPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = Leaderstay.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Leaderstay ss = new Leaderstay(wsdlURL, SERVICE_NAME);
        LeaderstayPortType port = ss.getLeaderstayPort();  
        
        {
        System.out.println("Invoking getInfoAvailabilityList...");
        net.cbtltd.rest.leaderstay.Infoavailabilitylistparameters _getInfoAvailabilityList_parameters = null;
        net.cbtltd.rest.leaderstay.ReturninfoavailabilitylistT _getInfoAvailabilityList__return = port.getInfoAvailabilityList(_getInfoAvailabilityList_parameters);
        System.out.println("getInfoAvailabilityList.result=" + _getInfoAvailabilityList__return);


        }
        {
        System.out.println("Invoking cancel...");
        net.cbtltd.rest.leaderstay.Cancelparameters _cancel_parameters = null;
        net.cbtltd.rest.leaderstay.Returncancelparameters _cancel__return = port.cancel(_cancel_parameters);
        System.out.println("cancel.result=" + _cancel__return);


        }
        {
        System.out.println("Invoking reserve...");
        net.cbtltd.rest.leaderstay.Reserveparameters _reserve_parameters = null;
        net.cbtltd.rest.leaderstay.Returnreserveparameters _reserve__return = port.reserve(_reserve_parameters);
        System.out.println("reserve.result=" + _reserve__return);


        }
        {
        System.out.println("Invoking getPriceAvailability...");
        net.cbtltd.rest.leaderstay.Priceavailabilityparameters _getPriceAvailability_parameters = null;
        net.cbtltd.rest.leaderstay.Returnpriceavailability _getPriceAvailability__return = port.getPriceAvailability(_getPriceAvailability_parameters);
        System.out.println("getPriceAvailability.result=" + _getPriceAvailability__return);


        }
        {
        System.out.println("Invoking getYearAvailability...");
        net.cbtltd.rest.leaderstay.Yearavailabilityparameters _getYearAvailability_parameters = null;
        net.cbtltd.rest.leaderstay.Returnyearavailability _getYearAvailability__return = port.getYearAvailability(_getYearAvailability_parameters);
        System.out.println("getYearAvailability.result=" + _getYearAvailability__return);


        }
        {
        System.out.println("Invoking getAreaStructure...");
        net.cbtltd.rest.leaderstay.AreaStructureparameters _getAreaStructure_parameters = null;
        net.cbtltd.rest.leaderstay.AreaStructurelist _getAreaStructure__return = port.getAreaStructure(_getAreaStructure_parameters);
        System.out.println("getAreaStructure.result=" + _getAreaStructure__return);


        }
        {
        System.out.println("Invoking getPriceAvailabilityList...");
        net.cbtltd.rest.leaderstay.Priceavailabilitylistparameters _getPriceAvailabilityList_parameters = null;
        net.cbtltd.rest.leaderstay.Returnpriceavailabilitylist _getPriceAvailabilityList__return = port.getPriceAvailabilityList(_getPriceAvailabilityList_parameters);
        System.out.println("getPriceAvailabilityList.result=" + _getPriceAvailabilityList__return);


        }
        {
        System.out.println("Invoking getGlobalHash...");
        net.cbtltd.rest.leaderstay.Hashparameters _getGlobalHash_parameters = null;
        net.cbtltd.rest.leaderstay.Hashoutput _getGlobalHash__return = port.getGlobalHash(_getGlobalHash_parameters);
        System.out.println("getGlobalHash.result=" + _getGlobalHash__return);


        }
        {
        System.out.println("Invoking getPriceAvailabilityList2...");
        net.cbtltd.rest.leaderstay.Priceavailabilitylistparameters2 _getPriceAvailabilityList2_parameters = null;
        net.cbtltd.rest.leaderstay.Returnpriceavailabilitylist _getPriceAvailabilityList2__return = port.getPriceAvailabilityList2(_getPriceAvailabilityList2_parameters);
        System.out.println("getPriceAvailabilityList2.result=" + _getPriceAvailabilityList2__return);


        }
        {
        System.out.println("Invoking getPriceCatalogue...");
        net.cbtltd.rest.leaderstay.Pricecatalogueparameters _getPriceCatalogue_parameters = null;
        net.cbtltd.rest.leaderstay.ReturnpricecatalogueList _getPriceCatalogue__return = port.getPriceCatalogue(_getPriceCatalogue_parameters);
        System.out.println("getPriceCatalogue.result=" + _getPriceCatalogue__return);


        }
        {
        System.out.println("Invoking amend...");
        net.cbtltd.rest.leaderstay.Amendparameters _amend_parameters = null;
        net.cbtltd.rest.leaderstay.Returnamendparameters _amend__return = port.amend(_amend_parameters);
        System.out.println("amend.result=" + _amend__return);


        }
        {
        System.out.println("Invoking getAvailableInfo...");
        net.cbtltd.rest.leaderstay.Infoparameters _getAvailableInfo_parameters = null;
        net.cbtltd.rest.leaderstay.ReturnpropertiesInfoList _getAvailableInfo__return = port.getAvailableInfo(_getAvailableInfo_parameters);
        System.out.println("getAvailableInfo.result=" + _getAvailableInfo__return);


        }

        System.exit(0);
    }

}
