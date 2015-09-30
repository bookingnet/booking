/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.26 at 04:29:10 PM CAT 
//


package net.cbtltd.rest.ota;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import net.cbtltd.soap.ota.server.ErrorsType;
import net.cbtltd.soap.ota.server.SuccessType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="Success" type="{}SuccessType"/>
 *           &lt;element name="Agent">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Companies" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Company" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="Code" use="required" type="{}StringLength1to32" />
 *                                       &lt;attribute name="Name" type="{}StringLength1to64" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="PaymentType" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice>
 *                               &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                               &lt;element name="Cash" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                               &lt;element name="CreditCard" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;/choice>
 *                             &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="AgentCode" use="required" type="{}StringLength1to32" />
 *                   &lt;attribute name="AgentName" type="{}StringLength1to64" />
 *                   &lt;attribute name="AgentType" type="{}OTA_CodeType" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;element name="Errors" type="{}ErrorsType"/>
 *       &lt;/choice>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "success",
    "agent",
    "errors"
})
@XmlRootElement(name = "eRes_AgentContactAuthRS")
public class AgentContactAuthRS {

    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Agent")
    protected AgentContactAuthRS.Agent agent;
    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessType }
     *     
     */
    public SuccessType getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessType }
     *     
     */
    public void setSuccess(SuccessType value) {
        this.success = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link AgentContactAuthRS.Agent }
     *     
     */
    public AgentContactAuthRS.Agent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentContactAuthRS.Agent }
     *     
     */
    public void setAgent(AgentContactAuthRS.Agent value) {
        this.agent = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Companies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Company" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" use="required" type="{}StringLength1to32" />
     *                           &lt;attribute name="Name" type="{}StringLength1to64" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PaymentType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="Cash" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="CreditCard" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                 &lt;/choice>
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="AgentCode" use="required" type="{}StringLength1to32" />
     *       &lt;attribute name="AgentName" type="{}StringLength1to64" />
     *       &lt;attribute name="AgentType" type="{}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "companies",
        "paymentType"
    })
    public static class Agent {

        @XmlElement(name = "Companies")
        protected AgentContactAuthRS.Agent.Companies companies;
        @XmlElement(name = "PaymentType")
        protected AgentContactAuthRS.Agent.PaymentType paymentType;
        @XmlAttribute(name = "AgentCode", required = true)
        protected String agentCode;
        @XmlAttribute(name = "AgentName")
        protected String agentName;
        @XmlAttribute(name = "AgentType")
        protected String agentType;

        /**
         * Gets the value of the companies property.
         * 
         * @return
         *     possible object is
         *     {@link AgentContactAuthRS.Agent.Companies }
         *     
         */
        public AgentContactAuthRS.Agent.Companies getCompanies() {
            return companies;
        }

        /**
         * Sets the value of the companies property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgentContactAuthRS.Agent.Companies }
         *     
         */
        public void setCompanies(AgentContactAuthRS.Agent.Companies value) {
            this.companies = value;
        }

        /**
         * Gets the value of the paymentType property.
         * 
         * @return
         *     possible object is
         *     {@link AgentContactAuthRS.Agent.PaymentType }
         *     
         */
        public AgentContactAuthRS.Agent.PaymentType getPaymentType() {
            return paymentType;
        }

        /**
         * Sets the value of the paymentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgentContactAuthRS.Agent.PaymentType }
         *     
         */
        public void setPaymentType(AgentContactAuthRS.Agent.PaymentType value) {
            this.paymentType = value;
        }

        /**
         * Gets the value of the agentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentCode() {
            return agentCode;
        }

        /**
         * Sets the value of the agentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentCode(String value) {
            this.agentCode = value;
        }

        /**
         * Gets the value of the agentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentName() {
            return agentName;
        }

        /**
         * Sets the value of the agentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentName(String value) {
            this.agentName = value;
        }

        /**
         * Gets the value of the agentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentType() {
            return agentType;
        }

        /**
         * Sets the value of the agentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentType(String value) {
            this.agentType = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Company" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" use="required" type="{}StringLength1to32" />
         *                 &lt;attribute name="Name" type="{}StringLength1to64" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "company"
        })
        public static class Companies {

            @XmlElement(name = "Company", required = true)
            protected List<AgentContactAuthRS.Agent.Companies.Company> company;

            /**
             * Gets the value of the company property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the company property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCompany().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AgentContactAuthRS.Agent.Companies.Company }
             * 
             * 
             */
            public List<AgentContactAuthRS.Agent.Companies.Company> getCompany() {
                if (company == null) {
                    company = new ArrayList<AgentContactAuthRS.Agent.Companies.Company>();
                }
                return this.company;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Code" use="required" type="{}StringLength1to32" />
             *       &lt;attribute name="Name" type="{}StringLength1to64" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Company {

                @XmlAttribute(name = "Code", required = true)
                protected String code;
                @XmlAttribute(name = "Name")
                protected String name;

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

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="Cash" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="CreditCard" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *       &lt;/choice>
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "account",
            "cash",
            "creditCard"
        })
        public static class PaymentType {

            @XmlElement(name = "Account")
            protected Object account;
            @XmlElement(name = "Cash")
            protected Object cash;
            @XmlElement(name = "CreditCard")
            protected Object creditCard;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;

            /**
             * Gets the value of the account property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getAccount() {
                return account;
            }

            /**
             * Sets the value of the account property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setAccount(Object value) {
                this.account = value;
            }

            /**
             * Gets the value of the cash property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCash() {
                return cash;
            }

            /**
             * Sets the value of the cash property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCash(Object value) {
                this.cash = value;
            }

            /**
             * Gets the value of the creditCard property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCreditCard() {
                return creditCard;
            }

            /**
             * Sets the value of the creditCard property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCreditCard(Object value) {
                this.creditCard = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

        }

    }

}
