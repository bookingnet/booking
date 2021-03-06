//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.07 at 11:32:17 AM IST 
//


package net.cbtltd.rest.tripvillas.xmlfeed.prices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="price" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="propertyID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="rooms">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="room" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="roomID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="dailyPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                       &lt;element name="weekendRates" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                       &lt;element name="specialRates">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="specialRate" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="startDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                           &lt;element name="endDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                           &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
    "price"
})
@XmlRootElement(name = "prices")
public class Prices {

    @XmlElement(required = true)
    protected List<Prices.Price> price;

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prices.Price }
     * 
     * 
     */
    public List<Prices.Price> getPrice() {
        if (price == null) {
            price = new ArrayList<Prices.Price>();
        }
        return this.price;
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
     *         &lt;element name="propertyID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="rooms">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="room" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="roomID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="dailyPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                             &lt;element name="weekendRates" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                             &lt;element name="specialRates">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="specialRate" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="startDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                 &lt;element name="endDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                 &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
        "propertyID",
        "propertyType",
        "rooms"
    })
    public static class Price {

        protected int propertyID;
        @XmlElement(required = true)
        protected String propertyType;
        @XmlElement(required = true)
        protected Prices.Price.Rooms rooms;

        /**
         * Gets the value of the propertyID property.
         * 
         */
        public int getPropertyID() {
            return propertyID;
        }

        /**
         * Sets the value of the propertyID property.
         * 
         */
        public void setPropertyID(int value) {
            this.propertyID = value;
        }

        /**
         * Gets the value of the propertyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyType() {
            return propertyType;
        }

        /**
         * Sets the value of the propertyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyType(String value) {
            this.propertyType = value;
        }

        /**
         * Gets the value of the rooms property.
         * 
         * @return
         *     possible object is
         *     {@link Prices.Price.Rooms }
         *     
         */
        public Prices.Price.Rooms getRooms() {
            return rooms;
        }

        /**
         * Sets the value of the rooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prices.Price.Rooms }
         *     
         */
        public void setRooms(Prices.Price.Rooms value) {
            this.rooms = value;
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
         *         &lt;element name="room" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="roomID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="dailyPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                   &lt;element name="weekendRates" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                   &lt;element name="specialRates">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="specialRate" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="startDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                       &lt;element name="endDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                       &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
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
            "room"
        })
        public static class Rooms {

            @XmlElement(required = true)
            protected List<Prices.Price.Rooms.Room> room;

            /**
             * Gets the value of the room property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the room property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoom().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Prices.Price.Rooms.Room }
             * 
             * 
             */
            public List<Prices.Price.Rooms.Room> getRoom() {
                if (room == null) {
                    room = new ArrayList<Prices.Price.Rooms.Room>();
                }
                return this.room;
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
             *         &lt;element name="roomID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="dailyPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *         &lt;element name="weekendRates" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *         &lt;element name="specialRates">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="specialRate" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="startDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                             &lt;element name="endDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                             &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
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
                "roomID",
                "dailyPrice",
                "weekendRates",
                "specialRates"
            })
            public static class Room {

                @XmlElement(required = true)
                protected String roomID;
                protected double dailyPrice;
                protected double weekendRates;
                @XmlElement(required = true)
                protected Prices.Price.Rooms.Room.SpecialRates specialRates;

                /**
                 * Gets the value of the roomID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomID() {
                    return roomID;
                }

                /**
                 * Sets the value of the roomID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomID(String value) {
                    this.roomID = value;
                }

                /**
                 * Gets the value of the dailyPrice property.
                 * 
                 */
                public double getDailyPrice() {
                    return dailyPrice;
                }

                /**
                 * Sets the value of the dailyPrice property.
                 * 
                 */
                public void setDailyPrice(double value) {
                    this.dailyPrice = value;
                }

                /**
                 * Gets the value of the weekendRates property.
                 * 
                 */
                public double getWeekendRates() {
                    return weekendRates;
                }

                /**
                 * Sets the value of the weekendRates property.
                 * 
                 */
                public void setWeekendRates(double value) {
                    this.weekendRates = value;
                }

                /**
                 * Gets the value of the specialRates property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Prices.Price.Rooms.Room.SpecialRates }
                 *     
                 */
                public Prices.Price.Rooms.Room.SpecialRates getSpecialRates() {
                    return specialRates;
                }

                /**
                 * Sets the value of the specialRates property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Prices.Price.Rooms.Room.SpecialRates }
                 *     
                 */
                public void setSpecialRates(Prices.Price.Rooms.Room.SpecialRates value) {
                    this.specialRates = value;
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
                 *         &lt;element name="specialRate" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="startDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *                   &lt;element name="endDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *                   &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *                 &lt;/sequence>
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
                    "specialRate"
                })
                public static class SpecialRates {

                    @XmlElement(required = true)
                    protected List<Prices.Price.Rooms.Room.SpecialRates.SpecialRate> specialRate;

                    /**
                     * Gets the value of the specialRate property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the specialRate property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSpecialRate().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Prices.Price.Rooms.Room.SpecialRates.SpecialRate }
                     * 
                     * 
                     */
                    public List<Prices.Price.Rooms.Room.SpecialRates.SpecialRate> getSpecialRate() {
                        if (specialRate == null) {
                            specialRate = new ArrayList<Prices.Price.Rooms.Room.SpecialRates.SpecialRate>();
                        }
                        return this.specialRate;
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
                     *         &lt;element name="startDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
                     *         &lt;element name="endDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
                     *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
                        "startDay",
                        "endDay",
                        "rate"
                    })
                    public static class SpecialRate {

                        @XmlElement(required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar startDay;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar endDay;
                        protected double rate;

                        /**
                         * Gets the value of the startDay property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getStartDay() {
                            return startDay;
                        }

                        /**
                         * Sets the value of the startDay property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setStartDay(XMLGregorianCalendar value) {
                            this.startDay = value;
                        }

                        /**
                         * Gets the value of the endDay property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getEndDay() {
                            return endDay;
                        }

                        /**
                         * Sets the value of the endDay property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setEndDay(XMLGregorianCalendar value) {
                            this.endDay = value;
                        }

                        /**
                         * Gets the value of the rate property.
                         * 
                         */
                        public double getRate() {
                            return rate;
                        }

                        /**
                         * Sets the value of the rate property.
                         * 
                         */
                        public void setRate(double value) {
                            this.rate = value;
                        }

                    }

                }

            }

        }

    }

}
