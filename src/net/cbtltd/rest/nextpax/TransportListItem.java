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
    "searchTransportType",
    "searchDeparture",
    "searchArrival"
})
@XmlRootElement(name = "TransportListItem")
public class TransportListItem {

    @XmlElement(name = "SearchTransportType", required = true)
    protected String searchTransportType;
    @XmlElement(name = "SearchDeparture", required = true)
    protected SearchDeparture searchDeparture;
    @XmlElement(name = "SearchArrival", required = true)
    protected SearchArrival searchArrival;

    /**
     * Gets the value of the searchTransportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTransportType() {
        return searchTransportType;
    }

    /**
     * Sets the value of the searchTransportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTransportType(String value) {
        this.searchTransportType = value;
    }

    /**
     * Gets the value of the searchDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDeparture }
     *     
     */
    public SearchDeparture getSearchDeparture() {
        return searchDeparture;
    }

    /**
     * Sets the value of the searchDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDeparture }
     *     
     */
    public void setSearchDeparture(SearchDeparture value) {
        this.searchDeparture = value;
    }

    /**
     * Gets the value of the searchArrival property.
     * 
     * @return
     *     possible object is
     *     {@link SearchArrival }
     *     
     */
    public SearchArrival getSearchArrival() {
        return searchArrival;
    }

    /**
     * Sets the value of the searchArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchArrival }
     *     
     */
    public void setSearchArrival(SearchArrival value) {
        this.searchArrival = value;
    }

}
