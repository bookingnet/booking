
package net.cbtltd.rest.maxxton;

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
 * 2014-12-01T12:16:43.092+01:00
 * Generated source version: 2.4.0
 * 
 */
public final class NewyseWebService_NewyseWebServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.newyse.ws.services.newyse.maxxton/", "NewyseWebService");

    private NewyseWebService_NewyseWebServicePort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = NewyseWebService_Service.WSDL_LOCATION;
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
      
        NewyseWebService_Service ss = new NewyseWebService_Service(wsdlURL, SERVICE_NAME);
        NewyseWebService port = ss.getNewyseWebServicePort();  
        
        {
        System.out.println("Invoking getWorkOrderAreas...");
        java.lang.String _getWorkOrderAreas_sessionKey = "";
        net.cbtltd.rest.maxxton.WorkOrderAreaCriteria _getWorkOrderAreas_criteria = null;
        try {
            net.cbtltd.rest.maxxton.WorkOrderAreaContainer _getWorkOrderAreas__return = port.getWorkOrderAreas(_getWorkOrderAreas_sessionKey, _getWorkOrderAreas_criteria);
            System.out.println("getWorkOrderAreas.result=" + _getWorkOrderAreas__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getCustomerTitles...");
        java.lang.String _getCustomerTitles_sessionKey = "";
        net.cbtltd.rest.maxxton.CustomerTitleCriteria _getCustomerTitles_criteria = null;
        try {
            net.cbtltd.rest.maxxton.CustomerTitleContainer _getCustomerTitles__return = port.getCustomerTitles(_getCustomerTitles_sessionKey, _getCustomerTitles_criteria);
            System.out.println("getCustomerTitles.result=" + _getCustomerTitles__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getWorkOrderCategories...");
        java.lang.String _getWorkOrderCategories_sessionKey = "";
        net.cbtltd.rest.maxxton.WorkOrderCategoryCriteria _getWorkOrderCategories_criteria = null;
        try {
            net.cbtltd.rest.maxxton.WorkOrderCategoryContainer _getWorkOrderCategories__return = port.getWorkOrderCategories(_getWorkOrderCategories_sessionKey, _getWorkOrderCategories_criteria);
            System.out.println("getWorkOrderCategories.result=" + _getWorkOrderCategories__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAccommodationTypes...");
        java.lang.String _getAccommodationTypes_sessionKey = "";
        net.cbtltd.rest.maxxton.AccommodationTypeCriteria _getAccommodationTypes_criteria = null;
        try {
            net.cbtltd.rest.maxxton.AccommodationTypeContainer _getAccommodationTypes__return = port.getAccommodationTypes(_getAccommodationTypes_sessionKey, _getAccommodationTypes_criteria);
            System.out.println("getAccommodationTypes.result=" + _getAccommodationTypes__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking confirmReservation...");
        java.lang.String _confirmReservation_sessionKey = "";
        net.cbtltd.rest.maxxton.ReservationCriteria _confirmReservation_criteria = null;
        try {
            net.cbtltd.rest.maxxton.Reservation _confirmReservation__return = port.confirmReservation(_confirmReservation_sessionKey, _confirmReservation_criteria);
            System.out.println("confirmReservation.result=" + _confirmReservation__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getResorts...");
        java.lang.String _getResorts_sessionKey = "";
        net.cbtltd.rest.maxxton.ResortCriteria _getResorts_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ResortContainer _getResorts__return = port.getResorts(_getResorts_sessionKey, _getResorts_criteria);
            System.out.println("getResorts.result=" + _getResorts__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getWorkOrderItems...");
        java.lang.String _getWorkOrderItems_sessionKey = "";
        net.cbtltd.rest.maxxton.WorkOrderItemCriteria _getWorkOrderItems_criteria = null;
        try {
            net.cbtltd.rest.maxxton.WorkOrderItemContainer _getWorkOrderItems__return = port.getWorkOrderItems(_getWorkOrderItems_sessionKey, _getWorkOrderItems_criteria);
            System.out.println("getWorkOrderItems.result=" + _getWorkOrderItems__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createReservationProposal...");
        java.lang.String _createReservationProposal_sessionKey = "";
        net.cbtltd.rest.maxxton.ReservationCriteria _createReservationProposal_criteria = null;
        try {
            net.cbtltd.rest.maxxton.Reservation _createReservationProposal__return = port.createReservationProposal(_createReservationProposal_sessionKey, _createReservationProposal_criteria);
            System.out.println("createReservationProposal.result=" + _createReservationProposal__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDebitCardItems...");
        java.lang.String _getDebitCardItems_sessionKey = "";
        net.cbtltd.rest.maxxton.DebitCardItemCriteria _getDebitCardItems_criteria = null;
        try {
            net.cbtltd.rest.maxxton.DebitCardItemContainer _getDebitCardItems__return = port.getDebitCardItems(_getDebitCardItems_sessionKey, _getDebitCardItems_criteria);
            System.out.println("getDebitCardItems.result=" + _getDebitCardItems__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getObjects...");
        java.lang.String _getObjects_sessionKey = "";
        net.cbtltd.rest.maxxton.ObjectCriteria _getObjects_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ObjectContainer _getObjects__return = port.getObjects(_getObjects_sessionKey, _getObjects_criteria);
            System.out.println("getObjects.result=" + _getObjects__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getResourceCapacity...");
        java.lang.String _getResourceCapacity_sessionKey = "";
        net.cbtltd.rest.maxxton.ResourceCapacityCriteria _getResourceCapacity_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ResourceCapacityContainer _getResourceCapacity__return = port.getResourceCapacity(_getResourceCapacity_sessionKey, _getResourceCapacity_criteria);
            System.out.println("getResourceCapacity.result=" + _getResourceCapacity__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getObjectAvailability...");
        java.lang.String _getObjectAvailability_sessionKey = "";
        net.cbtltd.rest.maxxton.ObjectAvailabilityCriteria _getObjectAvailability_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ObjectAvailabilityContainer _getObjectAvailability__return = port.getObjectAvailability(_getObjectAvailability_sessionKey, _getObjectAvailability_criteria);
            System.out.println("getObjectAvailability.result=" + _getObjectAvailability__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getBrochures...");
        java.lang.String _getBrochures_sessionKey = "";
        net.cbtltd.rest.maxxton.BrochureCriteria _getBrochures_criteria = null;
        try {
            net.cbtltd.rest.maxxton.BrochureContainer _getBrochures__return = port.getBrochures(_getBrochures_sessionKey, _getBrochures_criteria);
            System.out.println("getBrochures.result=" + _getBrochures__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createWorkOrder...");
        java.lang.String _createWorkOrder_sessionKey = "";
        net.cbtltd.rest.maxxton.WorkOrder _createWorkOrder_workOrder = null;
        try {
            net.cbtltd.rest.maxxton.WorkOrder _createWorkOrder__return = port.createWorkOrder(_createWorkOrder_sessionKey, _createWorkOrder_workOrder);
            System.out.println("createWorkOrder.result=" + _createWorkOrder__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking updateDebitCardItems...");
        java.lang.String _updateDebitCardItems_sessionKey = "";
        net.cbtltd.rest.maxxton.DebitCardTransactionContainer _updateDebitCardItems_debitCardTransactionContainer = null;
        try {
            port.updateDebitCardItems(_updateDebitCardItems_sessionKey, _updateDebitCardItems_debitCardTransactionContainer);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getReservationSubjects...");
        java.lang.String _getReservationSubjects_sessionKey = "";
        net.cbtltd.rest.maxxton.ReservationSubjectCriteria _getReservationSubjects_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ReservationSubjectContainer _getReservationSubjects__return = port.getReservationSubjects(_getReservationSubjects_sessionKey, _getReservationSubjects_criteria);
            System.out.println("getReservationSubjects.result=" + _getReservationSubjects__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDebitCardCustomersInfo...");
        java.lang.String _getDebitCardCustomersInfo_sessionKey = "";
        java.lang.String _getDebitCardCustomersInfo_debitCardNumber = "";
        try {
            net.cbtltd.rest.maxxton.DebitCardCustomerInfoContainer _getDebitCardCustomersInfo__return = port.getDebitCardCustomersInfo(_getDebitCardCustomersInfo_sessionKey, _getDebitCardCustomersInfo_debitCardNumber);
            System.out.println("getDebitCardCustomersInfo.result=" + _getDebitCardCustomersInfo__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking findAccommodationTypes...");
        java.lang.String _findAccommodationTypes_sessionKey = "";
        net.cbtltd.rest.maxxton.AccommodationTypeSearchCriteria _findAccommodationTypes_criteria = null;
        try {
            net.cbtltd.rest.maxxton.AccommodationTypeSearchContainer _findAccommodationTypes__return = port.findAccommodationTypes(_findAccommodationTypes_sessionKey, _findAccommodationTypes_criteria);
            System.out.println("findAccommodationTypes.result=" + _findAccommodationTypes__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking addResource...");
        java.lang.String _addResource_sessionKey = "";
        long _addResource_reservationId = 0;
        net.cbtltd.rest.maxxton.ResourceCriteria _addResource_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ReservedResourceContainer _addResource__return = port.addResource(_addResource_sessionKey, _addResource_reservationId, _addResource_criteria);
            System.out.println("addResource.result=" + _addResource__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking declineReservation...");
        java.lang.String _declineReservation_sessionKey = "";
        net.cbtltd.rest.maxxton.GetReservation _declineReservation_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ReservationContainer _declineReservation__return = port.declineReservation(_declineReservation_sessionKey, _declineReservation_criteria);
            System.out.println("declineReservation.result=" + _declineReservation__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getReservation...");
        java.lang.String _getReservation_sessionKey = "";
        net.cbtltd.rest.maxxton.GetReservation _getReservation_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ReservationContainer _getReservation__return = port.getReservation(_getReservation_sessionKey, _getReservation_criteria);
            System.out.println("getReservation.result=" + _getReservation__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getCountries...");
        java.lang.String _getCountries_sessionKey = "";
        try {
            net.cbtltd.rest.maxxton.CountryContainer _getCountries__return = port.getCountries(_getCountries_sessionKey);
            System.out.println("getCountries.result=" + _getCountries__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getKCActiveDoorlockPincodes...");
        java.lang.String _getKCActiveDoorlockPincodes_sessionKey = "";
        javax.xml.datatype.XMLGregorianCalendar _getKCActiveDoorlockPincodes_startDate = null;
        javax.xml.datatype.XMLGregorianCalendar _getKCActiveDoorlockPincodes_endDate = null;
        java.lang.String _getKCActiveDoorlockPincodes_resortCode = "";
        try {
            net.cbtltd.rest.maxxton.KCPincodes _getKCActiveDoorlockPincodes__return = port.getKCActiveDoorlockPincodes(_getKCActiveDoorlockPincodes_sessionKey, _getKCActiveDoorlockPincodes_startDate, _getKCActiveDoorlockPincodes_endDate, _getKCActiveDoorlockPincodes_resortCode);
            System.out.println("getKCActiveDoorlockPincodes.result=" + _getKCActiveDoorlockPincodes__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getProperties...");
        java.lang.String _getProperties_sessionKey = "";
        net.cbtltd.rest.maxxton.PropertyCriteria _getProperties_criteria = null;
        try {
            net.cbtltd.rest.maxxton.PropertyContainer _getProperties__return = port.getProperties(_getProperties_sessionKey, _getProperties_criteria);
            System.out.println("getProperties.result=" + _getProperties__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking generateVouchers...");
        java.lang.String _generateVouchers_sessionKey = "";
        net.cbtltd.rest.maxxton.VoucherCriteria _generateVouchers_criteria = null;
        try {
            net.cbtltd.rest.maxxton.VoucherContainer _generateVouchers__return = port.generateVouchers(_generateVouchers_sessionKey, _generateVouchers_criteria);
            System.out.println("generateVouchers.result=" + _generateVouchers__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDebitCardCustomers...");
        java.lang.String _getDebitCardCustomers_sessionKey = "";
        java.lang.String _getDebitCardCustomers_debitCardNumber = "";
        try {
            net.cbtltd.rest.maxxton.DebitCardCustomerContainer _getDebitCardCustomers__return = port.getDebitCardCustomers(_getDebitCardCustomers_sessionKey, _getDebitCardCustomers_debitCardNumber);
            System.out.println("getDebitCardCustomers.result=" + _getDebitCardCustomers__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking registerPayment...");
        java.lang.String _registerPayment_sessionKey = "";
        net.cbtltd.rest.maxxton.PaymentCriteria _registerPayment_criteria = null;
        try {
            net.cbtltd.rest.maxxton.Payment _registerPayment__return = port.registerPayment(_registerPayment_sessionKey, _registerPayment_criteria);
            System.out.println("registerPayment.result=" + _registerPayment__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getResourceAdditions...");
        java.lang.String _getResourceAdditions_sessionKey = "";
        net.cbtltd.rest.maxxton.ResourceAdditionCriteria _getResourceAdditions_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ResourceAdditionContainer _getResourceAdditions__return = port.getResourceAdditions(_getResourceAdditions_sessionKey, _getResourceAdditions_criteria);
            System.out.println("getResourceAdditions.result=" + _getResourceAdditions__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getSubjects...");
        java.lang.String _getSubjects_sessionKey = "";
        net.cbtltd.rest.maxxton.SubjectCriteria _getSubjects_criteria = null;
        try {
            net.cbtltd.rest.maxxton.SubjectContainer _getSubjects__return = port.getSubjects(_getSubjects_sessionKey, _getSubjects_criteria);
            System.out.println("getSubjects.result=" + _getSubjects__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getSources...");
        java.lang.String _getSources_sessionKey = "";
        net.cbtltd.rest.maxxton.SourceCriteria _getSources_criteria = null;
        try {
            net.cbtltd.rest.maxxton.SourceContainer _getSources__return = port.getSources(_getSources_sessionKey, _getSources_criteria);
            System.out.println("getSources.result=" + _getSources__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking updateCustomer...");
        java.lang.String _updateCustomer_sessionKey = "";
        net.cbtltd.rest.maxxton.Customer _updateCustomer_customer = null;
        try {
            port.updateCustomer(_updateCustomer_sessionKey, _updateCustomer_customer);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking requestBrochures...");
        java.lang.String _requestBrochures_sessionKey = "";
        net.cbtltd.rest.maxxton.BrochureRequest _requestBrochures_brochureRequest = null;
        try {
            port.requestBrochures(_requestBrochures_sessionKey, _requestBrochures_brochureRequest);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getImages...");
        java.lang.String _getImages_sessionKey = "";
        net.cbtltd.rest.maxxton.ImageCriteria _getImages_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ImageContainer _getImages__return = port.getImages(_getImages_sessionKey, _getImages_criteria);
            System.out.println("getImages.result=" + _getImages__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAddress...");
        java.lang.String _getAddress_sessionKey = "";
        net.cbtltd.rest.maxxton.AddressCriteria _getAddress_criteria = null;
        try {
            net.cbtltd.rest.maxxton.Address _getAddress__return = port.getAddress(_getAddress_sessionKey, _getAddress_criteria);
            System.out.println("getAddress.result=" + _getAddress__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAccommodationKinds...");
        java.lang.String _getAccommodationKinds_sessionKey = "";
        net.cbtltd.rest.maxxton.AccommodationKindCriteria _getAccommodationKinds_criteria = null;
        try {
            net.cbtltd.rest.maxxton.AccommodationKindContainer _getAccommodationKinds__return = port.getAccommodationKinds(_getAccommodationKinds_sessionKey, _getAccommodationKinds_criteria);
            System.out.println("getAccommodationKinds.result=" + _getAccommodationKinds__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getResourceAvailability...");
        java.lang.String _getResourceAvailability_sessionKey = "";
        net.cbtltd.rest.maxxton.AvailabilityCriteria _getResourceAvailability_criteria = null;
        try {
            net.cbtltd.rest.maxxton.AvailabilityContainer _getResourceAvailability__return = port.getResourceAvailability(_getResourceAvailability_sessionKey, _getResourceAvailability_criteria);
            System.out.println("getResourceAvailability.result=" + _getResourceAvailability__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking updateReservation...");
        java.lang.String _updateReservation_sessionKey = "";
        net.cbtltd.rest.maxxton.UpdateReservationCriteria _updateReservation_criteria = null;
        try {
            port.updateReservation(_updateReservation_sessionKey, _updateReservation_criteria);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getKCDoorlockPincodes...");
        java.lang.String _getKCDoorlockPincodes_sessionKey = "";
        javax.xml.datatype.XMLGregorianCalendar _getKCDoorlockPincodes_startDate = null;
        javax.xml.datatype.XMLGregorianCalendar _getKCDoorlockPincodes_endDate = null;
        java.lang.String _getKCDoorlockPincodes_resortCode = "";
        java.lang.String _getKCDoorlockPincodes_lockCode = "";
        try {
            net.cbtltd.rest.maxxton.KCPincodes _getKCDoorlockPincodes__return = port.getKCDoorlockPincodes(_getKCDoorlockPincodes_sessionKey, _getKCDoorlockPincodes_startDate, _getKCDoorlockPincodes_endDate, _getKCDoorlockPincodes_resortCode, _getKCDoorlockPincodes_lockCode);
            System.out.println("getKCDoorlockPincodes.result=" + _getKCDoorlockPincodes__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking destroySession...");
        java.lang.String _destroySession_sessionKey = "";
        try {
            port.destroySession(_destroySession_sessionKey);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking cancelReservation...");
        java.lang.String _cancelReservation_sessionKey = "";
        net.cbtltd.rest.maxxton.GetReservation _cancelReservation_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ReservationContainer _cancelReservation__return = port.cancelReservation(_cancelReservation_sessionKey, _cancelReservation_criteria);
            System.out.println("cancelReservation.result=" + _cancelReservation__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getInfo...");
        try {
            java.lang.String _getInfo__return = port.getInfo();
            System.out.println("getInfo.result=" + _getInfo__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createCustomer...");
        java.lang.String _createCustomer_sessionKey = "";
        net.cbtltd.rest.maxxton.Customer _createCustomer_customer = null;
        try {
            net.cbtltd.rest.maxxton.Customer _createCustomer__return = port.createCustomer(_createCustomer_sessionKey, _createCustomer_customer);
            System.out.println("createCustomer.result=" + _createCustomer__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getTipTripCategories...");
        java.lang.String _getTipTripCategories_sessionKey = "";
        net.cbtltd.rest.maxxton.TipTripCriteria _getTipTripCategories_criteria = null;
        try {
            net.cbtltd.rest.maxxton.TipTripCategoryContainer _getTipTripCategories__return = port.getTipTripCategories(_getTipTripCategories_sessionKey, _getTipTripCategories_criteria);
            System.out.println("getTipTripCategories.result=" + _getTipTripCategories__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getFacilities...");
        java.lang.String _getFacilities_sessionKey = "";
        net.cbtltd.rest.maxxton.FacilityCriteria _getFacilities_criteria = null;
        try {
            net.cbtltd.rest.maxxton.FacilityContainer _getFacilities__return = port.getFacilities(_getFacilities_sessionKey, _getFacilities_criteria);
            System.out.println("getFacilities.result=" + _getFacilities__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getReservedResources...");
        java.lang.String _getReservedResources_sessionKey = "";
        net.cbtltd.rest.maxxton.ReservedResourceCriteria _getReservedResources_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ReservedResourceContainer _getReservedResources__return = port.getReservedResources(_getReservedResources_sessionKey, _getReservedResources_criteria);
            System.out.println("getReservedResources.result=" + _getReservedResources__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getResortActivities...");
        java.lang.String _getResortActivities_sessionKey = "";
        net.cbtltd.rest.maxxton.ResortActivityCriteria _getResortActivities_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ResortActivityContainer _getResortActivities__return = port.getResortActivities(_getResortActivities_sessionKey, _getResortActivities_criteria);
            System.out.println("getResortActivities.result=" + _getResortActivities__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking registerKCDoorlockPincodeEvent...");
        java.lang.String _registerKCDoorlockPincodeEvent_sessionKey = "";
        net.cbtltd.rest.maxxton.PincodeRegistration _registerKCDoorlockPincodeEvent_pincodeRegistration = null;
        try {
            net.cbtltd.rest.maxxton.Reservation _registerKCDoorlockPincodeEvent__return = port.registerKCDoorlockPincodeEvent(_registerKCDoorlockPincodeEvent_sessionKey, _registerKCDoorlockPincodeEvent_pincodeRegistration);
            System.out.println("registerKCDoorlockPincodeEvent.result=" + _registerKCDoorlockPincodeEvent__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking checkinReservation...");
        java.lang.String _checkinReservation_sessionKey = "";
        net.cbtltd.rest.maxxton.GetReservation _checkinReservation_criteria = null;
        try {
            net.cbtltd.rest.maxxton.ReservationContainer _checkinReservation__return = port.checkinReservation(_checkinReservation_sessionKey, _checkinReservation_criteria);
            System.out.println("checkinReservation.result=" + _checkinReservation__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getTipTrips...");
        java.lang.String _getTipTrips_sessionKey = "";
        net.cbtltd.rest.maxxton.TipTripCriteria _getTipTrips_criteria = null;
        try {
            net.cbtltd.rest.maxxton.TipTripContainer _getTipTrips__return = port.getTipTrips(_getTipTrips_sessionKey, _getTipTrips_criteria);
            System.out.println("getTipTrips.result=" + _getTipTrips__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createSession...");
        net.cbtltd.rest.maxxton.SessionCriteria _createSession_criteria = null;
        try {
            java.lang.String _createSession__return = port.createSession(_createSession_criteria);
            System.out.println("createSession.result=" + _createSession__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getActiveDebitCardForReservation...");
        java.lang.String _getActiveDebitCardForReservation_sessionkey = "";
        net.cbtltd.rest.maxxton.DebitCardCriteria _getActiveDebitCardForReservation_criteria = null;
        try {
            net.cbtltd.rest.maxxton.DebitCardContainer _getActiveDebitCardForReservation__return = port.getActiveDebitCardForReservation(_getActiveDebitCardForReservation_sessionkey, _getActiveDebitCardForReservation_criteria);
            System.out.println("getActiveDebitCardForReservation.result=" + _getActiveDebitCardForReservation__return);

        } catch (NewyseWebserviceException e) { 
            System.out.println("Expected exception: NewyseWebserviceException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
