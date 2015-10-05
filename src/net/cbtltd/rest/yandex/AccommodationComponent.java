//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 09:44:01 AM IST 
//


package net.cbtltd.rest.yandex;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "destinationOrAccommodationID",
    "accommodationType",
    "boardType",
    "unitType",
    "facilityType",
    "arrivalDate",
    "durationOrDepartureDate",
    "numberOfAdults",
    "numberOfChildren",
    "numberOfBabies",
    "numberOfUnits"
})
@XmlRootElement(name = "AccommodationComponent")
public class AccommodationComponent {

    @XmlElements({
        @XmlElement(name = "Destination", required = true, type = Destination.class),
        @XmlElement(name = "AccommodationID", required = true, type = AccommodationID.class)
    })
    protected List<Object> destinationOrAccommodationID;
    @XmlElement(name = "AccommodationType")
    protected String accommodationType;
    @XmlElement(name = "BoardType")
    protected String boardType;
    @XmlElement(name = "UnitType")
    protected String unitType;
    @XmlElement(name = "FacilityType")
    protected List<FacilityType> facilityType;
    @XmlElement(name = "ArrivalDate", required = true)
    protected String arrivalDate;
    @XmlElements({
        @XmlElement(name = "Duration", required = true, type = Duration.class),
        @XmlElement(name = "DepartureDate", required = true, type = DepartureDate.class)
    })
    protected List<Object> durationOrDepartureDate;
    @XmlElement(name = "NumberOfAdults")
    protected NumberOfAdults numberOfAdults;
    @XmlElement(name = "NumberOfChildren")
    protected NumberOfChildren numberOfChildren;
    @XmlElement(name = "NumberOfBabies")
    protected NumberOfBabies numberOfBabies;
    @XmlElement(name = "NumberOfUnits")
    protected String numberOfUnits;

    /**
     * Gets the value of the destinationOrAccommodationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationOrAccommodationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationOrAccommodationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Destination }
     * {@link AccommodationID }
     * 
     * 
     */
    public List<Object> getDestinationOrAccommodationID() {
        if (destinationOrAccommodationID == null) {
            destinationOrAccommodationID = new ArrayList<Object>();
        }
        return this.destinationOrAccommodationID;
    }

    /**
     * Gets the value of the accommodationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationType() {
        return accommodationType;
    }

    /**
     * Sets the value of the accommodationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationType(String value) {
        this.accommodationType = value;
    }

    /**
     * Gets the value of the boardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardType() {
        return boardType;
    }

    /**
     * Sets the value of the boardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardType(String value) {
        this.boardType = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityType }
     * 
     * 
     */
    public List<FacilityType> getFacilityType() {
        if (facilityType == null) {
            facilityType = new ArrayList<FacilityType>();
        }
        return this.facilityType;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the durationOrDepartureDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the durationOrDepartureDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDurationOrDepartureDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Duration }
     * {@link DepartureDate }
     * 
     * 
     */
    public List<Object> getDurationOrDepartureDate() {
        if (durationOrDepartureDate == null) {
            durationOrDepartureDate = new ArrayList<Object>();
        }
        return this.durationOrDepartureDate;
    }

    /**
     * Gets the value of the numberOfAdults property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfAdults }
     *     
     */
    public NumberOfAdults getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * Sets the value of the numberOfAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfAdults }
     *     
     */
    public void setNumberOfAdults(NumberOfAdults value) {
        this.numberOfAdults = value;
    }

    /**
     * Gets the value of the numberOfChildren property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfChildren }
     *     
     */
    public NumberOfChildren getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * Sets the value of the numberOfChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfChildren }
     *     
     */
    public void setNumberOfChildren(NumberOfChildren value) {
        this.numberOfChildren = value;
    }

    /**
     * Gets the value of the numberOfBabies property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfBabies }
     *     
     */
    public NumberOfBabies getNumberOfBabies() {
        return numberOfBabies;
    }

    /**
     * Sets the value of the numberOfBabies property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfBabies }
     *     
     */
    public void setNumberOfBabies(NumberOfBabies value) {
        this.numberOfBabies = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfUnits(String value) {
        this.numberOfUnits = value;
    }

}
