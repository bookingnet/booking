//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 09:44:01 AM IST 
//


package net.cbtltd.rest.yandex;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookID",
    "departureDate",
    "numberOfAdults",
    "contactName",
    "senderID"
})
@XmlRootElement(name = "SecurityInfo")
public class SecurityInfo {

    @XmlElement(name = "BookID", required = true)
    protected String bookID;
    @XmlElement(name = "DepartureDate")
    protected DepartureDate departureDate;
    @XmlElement(name = "NumberOfAdults")
    protected NumberOfAdults numberOfAdults;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "SenderID")
    protected String senderID;

    /**
     * Gets the value of the bookID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookID() {
        return bookID;
    }

    /**
     * Sets the value of the bookID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookID(String value) {
        this.bookID = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureDate }
     *     
     */
    public DepartureDate getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureDate }
     *     
     */
    public void setDepartureDate(DepartureDate value) {
        this.departureDate = value;
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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the senderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderID(String value) {
        this.senderID = value;
    }

}
