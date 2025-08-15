package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Reference to the payment order leading to the execution request Payment|Payment (https://www.iso20022.org/standardsrepository/type/Payment)|Standard|ISO20022 BM ()
 */
@Schema(description = "(DDD Entity) - Reference to the payment order leading to the execution request Payment|Payment (https://www.iso20022.org/standardsrepository/type/Payment)|Standard|ISO20022 BM ()")
@Validated
public class Payment {
    @JsonProperty("PaymentObligation")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String paymentObligation = null;

    @JsonProperty("CurrencyOfTransfer")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String currencyOfTransfer = null;

    @JsonProperty("CreditMethod")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String creditMethod = null;

    @JsonProperty("Type")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String type = null;

    @JsonProperty("InstructedAmount")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String instructedAmount = null;

    @JsonProperty("Priority")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String priority = null;

    @JsonProperty("ValueDate")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String valueDate = null;

    @JsonProperty("PaymentStatus")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String paymentStatus = null;

    @JsonProperty("PartyRole")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String partyRole = null;

    @JsonProperty("TaxOnPayment")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String taxOnPayment = null;

    @JsonProperty("PaymentExecution")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String paymentExecution = null;

    @JsonProperty("PoolingAdjustmentDate")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String poolingAdjustmentDate = null;

    @JsonProperty("EquivalentAmount")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String equivalentAmount = null;

    @JsonProperty("CurrencyExchange")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String currencyExchange = null;

    @JsonProperty("InstructionForCreditorAgent")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String instructionForCreditorAgent = null;

    @JsonProperty("InstructionForDebtorAgent")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String instructionForDebtorAgent = null;

    @JsonProperty("PaymentRelatedIdentifications")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String paymentRelatedIdentifications = null;

    @JsonProperty("RelatedInvestigationCase")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedInvestigationCase = null;

    @JsonProperty("SettlementTimeRequest")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String settlementTimeRequest = null;

    @JsonProperty("Amount")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String amount = null;

    @JsonProperty("TradeSettlement")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String tradeSettlement = null;

    @JsonProperty("StandardSettlementInstructions")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String standardSettlementInstructions = null;

    @JsonProperty("RelatedDebitAuthorisation")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedDebitAuthorisation = null;

    @JsonProperty("RelatedInvestigationCaseResolution")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedInvestigationCaseResolution = null;

    @JsonProperty("OriginalPayment")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String originalPayment = null;

    @JsonProperty("ReturnPayment")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String returnPayment = null;

    @JsonProperty("RelatedSecuritiesSettlement")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedSecuritiesSettlement = null;

    @JsonProperty("InvoiceReconciliation")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String invoiceReconciliation = null;

    @JsonProperty("PaymentInstrument")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String paymentInstrument = null;

    @JsonProperty("Account")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String account = null;

    @JsonProperty("Adjustments")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String adjustments = null;

    @JsonProperty("ContractRegistration")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String contractRegistration = null;


    public Payment paymentObligation(String paymentObligation) {

        this.paymentObligation = paymentObligation;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the obligation which created the payment.
     *
     * @return paymentObligation
     **/

    @Schema(description = "(DDD Entity) - Specifies the obligation which created the payment. ")

    public String getPaymentObligation() {
        return paymentObligation;
    }


    public void setPaymentObligation(String paymentObligation) {
        this.paymentObligation = paymentObligation;
    }

    public Payment currencyOfTransfer(String currencyOfTransfer) {

        this.currencyOfTransfer = currencyOfTransfer;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account.
     *
     * @return currencyOfTransfer
     **/

    @Schema(description = "(DDD Entity) - Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account. ")

    public String getCurrencyOfTransfer() {
        return currencyOfTransfer;
    }


    public void setCurrencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
    }

    public Payment creditMethod(String creditMethod) {

        this.creditMethod = creditMethod;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the transfer method to be used for the credit.
     *
     * @return creditMethod
     **/

    @Schema(description = "(DDD Entity) - Specifies the transfer method to be used for the credit. ")

    public String getCreditMethod() {
        return creditMethod;
    }


    public void setCreditMethod(String creditMethod) {
        this.creditMethod = creditMethod;
    }

    public Payment type(String type) {

        this.type = type;
        return this;
    }

    /**
     * (DDD Entity) - Type, or nature, of the payment, eg, express payment.
     *
     * @return type
     **/

    @Schema(description = "(DDD Entity) - Type, or nature, of the payment, eg, express payment. ")

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public Payment instructedAmount(String instructedAmount) {

        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * (DDD Entity) - Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.
     *
     * @return instructedAmount
     **/

    @Schema(description = "(DDD Entity) - Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. ")

    public String getInstructedAmount() {
        return instructedAmount;
    }


    public void setInstructedAmount(String instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public Payment priority(String priority) {

        this.priority = priority;
        return this;
    }

    /**
     * (DDD Entity) - Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing.
     *
     * @return priority
     **/

    @Schema(description = "(DDD Entity) - Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing. ")

    public String getPriority() {
        return priority;
    }


    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Payment valueDate(String valueDate) {

        this.valueDate = valueDate;
        return this;
    }

    /**
     * (DDD Entity) - Date on which a payment must be executed
     *
     * @return valueDate
     **/

    @Schema(description = "(DDD Entity) - Date on which a payment must be executed ")

    public String getValueDate() {
        return valueDate;
    }


    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public Payment paymentStatus(String paymentStatus) {

        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the status of a payment at a specified time.
     *
     * @return paymentStatus
     **/

    @Schema(description = "(DDD Entity) - Specifies the status of a payment at a specified time. ")

    public String getPaymentStatus() {
        return paymentStatus;
    }


    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Payment partyRole(String partyRole) {

        this.partyRole = partyRole;
        return this;
    }

    /**
     * (DDD Entity) - Specifies each role linked to a payment and played by a party at that step in a payment flow.
     *
     * @return partyRole
     **/

    @Schema(description = "(DDD Entity) - Specifies each role linked to a payment and played by a party at that step in a payment flow. ")

    public String getPartyRole() {
        return partyRole;
    }


    public void setPartyRole(String partyRole) {
        this.partyRole = partyRole;
    }

    public Payment taxOnPayment(String taxOnPayment) {

        this.taxOnPayment = taxOnPayment;
        return this;
    }

    /**
     * (DDD Entity) - Payment levy tax.
     *
     * @return taxOnPayment
     **/

    @Schema(description = "(DDD Entity) - Payment levy tax. ")

    public String getTaxOnPayment() {
        return taxOnPayment;
    }


    public void setTaxOnPayment(String taxOnPayment) {
        this.taxOnPayment = taxOnPayment;
    }

    public Payment paymentExecution(String paymentExecution) {

        this.paymentExecution = paymentExecution;
        return this;
    }

    /**
     * (DDD Entity) - Describes the processes necessary to execute a payment.
     *
     * @return paymentExecution
     **/

    @Schema(description = "(DDD Entity) - Describes the processes necessary to execute a payment. ")

    public String getPaymentExecution() {
        return paymentExecution;
    }


    public void setPaymentExecution(String paymentExecution) {
        this.paymentExecution = paymentExecution;
    }

    public Payment poolingAdjustmentDate(String poolingAdjustmentDate) {

        this.poolingAdjustmentDate = poolingAdjustmentDate;
        return this;
    }

    /**
     * (DDD Entity) - Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.
     *
     * @return poolingAdjustmentDate
     **/

    @Schema(description = "(DDD Entity) - Date used for the correction of the value date of a cash pool movement that has been posted with a different value date. ")

    public String getPoolingAdjustmentDate() {
        return poolingAdjustmentDate;
    }


    public void setPoolingAdjustmentDate(String poolingAdjustmentDate) {
        this.poolingAdjustmentDate = poolingAdjustmentDate;
    }

    public Payment equivalentAmount(String equivalentAmount) {

        this.equivalentAmount = equivalentAmount;
        return this;
    }

    /**
     * (DDD Entity) - Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency.
     *
     * @return equivalentAmount
     **/

    @Schema(description = "(DDD Entity) - Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency. ")

    public String getEquivalentAmount() {
        return equivalentAmount;
    }


    public void setEquivalentAmount(String equivalentAmount) {
        this.equivalentAmount = equivalentAmount;
    }

    public Payment currencyExchange(String currencyExchange) {

        this.currencyExchange = currencyExchange;
        return this;
    }

    /**
     * (DDD Entity) - Information on the exchange rate and amounts used in the payment
     *
     * @return currencyExchange
     **/

    @Schema(description = "(DDD Entity) - Information on the exchange rate and amounts used in the payment ")

    public String getCurrencyExchange() {
        return currencyExchange;
    }


    public void setCurrencyExchange(String currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    public Payment instructionForCreditorAgent(String instructionForCreditorAgent) {

        this.instructionForCreditorAgent = instructionForCreditorAgent;
        return this;
    }

    /**
     * (DDD Entity) - Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent.  Usage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction.
     *
     * @return instructionForCreditorAgent
     **/

    @Schema(description = "(DDD Entity) - Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent.  Usage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction. ")

    public String getInstructionForCreditorAgent() {
        return instructionForCreditorAgent;
    }


    public void setInstructionForCreditorAgent(String instructionForCreditorAgent) {
        this.instructionForCreditorAgent = instructionForCreditorAgent;
    }

    public Payment instructionForDebtorAgent(String instructionForDebtorAgent) {

        this.instructionForDebtorAgent = instructionForDebtorAgent;
        return this;
    }

    /**
     * (DDD Entity) - Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.   Usage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction.
     *
     * @return instructionForDebtorAgent
     **/

    @Schema(description = "(DDD Entity) - Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.   Usage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction. ")

    public String getInstructionForDebtorAgent() {
        return instructionForDebtorAgent;
    }


    public void setInstructionForDebtorAgent(String instructionForDebtorAgent) {
        this.instructionForDebtorAgent = instructionForDebtorAgent;
    }

    public Payment paymentRelatedIdentifications(String paymentRelatedIdentifications) {

        this.paymentRelatedIdentifications = paymentRelatedIdentifications;
        return this;
    }

    /**
     * (DDD Entity) - Identifications provided to identify a payment at different processing levels.
     *
     * @return paymentRelatedIdentifications
     **/

    @Schema(description = "(DDD Entity) - Identifications provided to identify a payment at different processing levels. ")

    public String getPaymentRelatedIdentifications() {
        return paymentRelatedIdentifications;
    }


    public void setPaymentRelatedIdentifications(String paymentRelatedIdentifications) {
        this.paymentRelatedIdentifications = paymentRelatedIdentifications;
    }

    public Payment relatedInvestigationCase(String relatedInvestigationCase) {

        this.relatedInvestigationCase = relatedInvestigationCase;
        return this;
    }

    /**
     * (DDD Entity) - Investigation case assigned to the payment.
     *
     * @return relatedInvestigationCase
     **/

    @Schema(description = "(DDD Entity) - Investigation case assigned to the payment. ")

    public String getRelatedInvestigationCase() {
        return relatedInvestigationCase;
    }


    public void setRelatedInvestigationCase(String relatedInvestigationCase) {
        this.relatedInvestigationCase = relatedInvestigationCase;
    }

    public Payment settlementTimeRequest(String settlementTimeRequest) {

        this.settlementTimeRequest = settlementTimeRequest;
        return this;
    }

    /**
     * (DDD Entity) - Information on the requested settlement time of the instruction.
     *
     * @return settlementTimeRequest
     **/

    @Schema(description = "(DDD Entity) - Information on the requested settlement time of the instruction. ")

    public String getSettlementTimeRequest() {
        return settlementTimeRequest;
    }


    public void setSettlementTimeRequest(String settlementTimeRequest) {
        this.settlementTimeRequest = settlementTimeRequest;
    }

    public Payment amount(String amount) {

        this.amount = amount;
        return this;
    }

    /**
     * (DDD Entity) - Amount of the payment.
     *
     * @return amount
     **/

    @Schema(description = "(DDD Entity) - Amount of the payment. ")

    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Payment tradeSettlement(String tradeSettlement) {

        this.tradeSettlement = tradeSettlement;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the settlement operation which originates the payment.
     *
     * @return tradeSettlement
     **/

    @Schema(description = "(DDD Entity) - Specifies the settlement operation which originates the payment. ")

    public String getTradeSettlement() {
        return tradeSettlement;
    }


    public void setTradeSettlement(String tradeSettlement) {
        this.tradeSettlement = tradeSettlement;
    }

    public Payment standardSettlementInstructions(String standardSettlementInstructions) {

        this.standardSettlementInstructions = standardSettlementInstructions;
        return this;
    }

    /**
     * (DDD Entity) - Identifies the standard settlement instructions.
     *
     * @return standardSettlementInstructions
     **/

    @Schema(description = "(DDD Entity) - Identifies the standard settlement instructions. ")

    public String getStandardSettlementInstructions() {
        return standardSettlementInstructions;
    }


    public void setStandardSettlementInstructions(String standardSettlementInstructions) {
        this.standardSettlementInstructions = standardSettlementInstructions;
    }

    public Payment relatedDebitAuthorisation(String relatedDebitAuthorisation) {

        this.relatedDebitAuthorisation = relatedDebitAuthorisation;
        return this;
    }

    /**
     * (DDD Entity) - Payment which is the result of the debit authorisation
     *
     * @return relatedDebitAuthorisation
     **/

    @Schema(description = "(DDD Entity) - Payment which is the result of the debit authorisation ")

    public String getRelatedDebitAuthorisation() {
        return relatedDebitAuthorisation;
    }


    public void setRelatedDebitAuthorisation(String relatedDebitAuthorisation) {
        this.relatedDebitAuthorisation = relatedDebitAuthorisation;
    }

    public Payment relatedInvestigationCaseResolution(String relatedInvestigationCaseResolution) {

        this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
        return this;
    }

    /**
     * (DDD Entity) - Case resolution related to a specific payment.
     *
     * @return relatedInvestigationCaseResolution
     **/

    @Schema(description = "(DDD Entity) - Case resolution related to a specific payment. ")

    public String getRelatedInvestigationCaseResolution() {
        return relatedInvestigationCaseResolution;
    }


    public void setRelatedInvestigationCaseResolution(String relatedInvestigationCaseResolution) {
        this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
    }

    public Payment originalPayment(String originalPayment) {

        this.originalPayment = originalPayment;
        return this;
    }

    /**
     * (DDD Entity) - Original payment which is returned.
     *
     * @return originalPayment
     **/

    @Schema(description = "(DDD Entity) - Original payment which is returned. ")

    public String getOriginalPayment() {
        return originalPayment;
    }


    public void setOriginalPayment(String originalPayment) {
        this.originalPayment = originalPayment;
    }

    public Payment returnPayment(String returnPayment) {

        this.returnPayment = returnPayment;
        return this;
    }

    /**
     * (DDD Entity) - Payment which offsets an original payment.
     *
     * @return returnPayment
     **/

    @Schema(description = "(DDD Entity) - Payment which offsets an original payment. ")

    public String getReturnPayment() {
        return returnPayment;
    }


    public void setReturnPayment(String returnPayment) {
        this.returnPayment = returnPayment;
    }

    public Payment relatedSecuritiesSettlement(String relatedSecuritiesSettlement) {

        this.relatedSecuritiesSettlement = relatedSecuritiesSettlement;
        return this;
    }

    /**
     * (DDD Entity) - Securities settlement process which is the source of the payment.
     *
     * @return relatedSecuritiesSettlement
     **/

    @Schema(description = "(DDD Entity) - Securities settlement process which is the source of the payment. ")

    public String getRelatedSecuritiesSettlement() {
        return relatedSecuritiesSettlement;
    }


    public void setRelatedSecuritiesSettlement(String relatedSecuritiesSettlement) {
        this.relatedSecuritiesSettlement = relatedSecuritiesSettlement;
    }

    public Payment invoiceReconciliation(String invoiceReconciliation) {

        this.invoiceReconciliation = invoiceReconciliation;
        return this;
    }

    /**
     * (DDD Entity) - Reconciliation of the amounts of an invoice with the amounts included in one or more payments.
     *
     * @return invoiceReconciliation
     **/

    @Schema(description = "(DDD Entity) - Reconciliation of the amounts of an invoice with the amounts included in one or more payments. ")

    public String getInvoiceReconciliation() {
        return invoiceReconciliation;
    }


    public void setInvoiceReconciliation(String invoiceReconciliation) {
        this.invoiceReconciliation = invoiceReconciliation;
    }

    public Payment paymentInstrument(String paymentInstrument) {

        this.paymentInstrument = paymentInstrument;
        return this;
    }

    /**
     * (DDD Entity) - Payment type at the origin of the cash entry eg, a cheque.
     *
     * @return paymentInstrument
     **/

    @Schema(description = "(DDD Entity) - Payment type at the origin of the cash entry eg, a cheque. ")

    public String getPaymentInstrument() {
        return paymentInstrument;
    }


    public void setPaymentInstrument(String paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public Payment account(String account) {

        this.account = account;
        return this;
    }

    /**
     * (DDD Entity) - Account debited for the payment.
     *
     * @return account
     **/

    @Schema(description = "(DDD Entity) - Account debited for the payment. ")

    public String getAccount() {
        return account;
    }


    public void setAccount(String account) {
        this.account = account;
    }

    public Payment adjustments(String adjustments) {

        this.adjustments = adjustments;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the charges or the allowance related to a payment.
     *
     * @return adjustments
     **/

    @Schema(description = "(DDD Entity) - Specifies the charges or the allowance related to a payment. ")

    public String getAdjustments() {
        return adjustments;
    }


    public void setAdjustments(String adjustments) {
        this.adjustments = adjustments;
    }

    public Payment contractRegistration(String contractRegistration) {

        this.contractRegistration = contractRegistration;
        return this;
    }

    /**
     * (DDD Entity) - Provides the payment of the registered contract.
     *
     * @return contractRegistration
     **/

    @Schema(description = "(DDD Entity) - Provides the payment of the registered contract. ")

    public String getContractRegistration() {
        return contractRegistration;
    }


    public void setContractRegistration(String contractRegistration) {
        this.contractRegistration = contractRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Payment payment = (Payment) o;
        return Objects.equals(this.paymentObligation, payment.paymentObligation) &&
                Objects.equals(this.currencyOfTransfer, payment.currencyOfTransfer) &&
                Objects.equals(this.creditMethod, payment.creditMethod) &&
                Objects.equals(this.type, payment.type) &&
                Objects.equals(this.instructedAmount, payment.instructedAmount) &&
                Objects.equals(this.priority, payment.priority) &&
                Objects.equals(this.valueDate, payment.valueDate) &&
                Objects.equals(this.paymentStatus, payment.paymentStatus) &&
                Objects.equals(this.partyRole, payment.partyRole) &&
                Objects.equals(this.taxOnPayment, payment.taxOnPayment) &&
                Objects.equals(this.paymentExecution, payment.paymentExecution) &&
                Objects.equals(this.poolingAdjustmentDate, payment.poolingAdjustmentDate) &&
                Objects.equals(this.equivalentAmount, payment.equivalentAmount) &&
                Objects.equals(this.currencyExchange, payment.currencyExchange) &&
                Objects.equals(this.instructionForCreditorAgent, payment.instructionForCreditorAgent) &&
                Objects.equals(this.instructionForDebtorAgent, payment.instructionForDebtorAgent) &&
                Objects.equals(this.paymentRelatedIdentifications, payment.paymentRelatedIdentifications) &&
                Objects.equals(this.relatedInvestigationCase, payment.relatedInvestigationCase) &&
                Objects.equals(this.settlementTimeRequest, payment.settlementTimeRequest) &&
                Objects.equals(this.amount, payment.amount) &&
                Objects.equals(this.tradeSettlement, payment.tradeSettlement) &&
                Objects.equals(this.standardSettlementInstructions, payment.standardSettlementInstructions) &&
                Objects.equals(this.relatedDebitAuthorisation, payment.relatedDebitAuthorisation) &&
                Objects.equals(this.relatedInvestigationCaseResolution, payment.relatedInvestigationCaseResolution) &&
                Objects.equals(this.originalPayment, payment.originalPayment) &&
                Objects.equals(this.returnPayment, payment.returnPayment) &&
                Objects.equals(this.relatedSecuritiesSettlement, payment.relatedSecuritiesSettlement) &&
                Objects.equals(this.invoiceReconciliation, payment.invoiceReconciliation) &&
                Objects.equals(this.paymentInstrument, payment.paymentInstrument) &&
                Objects.equals(this.account, payment.account) &&
                Objects.equals(this.adjustments, payment.adjustments) &&
                Objects.equals(this.contractRegistration, payment.contractRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentObligation, currencyOfTransfer, creditMethod, type, instructedAmount, priority, valueDate, paymentStatus, partyRole, taxOnPayment, paymentExecution, poolingAdjustmentDate, equivalentAmount, currencyExchange, instructionForCreditorAgent, instructionForDebtorAgent, paymentRelatedIdentifications, relatedInvestigationCase, settlementTimeRequest, amount, tradeSettlement, standardSettlementInstructions, relatedDebitAuthorisation, relatedInvestigationCaseResolution, originalPayment, returnPayment, relatedSecuritiesSettlement, invoiceReconciliation, paymentInstrument, account, adjustments, contractRegistration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Payment {\n");

        sb.append("    paymentObligation: ").append(toIndentedString(paymentObligation)).append("\n");
        sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
        sb.append("    creditMethod: ").append(toIndentedString(creditMethod)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
        sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
        sb.append("    partyRole: ").append(toIndentedString(partyRole)).append("\n");
        sb.append("    taxOnPayment: ").append(toIndentedString(taxOnPayment)).append("\n");
        sb.append("    paymentExecution: ").append(toIndentedString(paymentExecution)).append("\n");
        sb.append("    poolingAdjustmentDate: ").append(toIndentedString(poolingAdjustmentDate)).append("\n");
        sb.append("    equivalentAmount: ").append(toIndentedString(equivalentAmount)).append("\n");
        sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
        sb.append("    instructionForCreditorAgent: ").append(toIndentedString(instructionForCreditorAgent)).append("\n");
        sb.append("    instructionForDebtorAgent: ").append(toIndentedString(instructionForDebtorAgent)).append("\n");
        sb.append("    paymentRelatedIdentifications: ").append(toIndentedString(paymentRelatedIdentifications)).append("\n");
        sb.append("    relatedInvestigationCase: ").append(toIndentedString(relatedInvestigationCase)).append("\n");
        sb.append("    settlementTimeRequest: ").append(toIndentedString(settlementTimeRequest)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    tradeSettlement: ").append(toIndentedString(tradeSettlement)).append("\n");
        sb.append("    standardSettlementInstructions: ").append(toIndentedString(standardSettlementInstructions)).append("\n");
        sb.append("    relatedDebitAuthorisation: ").append(toIndentedString(relatedDebitAuthorisation)).append("\n");
        sb.append("    relatedInvestigationCaseResolution: ").append(toIndentedString(relatedInvestigationCaseResolution)).append("\n");
        sb.append("    originalPayment: ").append(toIndentedString(originalPayment)).append("\n");
        sb.append("    returnPayment: ").append(toIndentedString(returnPayment)).append("\n");
        sb.append("    relatedSecuritiesSettlement: ").append(toIndentedString(relatedSecuritiesSettlement)).append("\n");
        sb.append("    invoiceReconciliation: ").append(toIndentedString(invoiceReconciliation)).append("\n");
        sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
        sb.append("    contractRegistration: ").append(toIndentedString(contractRegistration)).append("\n");
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
