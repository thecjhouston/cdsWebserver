//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.cds.edexchange.v1_7;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sender"/>
 *     &lt;enumeration value="Receiver"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleCodeType")
@XmlEnum
public enum RoleCodeType {

    @XmlEnumValue("Sender")
    SENDER("Sender"),
    @XmlEnumValue("Receiver")
    RECEIVER("Receiver"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    RoleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleCodeType fromValue(String v) {
        for (RoleCodeType c: RoleCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
