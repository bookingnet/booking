//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 09:44:01 AM IST 
//


package net.cbtltd.rest.yandex;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "senderSessionID",
    "receiverSessionID",
    "date",
    "time",
    "messageSequence",
    "previousMessageSequence",
    "senderID",
    "receiverID",
    "employeeID",
    "requestID",
    "responseID",
    "responseStatus"
})
@XmlRootElement(name = "Control")
public class Control {

    @XmlAttribute(name = "Language", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "Test")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String test;
    @XmlElement(name = "SenderSessionID", required = true)
    protected String senderSessionID;
    @XmlElement(name = "ReceiverSessionID", required = true)
    protected String receiverSessionID;
    @XmlElement(name = "Date", required = true)
    protected Date date;
    @XmlElement(name = "Time", required = true)
    protected Time time;
    @XmlElement(name = "MessageSequence", required = true)
    protected String messageSequence;
    @XmlElement(name = "PreviousMessageSequence")
    protected String previousMessageSequence;
    @XmlElement(name = "SenderID", required = true)
    protected String senderID;
    @XmlElement(name = "ReceiverID", required = true)
    protected String receiverID;
    @XmlElement(name = "EmployeeID")
    protected String employeeID;
    @XmlElement(name = "RequestID", required = true)
    protected String requestID;
    @XmlElement(name = "ResponseID", required = true)
    protected String responseID;
    @XmlElement(name = "ResponseStatus")
    protected String responseStatus;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTest() {
        if (test == null) {
            return "nee";
        } else {
            return test;
        }
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTest(String value) {
        this.test = value;
    }

    /**
     * Gets the value of the senderSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderSessionID() {
        return senderSessionID;
    }

    /**
     * Sets the value of the senderSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderSessionID(String value) {
        this.senderSessionID = value;
    }

    /**
     * Gets the value of the receiverSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverSessionID() {
        return receiverSessionID;
    }

    /**
     * Sets the value of the receiverSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverSessionID(String value) {
        this.receiverSessionID = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

    /**
     * Gets the value of the messageSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSequence() {
        return messageSequence;
    }

    /**
     * Sets the value of the messageSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSequence(String value) {
        this.messageSequence = value;
    }

    /**
     * Gets the value of the previousMessageSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousMessageSequence() {
        return previousMessageSequence;
    }

    /**
     * Sets the value of the previousMessageSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousMessageSequence(String value) {
        this.previousMessageSequence = value;
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

    /**
     * Gets the value of the receiverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverID() {
        return receiverID;
    }

    /**
     * Sets the value of the receiverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverID(String value) {
        this.receiverID = value;
    }

    /**
     * Gets the value of the employeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeID(String value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the responseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseID() {
        return responseID;
    }

    /**
     * Sets the value of the responseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseID(String value) {
        this.responseID = value;
    }

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStatus(String value) {
        this.responseStatus = value;
    }

}