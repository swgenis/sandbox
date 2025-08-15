
package iso20022.payments.initiation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamePrefix2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NamePrefix2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DOCT"/&gt;
 *     &lt;enumeration value="MADM"/&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="MIST"/&gt;
 *     &lt;enumeration value="MIKS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NamePrefix2Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.09")
@XmlEnum
public enum NamePrefix2Code {

    DOCT,
    MADM,
    MISS,
    MIST,
    MIKS;

    public String value() {
        return name();
    }

    public static NamePrefix2Code fromValue(String v) {
        return valueOf(v);
    }

}
