
package iso20022.payments.initiation;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProxyAccountIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProxyAccountIdentification1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}ProxyAccountType1Choice" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max2048Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProxyAccountIdentification1", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09", propOrder = {
    "tp",
    "id"
})
public class ProxyAccountIdentification1 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected ProxyAccountType1Choice tp;
    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09", required = true)
    protected String id;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyAccountType1Choice }
     *     
     */
    public ProxyAccountType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyAccountType1Choice }
     *     
     */
    public void setTp(ProxyAccountType1Choice value) {
        this.tp = value;
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
