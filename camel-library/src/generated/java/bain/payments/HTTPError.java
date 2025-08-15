package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Status Attributes
 */
@Schema(description = "Status Attributes")
@Validated
public class HTTPError {

    @JsonProperty("status_code")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String statusCode = null;

    @JsonProperty("status")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String status = null;

    @JsonProperty("message")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String message = null;


    public HTTPError statusCode(String statusCode) {

        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get statusCode
     *
     * @return statusCode
     **/

    @Schema(description = "")

    public String getStatusCode() {
        return statusCode;
    }


    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public HTTPError status(String status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/

    @Schema(description = "")

    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public HTTPError message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/

    @Schema(description = "")

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HTTPError htTPError = (HTTPError) o;
        return Objects.equals(this.statusCode, htTPError.statusCode) &&
                Objects.equals(this.status, htTPError.status) &&
                Objects.equals(this.message, htTPError.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, status, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HTTPError {\n");

        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
