//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 09:44:01 AM IST 
//


package net.cbtltd.rest.nextpax;
import java.util.ArrayList;
import java.util.List;
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
    "roundTripID",
    "transportAssignment",
    "accoAssignment"
})
@XmlRootElement(name = "RoundTripAssignment")
public class RoundTripAssignment {

    @XmlElement(name = "RoundTripID")
    protected String roundTripID;
    @XmlElement(name = "TransportAssignment")
    protected List<TransportAssignment> transportAssignment;
    @XmlElement(name = "AccoAssignment")
    protected List<AccoAssignment> accoAssignment;

    /**
     * Gets the value of the roundTripID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundTripID() {
        return roundTripID;
    }

    /**
     * Sets the value of the roundTripID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundTripID(String value) {
        this.roundTripID = value;
    }

    /**
     * Gets the value of the transportAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportAssignment }
     * 
     * 
     */
    public List<TransportAssignment> getTransportAssignment() {
        if (transportAssignment == null) {
            transportAssignment = new ArrayList<TransportAssignment>();
        }
        return this.transportAssignment;
    }

    /**
     * Gets the value of the accoAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accoAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccoAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccoAssignment }
     * 
     * 
     */
    public List<AccoAssignment> getAccoAssignment() {
        if (accoAssignment == null) {
            accoAssignment = new ArrayList<AccoAssignment>();
        }
        return this.accoAssignment;
    }

}
