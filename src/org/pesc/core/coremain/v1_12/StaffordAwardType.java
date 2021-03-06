//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.core.coremain.v1_12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Stuff that is common to both Subsidized and Unsubsidized loans, which are both part of the Stafford program. 
 * 
 * <p>Java class for StaffordAwardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffordAwardType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:org:pesc:core:CoreMain:v1.12.0}LoanAwardType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffordAwardType")
@XmlSeeAlso({
    UnsubsidizedAwardType.class,
    AlternativeLoanAwardType.class,
    SubsidizedAwardType.class
})
public class StaffordAwardType
    extends LoanAwardType
{


}
