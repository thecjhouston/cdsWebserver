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


/**
 * <p>Java class for TranscriptHoldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranscriptHoldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HoldType" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}HoldTypeType"/>
 *         &lt;element name="SessionDesignator" type="{urn:org:pesc:core:CoreMain:v1.12.0}SessionDesignatorType" minOccurs="0"/>
 *         &lt;element name="SessionName" type="{urn:org:pesc:core:CoreMain:v1.12.0}SessionNameType" minOccurs="0"/>
 *         &lt;element name="CourseTitle" type="{urn:org:pesc:core:CoreMain:v1.12.0}CourseTitleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcademicAwardTitle" type="{urn:org:pesc:core:CoreMain:v1.12.0}AcademicAwardTitleType" minOccurs="0"/>
 *         &lt;element name="ReleaseDate" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}ReleaseDateType" minOccurs="0"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.12.0}NoteMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranscriptHoldType", propOrder = {
    "holdType",
    "sessionDesignator",
    "sessionName",
    "courseTitle",
    "academicAwardTitle",
    "releaseDate",
    "noteMessage"
})
public class TranscriptHoldType {

    @XmlElement(name = "HoldType", required = true)
    protected HoldTypeType holdType;
    @XmlElement(name = "SessionDesignator")
    protected XMLGregorianCalendar sessionDesignator;
    @XmlElement(name = "SessionName")
    protected String sessionName;
    @XmlElement(name = "CourseTitle")
    protected List<String> courseTitle;
    @XmlElement(name = "AcademicAwardTitle")
    protected String academicAwardTitle;
    @XmlElement(name = "ReleaseDate")
    protected XMLGregorianCalendar releaseDate;
    @XmlElement(name = "NoteMessage")
    protected String noteMessage;

    /**
     * Gets the value of the holdType property.
     * 
     * @return
     *     possible object is
     *     {@link HoldTypeType }
     *     
     */
    public HoldTypeType getHoldType() {
        return holdType;
    }

    /**
     * Sets the value of the holdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldTypeType }
     *     
     */
    public void setHoldType(HoldTypeType value) {
        this.holdType = value;
    }

    /**
     * Gets the value of the sessionDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionDesignator() {
        return sessionDesignator;
    }

    /**
     * Sets the value of the sessionDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionDesignator(XMLGregorianCalendar value) {
        this.sessionDesignator = value;
    }

    /**
     * Gets the value of the sessionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Sets the value of the sessionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionName(String value) {
        this.sessionName = value;
    }

    /**
     * Gets the value of the courseTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCourseTitle() {
        if (courseTitle == null) {
            courseTitle = new ArrayList<String>();
        }
        return this.courseTitle;
    }

    /**
     * Gets the value of the academicAwardTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAwardTitle() {
        return academicAwardTitle;
    }

    /**
     * Sets the value of the academicAwardTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAwardTitle(String value) {
        this.academicAwardTitle = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(XMLGregorianCalendar value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteMessage() {
        return noteMessage;
    }

    /**
     * Sets the value of the noteMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteMessage(String value) {
        this.noteMessage = value;
    }

}