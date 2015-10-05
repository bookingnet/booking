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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cruiseID",
    "sequence",
    "cruiseTransport",
    "accommodation"
})
@XmlRootElement(name = "Cruise")
public class Cruise {

    @XmlElement(name = "CruiseID")
    protected String cruiseID;
    @XmlElement(name = "Sequence")
    protected Sequence sequence;
    @XmlElement(name = "CruiseTransport")
    protected List<CruiseTransport> cruiseTransport;
    @XmlElement(name = "Accommodation")
    protected List<Accommodation> accommodation;

    /**
     * Gets the value of the cruiseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCruiseID() {
        return cruiseID;
    }

    /**
     * Sets the value of the cruiseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCruiseID(String value) {
        this.cruiseID = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Sequence }
     *     
     */
    public Sequence getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sequence }
     *     
     */
    public void setSequence(Sequence value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the cruiseTransport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruiseTransport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCruiseTransport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseTransport }
     * 
     * 
     */
    public List<CruiseTransport> getCruiseTransport() {
        if (cruiseTransport == null) {
            cruiseTransport = new ArrayList<CruiseTransport>();
        }
        return this.cruiseTransport;
    }

    /**
     * Gets the value of the accommodation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accommodation }
     * 
     * 
     */
    public List<Accommodation> getAccommodation() {
        if (accommodation == null) {
            accommodation = new ArrayList<Accommodation>();
        }
        return this.accommodation;
    }

}
