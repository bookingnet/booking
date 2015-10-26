/**
 * @author	bookingnet
 * @
 * @version	4.0.0
 */

package net.cbtltd.soap.ota.server;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes the policies of the hotel, such as the type of payments, or whether children or pets are accepted.
 * 
 * <p>Java class for PoliciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoliciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Policy" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CancelPolicy" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="GuaranteePaymentPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PolicyInfoCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PolicyInfoCode" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
 *                                     &lt;attribute name="Name">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                           &lt;enumeration value="AdditionalOversoldPolicy"/>
 *                                           &lt;enumeration value="EarlyCheckinAvailable"/>
 *                                           &lt;enumeration value="LateCheckoutAvailable"/>
 *                                           &lt;enumeration value="OversoldArrangeAccommodations"/>
 *                                           &lt;enumeration value="OversoldArrangeTransportation"/>
 *                                           &lt;enumeration value="OversoldNotifyContacts"/>
 *                                           &lt;enumeration value="OversoldPayOneNightRoom"/>
 *                                           &lt;enumeration value="OversoldProvidePhonecall"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CheckoutCharges" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CheckoutCharge" maxOccurs="2">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                                     &lt;attribute name="Type">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                           &lt;enumeration value="Early"/>
 *                                           &lt;enumeration value="Late"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                     &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PolicyInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CheckInTime" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                           &lt;attribute name="CheckOutTime" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                           &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MaxChildAge" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                           &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TaxPolicies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
 *                                     &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PetsPolicies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *                                     &lt;attribute name="PetsPolicyCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                     &lt;attribute name="MaxPetQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *                                     &lt;attribute name="RefundableDeposit" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                     &lt;attribute name="NonRefundableFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                     &lt;attribute name="ChargeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                     &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="PetsAllowedCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Pets Allowed"/>
 *                                 &lt;enumeration value="Pets Not Allowed"/>
 *                                 &lt;enumeration value="Assistive Animals Only"/>
 *                                 &lt;enumeration value="Pets By Arrangements"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StayRequirements" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="StayRequirement" maxOccurs="9">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
 *                                     &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="StayContext">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                           &lt;enumeration value="Checkin"/>
 *                                           &lt;enumeration value="Checkout"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CommissionPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentCompany" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CommissionApplicability">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="AllRates"/>
 *                                 &lt;enumeration value="NoRates"/>
 *                                 &lt;enumeration value="SomeRates"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FeePolicies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FeePolicy" type="{http://www.opentravel.org/OTA/2003/05}FeeType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attribute name="DefaultValidBookingMinOffset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoliciesType", propOrder = {
    "policy"
})
@XmlSeeAlso({
    net.cbtltd.soap.ota.server.HotelDescriptiveContentType.Policies.class
})
public class PoliciesType {

