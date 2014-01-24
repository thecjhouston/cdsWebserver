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
 * <p>Java class for SupplementalGradeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplementalGradeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BiCourseGrade"/>
 *     &lt;enumeration value="BlendedFinalGrade"/>
 *     &lt;enumeration value="ExamGrade"/>
 *     &lt;enumeration value="InstructorAssignedGrade"/>
 *     &lt;enumeration value="SubSessionGrade"/>
 *     &lt;enumeration value="TriCourseGrade"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplementalGradeCodeType")
@XmlEnum
public enum SupplementalGradeCodeType {

    @XmlEnumValue("BiCourseGrade")
    BI_COURSE_GRADE("BiCourseGrade"),
    @XmlEnumValue("BlendedFinalGrade")
    BLENDED_FINAL_GRADE("BlendedFinalGrade"),
    @XmlEnumValue("ExamGrade")
    EXAM_GRADE("ExamGrade"),
    @XmlEnumValue("InstructorAssignedGrade")
    INSTRUCTOR_ASSIGNED_GRADE("InstructorAssignedGrade"),
    @XmlEnumValue("SubSessionGrade")
    SUB_SESSION_GRADE("SubSessionGrade"),
    @XmlEnumValue("TriCourseGrade")
    TRI_COURSE_GRADE("TriCourseGrade");
    private final String value;

    SupplementalGradeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplementalGradeCodeType fromValue(String v) {
        for (SupplementalGradeCodeType c: SupplementalGradeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}