
package net.cbtltd.rest.interhome;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVoucherDetailDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVoucherDetailDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoucherDetailDescription" type="{http://www.interhome.com/webservice}VoucherDetailDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVoucherDetailDescription", propOrder = {
    "voucherDetailDescription"
})
public class ArrayOfVoucherDetailDescription {

    @XmlElement(name = "VoucherDetailDescription", nillable = true)
    protected List<VoucherDetailDescription> voucherDetailDescription;

    /**
     * Gets the value of the voucherDetailDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voucherDetailDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoucherDetailDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoucherDetailDescription }
     * 
     * 
     */
    public List<VoucherDetailDescription> getVoucherDetailDescription() {
        if (voucherDetailDescription == null) {
            voucherDetailDescription = new ArrayList<VoucherDetailDescription>();
        }
        return this.voucherDetailDescription;
    }

}
