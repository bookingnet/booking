//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 09:44:01 AM IST 
//


package net.cbtltd.rest.nextpax;
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
    "invoiceID",
    "invoiceDate",
    "invoiceStatus",
    "travelDocumentsStatus"
})
@XmlRootElement(name = "BookInfo")
public class BookInfo {

    @XmlElement(name = "InvoiceID")
    protected String invoiceID;
    @XmlElement(name = "InvoiceDate")
    protected String invoiceDate;
    @XmlElement(name = "InvoiceStatus")
    protected String invoiceStatus;
    @XmlElement(name = "TravelDocumentsStatus")
    protected String travelDocumentsStatus;

    /**
     * Gets the value of the invoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceID() {
        return invoiceID;
    }

    /**
     * Sets the value of the invoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceID(String value) {
        this.invoiceID = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the invoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Sets the value of the invoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceStatus(String value) {
        this.invoiceStatus = value;
    }

    /**
     * Gets the value of the travelDocumentsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDocumentsStatus() {
        return travelDocumentsStatus;
    }

    /**
     * Sets the value of the travelDocumentsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDocumentsStatus(String value) {
        this.travelDocumentsStatus = value;
    }

}
