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
 * (DDD Entity) - Reference to the ACH financial gateway service used to execute payments ACHSession ||  |
 */
@Schema(description = "(DDD Entity) - Reference to the ACH financial gateway service used to execute payments ACHSession ||  |")
@Validated
public class ACHSession {
    @JsonProperty("ACHSessionIdentifier")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Identifier acHSessionIdentifier = null;


    public ACHSession acHSessionIdentifier(Identifier acHSessionIdentifier) {

        this.acHSessionIdentifier = acHSessionIdentifier;
        return this;
    }

    /**
     * Get acHSessionIdentifier
     *
     * @return acHSessionIdentifier
     **/

    @Schema(description = "")

    @Valid
    public Identifier getAcHSessionIdentifier() {
        return acHSessionIdentifier;
    }


    public void setAcHSessionIdentifier(Identifier acHSessionIdentifier) {
        this.acHSessionIdentifier = acHSessionIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ACHSession acHSession = (ACHSession) o;
        return Objects.equals(this.acHSessionIdentifier, acHSession.acHSessionIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acHSessionIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ACHSession {\n");

        sb.append("    acHSessionIdentifier: ").append(toIndentedString(acHSessionIdentifier)).append("\n");
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
