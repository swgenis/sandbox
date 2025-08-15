
package iso20022.payments.initiation;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherContact1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherContact1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChanlTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max4Text"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max128Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherContact1", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09", propOrder = {
    "chanlTp",
    "id"
})
public class OtherContact1 {

    @XmlElement(name = "ChanlTp", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09", required = true)
    protected String chanlTp;
    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected String id;

    /**
     * Gets the value of the chanlTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanlTp() {
        return chanlTp;
    }

    /**
     * Sets the value of the chanlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanlTp(String value) {
        this.chanlTp = value;
    }

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

}
