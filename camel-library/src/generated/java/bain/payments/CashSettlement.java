package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Requested settlement instructions CashSettlement|CashSettlement (https://www.iso20022.org/standardsrepository/type/CashSettlement)|Standard|ISO20022 BM ()
 */
@Schema(description = "(DDD Entity) - Requested settlement instructions CashSettlement|CashSettlement (https://www.iso20022.org/standardsrepository/type/CashSettlement)|Standard|ISO20022 BM ()")
@Validated
public class CashSettlement {

    @JsonProperty("InterbankSettlementAmount")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String interbankSettlementAmount = null;

    @JsonProperty("InterbankSettlementDate")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String interbankSettlementDate = null;

    @JsonProperty("RTGS")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String RTGS = null;

    @JsonProperty("CreditDateTime")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String creditDateTime = null;

    @JsonProperty("RelatedPaymentInstruction")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedPaymentInstruction = null;

    @JsonProperty("SettlementMethod")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String settlementMethod = null;

    @JsonProperty("SettlementAccount")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String settlementAccount = null;

    @JsonProperty("DebitDateTime")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String debitDateTime = null;

    @JsonProperty("PartyRole")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String partyRole = null;

    @JsonProperty("RelatedTransactionAdministrator")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedTransactionAdministrator = null;

    @JsonProperty("BookEntry")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String bookEntry = null;

    @JsonProperty("RelatedInvestigationCase")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedInvestigationCase = null;

    @JsonProperty("Reservation")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String reservation = null;


    public CashSettlement interbankSettlementAmount(String interbankSettlementAmount) {

        this.interbankSettlementAmount = interbankSettlementAmount;
        return this;
    }

    /**
     * (DDD Entity) - Amount of money moved between the instructing agent and the instructed agent.
     *
     * @return interbankSettlementAmount
     **/

    @Schema(description = "(DDD Entity) - Amount of money moved between the instructing agent and the instructed agent. ")

    public String getInterbankSettlementAmount() {
        return interbankSettlementAmount;
    }


    public void setInterbankSettlementAmount(String interbankSettlementAmount) {
        this.interbankSettlementAmount = interbankSettlementAmount;
    }

    public CashSettlement interbankSettlementDate(String interbankSettlementDate) {

        this.interbankSettlementDate = interbankSettlementDate;
        return this;
    }

    /**
     * (DDD Entity) - Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.
     *
     * @return interbankSettlementDate
     **/

    @Schema(description = "(DDD Entity) - Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due. ")

    public String getInterbankSettlementDate() {
        return interbankSettlementDate;
    }


    public void setInterbankSettlementDate(String interbankSettlementDate) {
        this.interbankSettlementDate = interbankSettlementDate;
    }

    public CashSettlement RTGS(String RTGS) {

        this.RTGS = RTGS;
        return this;
    }

    /**
     * (DDD Entity) - Qualifies the RTGS status.
     *
     * @return RTGS
     **/

    @Schema(description = "(DDD Entity) - Qualifies the RTGS status. ")

    public String getRTGS() {
        return RTGS;
    }


    public void setRTGS(String RTGS) {
        this.RTGS = RTGS;
    }

    public CashSettlement creditDateTime(String creditDateTime) {

        this.creditDateTime = creditDateTime;
        return this;
    }

    /**
     * (DDD Entity) - Information on the occurred settlement time(s) of the payment transaction for the credit side.
     *
     * @return creditDateTime
     **/

    @Schema(description = "(DDD Entity) - Information on the occurred settlement time(s) of the payment transaction for the credit side. ")

    public String getCreditDateTime() {
        return creditDateTime;
    }


    public void setCreditDateTime(String creditDateTime) {
        this.creditDateTime = creditDateTime;
    }

    public CashSettlement relatedPaymentInstruction(String relatedPaymentInstruction) {

        this.relatedPaymentInstruction = relatedPaymentInstruction;
        return this;
    }

    /**
     * (DDD Entity) - PaymentInstruction which is the source of the settlement instruction.
     *
     * @return relatedPaymentInstruction
     **/

    @Schema(description = "(DDD Entity) - PaymentInstruction which is the source of the settlement instruction. ")

    public String getRelatedPaymentInstruction() {
        return relatedPaymentInstruction;
    }


    public void setRelatedPaymentInstruction(String relatedPaymentInstruction) {
        this.relatedPaymentInstruction = relatedPaymentInstruction;
    }

    public CashSettlement settlementMethod(String settlementMethod) {

        this.settlementMethod = settlementMethod;
        return this;
    }

    /**
     * (DDD Entity) - Method used to settle the (batch of) payment instructions.
     *
     * @return settlementMethod
     **/

    @Schema(description = "(DDD Entity) - Method used to settle the (batch of) payment instructions. ")

    public String getSettlementMethod() {
        return settlementMethod;
    }


    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    public CashSettlement settlementAccount(String settlementAccount) {

        this.settlementAccount = settlementAccount;
        return this;
    }

    /**
     * (DDD Entity) - A specific purpose account used to post debit and credit entries as a result of the transaction.
     *
     * @return settlementAccount
     **/

    @Schema(description = "(DDD Entity) - A specific purpose account used to post debit and credit entries as a result of the transaction. ")

    public String getSettlementAccount() {
        return settlementAccount;
    }


    public void setSettlementAccount(String settlementAccount) {
        this.settlementAccount = settlementAccount;
    }

    public CashSettlement debitDateTime(String debitDateTime) {

        this.debitDateTime = debitDateTime;
        return this;
    }

    /**
     * (DDD Entity) - Information on the occurred settlement time(s) of the payment transaction for the debit side.
     *
     * @return debitDateTime
     **/

    @Schema(description = "(DDD Entity) - Information on the occurred settlement time(s) of the payment transaction for the debit side. ")

    public String getDebitDateTime() {
        return debitDateTime;
    }


    public void setDebitDateTime(String debitDateTime) {
        this.debitDateTime = debitDateTime;
    }

    public CashSettlement partyRole(String partyRole) {

        this.partyRole = partyRole;
        return this;
    }

    /**
     * (DDD Entity) - Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow.
     *
     * @return partyRole
     **/

    @Schema(description = "(DDD Entity) - Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow. ")

    public String getPartyRole() {
        return partyRole;
    }


    public void setPartyRole(String partyRole) {
        this.partyRole = partyRole;
    }

    public CashSettlement relatedTransactionAdministrator(String relatedTransactionAdministrator) {

        this.relatedTransactionAdministrator = relatedTransactionAdministrator;
        return this;
    }

    /**
     * (DDD Entity) - Transaction administrator which manages the related settlement instructions.
     *
     * @return relatedTransactionAdministrator
     **/

    @Schema(description = "(DDD Entity) - Transaction administrator which manages the related settlement instructions. ")

    public String getRelatedTransactionAdministrator() {
        return relatedTransactionAdministrator;
    }


    public void setRelatedTransactionAdministrator(String relatedTransactionAdministrator) {
        this.relatedTransactionAdministrator = relatedTransactionAdministrator;
    }

    public CashSettlement bookEntry(String bookEntry) {

        this.bookEntry = bookEntry;
        return this;
    }

    /**
     * (DDD Entity) - Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction.
     *
     * @return bookEntry
     **/

    @Schema(description = "(DDD Entity) - Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction. ")

    public String getBookEntry() {
        return bookEntry;
    }


    public void setBookEntry(String bookEntry) {
        this.bookEntry = bookEntry;
    }

    public CashSettlement relatedInvestigationCase(String relatedInvestigationCase) {

        this.relatedInvestigationCase = relatedInvestigationCase;
        return this;
    }

    /**
     * (DDD Entity) - Case resolution which is the source of the correction of a settlement instruction.
     *
     * @return relatedInvestigationCase
     **/

    @Schema(description = "(DDD Entity) - Case resolution which is the source of the correction of a settlement instruction. ")

    public String getRelatedInvestigationCase() {
        return relatedInvestigationCase;
    }


    public void setRelatedInvestigationCase(String relatedInvestigationCase) {
        this.relatedInvestigationCase = relatedInvestigationCase;
    }

    public CashSettlement reservation(String reservation) {

        this.reservation = reservation;
        return this;
    }

    /**
     * (DDD Entity) - Liquidity set aside by the payer for specific purposes.
     *
     * @return reservation
     **/

    @Schema(description = "(DDD Entity) - Liquidity set aside by the payer for specific purposes. ")

    public String getReservation() {
        return reservation;
    }


    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CashSettlement cashSettlement = (CashSettlement) o;
        return Objects.equals(this.interbankSettlementAmount, cashSettlement.interbankSettlementAmount) &&
                Objects.equals(this.interbankSettlementDate, cashSettlement.interbankSettlementDate) &&
                Objects.equals(this.RTGS, cashSettlement.RTGS) &&
                Objects.equals(this.creditDateTime, cashSettlement.creditDateTime) &&
                Objects.equals(this.relatedPaymentInstruction, cashSettlement.relatedPaymentInstruction) &&
                Objects.equals(this.settlementMethod, cashSettlement.settlementMethod) &&
                Objects.equals(this.settlementAccount, cashSettlement.settlementAccount) &&
                Objects.equals(this.debitDateTime, cashSettlement.debitDateTime) &&
                Objects.equals(this.partyRole, cashSettlement.partyRole) &&
                Objects.equals(this.relatedTransactionAdministrator, cashSettlement.relatedTransactionAdministrator) &&
                Objects.equals(this.bookEntry, cashSettlement.bookEntry) &&
                Objects.equals(this.relatedInvestigationCase, cashSettlement.relatedInvestigationCase) &&
                Objects.equals(this.reservation, cashSettlement.reservation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interbankSettlementAmount, interbankSettlementDate, RTGS, creditDateTime, relatedPaymentInstruction, settlementMethod, settlementAccount, debitDateTime, partyRole, relatedTransactionAdministrator, bookEntry, relatedInvestigationCase, reservation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CashSettlement {\n");

        sb.append("    interbankSettlementAmount: ").append(toIndentedString(interbankSettlementAmount)).append("\n");
        sb.append("    interbankSettlementDate: ").append(toIndentedString(interbankSettlementDate)).append("\n");
        sb.append("    RTGS: ").append(toIndentedString(RTGS)).append("\n");
        sb.append("    creditDateTime: ").append(toIndentedString(creditDateTime)).append("\n");
        sb.append("    relatedPaymentInstruction: ").append(toIndentedString(relatedPaymentInstruction)).append("\n");
        sb.append("    settlementMethod: ").append(toIndentedString(settlementMethod)).append("\n");
        sb.append("    settlementAccount: ").append(toIndentedString(settlementAccount)).append("\n");
        sb.append("    debitDateTime: ").append(toIndentedString(debitDateTime)).append("\n");
        sb.append("    partyRole: ").append(toIndentedString(partyRole)).append("\n");
        sb.append("    relatedTransactionAdministrator: ").append(toIndentedString(relatedTransactionAdministrator)).append("\n");
        sb.append("    bookEntry: ").append(toIndentedString(bookEntry)).append("\n");
        sb.append("    relatedInvestigationCase: ").append(toIndentedString(relatedInvestigationCase)).append("\n");
        sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
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
