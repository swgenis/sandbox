package bain.payments;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Reference to the payer&#x27;s account (the source of funds) ProductAgreement ||  |
 */
@Schema(description = "(DDD Entity) - Reference to the payer's account (the source of funds) ProductAgreement ||  |")
@Validated
public class Productagreementtypevalues {
    @JsonProperty("Productagreementtypevalues")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private ProductagreementtypevaluesEnum productagreementtypevalues = null;

    public Productagreementtypevalues productagreementtypevalues(ProductagreementtypevaluesEnum productagreementtypevalues) {

        this.productagreementtypevalues = productagreementtypevalues;
        return this;
    }

    /**
     * >  * `CurrentAccountAgreement` -   * `SavingsAccountAgreement` -   * `BrokeredProductAgreement` -   * `ConsumerLoanAgreement` -   * `MortgageLoanAgreement` -   * `DirectDebitServiceAgreement` -   * `TermDepositAgreement` -
     *
     * @return productagreementtypevalues
     **/

    @Schema(description = ">  * `CurrentAccountAgreement` -   * `SavingsAccountAgreement` -   * `BrokeredProductAgreement` -   * `ConsumerLoanAgreement` -   * `MortgageLoanAgreement` -   * `DirectDebitServiceAgreement` -   * `TermDepositAgreement` - ")

    public ProductagreementtypevaluesEnum getProductagreementtypevalues() {
        return productagreementtypevalues;
    }

    public void setProductagreementtypevalues(ProductagreementtypevaluesEnum productagreementtypevalues) {
        this.productagreementtypevalues = productagreementtypevalues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Productagreementtypevalues productagreementtypevalues = (Productagreementtypevalues) o;
        return Objects.equals(this.productagreementtypevalues, productagreementtypevalues.productagreementtypevalues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productagreementtypevalues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Productagreementtypevalues {\n");

        sb.append("    productagreementtypevalues: ").append(toIndentedString(productagreementtypevalues)).append("\n");
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
     * >  * `CurrentAccountAgreement` -   * `SavingsAccountAgreement` -   * `BrokeredProductAgreement` -   * `ConsumerLoanAgreement` -   * `MortgageLoanAgreement` -   * `DirectDebitServiceAgreement` -   * `TermDepositAgreement` -
     */
    public enum ProductagreementtypevaluesEnum {
        CURRENTACCOUNTAGREEMENT("CurrentAccountAgreement"),

        SAVINGSACCOUNTAGREEMENT("SavingsAccountAgreement"),

        BROKEREDPRODUCTAGREEMENT("BrokeredProductAgreement"),

        CONSUMERLOANAGREEMENT("ConsumerLoanAgreement"),

        MORTGAGELOANAGREEMENT("MortgageLoanAgreement"),

        DIRECTDEBITSERVICEAGREEMENT("DirectDebitServiceAgreement"),

        TERMDEPOSITAGREEMENT("TermDepositAgreement");

        private String value;

        ProductagreementtypevaluesEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ProductagreementtypevaluesEnum fromValue(String text) {
            for (ProductagreementtypevaluesEnum b : ProductagreementtypevaluesEnum.values()) {
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
