//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.core.coremain.v1_12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CourseApplicabilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CourseApplicabilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="FirstProgram"/>
 *     &lt;enumeration value="SecondProgram"/>
 *     &lt;enumeration value="BothPrograms"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CourseApplicabilityType")
@XmlEnum
public enum CourseApplicabilityType {

    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("FirstProgram")
    FIRST_PROGRAM("FirstProgram"),
    @XmlEnumValue("SecondProgram")
    SECOND_PROGRAM("SecondProgram"),
    @XmlEnumValue("BothPrograms")
    BOTH_PROGRAMS("BothPrograms");
    private final String value;

    CourseApplicabilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CourseApplicabilityType fromValue(String v) {
        for (CourseApplicabilityType c: CourseApplicabilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}