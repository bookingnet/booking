/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */

package net.cbtltd.soap.ota.server;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information significant to defining a rate plan.
 * 
 * <p>Java class for RatePlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="RatePlanDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="RatePlanInclusions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RatePlanInclusionDesciption" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/>
 *         &lt;element name="MealsIncluded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealsIncludedGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RestrictionStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RestrictionStatusGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalDetails" type="{http://www.opentravel.org/OTA/2003/05}AdditionalDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
 *       &lt;attribute name="BookingCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="RateIndicator" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
 *       &lt;attribute name="RatePlanType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="RatePlanID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="RatePlanName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="MarketCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
 *       &lt;attribute name="ID_RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PriceViewableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="QualificationType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanType", propOrder = {
    "guarantee",
    "cancelPenalties",
    "ratePlanDescription",
    "ratePlanInclusions",
    "commission",
    "mealsIncluded",
    "restrictionStatus"
})
public class RatePlanType {

    @XmlElement(name = "Guarantee")
    protected List<GuaranteeType> guarantee;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "RatePlanDescription")
    protected ParagraphType ratePlanDescription;
    @XmlElement(name = "RatePlanInclusions")
    protected RatePlanType.RatePlanInclusions ratePlanInclusions;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "MealsIncluded")
    protected RatePlanType.MealsIncluded mealsIncluded;
    @XmlElement(name = "RestrictionStatus")
    protected RatePlanType.RestrictionStatus restrictionStatus;
//    @XmlElement(name = "AdditionalDetails")
//    protected AdditionalDetailsType additionalDetails;
    @XmlAttribute(name = "BookingCode")
    protected String bookingCode;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "RateIndicator")
    protected RateIndicatorType rateIndicator;
    @XmlAttribute(name = "RatePlanType")
    protected String ratePlanType;
    @XmlAttribute(name = "RatePlanID")
    protected String ratePlanID;
    @XmlAttribute(name = "RatePlanName")
    protected String ratePlanName;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "AvailabilityStatus")
    protected RateIndicatorType availabilityStatus;
    @XmlAttribute(name = "ID_RequiredInd")
    protected Boolean idRequiredInd;
    @XmlAttribute(name = "PriceViewableInd")
    protected Boolean priceViewableInd;
    @XmlAttribute(name = "QualificationType")
    protected String qualificationType;
    @XmlAttribute(name = "AvailableQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger availableQuantity;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ExpireDateExclusiveIndicator")
    protected Boolean expireDateExclusiveIndicator;

    /**
     * Gets the value of the guarantee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeType }
     * 
     * 
     */
    public List<GuaranteeType> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<GuaranteeType>();
        }
        return this.guarantee;
    }

    /**
     * Gets the value of the cancelPenalties property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * Sets the value of the cancelPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * Gets the value of the ratePlanDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getRatePlanDescription() {
        return ratePlanDescription;
    }

    /**
     * Sets the value of the ratePlanDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setRatePlanDescription(ParagraphType value) {
        this.ratePlanDescription = value;
    }

    /**
     * Gets the value of the ratePlanInclusions property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.RatePlanInclusions }
     *     
     */
    public RatePlanType.RatePlanInclusions getRatePlanInclusions() {
        return ratePlanInclusions;
    }

    /**
     * Sets the value of the ratePlanInclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.RatePlanInclusions }
     *     
     */
    public void setRatePlanInclusions(RatePlanType.RatePlanInclusions value) {
        this.ratePlanInclusions = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the mealsIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.MealsIncluded }
     *     
     */
    public RatePlanType.MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * Sets the value of the mealsIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.MealsIncluded }
     *     
     */
    public void setMealsIncluded(RatePlanType.MealsIncluded value) {
        this.mealsIncluded = value;
    }

    /**
     * Gets the value of the restrictionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.RestrictionStatus }
     *     
     */
    public RatePlanType.RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    /**
     * Sets the value of the restrictionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.RestrictionStatus }
     *     
     */
    public void setRestrictionStatus(RatePlanType.RestrictionStatus value) {
        this.restrictionStatus = value;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDetailsType }
     *     
     */
//    public AdditionalDetailsType getAdditionalDetails() {
//        return additionalDetails;
//    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDetailsType }
     *     
     */
