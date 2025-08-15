package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.Valid;
import java.util.Objects;

/**
 * (DDD Entity) - Reference to the payer&#x27;s account (the source of funds) ProductAgreement ||  |
 */
@Schema(description = "(DDD Entity) - Reference to the payer's account (the source of funds) ProductAgreement ||  |")
@Validated
public class ProductAgreement {
    @JsonProperty("ProductAgreementType")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Productagreementtypevalues productAgreementType = null;


    public ProductAgreement productAgreementType(Productagreementtypevalues productAgreementType) {

        this.productAgreementType = productAgreementType;
        return this;
    }

    /**
     * Get productAgreementType
     *
     * @return productAgreementType
     **/

    @Schema(description = "")

    @Valid
    public Productagreementtypevalues getProductAgreementType() {
        return productAgreementType;
    }


    public void setProductAgreementType(Productagreementtypevalues productAgreementType) {
        this.productAgreementType = productAgreementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductAgreement productAgreement = (ProductAgreement) o;
        return Objects.equals(this.productAgreementType, productAgreement.productAgreementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productAgreementType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductAgreement {\n");

        sb.append("    productAgreementType: ").append(toIndentedString(productAgreementType)).append("\n");
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
}
