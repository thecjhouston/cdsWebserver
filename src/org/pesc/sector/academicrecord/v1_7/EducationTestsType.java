//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.sector.academicrecord.v1_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.pesc.core.coremain.v1_12.EducationTestCodeType;
import org.pesc.core.coremain.v1_12.NonStandardizedConditionsCodeType;
import org.pesc.core.coremain.v1_12.ScoreExclusionReasonCodeType;
import org.pesc.core.coremain.v1_12.StudentLevelType;
import org.pesc.core.coremain.v1_12.TestAdministrationMethodCodeType;
import org.pesc.core.coremain.v1_12.UserDefinedExtensionsType;


/**
 * Identification of an assessment and all its attributes
 * 
 * <p>Java class for EducationTestsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationTestsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EducationTestCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}EducationTestCodeType"/>
 *         &lt;element name="EducationTestName" type="{urn:org:pesc:core:CoreMain:v1.12.0}EducationTestNameType" minOccurs="0"/>
 *         &lt;element name="EducationTestVersion" type="{urn:org:pesc:core:CoreMain:v1.12.0}EducationTestVersionType" minOccurs="0"/>
 *         &lt;element name="EducationTestGroup" type="{urn:org:pesc:core:CoreMain:v1.12.0}EducationTestGroupType" minOccurs="0"/>
 *         &lt;element name="TestAdministrationMethodCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}TestAdministrationMethodCodeType" minOccurs="0"/>
 *         &lt;element name="TestRegistrationNumber" type="{urn:org:pesc:core:CoreMain:v1.12.0}TestRegistrationNumberType" minOccurs="0"/>
 *         &lt;element name="ScoreExclusionReasonCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}ScoreExclusionReasonCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NonStandardizedTestConditionsCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}NonStandardizedConditionsCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="TestDate" type="{urn:org:pesc:core:CoreMain:v1.12.0}TestDateType"/>
 *           &lt;element name="TestYearMonth" type="{urn:org:pesc:core:CoreMain:v1.12.0}TestYearMonthType"/>
 *           &lt;element name="TestYear" type="{urn:org:pesc:core:CoreMain:v1.12.0}TestYearType"/>
 *         &lt;/choice>
 *         &lt;element name="StudentLevel" type="{urn:org:pesc:core:CoreMain:v1.12.0}StudentLevelType" minOccurs="0"/>
 *         &lt;element name="EducationSubtest" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}EducationSubtestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.12.0}NoteMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserDefinedExtensions" type="{urn:org:pesc:core:CoreMain:v1.12.0}UserDefinedExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationTestsType", propOrder = {
    "educationTestCode",
    "educationTestName",
    "educationTestVersion",
    "educationTestGroup",
    "testAdministrationMethodCode",
    "testRegistrationNumber",
    "scoreExclusionReasonCode",
    "nonStandardizedTestConditionsCode",
    "testDate",
    "testYearMonth",
    "testYear",
    "studentLevel",
    "educationSubtest",
    "noteMessage",
    "userDefinedExtensions"
})
public class EducationTestsType {

    @XmlElement(name = "EducationTestCode", required = true)
    protected EducationTestCodeType educationTestCode;
    @XmlElement(name = "EducationTestName")
    protected String educationTestName;
    @XmlElement(name = "EducationTestVersion")
    protected String educationTestVersion;
    @XmlElement(name = "EducationTestGroup")
    protected String educationTestGroup;
    @XmlElement(name = "TestAdministrationMethodCode")
    protected TestAdministrationMethodCodeType testAdministrationMethodCode;
    @XmlElement(name = "TestRegistrationNumber")
    protected String testRegistrationNumber;
    @XmlElement(name = "ScoreExclusionReasonCode")
    protected List<ScoreExclusionReasonCodeType> scoreExclusionReasonCode;
    @XmlElement(name = "NonStandardizedTestConditionsCode")
    protected List<NonStandardizedConditionsCodeType> nonStandardizedTestConditionsCode;
    @XmlElement(name = "TestDate")
    protected XMLGregorianCalendar testDate;
    @XmlElement(name = "TestYearMonth")
    protected XMLGregorianCalendar testYearMonth;
    @XmlElement(name = "TestYear")
    protected XMLGregorianCalendar testYear;
    @XmlElement(name = "StudentLevel")
    protected StudentLevelType studentLevel;
    @XmlElement(name = "EducationSubtest")
    protected List<EducationSubtestType> educationSubtest;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;
    @XmlElement(name = "UserDefinedExtensions")
    protected UserDefinedExtensionsType userDefinedExtensions;

    /**
     * Gets the value of the educationTestCode property.
     * 
     * @return
     *     possible object is
     *     {@link EducationTestCodeType }
     *     
     */
    public EducationTestCodeType getEducationTestCode() {
        return educationTestCode;
    }

    /**
     * Sets the value of the educationTestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationTestCodeType }
     *     
     */
    public void setEducationTestCode(EducationTestCodeType value) {
        this.educationTestCode = value;
    }

    /**
     * Gets the value of the educationTestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationTestName() {
        return educationTestName;
    }

    /**
     * Sets the value of the educationTestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationTestName(String value) {
        this.educationTestName = value;
    }

    /**
     * Gets the value of the educationTestVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationTestVersion() {
        return educationTestVersion;
    }

    /**
     * Sets the value of the educationTestVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationTestVersion(String value) {
        this.educationTestVersion = value;
    }

    /**
     * Gets the value of the educationTestGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationTestGroup() {
        return educationTestGroup;
    }

    /**
     * Sets the value of the educationTestGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationTestGroup(String value) {
        this.educationTestGroup = value;
    }

    /**
     * Gets the value of the testAdministrationMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link TestAdministrationMethodCodeType }
     *     
     */
    public TestAdministrationMethodCodeType getTestAdministrationMethodCode() {
        return testAdministrationMethodCode;
    }

    /**
     * Sets the value of the testAdministrationMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestAdministrationMethodCodeType }
     *     
     */
    public void setTestAdministrationMethodCode(TestAdministrationMethodCodeType value) {
        this.testAdministrationMethodCode = value;
    }

    /**
     * Gets the value of the testRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestRegistrationNumber() {
        return testRegistrationNumber;
    }

    /**
     * Sets the value of the testRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestRegistrationNumber(String value) {
        this.testRegistrationNumber = value;
    }

    /**
     * Gets the value of the scoreExclusionReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreExclusionReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreExclusionReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreExclusionReasonCodeType }
     * 
     * 
     */
    public List<ScoreExclusionReasonCodeType> getScoreExclusionReasonCode() {
        if (scoreExclusionReasonCode == null) {
            scoreExclusionReasonCode = new ArrayList<ScoreExclusionReasonCodeType>();
        }
        return this.scoreExclusionReasonCode;
    }

    /**
     * Gets the value of the nonStandardizedTestConditionsCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonStandardizedTestConditionsCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonStandardizedTestConditionsCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonStandardizedConditionsCodeType }
     * 
     * 
     */
    public List<NonStandardizedConditionsCodeType> getNonStandardizedTestConditionsCode() {
        if (nonStandardizedTestConditionsCode == null) {
            nonStandardizedTestConditionsCode = new ArrayList<NonStandardizedConditionsCodeType>();
        }
        return this.nonStandardizedTestConditionsCode;
    }

    /**
     * Gets the value of the testDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestDate() {
        return testDate;
    }

    /**
     * Sets the value of the testDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestDate(XMLGregorianCalendar value) {
        this.testDate = value;
    }

    /**
     * Gets the value of the testYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestYearMonth() {
        return testYearMonth;
    }

    /**
     * Sets the value of the testYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestYearMonth(XMLGregorianCalendar value) {
        this.testYearMonth = value;
    }

    /**
     * Gets the value of the testYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestYear() {
        return testYear;
    }

    /**
     * Sets the value of the testYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestYear(XMLGregorianCalendar value) {
        this.testYear = value;
    }

    /**
     * Gets the value of the studentLevel property.
     * 
     * @return
     *     possible object is
     *     {@link StudentLevelType }
     *     
     */
    public StudentLevelType getStudentLevel() {
        return studentLevel;
    }

    /**
     * Sets the value of the studentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentLevelType }
     *     
     */
    public void setStudentLevel(StudentLevelType value) {
        this.studentLevel = value;
    }

    /**
     * Gets the value of the educationSubtest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the educationSubtest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducationSubtest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EducationSubtestType }
     * 
     * 
     */
    public List<EducationSubtestType> getEducationSubtest() {
        if (educationSubtest == null) {
            educationSubtest = new ArrayList<EducationSubtestType>();
        }
        return this.educationSubtest;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoteMessage() {
        if (noteMessage == null) {
            noteMessage = new ArrayList<String>();
        }
        return this.noteMessage;
    }

    /**
     * Gets the value of the userDefinedExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public UserDefinedExtensionsType getUserDefinedExtensions() {
        return userDefinedExtensions;
    }

    /**
     * Sets the value of the userDefinedExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public void setUserDefinedExtensions(UserDefinedExtensionsType value) {
        this.userDefinedExtensions = value;
    }

}
