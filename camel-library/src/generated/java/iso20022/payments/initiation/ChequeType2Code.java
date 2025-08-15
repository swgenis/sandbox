
package iso20022.payments.initiation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChequeType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CCHQ"/&gt;
 *     &lt;enumeration value="CCCH"/&gt;
 *     &lt;enumeration value="BCHQ"/&gt;
 *     &lt;enumeration value="DRFT"/&gt;
 *     &lt;enumeration value="ELDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChequeType2Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
@XmlEnum
public enum ChequeType2Code {

    CCHQ,
    CCCH,
    BCHQ,
    DRFT,
    ELDR;

    public String value() {
        return name();
    }

    public static ChequeType2Code fromValue(String v) {
        return valueOf(v);
    }

}
