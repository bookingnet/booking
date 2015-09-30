
package net.cbtltd.rest.ciirus.ciirusxml.com.ciirus.xml;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.net.URL;

import javax.xml.namespace.QName;

import net.cbtltd.rest.ciirus.CiirusServiceHolder;
import net.cbtltd.rest.ciirus.ciirusxmladditionalfunctions1.com.ciirus.xml.ArrayOfReservation;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-10-08T11:13:41.239+02:00
 * Generated source version: 2.4.0
 * 
 */
public final class Test {

    private static final QName SERVICE_NAME = new QName("http://xml.ciirus.com/", "CiirusXML");
	//private static CiirusServiceHolder ciirusServiceHolder = new CiirusServiceHolder();
    private Test() {
    }

    private static CiirusXMLSoap getPort() {
    	URL wsdlURL = CiirusXML.CIIRUSXML_WSDL_LOCATION;
    	CiirusXML ss = new CiirusXML(wsdlURL, SERVICE_NAME);
    	CiirusXMLSoap port = ss.getCiirusXMLSoap(); 
    	return port;
    }

    public static void main(String args[]) throws Exception {
//        URL wsdlURL = CiirusXML.WSDL_LOCATION;
//        if (args.length > 0) { 
//            File wsdlFile = new File(args[0]);
//            try {
//                if (wsdlFile.exists()) {
//                    wsdlURL = wsdlFile.toURI().toURL();
//                } else {
//                    wsdlURL = new URL(args[0]);
//                }
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//        }
//      
//        CiirusXML ss = new CiirusXML(wsdlURL, SERVICE_NAME);
//        CiirusXMLSoap port = ss.getCiirusXMLSoap();  
    	CiirusXMLSoap port = getPort();
        String username = "EricMason";
        String password = "YiPL46Rfi";
        
        if(true){
        	System.out.println("Invoking getAllReservations...");
        	//ArrayOfReservation bookings = ciirusServiceHolder.getAllReservations(username, password);
        	//System.out.print("getAllReservations..."+ bookings);
        }
        if(true){
        	
        }
        if (true) {
        System.out.println("Invoking getCommunities...");
      //  ArrayOfCommunities rs = ciirusServiceHolder.getCommunities(username, password);
       // System.out.println("getCommunities.result=" + rs);
        }
        if (false) {
        System.out.println("Invoking getPropertyTypes...");
        ArrayOfPropertyTypes rs = port.getPropertyTypes(username, password);
        System.out.println("getPropertyTypes.result=" + rs);
        }
        if (false) {
        System.out.println("Invoking getManagementCompanyList...");
        ArrayOfManagementCompanies rs = port.getManagementCompanyList(username, password);
        System.out.println("getManagementCompanyList.result=" + rs);
        }
        if (true) {
        System.out.println("Invoking getReservations...");
        ArrayOfReservations rs = port.getReservations(username, password, 33674);
        System.out.println("getReservations.result=" + rs);
        }
        if (true) {
        System.out.println("Invoking getPropertyClasses...");
         ArrayOfPropertyClasses rs = port.getPropertyClasses(username, password);
        System.out.println("getPropertyClasses.result=" + rs);
        }
        if (false) {
        System.out.println("Invoking isPropertyAvailable...");
        int propertyID = 33698;
        String arrivalDate = "22 Oct 2012";
        String departureDate = "28 Oct 2012";
        boolean rs = port.isPropertyAvailable(username, password, propertyID, arrivalDate, departureDate);
        System.out.println("isPropertyAvailable.result=" + rs);
        }
        if (false) {
        System.out.println("Invoking getPropertyRates...");
        int propertyID = 0;
        ArrayOfRate rs = port.getPropertyRates(username, password, propertyID);
        System.out.println("getPropertyRates.result=" + rs);
        }
        if (false) {
        System.out.println("Invoking getImageList...");
        ArrayOfString rs = port.getImageList(username, password, 33698);
        System.out.println("getImageList.result=" + rs);
        }
        if (false) {
        System.out.println("Invoking getDescriptions...");
        int propertyID = 33698;
        String rs = port.getDescriptions(username, password, propertyID);
        System.out.println("getDescriptions.result=" + rs);
        }
        if (false) {
        System.out.println("Invoking makeBooking...");
        SBookingDetails rq = new SBookingDetails();
//        rq.setArrivalDate(value);
//        rq.setDepartureDate(value);
//        rq.setGuestAddress(value);
//        rq.setGuestEmailAddress(value);
//        rq.setGuestList(value);
//        rq.setGuestTelephone(value);
//        rq.setPoolHeatRequired(value);
//        rq.setPropertyID(value);
        SBookingResult rs = port.makeBooking(username, password, rq);
        System.out.println("makeBooking.result=" + rs);
        }
        if (false) {
//		FO.Bedrooms = 4 �4 bedroom properties only
//		FO.CommunityID = 0 �Any community
//		FO.HasGamesRoom = 1 �Must have games room
//		FO.HasPool = 1 �Must have pool
//		FO.HasSpa = -1 �Either without without Spa
//		FO.IsGasFree = False
//		FO.PropertyClass = 0 �Any property class
//		FO.PropertyType = 0 �Any property type
//		FO.Sleeps = 8 �Property must be able to sleep at least 8 guests

        System.out.println("Invoking getProperties...");
        String arriveDate = null;
        String departDate = null;

        StrucSearchFilterOptions filterOptions = new StrucSearchFilterOptions();
        filterOptions.setBedrooms(0);
        filterOptions.setCommunalGym(2);
        filterOptions.setCommunityID(0);
        filterOptions.setHasGamesRoom(2);
        filterOptions.setConservationView(2);
        filterOptions.setHasPool(2);
        filterOptions.setHasSpa(2);
        filterOptions.setIsGasFree(false);
        filterOptions.setLakeView(2);
        filterOptions.setManagementCompanyID(0);
        filterOptions.setOnGolfCourse(2);
        filterOptions.setPetsAllowed(2);
        filterOptions.setPrivacyFence(2);
        filterOptions.setPropertyClass(0);
        filterOptions.setPropertyType(0);
        filterOptions.setSleeps(0);
        filterOptions.setSouthFacingPool(2);
        filterOptions.setWaterView(2);
        filterOptions.setWiFi(2);

        StrucSearchOptions searchOptions = new StrucSearchOptions();
        searchOptions.setReturnFullDetails(false);
        searchOptions.setReturnQuote(false);
        searchOptions.setIncludePoolHeatInQuote(false);
        searchOptions.setReturnTopX(10);

        ArrayOfPropertyDetails rs = port.getProperties(username, password, arriveDate, departDate, filterOptions, searchOptions);
        System.out.println("getProperties.result=" + rs);
        }

        System.exit(0);
    }

}
