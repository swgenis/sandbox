package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;

/**
 * (DDD Entity) - Reference to the SWIFT gateway service used to execute correspondent payments CorrespondentServiceSession ||  |
 */
@Schema(description = "(DDD Entity) - Reference to the SWIFT gateway service used to execute correspondent payments CorrespondentServiceSession ||  |")
@Validated
public class CorrespondentServiceSession {

    @JsonProperty("CorrespondentServiceSessionIdentifier")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Identifier correspondentServiceSessionIdentifier = null;


    public CorrespondentServiceSession correspondentServiceSessionIdentifier(Identifier correspondentServiceSessionIdentifier) {

        this.correspondentServiceSessionIdentifier = correspondentServiceSessionIdentifier;
        return this;
    }

    /**
     * Get correspondentServiceSessionIdentifier
     *
     * @return correspondentServiceSessionIdentifier
     **/

    @Schema(description = "")

    @Valid
    public Identifier getCorrespondentServiceSessionIdentifier() {
        return correspondentServiceSessionIdentifier;
    }


    public void setCorrespondentServiceSessionIdentifier(Identifier correspondentServiceSessionIdentifier) {
        this.correspondentServiceSessionIdentifier = correspondentServiceSessionIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorrespondentServiceSession correspondentServiceSession = (CorrespondentServiceSession) o;
        return Objects.equals(this.correspondentServiceSessionIdentifier, correspondentServiceSession.correspondentServiceSessionIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correspondentServiceSessionIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorrespondentServiceSession {\n");

        sb.append("    correspondentServiceSessionIdentifier: ").append(toIndentedString(correspondentServiceSessionIdentifier)).append("\n");
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
