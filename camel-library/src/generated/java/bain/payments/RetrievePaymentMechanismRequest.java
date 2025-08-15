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
 * RetrievePaymentMechanismRequest
 */
@Validated
public class RetrievePaymentMechanismRequest {
    @JsonProperty("PaymentExecutionTaskResult")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private TaskInputOutput paymentExecutionTaskResult = null;


    public RetrievePaymentMechanismRequest paymentExecutionTaskResult(TaskInputOutput paymentExecutionTaskResult) {

        this.paymentExecutionTaskResult = paymentExecutionTaskResult;
        return this;
    }

    /**
     * Get paymentExecutionTaskResult
     *
     * @return paymentExecutionTaskResult
     **/

    @Schema(description = "")

    @Valid
    public TaskInputOutput getPaymentExecutionTaskResult() {
        return paymentExecutionTaskResult;
    }


    public void setPaymentExecutionTaskResult(TaskInputOutput paymentExecutionTaskResult) {
        this.paymentExecutionTaskResult = paymentExecutionTaskResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetrievePaymentMechanismRequest retrievePaymentMechanismRequest = (RetrievePaymentMechanismRequest) o;
        return Objects.equals(this.paymentExecutionTaskResult, retrievePaymentMechanismRequest.paymentExecutionTaskResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentExecutionTaskResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetrievePaymentMechanismRequest {\n");

        sb.append("    paymentExecutionTaskResult: ").append(toIndentedString(paymentExecutionTaskResult)).append("\n");
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
