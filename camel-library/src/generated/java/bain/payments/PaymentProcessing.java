package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Specifies how a payment must be processed, for instance through which specific clearing channel. (ISO20022) PaymentProcessing|PaymentProcessing (https://www.iso20022.org/standardsrepository/type/PaymentProcessing)|Standard|ISO20022 BM ()
 */
@Schema(description = "(DDD Entity) - Specifies how a payment must be processed, for instance through which specific clearing channel. (ISO20022) PaymentProcessing|PaymentProcessing (https://www.iso20022.org/standardsrepository/type/PaymentProcessing)|Standard|ISO20022 BM ()")
@Validated
public class PaymentProcessing {
    @JsonProperty("Priority")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String priority = null;

    @JsonProperty("ServiceLevel")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String serviceLevel = null;

    @JsonProperty("ClearingChannel")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String clearingChannel = null;

    @JsonProperty("LocalInstrument")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String localInstrument = null;

    @JsonProperty("CategoryPurpose")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String categoryPurpose = null;

    @JsonProperty("PaymentExecution")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String paymentExecution = null;

    @JsonProperty("SequenceType")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String sequenceType = null;

    @JsonProperty("RelatedMandate")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedMandate = null;

    @JsonProperty("BankTransaction")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String bankTransaction = null;

    @JsonProperty("ContactPoint")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String contactPoint = null;

    @JsonProperty("AdviceType")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String adviceType = null;


    public PaymentProcessing priority(String priority) {

        this.priority = priority;
        return this;
    }

    /**
     * (DDD Entity) - Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.
     *
     * @return priority
     **/

    @Schema(description = "(DDD Entity) - Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction. ")

    public String getPriority() {
        return priority;
    }


    public void setPriority(String priority) {
        this.priority = priority;
    }

    public PaymentProcessing serviceLevel(String serviceLevel) {

        this.serviceLevel = serviceLevel;
        return this;
    }

    /**
     * (DDD Entity) - Agreement under which or rules under which the transaction should be processed.
     *
     * @return serviceLevel
     **/

    @Schema(description = "(DDD Entity) - Agreement under which or rules under which the transaction should be processed. ")

    public String getServiceLevel() {
        return serviceLevel;
    }


    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public PaymentProcessing clearingChannel(String clearingChannel) {

        this.clearingChannel = clearingChannel;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the clearing channel to be used to process the payment instruction.
     *
     * @return clearingChannel
     **/

    @Schema(description = "(DDD Entity) - Specifies the clearing channel to be used to process the payment instruction. ")

    public String getClearingChannel() {
        return clearingChannel;
    }


    public void setClearingChannel(String clearingChannel) {
        this.clearingChannel = clearingChannel;
    }

    public PaymentProcessing localInstrument(String localInstrument) {

        this.localInstrument = localInstrument;
        return this;
    }

    /**
     * (DDD Entity) - User community specific instrument. Usage : When available, codes provided by local authorities should be used.
     *
     * @return localInstrument
     **/

    @Schema(description = "(DDD Entity) - User community specific instrument. Usage : When available, codes provided by local authorities should be used. ")

    public String getLocalInstrument() {
        return localInstrument;
    }


    public void setLocalInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
    }

    public PaymentProcessing categoryPurpose(String categoryPurpose) {

        this.categoryPurpose = categoryPurpose;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the high level purpose of the instruction based on a set of pre-defined categories.
     *
     * @return categoryPurpose
     **/

    @Schema(description = "(DDD Entity) - Specifies the high level purpose of the instruction based on a set of pre-defined categories. ")

    public String getCategoryPurpose() {
        return categoryPurpose;
    }


    public void setCategoryPurpose(String categoryPurpose) {
        this.categoryPurpose = categoryPurpose;
    }

    public PaymentProcessing paymentExecution(String paymentExecution) {

        this.paymentExecution = paymentExecution;
        return this;
    }

    /**
     * (DDD Entity) - Payment execution process for which processing parameters are specified.
     *
     * @return paymentExecution
     **/

    @Schema(description = "(DDD Entity) - Payment execution process for which processing parameters are specified. ")

    public String getPaymentExecution() {
        return paymentExecution;
    }


    public void setPaymentExecution(String paymentExecution) {
        this.paymentExecution = paymentExecution;
    }

    public PaymentProcessing sequenceType(String sequenceType) {

        this.sequenceType = sequenceType;
        return this;
    }

    /**
     * (DDD Entity) - Identifies the payment sequence where applicable.
     *
     * @return sequenceType
     **/

    @Schema(description = "(DDD Entity) - Identifies the payment sequence where applicable. ")

    public String getSequenceType() {
        return sequenceType;
    }


    public void setSequenceType(String sequenceType) {
        this.sequenceType = sequenceType;
    }

    public PaymentProcessing relatedMandate(String relatedMandate) {

        this.relatedMandate = relatedMandate;
        return this;
    }

    /**
     * (DDD Entity) - Mandate for which payment processing parametres are specified.
     *
     * @return relatedMandate
     **/

    @Schema(description = "(DDD Entity) - Mandate for which payment processing parametres are specified. ")

    public String getRelatedMandate() {
        return relatedMandate;
    }


    public void setRelatedMandate(String relatedMandate) {
        this.relatedMandate = relatedMandate;
    }

    public PaymentProcessing bankTransaction(String bankTransaction) {

        this.bankTransaction = bankTransaction;
        return this;
    }

    /**
     * (DDD Entity) - Code of the underlying bank transaction.
     *
     * @return bankTransaction
     **/

    @Schema(description = "(DDD Entity) - Code of the underlying bank transaction. ")

    public String getBankTransaction() {
        return bankTransaction;
    }


    public void setBankTransaction(String bankTransaction) {
        this.bankTransaction = bankTransaction;
    }

    public PaymentProcessing contactPoint(String contactPoint) {

        this.contactPoint = contactPoint;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the notification method to be used to inform the beneficiary.
     *
     * @return contactPoint
     **/

    @Schema(description = "(DDD Entity) - Specifies the notification method to be used to inform the beneficiary. ")

    public String getContactPoint() {
        return contactPoint;
    }


    public void setContactPoint(String contactPoint) {
        this.contactPoint = contactPoint;
    }

    public PaymentProcessing adviceType(String adviceType) {

        this.adviceType = adviceType;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the type of advice to report back for the transaction.
     *
     * @return adviceType
     **/

    @Schema(description = "(DDD Entity) - Specifies the type of advice to report back for the transaction. ")

    public String getAdviceType() {
        return adviceType;
    }


    public void setAdviceType(String adviceType) {
        this.adviceType = adviceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentProcessing paymentProcessing = (PaymentProcessing) o;
        return Objects.equals(this.priority, paymentProcessing.priority) &&
                Objects.equals(this.serviceLevel, paymentProcessing.serviceLevel) &&
                Objects.equals(this.clearingChannel, paymentProcessing.clearingChannel) &&
                Objects.equals(this.localInstrument, paymentProcessing.localInstrument) &&
                Objects.equals(this.categoryPurpose, paymentProcessing.categoryPurpose) &&
                Objects.equals(this.paymentExecution, paymentProcessing.paymentExecution) &&
                Objects.equals(this.sequenceType, paymentProcessing.sequenceType) &&
                Objects.equals(this.relatedMandate, paymentProcessing.relatedMandate) &&
                Objects.equals(this.bankTransaction, paymentProcessing.bankTransaction) &&
                Objects.equals(this.contactPoint, paymentProcessing.contactPoint) &&
                Objects.equals(this.adviceType, paymentProcessing.adviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, serviceLevel, clearingChannel, localInstrument, categoryPurpose, paymentExecution, sequenceType, relatedMandate, bankTransaction, contactPoint, adviceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentProcessing {\n");

        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
        sb.append("    clearingChannel: ").append(toIndentedString(clearingChannel)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    categoryPurpose: ").append(toIndentedString(categoryPurpose)).append("\n");
        sb.append("    paymentExecution: ").append(toIndentedString(paymentExecution)).append("\n");
        sb.append("    sequenceType: ").append(toIndentedString(sequenceType)).append("\n");
        sb.append("    relatedMandate: ").append(toIndentedString(relatedMandate)).append("\n");
        sb.append("    bankTransaction: ").append(toIndentedString(bankTransaction)).append("\n");
        sb.append("    contactPoint: ").append(toIndentedString(contactPoint)).append("\n");
        sb.append("    adviceType: ").append(toIndentedString(adviceType)).append("\n");
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
