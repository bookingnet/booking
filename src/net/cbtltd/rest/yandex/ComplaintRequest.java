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
    "complaintDetails",
    "complaint",
    "complaintSettlement"
})
@XmlRootElement(name = "ComplaintRequest")
public class ComplaintRequest {

    @XmlElement(name = "ComplaintDetails", required = true)
    protected ComplaintDetails complaintDetails;
    @XmlElement(name = "Complaint", required = true)
    protected Complaint complaint;
    @XmlElement(name = "ComplaintSettlement", required = true)
    protected ComplaintSettlement complaintSettlement;

    /**
     * Gets the value of the complaintDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ComplaintDetails }
     *     
     */
    public ComplaintDetails getComplaintDetails() {
        return complaintDetails;
    }

    /**
     * Sets the value of the complaintDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplaintDetails }
     *     
     */
    public void setComplaintDetails(ComplaintDetails value) {
        this.complaintDetails = value;
    }

    /**
     * Gets the value of the complaint property.
     * 
     * @return
     *     possible object is
     *     {@link Complaint }
     *     
     */
    public Complaint getComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Complaint }
     *     
     */
    public void setComplaint(Complaint value) {
        this.complaint = value;
    }

    /**
     * Gets the value of the complaintSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link ComplaintSettlement }
     *     
     */
    public ComplaintSettlement getComplaintSettlement() {
        return complaintSettlement;
    }

    /**
     * Sets the value of the complaintSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplaintSettlement }
     *     
     */
    public void setComplaintSettlement(ComplaintSettlement value) {
        this.complaintSettlement = value;
    }

}