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
 * (DDD Entity) - Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Payment Execution.
 */
@Schema(description = "(DDD Entity) - Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Payment Execution. ")
@Validated
public class UpdatePaymentExecutionProcedure {
    @JsonProperty("ACHAccessServiceSessionReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private ACHSession acHAccessServiceSessionReference = null;

    @JsonProperty("ACHAccessSchedule")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Schedule acHAccessSchedule = null;

    @JsonProperty("CorrespondentServiceSessionReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private CorrespondentServiceSession correspondentServiceSessionReference = null;

    @JsonProperty("CorrespondentServiceAccessSchedule")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Schedule correspondentServiceAccessSchedule = null;

    @JsonProperty("PaymentTransactionInitiatorReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Involvedparty paymentTransactionInitiatorReference = null;

    @JsonProperty("PaymentOrderReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Payment paymentOrderReference = null;

    @JsonProperty("PayerReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Involvedparty payerReference = null;

    @JsonProperty("PayerBankReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Involvedparty payerBankReference = null;

    @JsonProperty("PayerProductInstanceReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private ProductAgreement payerProductInstanceReference = null;

    @JsonProperty("PayeeReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Involvedparty payeeReference = null;

    @JsonProperty("PayeeBankReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Involvedparty payeeBankReference = null;

    @JsonProperty("PayeeProductInstanceReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private ProductAgreement payeeProductInstanceReference = null;

    @JsonProperty("Amount")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String amount = null;

    @JsonProperty("Currency")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String currency = null;

    @JsonProperty("DateType")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Paymentdatetimetypevalues dateType = null;

    @JsonProperty("Date")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String date = null;

    @JsonProperty("WashAccountReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Account washAccountReference = null;

    @JsonProperty("IntermediaryAccountReference")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Account intermediaryAccountReference = null;

    @JsonProperty("PaymentMechanismType")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Paymentmechanismtypevalues paymentMechanismType = null;

    @JsonProperty("PaymentProcessingConfiguration")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private PaymentProcessing paymentProcessingConfiguration = null;

    @JsonProperty("SettlementInstruction")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private CashSettlement settlementInstruction = null;


    public UpdatePaymentExecutionProcedure acHAccessServiceSessionReference(ACHSession acHAccessServiceSessionReference) {

        this.acHAccessServiceSessionReference = acHAccessServiceSessionReference;
        return this;
    }

    /**
     * Get acHAccessServiceSessionReference
     *
     * @return acHAccessServiceSessionReference
     **/

    @Schema(description = "")

    @Valid
    public ACHSession getAcHAccessServiceSessionReference() {
        return acHAccessServiceSessionReference;
    }


    public void setAcHAccessServiceSessionReference(ACHSession acHAccessServiceSessionReference) {
        this.acHAccessServiceSessionReference = acHAccessServiceSessionReference;
    }

    public UpdatePaymentExecutionProcedure acHAccessSchedule(Schedule acHAccessSchedule) {

        this.acHAccessSchedule = acHAccessSchedule;
        return this;
    }

    /**
     * Get acHAccessSchedule
     *
     * @return acHAccessSchedule
     **/

    @Schema(description = "")

    @Valid
    public Schedule getAcHAccessSchedule() {
        return acHAccessSchedule;
    }


    public void setAcHAccessSchedule(Schedule acHAccessSchedule) {
        this.acHAccessSchedule = acHAccessSchedule;
    }

    public UpdatePaymentExecutionProcedure correspondentServiceSessionReference(CorrespondentServiceSession correspondentServiceSessionReference) {

        this.correspondentServiceSessionReference = correspondentServiceSessionReference;
        return this;
    }

    /**
     * Get correspondentServiceSessionReference
     *
     * @return correspondentServiceSessionReference
     **/

    @Schema(description = "")

    @Valid
    public CorrespondentServiceSession getCorrespondentServiceSessionReference() {
        return correspondentServiceSessionReference;
    }


    public void setCorrespondentServiceSessionReference(CorrespondentServiceSession correspondentServiceSessionReference) {
        this.correspondentServiceSessionReference = correspondentServiceSessionReference;
    }

    public UpdatePaymentExecutionProcedure correspondentServiceAccessSchedule(Schedule correspondentServiceAccessSchedule) {

        this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
        return this;
    }

    /**
     * Get correspondentServiceAccessSchedule
     *
     * @return correspondentServiceAccessSchedule
     **/

    @Schema(description = "")

    @Valid
    public Schedule getCorrespondentServiceAccessSchedule() {
        return correspondentServiceAccessSchedule;
    }


    public void setCorrespondentServiceAccessSchedule(Schedule correspondentServiceAccessSchedule) {
        this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
    }

    public UpdatePaymentExecutionProcedure paymentTransactionInitiatorReference(Involvedparty paymentTransactionInitiatorReference) {

        this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
        return this;
    }

    /**
     * Get paymentTransactionInitiatorReference
     *
     * @return paymentTransactionInitiatorReference
     **/

    @Schema(description = "")

    @Valid
    public Involvedparty getPaymentTransactionInitiatorReference() {
        return paymentTransactionInitiatorReference;
    }


    public void setPaymentTransactionInitiatorReference(Involvedparty paymentTransactionInitiatorReference) {
        this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    }

    public UpdatePaymentExecutionProcedure paymentOrderReference(Payment paymentOrderReference) {

        this.paymentOrderReference = paymentOrderReference;
        return this;
    }

    /**
     * Get paymentOrderReference
     *
     * @return paymentOrderReference
     **/

    @Schema(description = "")

    @Valid
    public Payment getPaymentOrderReference() {
        return paymentOrderReference;
    }


    public void setPaymentOrderReference(Payment paymentOrderReference) {
        this.paymentOrderReference = paymentOrderReference;
    }

    public UpdatePaymentExecutionProcedure payerReference(Involvedparty payerReference) {

        this.payerReference = payerReference;
        return this;
    }

    /**
     * Get payerReference
     *
     * @return payerReference
     **/

    @Schema(description = "")

    @Valid
    public Involvedparty getPayerReference() {
        return payerReference;
    }


    public void setPayerReference(Involvedparty payerReference) {
        this.payerReference = payerReference;
    }

    public UpdatePaymentExecutionProcedure payerBankReference(Involvedparty payerBankReference) {

        this.payerBankReference = payerBankReference;
        return this;
    }

    /**
     * Get payerBankReference
     *
     * @return payerBankReference
     **/

    @Schema(description = "")

    @Valid
    public Involvedparty getPayerBankReference() {
        return payerBankReference;
    }


    public void setPayerBankReference(Involvedparty payerBankReference) {
        this.payerBankReference = payerBankReference;
    }

    public UpdatePaymentExecutionProcedure payerProductInstanceReference(ProductAgreement payerProductInstanceReference) {

        this.payerProductInstanceReference = payerProductInstanceReference;
        return this;
    }

    /**
     * Get payerProductInstanceReference
     *
     * @return payerProductInstanceReference
     **/

    @Schema(description = "")

    @Valid
    public ProductAgreement getPayerProductInstanceReference() {
        return payerProductInstanceReference;
    }


    public void setPayerProductInstanceReference(ProductAgreement payerProductInstanceReference) {
        this.payerProductInstanceReference = payerProductInstanceReference;
    }

    public UpdatePaymentExecutionProcedure payeeReference(Involvedparty payeeReference) {

        this.payeeReference = payeeReference;
        return this;
    }

    /**
     * Get payeeReference
     *
     * @return payeeReference
     **/

    @Schema(description = "")

    @Valid
    public Involvedparty getPayeeReference() {
        return payeeReference;
    }


    public void setPayeeReference(Involvedparty payeeReference) {
        this.payeeReference = payeeReference;
    }

    public UpdatePaymentExecutionProcedure payeeBankReference(Involvedparty payeeBankReference) {

        this.payeeBankReference = payeeBankReference;
        return this;
    }

    /**
     * Get payeeBankReference
     *
     * @return payeeBankReference
     **/

    @Schema(description = "")

    @Valid
    public Involvedparty getPayeeBankReference() {
        return payeeBankReference;
    }


    public void setPayeeBankReference(Involvedparty payeeBankReference) {
        this.payeeBankReference = payeeBankReference;
    }

    public UpdatePaymentExecutionProcedure payeeProductInstanceReference(ProductAgreement payeeProductInstanceReference) {

        this.payeeProductInstanceReference = payeeProductInstanceReference;
        return this;
    }

    /**
     * Get payeeProductInstanceReference
     *
     * @return payeeProductInstanceReference
     **/

    @Schema(description = "")

    @Valid
    public ProductAgreement getPayeeProductInstanceReference() {
        return payeeProductInstanceReference;
    }


    public void setPayeeProductInstanceReference(ProductAgreement payeeProductInstanceReference) {
        this.payeeProductInstanceReference = payeeProductInstanceReference;
    }

    public UpdatePaymentExecutionProcedure amount(String amount) {

        this.amount = amount;
        return this;
    }

    /**
     * (DDD Entity) - Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217. The decimal separator is a dot. Note: A zero amount is considered a positive amount.
     *
     * @return amount
     **/

    @Schema(description = "(DDD Entity) - Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217. The decimal separator is a dot. Note: A zero amount is considered a positive amount.")

    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }

    public UpdatePaymentExecutionProcedure currency(String currency) {

        this.currency = currency;
        return this;
    }

    /**
     * (DDD Entity) - Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters.
     *
     * @return currency
     **/

    @Schema(description = "(DDD Entity) - Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters.")

    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public UpdatePaymentExecutionProcedure dateType(Paymentdatetimetypevalues dateType) {

        this.dateType = dateType;
        return this;
    }

    /**
     * Get dateType
     *
     * @return dateType
     **/

    @Schema(description = "")

    @Valid
    public Paymentdatetimetypevalues getDateType() {
        return dateType;
    }


    public void setDateType(Paymentdatetimetypevalues dateType) {
        this.dateType = dateType;
    }

    public UpdatePaymentExecutionProcedure date(String date) {

        this.date = date;
        return this;
    }

    /**
     * (DDD Entity) - A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00  -  the beginning of a calendar day 24:00:00  -  the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.
     *
     * @return date
     **/

    @Schema(description = "(DDD Entity) - A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00  -  the beginning of a calendar day 24:00:00  -  the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.")

    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public UpdatePaymentExecutionProcedure washAccountReference(Account washAccountReference) {

        this.washAccountReference = washAccountReference;
        return this;
    }

    /**
     * Get washAccountReference
     *
     * @return washAccountReference
     **/

    @Schema(description = "")

    @Valid
    public Account getWashAccountReference() {
        return washAccountReference;
    }


    public void setWashAccountReference(Account washAccountReference) {
        this.washAccountReference = washAccountReference;
    }

    public UpdatePaymentExecutionProcedure intermediaryAccountReference(Account intermediaryAccountReference) {

        this.intermediaryAccountReference = intermediaryAccountReference;
        return this;
    }

    /**
     * Get intermediaryAccountReference
     *
     * @return intermediaryAccountReference
     **/

    @Schema(description = "")

    @Valid
    public Account getIntermediaryAccountReference() {
        return intermediaryAccountReference;
    }


    public void setIntermediaryAccountReference(Account intermediaryAccountReference) {
        this.intermediaryAccountReference = intermediaryAccountReference;
    }

    public UpdatePaymentExecutionProcedure paymentMechanismType(Paymentmechanismtypevalues paymentMechanismType) {

        this.paymentMechanismType = paymentMechanismType;
        return this;
    }

    /**
     * Get paymentMechanismType
     *
     * @return paymentMechanismType
     **/

    @Schema(description = "")

    @Valid
    public Paymentmechanismtypevalues getPaymentMechanismType() {
        return paymentMechanismType;
    }


    public void setPaymentMechanismType(Paymentmechanismtypevalues paymentMechanismType) {
        this.paymentMechanismType = paymentMechanismType;
    }

    public UpdatePaymentExecutionProcedure paymentProcessingConfiguration(PaymentProcessing paymentProcessingConfiguration) {

        this.paymentProcessingConfiguration = paymentProcessingConfiguration;
        return this;
    }

    /**
     * Get paymentProcessingConfiguration
     *
     * @return paymentProcessingConfiguration
     **/

    @Schema(description = "")

    @Valid
    public PaymentProcessing getPaymentProcessingConfiguration() {
        return paymentProcessingConfiguration;
    }


    public void setPaymentProcessingConfiguration(PaymentProcessing paymentProcessingConfiguration) {
        this.paymentProcessingConfiguration = paymentProcessingConfiguration;
    }

    public UpdatePaymentExecutionProcedure settlementInstruction(CashSettlement settlementInstruction) {

        this.settlementInstruction = settlementInstruction;
        return this;
    }

    /**
     * Get settlementInstruction
     *
     * @return settlementInstruction
     **/

    @Schema(description = "")

    @Valid
    public CashSettlement getSettlementInstruction() {
        return settlementInstruction;
    }


    public void setSettlementInstruction(CashSettlement settlementInstruction) {
        this.settlementInstruction = settlementInstruction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePaymentExecutionProcedure updatePaymentExecutionProcedure = (UpdatePaymentExecutionProcedure) o;
        return Objects.equals(this.acHAccessServiceSessionReference, updatePaymentExecutionProcedure.acHAccessServiceSessionReference) &&
                Objects.equals(this.acHAccessSchedule, updatePaymentExecutionProcedure.acHAccessSchedule) &&
                Objects.equals(this.correspondentServiceSessionReference, updatePaymentExecutionProcedure.correspondentServiceSessionReference) &&
                Objects.equals(this.correspondentServiceAccessSchedule, updatePaymentExecutionProcedure.correspondentServiceAccessSchedule) &&
                Objects.equals(this.paymentTransactionInitiatorReference, updatePaymentExecutionProcedure.paymentTransactionInitiatorReference) &&
                Objects.equals(this.paymentOrderReference, updatePaymentExecutionProcedure.paymentOrderReference) &&
                Objects.equals(this.payerReference, updatePaymentExecutionProcedure.payerReference) &&
                Objects.equals(this.payerBankReference, updatePaymentExecutionProcedure.payerBankReference) &&
                Objects.equals(this.payerProductInstanceReference, updatePaymentExecutionProcedure.payerProductInstanceReference) &&
                Objects.equals(this.payeeReference, updatePaymentExecutionProcedure.payeeReference) &&
                Objects.equals(this.payeeBankReference, updatePaymentExecutionProcedure.payeeBankReference) &&
                Objects.equals(this.payeeProductInstanceReference, updatePaymentExecutionProcedure.payeeProductInstanceReference) &&
                Objects.equals(this.amount, updatePaymentExecutionProcedure.amount) &&
                Objects.equals(this.currency, updatePaymentExecutionProcedure.currency) &&
                Objects.equals(this.dateType, updatePaymentExecutionProcedure.dateType) &&
                Objects.equals(this.date, updatePaymentExecutionProcedure.date) &&
                Objects.equals(this.washAccountReference, updatePaymentExecutionProcedure.washAccountReference) &&
                Objects.equals(this.intermediaryAccountReference, updatePaymentExecutionProcedure.intermediaryAccountReference) &&
                Objects.equals(this.paymentMechanismType, updatePaymentExecutionProcedure.paymentMechanismType) &&
                Objects.equals(this.paymentProcessingConfiguration, updatePaymentExecutionProcedure.paymentProcessingConfiguration) &&
                Objects.equals(this.settlementInstruction, updatePaymentExecutionProcedure.settlementInstruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acHAccessServiceSessionReference, acHAccessSchedule, correspondentServiceSessionReference, correspondentServiceAccessSchedule, paymentTransactionInitiatorReference, paymentOrderReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, date, washAccountReference, intermediaryAccountReference, paymentMechanismType, paymentProcessingConfiguration, settlementInstruction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePaymentExecutionProcedure {\n");

        sb.append("    acHAccessServiceSessionReference: ").append(toIndentedString(acHAccessServiceSessionReference)).append("\n");
        sb.append("    acHAccessSchedule: ").append(toIndentedString(acHAccessSchedule)).append("\n");
        sb.append("    correspondentServiceSessionReference: ").append(toIndentedString(correspondentServiceSessionReference)).append("\n");
        sb.append("    correspondentServiceAccessSchedule: ").append(toIndentedString(correspondentServiceAccessSchedule)).append("\n");
        sb.append("    paymentTransactionInitiatorReference: ").append(toIndentedString(paymentTransactionInitiatorReference)).append("\n");
        sb.append("    paymentOrderReference: ").append(toIndentedString(paymentOrderReference)).append("\n");
        sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
        sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
        sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
        sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
        sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
        sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    washAccountReference: ").append(toIndentedString(washAccountReference)).append("\n");
        sb.append("    intermediaryAccountReference: ").append(toIndentedString(intermediaryAccountReference)).append("\n");
        sb.append("    paymentMechanismType: ").append(toIndentedString(paymentMechanismType)).append("\n");
        sb.append("    paymentProcessingConfiguration: ").append(toIndentedString(paymentProcessingConfiguration)).append("\n");
        sb.append("    settlementInstruction: ").append(toIndentedString(settlementInstruction)).append("\n");
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
