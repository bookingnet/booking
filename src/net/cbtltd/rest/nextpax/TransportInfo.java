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
    "departureInfo",
    "arrivalInfo",
    "classInfo",
    "priceNotes"
})
@XmlRootElement(name = "TransportInfo")
public class TransportInfo {

    @XmlElement(name = "DepartureInfo")
    protected List<DepartureInfo> departureInfo;
    @XmlElement(name = "ArrivalInfo")
    protected List<ArrivalInfo> arrivalInfo;
    @XmlElement(name = "ClassInfo")
    protected List<ClassInfo> classInfo;
    @XmlElement(name = "PriceNotes")
    protected List<PriceNotes> priceNotes;

    /**
     * Gets the value of the departureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepartureInfo }
     * 
     * 
     */
    public List<DepartureInfo> getDepartureInfo() {
        if (departureInfo == null) {
            departureInfo = new ArrayList<DepartureInfo>();
        }
        return this.departureInfo;
    }

    /**
     * Gets the value of the arrivalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrivalInfo }
     * 
     * 
     */
    public List<ArrivalInfo> getArrivalInfo() {
        if (arrivalInfo == null) {
            arrivalInfo = new ArrayList<ArrivalInfo>();
        }
        return this.arrivalInfo;
    }

    /**
     * Gets the value of the classInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassInfo }
     * 
     * 
     */
    public List<ClassInfo> getClassInfo() {
        if (classInfo == null) {
            classInfo = new ArrayList<ClassInfo>();
        }
        return this.classInfo;
    }

    /**
     * Gets the value of the priceNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceNotes }
     * 
     * 
     */
    public List<PriceNotes> getPriceNotes() {
        if (priceNotes == null) {
            priceNotes = new ArrayList<PriceNotes>();
        }
        return this.priceNotes;
    }

}
