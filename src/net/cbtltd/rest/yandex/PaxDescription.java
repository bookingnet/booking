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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paxID",
    "givenNames",
    "initials",
    "infix",
    "name",
    "dateOfBirthOrAge",
    "gender",
    "nationality",
    "passportNumber"
})
@XmlRootElement(name = "PaxDescription")
public class PaxDescription {

    @XmlElement(name = "PaxID", required = true)
    protected PaxID paxID;
    @XmlElement(name = "GivenNames")
    protected String givenNames;
    @XmlElement(name = "Initials", required = true)
    protected String initials;
    @XmlElement(name = "Infix")
    protected String infix;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElements({
        @XmlElement(name = "DateOfBirth", type = DateOfBirth.class),
        @XmlElement(name = "Age", type = Age.class)
    })
    protected List<Object> dateOfBirthOrAge;
    @XmlElement(name = "Gender", required = true)
    protected String gender;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "PassportNumber")
    protected String passportNumber;

    /**
     * Gets the value of the paxID property.
     * 
     * @return
     *     possible object is
     *     {@link PaxID }
     *     
     */
    public PaxID getPaxID() {
        return paxID;
    }

    /**
     * Sets the value of the paxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxID }
     *     
     */
    public void setPaxID(PaxID value) {
        this.paxID = value;
    }

    /**
     * Gets the value of the givenNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenNames() {
        return givenNames;
    }

    /**
     * Sets the value of the givenNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenNames(String value) {
        this.givenNames = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the infix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfix() {
        return infix;
    }

    /**
     * Sets the value of the infix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfix(String value) {
        this.infix = value;
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
     * Gets the value of the dateOfBirthOrAge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateOfBirthOrAge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateOfBirthOrAge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateOfBirth }
     * {@link Age }
     * 
     * 
     */
    public List<Object> getDateOfBirthOrAge() {
        if (dateOfBirthOrAge == null) {
            dateOfBirthOrAge = new ArrayList<Object>();
        }
        return this.dateOfBirthOrAge;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

}
