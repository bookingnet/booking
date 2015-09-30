/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */

package net.cbtltd.soap.ota.server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateIndicatorType">
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
 *     &lt;enumeration value="ChangeDuringStay"/>
 *     &lt;enumeration value="MultipleNights"/>
 *     &lt;enumeration value="Exclusive"/>
 *     &lt;enumeration value="OnRequest"/>
 *     &lt;enumeration value="LimitedAvailability"/>
 *     &lt;enumeration value="AvailableForSale"/>
 *     &lt;enumeration value="ClosedOut"/>
 *     &lt;enumeration value="OtherAvailable"/>
 *     &lt;enumeration value="UnableToProcess"/>
 *     &lt;enumeration value="NoAvailability"/>
 *     &lt;enumeration value="RoomTypeClosed"/>
 *     &lt;enumeration value="RatePlanClosed"/>
 *     &lt;enumeration value="LOS_Restricted"/>
 *     &lt;enumeration value="Restricted"/>
 *     &lt;enumeration value="DoesNotExist"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateIndicatorType")
@XmlEnum
public enum RateIndicatorType {

    @XmlEnumValue("ChangeDuringStay")
    CHANGE_DURING_STAY("ChangeDuringStay"),
    @XmlEnumValue("MultipleNights")
    MULTIPLE_NIGHTS("MultipleNights"),

    /**
     * Availability is limited based on guest qualification criteria e.g. AAA member or Government Employee
     * 
     */
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("LimitedAvailability")
    LIMITED_AVAILABILITY("LimitedAvailability"),
    @XmlEnumValue("AvailableForSale")
    AVAILABLE_FOR_SALE("AvailableForSale"),
    @XmlEnumValue("ClosedOut")
    CLOSED_OUT("ClosedOut"),
    @XmlEnumValue("OtherAvailable")
    OTHER_AVAILABLE("OtherAvailable"),

    /**
     * Indicates an issue that precluded the ability to provide the information.
     * 
     */
    @XmlEnumValue("UnableToProcess")
    UNABLE_TO_PROCESS("UnableToProcess"),
    @XmlEnumValue("NoAvailability")
    NO_AVAILABILITY("NoAvailability"),
    @XmlEnumValue("RoomTypeClosed")
    ROOM_TYPE_CLOSED("RoomTypeClosed"),
    @XmlEnumValue("RatePlanClosed")
    RATE_PLAN_CLOSED("RatePlanClosed"),
    @XmlEnumValue("LOS_Restricted")
    LOS_RESTRICTED("LOS_Restricted"),

    /**
     * Availability is limited based on distribution channel qualification criteria (e.g., Expedia or Sabre).
     * 
     */
    @XmlEnumValue("Restricted")
    RESTRICTED("Restricted"),

    /**
     * The rate plan does not exist.
     * 
     */
    @XmlEnumValue("DoesNotExist")
    DOES_NOT_EXIST("DoesNotExist");
    private final String value;

    RateIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateIndicatorType fromValue(String v) {
        for (RateIndicatorType c: RateIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
