
package iso20022.payments.initiation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cheque11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cheque11"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChqTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}ChequeType2Code" minOccurs="0"/&gt;
 *         &lt;element name="ChqNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ChqFr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}NameAndAddress16" minOccurs="0"/&gt;
 *         &lt;element name="DlvryMtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}ChequeDeliveryMethod1Choice" minOccurs="0"/&gt;
 *         &lt;element name="DlvrTo" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}NameAndAddress16" minOccurs="0"/&gt;
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Priority2Code" minOccurs="0"/&gt;
 *         &lt;element name="ChqMtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="FrmsCd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="MemoFld" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max35Text" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="RgnlClrZone" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PrtLctn" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.09}Max70Text" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque11", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09", propOrder = {
    "chqTp",
    "chqNb",
    "chqFr",
    "dlvryMtd",
    "dlvrTo",
    "instrPrty",
    "chqMtrtyDt",
    "frmsCd",
    "memoFld",
    "rgnlClrZone",
    "prtLctn",
    "sgntr"
})
public class Cheque11 {

    @XmlElement(name = "ChqTp", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    @XmlSchemaType(name = "string")
    protected ChequeType2Code chqTp;
    @XmlElement(name = "ChqNb", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected String chqNb;
    @XmlElement(name = "ChqFr", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected NameAndAddress16 chqFr;
    @XmlElement(name = "DlvryMtd", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected ChequeDeliveryMethod1Choice dlvryMtd;
    @XmlElement(name = "DlvrTo", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected NameAndAddress16 dlvrTo;
    @XmlElement(name = "InstrPrty", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    @XmlSchemaType(name = "string")
    protected Priority2Code instrPrty;
    @XmlElement(name = "ChqMtrtyDt", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chqMtrtyDt;
    @XmlElement(name = "FrmsCd", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected String frmsCd;
    @XmlElement(name = "MemoFld", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected List<String> memoFld;
    @XmlElement(name = "RgnlClrZone", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected String rgnlClrZone;
    @XmlElement(name = "PrtLctn", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected String prtLctn;
    @XmlElement(name = "Sgntr", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
    protected List<String> sgntr;

    /**
     * Gets the value of the chqTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeType2Code }
     *     
     */
    public ChequeType2Code getChqTp() {
        return chqTp;
    }

    /**
     * Sets the value of the chqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeType2Code }
     *     
     */
    public void setChqTp(ChequeType2Code value) {
        this.chqTp = value;
    }

    /**
     * Gets the value of the chqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqNb() {
        return chqNb;
    }

    /**
     * Sets the value of the chqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChqNb(String value) {
        this.chqNb = value;
    }

    /**
     * Gets the value of the chqFr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress16 }
     *     
     */
    public NameAndAddress16 getChqFr() {
        return chqFr;
    }

    /**
     * Sets the value of the chqFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress16 }
     *     
     */
    public void setChqFr(NameAndAddress16 value) {
        this.chqFr = value;
    }

    /**
     * Gets the value of the dlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeDeliveryMethod1Choice }
     *     
     */
    public ChequeDeliveryMethod1Choice getDlvryMtd() {
        return dlvryMtd;
    }

    /**
     * Sets the value of the dlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeDeliveryMethod1Choice }
     *     
     */
    public void setDlvryMtd(ChequeDeliveryMethod1Choice value) {
        this.dlvryMtd = value;
    }

    /**
     * Gets the value of the dlvrTo property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress16 }
     *     
     */
    public NameAndAddress16 getDlvrTo() {
        return dlvrTo;
    }

    /**
     * Sets the value of the dlvrTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress16 }
     *     
     */
    public void setDlvrTo(NameAndAddress16 value) {
        this.dlvrTo = value;
    }

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setInstrPrty(Priority2Code value) {
        this.instrPrty = value;
    }

    /**
     * Gets the value of the chqMtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChqMtrtyDt() {
        return chqMtrtyDt;
    }

    /**
     * Sets the value of the chqMtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChqMtrtyDt(XMLGregorianCalendar value) {
        this.chqMtrtyDt = value;
    }

    /**
     * Gets the value of the frmsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmsCd() {
        return frmsCd;
    }

    /**
     * Sets the value of the frmsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmsCd(String value) {
        this.frmsCd = value;
    }

    /**
     * Gets the value of the memoFld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the memoFld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemoFld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMemoFld() {
        if (memoFld == null) {
            memoFld = new ArrayList<String>();
        }
        return this.memoFld;
    }

    /**
     * Gets the value of the rgnlClrZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgnlClrZone() {
        return rgnlClrZone;
    }

    /**
     * Sets the value of the rgnlClrZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgnlClrZone(String value) {
        this.rgnlClrZone = value;
    }

    /**
     * Gets the value of the prtLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtLctn() {
        return prtLctn;
    }

    /**
     * Sets the value of the prtLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtLctn(String value) {
        this.prtLctn = value;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSgntr() {
        if (sgntr == null) {
            sgntr = new ArrayList<String>();
        }
        return this.sgntr;
    }

}
