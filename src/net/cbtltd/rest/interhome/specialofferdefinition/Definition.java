//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.17 at 03:10:52 PM CAT 
//


package net.cbtltd.rest.interhome.specialofferdefinition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="code" type="{}specialOfferCodeType" minOccurs="0"/>
 *         &lt;element name="name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="minstay" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="maxstay" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="latebooking" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="earlybooking" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "name",
    "minstay",
    "maxstay",
    "latebooking",
    "earlybooking"
})
@XmlRootElement(name = "definition")
public class Definition {

    protected String code;
    protected String name;
    protected Short minstay;
    protected Short maxstay;
    protected Short latebooking;
    protected Short earlybooking;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the minstay property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMinstay() {
        return minstay;
    }

    /**
     * Sets the value of the minstay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMinstay(Short value) {
        this.minstay = value;
    }

    /**
     * Gets the value of the maxstay property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMaxstay() {
        return maxstay;
    }

    /**
     * Sets the value of the maxstay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMaxstay(Short value) {
        this.maxstay = value;
    }

    /**
     * Gets the value of the latebooking property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLatebooking() {
        return latebooking;
    }

    /**
     * Sets the value of the latebooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLatebooking(Short value) {
        this.latebooking = value;
    }

    /**
     * Gets the value of the earlybooking property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEarlybooking() {
        return earlybooking;
    }

    /**
     * Sets the value of the earlybooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEarlybooking(Short value) {
        this.earlybooking = value;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Definition [code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append(", minstay=");
		builder.append(minstay);
		builder.append(", maxstay=");
		builder.append(maxstay);
		builder.append(", latebooking=");
		builder.append(latebooking);
		builder.append(", earlybooking=");
		builder.append(earlybooking);
		builder.append("]");
		return builder.toString();
	}

}