//    public void setAdditionalDetails(AdditionalDetailsType value) {
//        this.additionalDetails = value;
//    }

    /**
     * Gets the value of the bookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the rateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link RateIndicatorType }
     *     
     */
    public RateIndicatorType getRateIndicator() {
        return rateIndicator;
    }

    /**
     * Sets the value of the rateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorType }
     *     
     */
    public void setRateIndicator(RateIndicatorType value) {
        this.rateIndicator = value;
    }

    /**
     * Gets the value of the ratePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * Sets the value of the ratePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * Gets the value of the ratePlanID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanID() {
        return ratePlanID;
    }

    /**
     * Sets the value of the ratePlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanID(String value) {
        this.ratePlanID = value;
    }

    /**
     * Gets the value of the ratePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanName() {
        return ratePlanName;
    }

    /**
     * Sets the value of the ratePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanName(String value) {
        this.ratePlanName = value;
    }

    /**
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * Gets the value of the availabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RateIndicatorType }
     *     
     */
    public RateIndicatorType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * Sets the value of the availabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorType }
     *     
     */
    public void setAvailabilityStatus(RateIndicatorType value) {
        this.availabilityStatus = value;
    }

    /**
     * Gets the value of the idRequiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIDRequiredInd() {
        return idRequiredInd;
    }

    /**
     * Sets the value of the idRequiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIDRequiredInd(Boolean value) {
        this.idRequiredInd = value;
    }

    /**
     * Gets the value of the priceViewableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceViewableInd() {
        return priceViewableInd;
    }

    /**
     * Sets the value of the priceViewableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceViewableInd(Boolean value) {
        this.priceViewableInd = value;
    }

    /**
     * Gets the value of the qualificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationType() {
        return qualificationType;
    }

    /**
     * Sets the value of the qualificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationType(String value) {
        this.qualificationType = value;
    }

    /**
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableQuantity(BigInteger value) {
        this.availableQuantity = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the expireDateExclusiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpireDateExclusiveIndicator() {
        return expireDateExclusiveIndicator;
    }

    /**
     * Sets the value of the expireDateExclusiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpireDateExclusiveIndicator(Boolean value) {
        this.expireDateExclusiveIndicator = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealsIncludedGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MealsIncluded {

        @XmlAttribute(name = "Breakfast")
        protected Boolean breakfast;
        @XmlAttribute(name = "Lunch")
        protected Boolean lunch;
        @XmlAttribute(name = "Dinner")
        protected Boolean dinner;
        @XmlAttribute(name = "MealPlanIndicator")
        protected Boolean mealPlanIndicator;
        @XmlAttribute(name = "MealPlanCodes")
        protected List<String> mealPlanCodes;

        /**
         * Gets the value of the breakfast property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBreakfast() {
            return breakfast;
        }

        /**
         * Sets the value of the breakfast property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBreakfast(Boolean value) {
            this.breakfast = value;
        }

        /**
         * Gets the value of the lunch property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLunch() {
            return lunch;
        }

        /**
         * Sets the value of the lunch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLunch(Boolean value) {
            this.lunch = value;
        }

        /**
         * Gets the value of the dinner property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDinner() {
            return dinner;
        }

        /**
         * Sets the value of the dinner property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDinner(Boolean value) {
            this.dinner = value;
        }

        /**
         * Gets the value of the mealPlanIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMealPlanIndicator() {
            return mealPlanIndicator;
        }

        /**
         * Sets the value of the mealPlanIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMealPlanIndicator(Boolean value) {
            this.mealPlanIndicator = value;
        }

        /**
         * Gets the value of the mealPlanCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mealPlanCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMealPlanCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMealPlanCodes() {
            if (mealPlanCodes == null) {
                mealPlanCodes = new ArrayList<String>();
            }
            return this.mealPlanCodes;
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
     *         &lt;element name="RatePlanInclusionDesciption" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ratePlanInclusionDesciption"
    })
    public static class RatePlanInclusions {

        @XmlElement(name = "RatePlanInclusionDesciption")
        protected ParagraphType ratePlanInclusionDesciption;
        @XmlAttribute(name = "TaxInclusive")
        protected Boolean taxInclusive;
        @XmlAttribute(name = "ServiceFeeInclusive")
        protected Boolean serviceFeeInclusive;

        /**
         * Gets the value of the ratePlanInclusionDesciption property.
         * 
         * @return
         *     possible object is
         *     {@link ParagraphType }
         *     
         */
        public ParagraphType getRatePlanInclusionDesciption() {
            return ratePlanInclusionDesciption;
        }

        /**
         * Sets the value of the ratePlanInclusionDesciption property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParagraphType }
         *     
         */
        public void setRatePlanInclusionDesciption(ParagraphType value) {
            this.ratePlanInclusionDesciption = value;
        }

        /**
         * Gets the value of the taxInclusive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTaxInclusive() {
            return taxInclusive;
        }

        /**
         * Sets the value of the taxInclusive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTaxInclusive(Boolean value) {
            this.taxInclusive = value;
        }

        /**
         * Gets the value of the serviceFeeInclusive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isServiceFeeInclusive() {
            return serviceFeeInclusive;
        }

        /**
         * Sets the value of the serviceFeeInclusive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setServiceFeeInclusive(Boolean value) {
            this.serviceFeeInclusive = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RestrictionStatusGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RestrictionStatus {

        @XmlAttribute(name = "Restriction")
        protected List<String> restriction;
        @XmlAttribute(name = "Status")
        protected List<String> status;
        @XmlAttribute(name = "SellThroughOpenIndicator")
        protected Boolean sellThroughOpenIndicator;

        /**
         * Gets the value of the restriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the restriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRestriction() {
            if (restriction == null) {
                restriction = new ArrayList<String>();
            }
            return this.restriction;
        }

        /**
         * Gets the value of the status property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the status property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStatus() {
            if (status == null) {
                status = new ArrayList<String>();
            }
            return this.status;
        }

        /**
         * Gets the value of the sellThroughOpenIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSellThroughOpenIndicator() {
            return sellThroughOpenIndicator;
        }

        /**
         * Sets the value of the sellThroughOpenIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSellThroughOpenIndicator(Boolean value) {
            this.sellThroughOpenIndicator = value;
        }

    }

}
