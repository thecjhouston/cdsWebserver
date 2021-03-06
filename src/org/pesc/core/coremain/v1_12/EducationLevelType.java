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
 * <p>Java class for EducationLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EducationLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AssociateDegree"/>
 *     &lt;enumeration value="BaccalaureateDegree"/>
 *     &lt;enumeration value="CollegeAttended"/>
 *     &lt;enumeration value="CollegeCertificate"/>
 *     &lt;enumeration value="CollegeDiploma"/>
 *     &lt;enumeration value="DoctoralDegree"/>
 *     &lt;enumeration value="Elementary"/>
 *     &lt;enumeration value="FourYearCollegeGraduate"/>
 *     &lt;enumeration value="HighSchoolAttended"/>
 *     &lt;enumeration value="HighSchoolGraduate"/>
 *     &lt;enumeration value="JuniorHighSchool"/>
 *     &lt;enumeration value="MastersDegree"/>
 *     &lt;enumeration value="MiddleSchool"/>
 *     &lt;enumeration value="NoHighSchool"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="PostGraduateStudy"/>
 *     &lt;enumeration value="ProfessionalAttended"/>
 *     &lt;enumeration value="ProfessionalCertification"/>
 *     &lt;enumeration value="ProfessionalDegree"/>
 *     &lt;enumeration value="SecondarySchool"/>
 *     &lt;enumeration value="TwoYearCollegeGraduate"/>
 *     &lt;enumeration value="VocationalSchool"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EducationLevelType")
@XmlEnum
public enum EducationLevelType {

    @XmlEnumValue("AssociateDegree")
    ASSOCIATE_DEGREE("AssociateDegree"),
    @XmlEnumValue("BaccalaureateDegree")
    BACCALAUREATE_DEGREE("BaccalaureateDegree"),
    @XmlEnumValue("CollegeAttended")
    COLLEGE_ATTENDED("CollegeAttended"),
    @XmlEnumValue("CollegeCertificate")
    COLLEGE_CERTIFICATE("CollegeCertificate"),
    @XmlEnumValue("CollegeDiploma")
    COLLEGE_DIPLOMA("CollegeDiploma"),
    @XmlEnumValue("DoctoralDegree")
    DOCTORAL_DEGREE("DoctoralDegree"),
    @XmlEnumValue("Elementary")
    ELEMENTARY("Elementary"),
    @XmlEnumValue("FourYearCollegeGraduate")
    FOUR_YEAR_COLLEGE_GRADUATE("FourYearCollegeGraduate"),
    @XmlEnumValue("HighSchoolAttended")
    HIGH_SCHOOL_ATTENDED("HighSchoolAttended"),
    @XmlEnumValue("HighSchoolGraduate")
    HIGH_SCHOOL_GRADUATE("HighSchoolGraduate"),
    @XmlEnumValue("JuniorHighSchool")
    JUNIOR_HIGH_SCHOOL("JuniorHighSchool"),
    @XmlEnumValue("MastersDegree")
    MASTERS_DEGREE("MastersDegree"),
    @XmlEnumValue("MiddleSchool")
    MIDDLE_SCHOOL("MiddleSchool"),
    @XmlEnumValue("NoHighSchool")
    NO_HIGH_SCHOOL("NoHighSchool"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PostGraduateStudy")
    POST_GRADUATE_STUDY("PostGraduateStudy"),
    @XmlEnumValue("ProfessionalAttended")
    PROFESSIONAL_ATTENDED("ProfessionalAttended"),
    @XmlEnumValue("ProfessionalCertification")
    PROFESSIONAL_CERTIFICATION("ProfessionalCertification"),
    @XmlEnumValue("ProfessionalDegree")
    PROFESSIONAL_DEGREE("ProfessionalDegree"),
    @XmlEnumValue("SecondarySchool")
    SECONDARY_SCHOOL("SecondarySchool"),
    @XmlEnumValue("TwoYearCollegeGraduate")
    TWO_YEAR_COLLEGE_GRADUATE("TwoYearCollegeGraduate"),
    @XmlEnumValue("VocationalSchool")
    VOCATIONAL_SCHOOL("VocationalSchool");
    private final String value;

    EducationLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EducationLevelType fromValue(String v) {
        for (EducationLevelType c: EducationLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
