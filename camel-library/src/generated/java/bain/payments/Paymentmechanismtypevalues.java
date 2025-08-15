package bain.payments;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Paymentmechanismtypevalues
 */
@Validated
public class Paymentmechanismtypevalues {
    @JsonProperty("Paymentmechanismtypevalues")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private PaymentmechanismtypevaluesEnum paymentmechanismtypevalues = null;

    public Paymentmechanismtypevalues paymentmechanismtypevalues(PaymentmechanismtypevaluesEnum paymentmechanismtypevalues) {

        this.paymentmechanismtypevalues = paymentmechanismtypevalues;
        return this;
    }

    /**
     * >  * `ACH` -   * `SWIFT` -
     *
     * @return paymentmechanismtypevalues
     **/

    @Schema(description = ">  * `ACH` -   * `SWIFT` - ")

    public PaymentmechanismtypevaluesEnum getPaymentmechanismtypevalues() {
        return paymentmechanismtypevalues;
    }

    public void setPaymentmechanismtypevalues(PaymentmechanismtypevaluesEnum paymentmechanismtypevalues) {
        this.paymentmechanismtypevalues = paymentmechanismtypevalues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Paymentmechanismtypevalues paymentmechanismtypevalues = (Paymentmechanismtypevalues) o;
        return Objects.equals(this.paymentmechanismtypevalues, paymentmechanismtypevalues.paymentmechanismtypevalues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentmechanismtypevalues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Paymentmechanismtypevalues {\n");

        sb.append("    paymentmechanismtypevalues: ").append(toIndentedString(paymentmechanismtypevalues)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * >  * `ACH` -   * `SWIFT` -
     */
    public enum PaymentmechanismtypevaluesEnum {
        ACH("ACH"),

        SWIFT("SWIFT");

        private String value;

        PaymentmechanismtypevaluesEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static PaymentmechanismtypevaluesEnum fromValue(String text) {
            for (PaymentmechanismtypevaluesEnum b : PaymentmechanismtypevaluesEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}
