package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) -  Partyidentification
 */
@Schema(description = "(DDD Entity) -  Partyidentification ")
@Validated
public class Partyidentification {
    @JsonProperty("PartyIdentificationType")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Partyidentificationtypevalues partyIdentificationType = null;

    @JsonProperty("PartyIdentification")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Identifier partyIdentification = null;


    public Partyidentification partyIdentificationType(Partyidentificationtypevalues partyIdentificationType) {

        this.partyIdentificationType = partyIdentificationType;
        return this;
    }

    /**
     * Get partyIdentificationType
     *
     * @return partyIdentificationType
     **/

    @Schema(description = "")

    @Valid
    public Partyidentificationtypevalues getPartyIdentificationType() {
        return partyIdentificationType;
    }


    public void setPartyIdentificationType(Partyidentificationtypevalues partyIdentificationType) {
        this.partyIdentificationType = partyIdentificationType;
    }

    public Partyidentification partyIdentification(Identifier partyIdentification) {

        this.partyIdentification = partyIdentification;
        return this;
    }

    /**
     * Get partyIdentification
     *
     * @return partyIdentification
     **/

    @Schema(description = "")

    @Valid
    public Identifier getPartyIdentification() {
        return partyIdentification;
    }


    public void setPartyIdentification(Identifier partyIdentification) {
        this.partyIdentification = partyIdentification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Partyidentification partyidentification = (Partyidentification) o;
        return Objects.equals(this.partyIdentificationType, partyidentification.partyIdentificationType) &&
                Objects.equals(this.partyIdentification, partyidentification.partyIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partyIdentificationType, partyIdentification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Partyidentification {\n");

        sb.append("    partyIdentificationType: ").append(toIndentedString(partyIdentificationType)).append("\n");
        sb.append("    partyIdentification: ").append(toIndentedString(partyIdentification)).append("\n");
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