    @XmlElement(name = "Policy", required = true)
    protected List<PoliciesType.Policy> policy;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoliciesType.Policy }
     * 
     * 
     */
    public List<PoliciesType.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PoliciesType.Policy>();
        }
        return this.policy;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CancelPolicy" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
     *         &lt;element name="GuaranteePaymentPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PolicyInfoCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PolicyInfoCode" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
     *                           &lt;attribute name="Name">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                 &lt;enumeration value="AdditionalOversoldPolicy"/>
     *                                 &lt;enumeration value="EarlyCheckinAvailable"/>
     *                                 &lt;enumeration value="LateCheckoutAvailable"/>
     *                                 &lt;enumeration value="OversoldArrangeAccommodations"/>
     *                                 &lt;enumeration value="OversoldArrangeTransportation"/>
     *                                 &lt;enumeration value="OversoldNotifyContacts"/>
     *                                 &lt;enumeration value="OversoldPayOneNightRoom"/>
     *                                 &lt;enumeration value="OversoldProvidePhonecall"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CheckoutCharges" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CheckoutCharge" maxOccurs="2">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *                           &lt;attribute name="Type">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                 &lt;enumeration value="Early"/>
     *                                 &lt;enumeration value="Late"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                           &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PolicyInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CheckInTime" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *                 &lt;attribute name="CheckOutTime" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *                 &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MaxChildAge" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *                 &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TaxPolicies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
     *                           &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PetsPolicies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *                           &lt;attribute name="PetsPolicyCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                           &lt;attribute name="MaxPetQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
     *                           &lt;attribute name="RefundableDeposit" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                           &lt;attribute name="NonRefundableFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                           &lt;attribute name="ChargeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                           &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="PetsAllowedCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Pets Allowed"/>
     *                       &lt;enumeration value="Pets Not Allowed"/>
     *                       &lt;enumeration value="Assistive Animals Only"/>
     *                       &lt;enumeration value="Pets By Arrangements"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StayRequirements" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="StayRequirement" maxOccurs="9">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
     *                           &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="StayContext">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                 &lt;enumeration value="Checkin"/>
     *                                 &lt;enumeration value="Checkout"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CommissionPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentCompany" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CommissionApplicability">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="AllRates"/>
     *                       &lt;enumeration value="NoRates"/>
     *                       &lt;enumeration value="SomeRates"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FeePolicies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FeePolicy" type="{http://www.opentravel.org/OTA/2003/05}FeeType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attribute name="DefaultValidBookingMinOffset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cancelPolicy",
        "guaranteePaymentPolicy",
        "policyInfoCodes",
        "checkoutCharges",
        "policyInfo",
        "taxPolicies",
        "petsPolicies",
        "stayRequirements",
        "commissionPolicy",
        "feePolicies"
    })
    public static class Policy {

        @XmlElement(name = "CancelPolicy")
        protected CancelPenaltiesType cancelPolicy;
        @XmlElement(name = "GuaranteePaymentPolicy")
        protected PoliciesType.Policy.GuaranteePaymentPolicy guaranteePaymentPolicy;
        @XmlElement(name = "PolicyInfoCodes")
        protected PoliciesType.Policy.PolicyInfoCodes policyInfoCodes;
        @XmlElement(name = "CheckoutCharges")
        protected PoliciesType.Policy.CheckoutCharges checkoutCharges;
        @XmlElement(name = "PolicyInfo")
        protected PoliciesType.Policy.PolicyInfo policyInfo;
        @XmlElement(name = "TaxPolicies")
        protected PoliciesType.Policy.TaxPolicies taxPolicies;
        @XmlElement(name = "PetsPolicies")
        protected PoliciesType.Policy.PetsPolicies petsPolicies;
        @XmlElement(name = "StayRequirements")
        protected PoliciesType.Policy.StayRequirements stayRequirements;
        @XmlElement(name = "CommissionPolicy")
        protected PoliciesType.Policy.CommissionPolicy commissionPolicy;
        @XmlElement(name = "FeePolicies")
        protected PoliciesType.Policy.FeePolicies feePolicies;
        @XmlAttribute(name = "DefaultValidBookingMinOffset")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger defaultValidBookingMinOffset;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "Mon")
        protected Boolean mon;
        @XmlAttribute(name = "Tue")
        protected Boolean tue;
        @XmlAttribute(name = "Weds")
        protected Boolean weds;
        @XmlAttribute(name = "Thur")
        protected Boolean thur;
        @XmlAttribute(name = "Fri")
        protected Boolean fri;
        @XmlAttribute(name = "Sat")
        protected Boolean sat;
        @XmlAttribute(name = "Sun")
        protected Boolean sun;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * Gets the value of the cancelPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancelPolicy() {
            return cancelPolicy;
        }

        /**
         * Sets the value of the cancelPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancelPolicy(CancelPenaltiesType value) {
            this.cancelPolicy = value;
        }

        /**
         * Gets the value of the guaranteePaymentPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.GuaranteePaymentPolicy }
         *     
         */
        public PoliciesType.Policy.GuaranteePaymentPolicy getGuaranteePaymentPolicy() {
            return guaranteePaymentPolicy;
        }

        /**
         * Sets the value of the guaranteePaymentPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.GuaranteePaymentPolicy }
         *     
         */
        public void setGuaranteePaymentPolicy(PoliciesType.Policy.GuaranteePaymentPolicy value) {
            this.guaranteePaymentPolicy = value;
        }

        /**
         * Gets the value of the policyInfoCodes property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.PolicyInfoCodes }
         *     
         */
        public PoliciesType.Policy.PolicyInfoCodes getPolicyInfoCodes() {
            return policyInfoCodes;
        }

        /**
         * Sets the value of the policyInfoCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.PolicyInfoCodes }
         *     
         */
        public void setPolicyInfoCodes(PoliciesType.Policy.PolicyInfoCodes value) {
            this.policyInfoCodes = value;
        }

        /**
         * Gets the value of the checkoutCharges property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.CheckoutCharges }
         *     
         */
        public PoliciesType.Policy.CheckoutCharges getCheckoutCharges() {
            return checkoutCharges;
        }

        /**
         * Sets the value of the checkoutCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.CheckoutCharges }
         *     
         */
        public void setCheckoutCharges(PoliciesType.Policy.CheckoutCharges value) {
            this.checkoutCharges = value;
        }

        /**
         * Gets the value of the policyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.PolicyInfo }
         *     
         */
        public PoliciesType.Policy.PolicyInfo getPolicyInfo() {
            return policyInfo;
        }

        /**
         * Sets the value of the policyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.PolicyInfo }
         *     
         */
        public void setPolicyInfo(PoliciesType.Policy.PolicyInfo value) {
            this.policyInfo = value;
        }

        /**
         * Gets the value of the taxPolicies property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.TaxPolicies }
         *     
         */
        public PoliciesType.Policy.TaxPolicies getTaxPolicies() {
            return taxPolicies;
        }

        /**
         * Sets the value of the taxPolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.TaxPolicies }
         *     
         */
        public void setTaxPolicies(PoliciesType.Policy.TaxPolicies value) {
            this.taxPolicies = value;
        }

        /**
         * Gets the value of the petsPolicies property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.PetsPolicies }
         *     
         */
        public PoliciesType.Policy.PetsPolicies getPetsPolicies() {
            return petsPolicies;
        }

        /**
         * Sets the value of the petsPolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.PetsPolicies }
         *     
         */
        public void setPetsPolicies(PoliciesType.Policy.PetsPolicies value) {
            this.petsPolicies = value;
        }

        /**
         * Gets the value of the stayRequirements property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.StayRequirements }
         *     
         */
        public PoliciesType.Policy.StayRequirements getStayRequirements() {
            return stayRequirements;
        }

        /**
         * Sets the value of the stayRequirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.StayRequirements }
         *     
         */
        public void setStayRequirements(PoliciesType.Policy.StayRequirements value) {
            this.stayRequirements = value;
        }

        /**
         * Gets the value of the commissionPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.CommissionPolicy }
         *     
         */
        public PoliciesType.Policy.CommissionPolicy getCommissionPolicy() {
            return commissionPolicy;
        }

        /**
         * Sets the value of the commissionPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.CommissionPolicy }
         *     
         */
        public void setCommissionPolicy(PoliciesType.Policy.CommissionPolicy value) {
            this.commissionPolicy = value;
        }

        /**
         * Gets the value of the feePolicies property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.FeePolicies }
         *     
         */
        public PoliciesType.Policy.FeePolicies getFeePolicies() {
            return feePolicies;
        }

        /**
         * Sets the value of the feePolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.FeePolicies }
         *     
         */
        public void setFeePolicies(PoliciesType.Policy.FeePolicies value) {
            this.feePolicies = value;
        }

        /**
         * Gets the value of the defaultValidBookingMinOffset property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDefaultValidBookingMinOffset() {
            return defaultValidBookingMinOffset;
        }

        /**
         * Sets the value of the defaultValidBookingMinOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDefaultValidBookingMinOffset(BigInteger value) {
            this.defaultValidBookingMinOffset = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the lastUpdated property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * Sets the value of the lastUpdated property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }

        /**
         * Gets the value of the codeDetail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * Sets the value of the codeDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * Gets the value of the removal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRemoval() {
            if (removal == null) {
                return false;
            } else {
                return removal;
            }
        }

        /**
         * Sets the value of the removal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * Gets the value of the mon property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * Sets the value of the mon property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * Gets the value of the tue property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * Sets the value of the tue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * Gets the value of the weds property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeds() {
            return weds;
        }

        /**
         * Sets the value of the weds property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeds(Boolean value) {
            this.weds = value;
        }

        /**
         * Gets the value of the thur property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isThur() {
            return thur;
        }

        /**
         * Sets the value of the thur property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setThur(Boolean value) {
            this.thur = value;
        }

        /**
         * Gets the value of the fri property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * Sets the value of the fri property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * Gets the value of the sat property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * Sets the value of the sat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * Gets the value of the sun property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * Sets the value of the sun property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSun(Boolean value) {
            this.sun = value;
        }

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CheckoutCharge" maxOccurs="2">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
         *                 &lt;attribute name="Type">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="Early"/>
         *                       &lt;enumeration value="Late"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                 &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "checkoutCharge"
        })
        public static class CheckoutCharges {

            @XmlElement(name = "CheckoutCharge", required = true)
            protected List<PoliciesType.Policy.CheckoutCharges.CheckoutCharge> checkoutCharge;

            /**
             * Gets the value of the checkoutCharge property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the checkoutCharge property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCheckoutCharge().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.CheckoutCharges.CheckoutCharge }
             * 
             * 
             */
            public List<PoliciesType.Policy.CheckoutCharges.CheckoutCharge> getCheckoutCharge() {
                if (checkoutCharge == null) {
                    checkoutCharge = new ArrayList<PoliciesType.Policy.CheckoutCharges.CheckoutCharge>();
                }
                return this.checkoutCharge;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *       &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
             *       &lt;attribute name="Type">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="Early"/>
             *             &lt;enumeration value="Late"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *       &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description"
            })
            public static class CheckoutCharge {

                @XmlElement(name = "Description")
                protected List<ParagraphType> description;
                @XmlAttribute(name = "Percent")
                protected BigDecimal percent;
                @XmlAttribute(name = "Type")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String type;
                @XmlAttribute(name = "NmbrOfNights")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger nmbrOfNights;
                @XmlAttribute(name = "ExistsCode")
                protected String existsCode;
                @XmlAttribute(name = "BalanceOfStayInd")
                protected Boolean balanceOfStayInd;
                @XmlAttribute(name = "CodeDetail")
                protected String codeDetail;
                @XmlAttribute(name = "Removal")
                protected Boolean removal;
                @XmlAttribute(name = "Amount")
                protected BigDecimal amount;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;

                /**
                 * Gets the value of the description property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the description property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDescription().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ParagraphType }
                 * 
                 * 
                 */
                public List<ParagraphType> getDescription() {
                    if (description == null) {
                        description = new ArrayList<ParagraphType>();
                    }
                    return this.description;
                }

                /**
                 * Gets the value of the percent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPercent() {
                    return percent;
                }

                /**
                 * Sets the value of the percent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPercent(BigDecimal value) {
                    this.percent = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the nmbrOfNights property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNmbrOfNights() {
                    return nmbrOfNights;
                }

                /**
                 * Sets the value of the nmbrOfNights property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNmbrOfNights(BigInteger value) {
                    this.nmbrOfNights = value;
                }

                /**
                 * Gets the value of the existsCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExistsCode() {
                    return existsCode;
                }

                /**
                 * Sets the value of the existsCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExistsCode(String value) {
                    this.existsCode = value;
                }

                /**
                 * Gets the value of the balanceOfStayInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isBalanceOfStayInd() {
                    return balanceOfStayInd;
                }

                /**
                 * Sets the value of the balanceOfStayInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setBalanceOfStayInd(Boolean value) {
                    this.balanceOfStayInd = value;
                }

                /**
                 * Gets the value of the codeDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeDetail() {
                    return codeDetail;
                }

                /**
                 * Sets the value of the codeDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeDetail(String value) {
                    this.codeDetail = value;
                }

                /**
                 * Gets the value of the removal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isRemoval() {
                    if (removal == null) {
                        return false;
                    } else {
                        return removal;
                    }
                }

                /**
                 * Sets the value of the removal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the currencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * Sets the value of the currencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                /**
                 * Gets the value of the decimalPlaces property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDecimalPlaces() {
                    return decimalPlaces;
                }

                /**
                 * Sets the value of the decimalPlaces property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDecimalPlaces(BigInteger value) {
                    this.decimalPlaces = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
         *       &lt;sequence>
         *         &lt;element name="PaymentCompany" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="CommissionApplicability">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="AllRates"/>
         *             &lt;enumeration value="NoRates"/>
         *             &lt;enumeration value="SomeRates"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paymentCompany"
        })
        public static class CommissionPolicy
            extends FeeType
        {

            @XmlElement(name = "PaymentCompany")
            protected List<PoliciesType.Policy.CommissionPolicy.PaymentCompany> paymentCompany;
            @XmlAttribute(name = "CommissionApplicability")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String commissionApplicability;

            /**
             * Gets the value of the paymentCompany property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paymentCompany property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPaymentCompany().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.CommissionPolicy.PaymentCompany }
             * 
             * 
             */
            public List<PoliciesType.Policy.CommissionPolicy.PaymentCompany> getPaymentCompany() {
                if (paymentCompany == null) {
                    paymentCompany = new ArrayList<PoliciesType.Policy.CommissionPolicy.PaymentCompany>();
                }
                return this.paymentCompany;
            }

            /**
             * Gets the value of the commissionApplicability property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommissionApplicability() {
                return commissionApplicability;
            }

            /**
             * Sets the value of the commissionApplicability property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommissionApplicability(String value) {
                this.commissionApplicability = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PaymentCompany {

                @XmlAttribute(name = "Name")
                protected String name;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FeePolicy" type="{http://www.opentravel.org/OTA/2003/05}FeeType" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "feePolicy"
        })
        public static class FeePolicies {

            @XmlElement(name = "FeePolicy", required = true)
            protected List<FeeType> feePolicy;

            /**
             * Gets the value of the feePolicy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the feePolicy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFeePolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FeeType }
             * 
             * 
             */
            public List<FeeType> getFeePolicy() {
                if (feePolicy == null) {
                    feePolicy = new ArrayList<FeeType>();
                }
                return this.feePolicy;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GuaranteePaymentPolicy
            extends RequiredPaymentsType
        {

            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * Gets the value of the removal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * Sets the value of the removal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
         *                 &lt;attribute name="PetsPolicyCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                 &lt;attribute name="MaxPetQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
         *                 &lt;attribute name="RefundableDeposit" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                 &lt;attribute name="NonRefundableFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                 &lt;attribute name="ChargeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                 &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="PetsAllowedCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Pets Allowed"/>
         *             &lt;enumeration value="Pets Not Allowed"/>
         *             &lt;enumeration value="Assistive Animals Only"/>
         *             &lt;enumeration value="Pets By Arrangements"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "petsPolicy"
        })
        public static class PetsPolicies {

            @XmlElement(name = "PetsPolicy")
            protected List<PoliciesType.Policy.PetsPolicies.PetsPolicy> petsPolicy;
            @XmlAttribute(name = "PetsAllowedCode")
            protected String petsAllowedCode;

            /**
             * Gets the value of the petsPolicy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the petsPolicy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPetsPolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.PetsPolicies.PetsPolicy }
             * 
             * 
             */
            public List<PoliciesType.Policy.PetsPolicies.PetsPolicy> getPetsPolicy() {
                if (petsPolicy == null) {
                    petsPolicy = new ArrayList<PoliciesType.Policy.PetsPolicies.PetsPolicy>();
                }
                return this.petsPolicy;
            }

            /**
             * Gets the value of the petsAllowedCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPetsAllowedCode() {
                return petsAllowedCode;
            }

            /**
             * Sets the value of the petsAllowedCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPetsAllowedCode(String value) {
                this.petsAllowedCode = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
             *       &lt;attribute name="PetsPolicyCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *       &lt;attribute name="MaxPetQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
             *       &lt;attribute name="RefundableDeposit" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *       &lt;attribute name="NonRefundableFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *       &lt;attribute name="ChargeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *       &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description"
            })
            public static class PetsPolicy {

                @XmlElement(name = "Description")
                protected List<ParagraphType> description;
                @XmlAttribute(name = "PetsPolicyCode")
                protected String petsPolicyCode;
                @XmlAttribute(name = "MaxPetQuantity")
                protected Integer maxPetQuantity;
                @XmlAttribute(name = "RefundableDeposit")
                protected BigDecimal refundableDeposit;
                @XmlAttribute(name = "NonRefundableFee")
                protected BigDecimal nonRefundableFee;
                @XmlAttribute(name = "ChargeCode")
                protected String chargeCode;
                @XmlAttribute(name = "RestrictionInd")
                protected Boolean restrictionInd;
                @XmlAttribute(name = "MinUnitOfMeasureQuantity")
                protected BigDecimal minUnitOfMeasureQuantity;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;
                @XmlAttribute(name = "UnitOfMeasureQuantity")
                protected BigDecimal unitOfMeasureQuantity;
                @XmlAttribute(name = "UnitOfMeasure")
                protected String unitOfMeasure;
                @XmlAttribute(name = "UnitOfMeasureCode")
                protected String unitOfMeasureCode;

                /**
                 * Gets the value of the description property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the description property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDescription().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ParagraphType }
                 * 
                 * 
                 */
                public List<ParagraphType> getDescription() {
                    if (description == null) {
                        description = new ArrayList<ParagraphType>();
                    }
                    return this.description;
                }

                /**
                 * Gets the value of the petsPolicyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPetsPolicyCode() {
                    return petsPolicyCode;
                }

                /**
                 * Sets the value of the petsPolicyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPetsPolicyCode(String value) {
                    this.petsPolicyCode = value;
                }

                /**
                 * Gets the value of the maxPetQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMaxPetQuantity() {
                    return maxPetQuantity;
                }

                /**
                 * Sets the value of the maxPetQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMaxPetQuantity(Integer value) {
                    this.maxPetQuantity = value;
                }

                /**
                 * Gets the value of the refundableDeposit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRefundableDeposit() {
                    return refundableDeposit;
                }

                /**
                 * Sets the value of the refundableDeposit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setRefundableDeposit(BigDecimal value) {
                    this.refundableDeposit = value;
                }

                /**
                 * Gets the value of the nonRefundableFee property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNonRefundableFee() {
                    return nonRefundableFee;
                }

                /**
                 * Sets the value of the nonRefundableFee property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNonRefundableFee(BigDecimal value) {
                    this.nonRefundableFee = value;
                }

                /**
                 * Gets the value of the chargeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChargeCode() {
                    return chargeCode;
                }

                /**
                 * Sets the value of the chargeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChargeCode(String value) {
                    this.chargeCode = value;
                }

                /**
                 * Gets the value of the restrictionInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRestrictionInd() {
                    return restrictionInd;
                }

                /**
                 * Sets the value of the restrictionInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRestrictionInd(Boolean value) {
                    this.restrictionInd = value;
                }

                /**
                 * Gets the value of the minUnitOfMeasureQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMinUnitOfMeasureQuantity() {
                    return minUnitOfMeasureQuantity;
                }

                /**
                 * Sets the value of the minUnitOfMeasureQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMinUnitOfMeasureQuantity(BigDecimal value) {
                    this.minUnitOfMeasureQuantity = value;
                }

                /**
                 * Gets the value of the currencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * Sets the value of the currencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                /**
                 * Gets the value of the decimalPlaces property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDecimalPlaces() {
                    return decimalPlaces;
                }

                /**
                 * Sets the value of the decimalPlaces property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDecimalPlaces(BigInteger value) {
                    this.decimalPlaces = value;
                }

                /**
                 * Gets the value of the unitOfMeasureQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUnitOfMeasureQuantity() {
                    return unitOfMeasureQuantity;
                }

                /**
                 * Sets the value of the unitOfMeasureQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUnitOfMeasureQuantity(BigDecimal value) {
                    this.unitOfMeasureQuantity = value;
                }

                /**
                 * Gets the value of the unitOfMeasure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasure() {
                    return unitOfMeasure;
                }

                /**
                 * Sets the value of the unitOfMeasure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasure(String value) {
                    this.unitOfMeasure = value;
                }

                /**
                 * Gets the value of the unitOfMeasureCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasureCode() {
                    return unitOfMeasureCode;
                }

                /**
                 * Sets the value of the unitOfMeasureCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasureCode(String value) {
                    this.unitOfMeasureCode = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="CheckInTime" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *       &lt;attribute name="CheckOutTime" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *       &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MaxChildAge" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
         *       &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description"
        })
        public static class PolicyInfo {

            @XmlElement(name = "Description")
            protected ParagraphType description;
            @XmlAttribute(name = "CheckInTime")
            protected String checkInTime;
            @XmlAttribute(name = "CheckOutTime")
            protected String checkOutTime;
            @XmlAttribute(name = "MinGuestAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger minGuestAge;
            @XmlAttribute(name = "MinRecommendedGuestAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger minRecommendedGuestAge;
            @XmlAttribute(name = "UsualStayFreeCutoffAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger usualStayFreeCutoffAge;
            @XmlAttribute(name = "UsualStayFreeChildPerAdult")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger usualStayFreeChildPerAdult;
            @XmlAttribute(name = "TotalGuestCount")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger totalGuestCount;
            @XmlAttribute(name = "DefaultTaxServiceInclusive")
            protected Boolean defaultTaxServiceInclusive;
            @XmlAttribute(name = "KidsStayFree")
            protected Boolean kidsStayFree;
            @XmlAttribute(name = "MaxChildAge")
            protected Integer maxChildAge;
            @XmlAttribute(name = "InternetGuaranteeRequiredInd")
            protected Boolean internetGuaranteeRequiredInd;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link ParagraphType }
             *     
             */
            public ParagraphType getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link ParagraphType }
             *     
             */
            public void setDescription(ParagraphType value) {
                this.description = value;
            }

            /**
             * Gets the value of the checkInTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckInTime() {
                return checkInTime;
            }

            /**
             * Sets the value of the checkInTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckInTime(String value) {
                this.checkInTime = value;
            }

            /**
             * Gets the value of the checkOutTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckOutTime() {
                return checkOutTime;
            }

            /**
             * Sets the value of the checkOutTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckOutTime(String value) {
                this.checkOutTime = value;
            }

            /**
             * Gets the value of the minGuestAge property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinGuestAge() {
                return minGuestAge;
            }

            /**
             * Sets the value of the minGuestAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinGuestAge(BigInteger value) {
                this.minGuestAge = value;
            }

            /**
             * Gets the value of the minRecommendedGuestAge property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinRecommendedGuestAge() {
                return minRecommendedGuestAge;
            }

            /**
             * Sets the value of the minRecommendedGuestAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinRecommendedGuestAge(BigInteger value) {
                this.minRecommendedGuestAge = value;
            }

            /**
             * Gets the value of the usualStayFreeCutoffAge property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUsualStayFreeCutoffAge() {
                return usualStayFreeCutoffAge;
            }

            /**
             * Sets the value of the usualStayFreeCutoffAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUsualStayFreeCutoffAge(BigInteger value) {
                this.usualStayFreeCutoffAge = value;
            }

            /**
             * Gets the value of the usualStayFreeChildPerAdult property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUsualStayFreeChildPerAdult() {
                return usualStayFreeChildPerAdult;
            }

            /**
             * Sets the value of the usualStayFreeChildPerAdult property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUsualStayFreeChildPerAdult(BigInteger value) {
                this.usualStayFreeChildPerAdult = value;
            }

            /**
             * Gets the value of the totalGuestCount property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalGuestCount() {
                return totalGuestCount;
            }

            /**
             * Sets the value of the totalGuestCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalGuestCount(BigInteger value) {
                this.totalGuestCount = value;
            }

            /**
             * Gets the value of the defaultTaxServiceInclusive property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDefaultTaxServiceInclusive() {
                return defaultTaxServiceInclusive;
            }

            /**
             * Sets the value of the defaultTaxServiceInclusive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDefaultTaxServiceInclusive(Boolean value) {
                this.defaultTaxServiceInclusive = value;
            }

            /**
             * Gets the value of the kidsStayFree property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isKidsStayFree() {
                return kidsStayFree;
            }

            /**
             * Sets the value of the kidsStayFree property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setKidsStayFree(Boolean value) {
                this.kidsStayFree = value;
            }

            /**
             * Gets the value of the maxChildAge property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxChildAge() {
                return maxChildAge;
            }

            /**
             * Sets the value of the maxChildAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxChildAge(Integer value) {
                this.maxChildAge = value;
            }

            /**
             * Gets the value of the internetGuaranteeRequiredInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInternetGuaranteeRequiredInd() {
                return internetGuaranteeRequiredInd;
            }

            /**
             * Sets the value of the internetGuaranteeRequiredInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInternetGuaranteeRequiredInd(Boolean value) {
                this.internetGuaranteeRequiredInd = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PolicyInfoCode" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
         *                 &lt;attribute name="Name">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="AdditionalOversoldPolicy"/>
         *                       &lt;enumeration value="EarlyCheckinAvailable"/>
         *                       &lt;enumeration value="LateCheckoutAvailable"/>
         *                       &lt;enumeration value="OversoldArrangeAccommodations"/>
         *                       &lt;enumeration value="OversoldArrangeTransportation"/>
         *                       &lt;enumeration value="OversoldNotifyContacts"/>
         *                       &lt;enumeration value="OversoldPayOneNightRoom"/>
         *                       &lt;enumeration value="OversoldProvidePhonecall"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "policyInfoCode"
        })
        public static class PolicyInfoCodes {

            @XmlElement(name = "PolicyInfoCode", required = true)
            protected List<PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode> policyInfoCode;

            /**
             * Gets the value of the policyInfoCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the policyInfoCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPolicyInfoCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode }
             * 
             * 
             */
            public List<PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode> getPolicyInfoCode() {
                if (policyInfoCode == null) {
                    policyInfoCode = new ArrayList<PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode>();
                }
                return this.policyInfoCode;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
             *       &lt;attribute name="Name">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="AdditionalOversoldPolicy"/>
             *             &lt;enumeration value="EarlyCheckinAvailable"/>
             *             &lt;enumeration value="LateCheckoutAvailable"/>
             *             &lt;enumeration value="OversoldArrangeAccommodations"/>
             *             &lt;enumeration value="OversoldArrangeTransportation"/>
             *             &lt;enumeration value="OversoldNotifyContacts"/>
             *             &lt;enumeration value="OversoldPayOneNightRoom"/>
             *             &lt;enumeration value="OversoldProvidePhonecall"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description"
            })
            public static class PolicyInfoCode {

                @XmlElement(name = "Description")
                protected List<ParagraphType> description;
                @XmlAttribute(name = "Name")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String name;
                @XmlAttribute(name = "ExistsCode")
                protected String existsCode;
                @XmlAttribute(name = "CodeDetail")
                protected String codeDetail;
                @XmlAttribute(name = "Removal")
                protected Boolean removal;
                @XmlAttribute(name = "URI")
                @XmlSchemaType(name = "anyURI")
                protected String uri;
                @XmlAttribute(name = "Quantity")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger quantity;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the description property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the description property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDescription().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ParagraphType }
                 * 
                 * 
                 */
                public List<ParagraphType> getDescription() {
                    if (description == null) {
                        description = new ArrayList<ParagraphType>();
                    }
                    return this.description;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the existsCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExistsCode() {
                    return existsCode;
                }

                /**
                 * Sets the value of the existsCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExistsCode(String value) {
                    this.existsCode = value;
                }

                /**
                 * Gets the value of the codeDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeDetail() {
                    return codeDetail;
                }

                /**
                 * Sets the value of the codeDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeDetail(String value) {
                    this.codeDetail = value;
                }

                /**
                 * Gets the value of the removal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isRemoval() {
                    if (removal == null) {
                        return false;
                    } else {
                        return removal;
                    }
                }

                /**
                 * Sets the value of the removal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
                }

                /**
                 * Gets the value of the uri property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getURI() {
                    return uri;
                }

                /**
                 * Sets the value of the uri property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setURI(String value) {
                    this.uri = value;
                }

                /**
                 * Gets the value of the quantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getQuantity() {
                    return quantity;
                }

                /**
                 * Sets the value of the quantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setQuantity(BigInteger value) {
                    this.quantity = value;
                }

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    return codeContext;
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="StayRequirement" maxOccurs="9">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
         *                 &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="StayContext">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="Checkin"/>
         *                       &lt;enumeration value="Checkout"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "stayRequirement"
        })
        public static class StayRequirements {

            @XmlElement(name = "StayRequirement", required = true)
            protected List<PoliciesType.Policy.StayRequirements.StayRequirement> stayRequirement;

            /**
             * Gets the value of the stayRequirement property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stayRequirement property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStayRequirement().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.StayRequirements.StayRequirement }
             * 
             * 
             */
            public List<PoliciesType.Policy.StayRequirements.StayRequirement> getStayRequirement() {
                if (stayRequirement == null) {
                    stayRequirement = new ArrayList<PoliciesType.Policy.StayRequirements.StayRequirement>();
                }
                return this.stayRequirement;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
             *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="StayContext">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="Checkin"/>
             *             &lt;enumeration value="Checkout"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description"
            })
            public static class StayRequirement {

                @XmlElement(name = "Description")
                protected ParagraphType description;
                @XmlAttribute(name = "MinLOS")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger minLOS;
                @XmlAttribute(name = "MaxLOS")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger maxLOS;
                @XmlAttribute(name = "StayContext")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String stayContext;
                @XmlAttribute(name = "Mon")
                protected Boolean mon;
                @XmlAttribute(name = "Tue")
                protected Boolean tue;
                @XmlAttribute(name = "Weds")
                protected Boolean weds;
                @XmlAttribute(name = "Thur")
                protected Boolean thur;
                @XmlAttribute(name = "Fri")
                protected Boolean fri;
                @XmlAttribute(name = "Sat")
                protected Boolean sat;
                @XmlAttribute(name = "Sun")
                protected Boolean sun;

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ParagraphType }
                 *     
                 */
                public ParagraphType getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ParagraphType }
                 *     
                 */
                public void setDescription(ParagraphType value) {
                    this.description = value;
                }

                /**
                 * Gets the value of the minLOS property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMinLOS() {
                    return minLOS;
                }

                /**
                 * Sets the value of the minLOS property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMinLOS(BigInteger value) {
                    this.minLOS = value;
                }

                /**
                 * Gets the value of the maxLOS property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMaxLOS() {
                    return maxLOS;
                }

                /**
                 * Sets the value of the maxLOS property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMaxLOS(BigInteger value) {
                    this.maxLOS = value;
                }

                /**
                 * Gets the value of the stayContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStayContext() {
                    return stayContext;
                }

                /**
                 * Sets the value of the stayContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStayContext(String value) {
                    this.stayContext = value;
                }

                /**
                 * Gets the value of the mon property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isMon() {
                    return mon;
                }

                /**
                 * Sets the value of the mon property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setMon(Boolean value) {
                    this.mon = value;
                }

                /**
                 * Gets the value of the tue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isTue() {
                    return tue;
                }

                /**
                 * Sets the value of the tue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setTue(Boolean value) {
                    this.tue = value;
                }

                /**
                 * Gets the value of the weds property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isWeds() {
                    return weds;
                }

                /**
                 * Sets the value of the weds property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setWeds(Boolean value) {
                    this.weds = value;
                }

                /**
                 * Gets the value of the thur property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isThur() {
                    return thur;
                }

                /**
                 * Sets the value of the thur property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setThur(Boolean value) {
                    this.thur = value;
                }

                /**
                 * Gets the value of the fri property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isFri() {
                    return fri;
                }

                /**
                 * Sets the value of the fri property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setFri(Boolean value) {
                    this.fri = value;
                }

                /**
                 * Gets the value of the sat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSat() {
                    return sat;
                }

                /**
                 * Sets the value of the sat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSat(Boolean value) {
                    this.sat = value;
                }

                /**
                 * Gets the value of the sun property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSun() {
                    return sun;
                }

                /**
                 * Sets the value of the sun property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSun(Boolean value) {
                    this.sun = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
         *                 &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "taxPolicy"
        })
        public static class TaxPolicies {

            @XmlElement(name = "TaxPolicy")
            protected List<PoliciesType.Policy.TaxPolicies.TaxPolicy> taxPolicy;

            /**
             * Gets the value of the taxPolicy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the taxPolicy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTaxPolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.TaxPolicies.TaxPolicy }
             * 
             * 
             */
            public List<PoliciesType.Policy.TaxPolicies.TaxPolicy> getTaxPolicy() {
                if (taxPolicy == null) {
                    taxPolicy = new ArrayList<PoliciesType.Policy.TaxPolicies.TaxPolicy>();
                }
                return this.taxPolicy;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
             *       &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TaxPolicy
                extends TaxType
            {

                @XmlAttribute(name = "NightsForTaxExemptionQuantity")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger nightsForTaxExemptionQuantity;
                @XmlAttribute(name = "TaxableNightsQuantity")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger taxableNightsQuantity;

                /**
                 * Gets the value of the nightsForTaxExemptionQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNightsForTaxExemptionQuantity() {
                    return nightsForTaxExemptionQuantity;
                }

                /**
                 * Sets the value of the nightsForTaxExemptionQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNightsForTaxExemptionQuantity(BigInteger value) {
                    this.nightsForTaxExemptionQuantity = value;
                }

                /**
                 * Gets the value of the taxableNightsQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTaxableNightsQuantity() {
                    return taxableNightsQuantity;
                }

                /**
                 * Sets the value of the taxableNightsQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTaxableNightsQuantity(BigInteger value) {
                    this.taxableNightsQuantity = value;
                }

            }

        }

    }

}
