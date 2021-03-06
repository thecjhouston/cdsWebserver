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
 * <p>Java class for StudentActivityGradeLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StudentActivityGradeLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Grade9"/>
 *     &lt;enumeration value="Grade10"/>
 *     &lt;enumeration value="Grade11"/>
 *     &lt;enumeration value="Grade12"/>
 *     &lt;enumeration value="PostSecondary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StudentActivityGradeLevelType")
@XmlEnum
public enum StudentActivityGradeLevelType {

    @XmlEnumValue("Grade9")
    GRADE_9("Grade9"),
    @XmlEnumValue("Grade10")
    GRADE_10("Grade10"),
    @XmlEnumValue("Grade11")
    GRADE_11("Grade11"),
    @XmlEnumValue("Grade12")
    GRADE_12("Grade12"),
    @XmlEnumValue("PostSecondary")
    POST_SECONDARY("PostSecondary");
    private final String value;

    StudentActivityGradeLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StudentActivityGradeLevelType fromValue(String v) {
        for (StudentActivityGradeLevelType c: StudentActivityGradeLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
