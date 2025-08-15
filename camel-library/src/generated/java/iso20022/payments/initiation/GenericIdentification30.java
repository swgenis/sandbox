
package iso20022.payments.initiation;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericIdentification30 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericIdentification30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Exact4AlphaNumericText"/&gt;
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max35Text"/&gt;
 *         &lt;element name="SchmeNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericIdentification30", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09", propOrder = {
    "id",
    "issr",
    "schmeNm"
})
public class GenericIdentification30 {

    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09", required = true)
    protected String id;
    @XmlElement(name = "Issr", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09", required = true)
    protected String issr;
    @XmlElement(name = "SchmeNm", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected String schmeNm;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

    /**
     * Gets the value of the schmeNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmeNm() {
        return schmeNm;
    }

    /**
     * Sets the value of the schmeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchmeNm(String value) {
        this.schmeNm = value;
    }

}
