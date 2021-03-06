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
    "preBookDetails",
    "paxDetails",
    "preferencesAndEssentials"
})
@XmlRootElement(name = "PreBookRequest")
public class PreBookRequest {

    @XmlElement(name = "PreBookDetails")
    protected PreBookDetails preBookDetails;
    @XmlElement(name = "PaxDetails")
    protected PaxDetails paxDetails;
    @XmlElement(name = "PreferencesAndEssentials")
    protected List<PreferencesAndEssentials> preferencesAndEssentials;

    /**
     * Gets the value of the preBookDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PreBookDetails }
     *     
     */
    public PreBookDetails getPreBookDetails() {
        return preBookDetails;
    }

    /**
     * Sets the value of the preBookDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreBookDetails }
     *     
     */
    public void setPreBookDetails(PreBookDetails value) {
        this.preBookDetails = value;
    }

    /**
     * Gets the value of the paxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaxDetails }
     *     
     */
    public PaxDetails getPaxDetails() {
        return paxDetails;
    }

    /**
     * Sets the value of the paxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxDetails }
     *     
     */
    public void setPaxDetails(PaxDetails value) {
        this.paxDetails = value;
    }

    /**
     * Gets the value of the preferencesAndEssentials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferencesAndEssentials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferencesAndEssentials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferencesAndEssentials }
     * 
     * 
     */
    public List<PreferencesAndEssentials> getPreferencesAndEssentials() {
        if (preferencesAndEssentials == null) {
            preferencesAndEssentials = new ArrayList<PreferencesAndEssentials>();
        }
        return this.preferencesAndEssentials;
    }

}
