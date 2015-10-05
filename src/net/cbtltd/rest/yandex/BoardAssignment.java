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
    "boardType",
    "paxID"
})
@XmlRootElement(name = "BoardAssignment")
public class BoardAssignment {

    @XmlElement(name = "BoardType", required = true)
    protected String boardType;
    @XmlElement(name = "PaxID")
    protected List<PaxID> paxID;

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
     * Gets the value of the paxID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxID }
     * 
     * 
     */
    public List<PaxID> getPaxID() {
        if (paxID == null) {
            paxID = new ArrayList<PaxID>();
        }
        return this.paxID;
    }

}
