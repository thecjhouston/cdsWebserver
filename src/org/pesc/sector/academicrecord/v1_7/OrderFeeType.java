//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.sector.academicrecord.v1_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Fee Details
 * 
 * <p>Java class for OrderFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeStatusCode" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}FeeStatusCodeType" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{urn:org:pesc:core:CoreMain:v1.12.0}SmallCurrencyType" minOccurs="0"/>
 *         &lt;element name="FeeStatusReason" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}FeeStatusReasonType" minOccurs="0"/>
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
@XmlType(name = "OrderFeeType", propOrder = {
    "feeStatusCode",
    "feeAmount",
    "feeStatusReason",
    "noteMessage"
})
public class OrderFeeType {

    @XmlElement(name = "FeeStatusCode")
    protected FeeStatusCodeType feeStatusCode;
    @XmlElement(name = "FeeAmount")
    protected BigDecimal feeAmount;
    @XmlElement(name = "FeeStatusReason")
    protected String feeStatusReason;
    @XmlElement(name = "NoteMessage")
    protected String noteMessage;

    /**
     * Gets the value of the feeStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link FeeStatusCodeType }
     *     
     */
    public FeeStatusCodeType getFeeStatusCode() {
        return feeStatusCode;
    }

    /**
     * Sets the value of the feeStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeStatusCodeType }
     *     
     */
    public void setFeeStatusCode(FeeStatusCodeType value) {
        this.feeStatusCode = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeAmount(BigDecimal value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the feeStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeStatusReason() {
        return feeStatusReason;
    }

    /**
     * Sets the value of the feeStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeStatusReason(String value) {
        this.feeStatusReason = value;
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