package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Reference to any external accounts used in processing Account|Account  (https://www.iso20022.org/standardsrepository/type/Account)|Standard|ISO20022 BM ()
 */
@Schema(description = "(DDD Entity) - Reference to any external accounts used in processing Account|Account  (https://www.iso20022.org/standardsrepository/type/Account)|Standard|ISO20022 BM ()")
@Validated
public class Account {

    @JsonProperty("BaseCurrency")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String baseCurrency = null;

    @JsonProperty("Identification")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String identification = null;

    @JsonProperty("ParentAccount")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String parentAccount = null;

    @JsonProperty("SubAccount")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String subAccount = null;

    @JsonProperty("RelatedFundProcessingCharacteristics")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedFundProcessingCharacteristics = null;

    @JsonProperty("Status")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String status = null;

    @JsonProperty("Language")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String language = null;

    @JsonProperty("PartyRole")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String partyRole = null;

    @JsonProperty("TradePartyRole")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String tradePartyRole = null;

    @JsonProperty("ReportingCurrency")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String reportingCurrency = null;

    @JsonProperty("AccountRestriction")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String accountRestriction = null;

    @JsonProperty("SettlementPartyRole")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String settlementPartyRole = null;

    @JsonProperty("Purpose")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String purpose = null;

    @JsonProperty("ClosingDate")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String closingDate = null;

    @JsonProperty("LiveDate")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String liveDate = null;

    @JsonProperty("ReportedPeriod")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String reportedPeriod = null;

    @JsonProperty("InvestmentFundPartyRole")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String investmentFundPartyRole = null;

    @JsonProperty("RelatedCollateralProcess")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedCollateralProcess = null;

    @JsonProperty("Type")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String type = null;

    @JsonProperty("RelatedProceedsDelivery")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedProceedsDelivery = null;

    @JsonProperty("RelatedCorporateActionPartyRole")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String relatedCorporateActionPartyRole = null;

    @JsonProperty("DefaultFundAccountOwner")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String defaultFundAccountOwner = null;

    @JsonProperty("System")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String system = null;

    @JsonProperty("Balance")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String balance = null;

    @JsonProperty("Entry")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String entry = null;

    @JsonProperty("AccountContract")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String accountContract = null;

    @JsonProperty("OpeningDate")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String openingDate = null;

    @JsonProperty("CurrencyExchange")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String currencyExchange = null;

    @JsonProperty("DefaultFundContribution")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String defaultFundContribution = null;

    @JsonProperty("SystemMember")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String systemMember = null;

    @JsonProperty("CollateralAccountType")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String collateralAccountType = null;

    @JsonProperty("AccountService")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String accountService = null;

    @JsonProperty("Reconciliation")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String reconciliation = null;

    @JsonProperty("ManagedAccountProduct")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String managedAccountProduct = null;


    public Account baseCurrency(String baseCurrency) {

        this.baseCurrency = baseCurrency;
        return this;
    }

    /**
     * (DDD Entity) - Base currency of the account.
     *
     * @return baseCurrency
     **/

    @Schema(description = "(DDD Entity) - Base currency of the account. ")

    public String getBaseCurrency() {
        return baseCurrency;
    }


    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public Account identification(String identification) {

        this.identification = identification;
        return this;
    }

    /**
     * (DDD Entity) - Unique and unambiguous identification for the account between the account owner and the account servicer.
     *
     * @return identification
     **/

    @Schema(description = "(DDD Entity) - Unique and unambiguous identification for the account between the account owner and the account servicer. ")

    public String getIdentification() {
        return identification;
    }


    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public Account parentAccount(String parentAccount) {

        this.parentAccount = parentAccount;
        return this;
    }

    /**
     * (DDD Entity) - Account for which one or more sub-accounts are specified.
     *
     * @return parentAccount
     **/

    @Schema(description = "(DDD Entity) - Account for which one or more sub-accounts are specified. ")

    public String getParentAccount() {
        return parentAccount;
    }


    public void setParentAccount(String parentAccount) {
        this.parentAccount = parentAccount;
    }

    public Account subAccount(String subAccount) {

        this.subAccount = subAccount;
        return this;
    }

    /**
     * (DDD Entity) - Subdivision of an account used to segregate specific holdings.
     *
     * @return subAccount
     **/

    @Schema(description = "(DDD Entity) - Subdivision of an account used to segregate specific holdings. ")

    public String getSubAccount() {
        return subAccount;
    }


    public void setSubAccount(String subAccount) {
        this.subAccount = subAccount;
    }

    public Account relatedFundProcessingCharacteristics(String relatedFundProcessingCharacteristics) {

        this.relatedFundProcessingCharacteristics = relatedFundProcessingCharacteristics;
        return this;
    }

    /**
     * (DDD Entity) - Fund processing characteristics for which a settlement account is specified.
     *
     * @return relatedFundProcessingCharacteristics
     **/

    @Schema(description = "(DDD Entity) - Fund processing characteristics for which a settlement account is specified. ")

    public String getRelatedFundProcessingCharacteristics() {
        return relatedFundProcessingCharacteristics;
    }


    public void setRelatedFundProcessingCharacteristics(String relatedFundProcessingCharacteristics) {
        this.relatedFundProcessingCharacteristics = relatedFundProcessingCharacteristics;
    }

    public Account status(String status) {

        this.status = status;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the current state of an account, eg, enabled or deleted.
     *
     * @return status
     **/

    @Schema(description = "(DDD Entity) - Specifies the current state of an account, eg, enabled or deleted. ")

    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public Account language(String language) {

        this.language = language;
        return this;
    }

    /**
     * (DDD Entity) - Language for all communication concerning the account.
     *
     * @return language
     **/

    @Schema(description = "(DDD Entity) - Language for all communication concerning the account. ")

    public String getLanguage() {
        return language;
    }


    public void setLanguage(String language) {
        this.language = language;
    }

    public Account partyRole(String partyRole) {

        this.partyRole = partyRole;
        return this;
    }

    /**
     * (DDD Entity) - Specifies each role linked to an account and played by a party in that context.
     *
     * @return partyRole
     **/

    @Schema(description = "(DDD Entity) - Specifies each role linked to an account and played by a party in that context. ")

    public String getPartyRole() {
        return partyRole;
    }


    public void setPartyRole(String partyRole) {
        this.partyRole = partyRole;
    }

    public Account tradePartyRole(String tradePartyRole) {

        this.tradePartyRole = tradePartyRole;
        return this;
    }

    /**
     * (DDD Entity) - Party for which an account is specified in the context of a trade.
     *
     * @return tradePartyRole
     **/

    @Schema(description = "(DDD Entity) - Party for which an account is specified in the context of a trade. ")

    public String getTradePartyRole() {
        return tradePartyRole;
    }


    public void setTradePartyRole(String tradePartyRole) {
        this.tradePartyRole = tradePartyRole;
    }

    public Account reportingCurrency(String reportingCurrency) {

        this.reportingCurrency = reportingCurrency;
        return this;
    }

    /**
     * (DDD Entity) - Currency used to calculate and report the balance and related entries of an account.
     *
     * @return reportingCurrency
     **/

    @Schema(description = "(DDD Entity) - Currency used to calculate and report the balance and related entries of an account. ")

    public String getReportingCurrency() {
        return reportingCurrency;
    }


    public void setReportingCurrency(String reportingCurrency) {
        this.reportingCurrency = reportingCurrency;
    }

    public Account accountRestriction(String accountRestriction) {

        this.accountRestriction = accountRestriction;
        return this;
    }

    /**
     * (DDD Entity) - Restriction on capability or operations allowed.
     *
     * @return accountRestriction
     **/

    @Schema(description = "(DDD Entity) - Restriction on capability or operations allowed. ")

    public String getAccountRestriction() {
        return accountRestriction;
    }


    public void setAccountRestriction(String accountRestriction) {
        this.accountRestriction = accountRestriction;
    }

    public Account settlementPartyRole(String settlementPartyRole) {

        this.settlementPartyRole = settlementPartyRole;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the role of the party which uses the account for settlement.
     *
     * @return settlementPartyRole
     **/

    @Schema(description = "(DDD Entity) - Specifies the role of the party which uses the account for settlement. ")

    public String getSettlementPartyRole() {
        return settlementPartyRole;
    }


    public void setSettlementPartyRole(String settlementPartyRole) {
        this.settlementPartyRole = settlementPartyRole;
    }

    public Account purpose(String purpose) {

        this.purpose = purpose;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the purpose of the account.
     *
     * @return purpose
     **/

    @Schema(description = "(DDD Entity) - Specifies the purpose of the account. ")

    public String getPurpose() {
        return purpose;
    }


    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Account closingDate(String closingDate) {

        this.closingDate = closingDate;
        return this;
    }

    /**
     * (DDD Entity) - Date on which the account and related services cease effectively to be operational for the account owner.
     *
     * @return closingDate
     **/

    @Schema(description = "(DDD Entity) - Date on which the account and related services cease effectively to be operational for the account owner. ")

    public String getClosingDate() {
        return closingDate;
    }


    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public Account liveDate(String liveDate) {

        this.liveDate = liveDate;
        return this;
    }

    /**
     * (DDD Entity) - Date of the first movement on the account.
     *
     * @return liveDate
     **/

    @Schema(description = "(DDD Entity) - Date of the first movement on the account. ")

    public String getLiveDate() {
        return liveDate;
    }


    public void setLiveDate(String liveDate) {
        this.liveDate = liveDate;
    }

    public Account reportedPeriod(String reportedPeriod) {

        this.reportedPeriod = reportedPeriod;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the period for which the movements in the account are reported.
     *
     * @return reportedPeriod
     **/

    @Schema(description = "(DDD Entity) - Specifies the period for which the movements in the account are reported. ")

    public String getReportedPeriod() {
        return reportedPeriod;
    }


    public void setReportedPeriod(String reportedPeriod) {
        this.reportedPeriod = reportedPeriod;
    }

    public Account investmentFundPartyRole(String investmentFundPartyRole) {

        this.investmentFundPartyRole = investmentFundPartyRole;
        return this;
    }

    /**
     * (DDD Entity) - Party role for which an account is specified.
     *
     * @return investmentFundPartyRole
     **/

    @Schema(description = "(DDD Entity) - Party role for which an account is specified. ")

    public String getInvestmentFundPartyRole() {
        return investmentFundPartyRole;
    }


    public void setInvestmentFundPartyRole(String investmentFundPartyRole) {
        this.investmentFundPartyRole = investmentFundPartyRole;
    }

    public Account relatedCollateralProcess(String relatedCollateralProcess) {

        this.relatedCollateralProcess = relatedCollateralProcess;
        return this;
    }

    /**
     * (DDD Entity) - Collateral data for which a collateral account is specified.
     *
     * @return relatedCollateralProcess
     **/

    @Schema(description = "(DDD Entity) - Collateral data for which a collateral account is specified. ")

    public String getRelatedCollateralProcess() {
        return relatedCollateralProcess;
    }


    public void setRelatedCollateralProcess(String relatedCollateralProcess) {
        this.relatedCollateralProcess = relatedCollateralProcess;
    }

    public Account type(String type) {

        this.type = type;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the type of account.
     *
     * @return type
     **/

    @Schema(description = "(DDD Entity) - Specifies the type of account. ")

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public Account relatedProceedsDelivery(String relatedProceedsDelivery) {

        this.relatedProceedsDelivery = relatedProceedsDelivery;
        return this;
    }

    /**
     * (DDD Entity) - Proceeds delivery instruction which contain account identification.
     *
     * @return relatedProceedsDelivery
     **/

    @Schema(description = "(DDD Entity) - Proceeds delivery instruction which contain account identification. ")

    public String getRelatedProceedsDelivery() {
        return relatedProceedsDelivery;
    }


    public void setRelatedProceedsDelivery(String relatedProceedsDelivery) {
        this.relatedProceedsDelivery = relatedProceedsDelivery;
    }

    public Account relatedCorporateActionPartyRole(String relatedCorporateActionPartyRole) {

        this.relatedCorporateActionPartyRole = relatedCorporateActionPartyRole;
        return this;
    }

    /**
     * (DDD Entity) - Party for which an account is specified in the context of a corporate action.
     *
     * @return relatedCorporateActionPartyRole
     **/

    @Schema(description = "(DDD Entity) - Party for which an account is specified in the context of a corporate action. ")

    public String getRelatedCorporateActionPartyRole() {
        return relatedCorporateActionPartyRole;
    }


    public void setRelatedCorporateActionPartyRole(String relatedCorporateActionPartyRole) {
        this.relatedCorporateActionPartyRole = relatedCorporateActionPartyRole;
    }

    public Account defaultFundAccountOwner(String defaultFundAccountOwner) {

        this.defaultFundAccountOwner = defaultFundAccountOwner;
        return this;
    }

    /**
     * (DDD Entity) - Clearing member which holds a default fund account at an ICSD or at the central bank.
     *
     * @return defaultFundAccountOwner
     **/

    @Schema(description = "(DDD Entity) - Clearing member which holds a default fund account at an ICSD or at the central bank. ")

    public String getDefaultFundAccountOwner() {
        return defaultFundAccountOwner;
    }


    public void setDefaultFundAccountOwner(String defaultFundAccountOwner) {
        this.defaultFundAccountOwner = defaultFundAccountOwner;
    }

    public Account system(String system) {

        this.system = system;
        return this;
    }

    /**
     * (DDD Entity) - System where the account is held.
     *
     * @return system
     **/

    @Schema(description = "(DDD Entity) - System where the account is held. ")

    public String getSystem() {
        return system;
    }


    public void setSystem(String system) {
        this.system = system;
    }

    public Account balance(String balance) {

        this.balance = balance;
        return this;
    }

    /**
     * (DDD Entity) - Overall position representing the net debits and credits in an account at a specific point in time.
     *
     * @return balance
     **/

    @Schema(description = "(DDD Entity) - Overall position representing the net debits and credits in an account at a specific point in time. ")

    public String getBalance() {
        return balance;
    }


    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Account entry(String entry) {

        this.entry = entry;
        return this;
    }

    /**
     * (DDD Entity) - Record of the movements into or out of an account.
     *
     * @return entry
     **/

    @Schema(description = "(DDD Entity) - Record of the movements into or out of an account. ")

    public String getEntry() {
        return entry;
    }


    public void setEntry(String entry) {
        this.entry = entry;
    }

    public Account accountContract(String accountContract) {

        this.accountContract = accountContract;
        return this;
    }

    /**
     * (DDD Entity) - Agreement which provides information on the account and on the services linked to it.
     *
     * @return accountContract
     **/

    @Schema(description = "(DDD Entity) - Agreement which provides information on the account and on the services linked to it. ")

    public String getAccountContract() {
        return accountContract;
    }


    public void setAccountContract(String accountContract) {
        this.accountContract = accountContract;
    }

    public Account openingDate(String openingDate) {

        this.openingDate = openingDate;
        return this;
    }

    /**
     * (DDD Entity) - Date on which the account and related basic services are effectively operational for the account owner.
     *
     * @return openingDate
     **/

    @Schema(description = "(DDD Entity) - Date on which the account and related basic services are effectively operational for the account owner. ")

    public String getOpeningDate() {
        return openingDate;
    }


    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public Account currencyExchange(String currencyExchange) {

        this.currencyExchange = currencyExchange;
        return this;
    }

    /**
     * (DDD Entity) - Rate used to calculate the difference between amounts based on the base currency and the reporting currency.
     *
     * @return currencyExchange
     **/

    @Schema(description = "(DDD Entity) - Rate used to calculate the difference between amounts based on the base currency and the reporting currency. ")

    public String getCurrencyExchange() {
        return currencyExchange;
    }


    public void setCurrencyExchange(String currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    public Account defaultFundContribution(String defaultFundContribution) {

        this.defaultFundContribution = defaultFundContribution;
        return this;
    }

    /**
     * (DDD Entity) - Default fund contribution parameters associated with a contribution account.
     *
     * @return defaultFundContribution
     **/

    @Schema(description = "(DDD Entity) - Default fund contribution parameters associated with a contribution account. ")

    public String getDefaultFundContribution() {
        return defaultFundContribution;
    }


    public void setDefaultFundContribution(String defaultFundContribution) {
        this.defaultFundContribution = defaultFundContribution;
    }

    public Account systemMember(String systemMember) {

        this.systemMember = systemMember;
        return this;
    }

    /**
     * (DDD Entity) - Member of a system which is the owner of an account with the system.
     *
     * @return systemMember
     **/

    @Schema(description = "(DDD Entity) - Member of a system which is the owner of an account with the system. ")

    public String getSystemMember() {
        return systemMember;
    }


    public void setSystemMember(String systemMember) {
        this.systemMember = systemMember;
    }

    public Account collateralAccountType(String collateralAccountType) {

        this.collateralAccountType = collateralAccountType;
        return this;
    }

    /**
     * (DDD Entity) - Specifies the collateral account type.
     *
     * @return collateralAccountType
     **/

    @Schema(description = "(DDD Entity) - Specifies the collateral account type. ")

    public String getCollateralAccountType() {
        return collateralAccountType;
    }


    public void setCollateralAccountType(String collateralAccountType) {
        this.collateralAccountType = collateralAccountType;
    }

    public Account accountService(String accountService) {

        this.accountService = accountService;
        return this;
    }

    /**
     * (DDD Entity) - Services linked to the account and specified in the account contract.
     *
     * @return accountService
     **/

    @Schema(description = "(DDD Entity) - Services linked to the account and specified in the account contract. ")

    public String getAccountService() {
        return accountService;
    }


    public void setAccountService(String accountService) {
        this.accountService = accountService;
    }

    public Account reconciliation(String reconciliation) {

        this.reconciliation = reconciliation;
        return this;
    }

    /**
     * (DDD Entity) - Process which compares and matches trade information with entries in an account.
     *
     * @return reconciliation
     **/

    @Schema(description = "(DDD Entity) - Process which compares and matches trade information with entries in an account. ")

    public String getReconciliation() {
        return reconciliation;
    }


    public void setReconciliation(String reconciliation) {
        this.reconciliation = reconciliation;
    }

    public Account managedAccountProduct(String managedAccountProduct) {

        this.managedAccountProduct = managedAccountProduct;
        return this;
    }

    /**
     * (DDD Entity) - Product which provides guidance to investors to manage their portfolios.
     *
     * @return managedAccountProduct
     **/

    @Schema(description = "(DDD Entity) - Product which provides guidance to investors to manage their portfolios. ")

    public String getManagedAccountProduct() {
        return managedAccountProduct;
    }


    public void setManagedAccountProduct(String managedAccountProduct) {
        this.managedAccountProduct = managedAccountProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(this.baseCurrency, account.baseCurrency) &&
                Objects.equals(this.identification, account.identification) &&
                Objects.equals(this.parentAccount, account.parentAccount) &&
                Objects.equals(this.subAccount, account.subAccount) &&
                Objects.equals(this.relatedFundProcessingCharacteristics, account.relatedFundProcessingCharacteristics) &&
                Objects.equals(this.status, account.status) &&
                Objects.equals(this.language, account.language) &&
                Objects.equals(this.partyRole, account.partyRole) &&
                Objects.equals(this.tradePartyRole, account.tradePartyRole) &&
                Objects.equals(this.reportingCurrency, account.reportingCurrency) &&
                Objects.equals(this.accountRestriction, account.accountRestriction) &&
                Objects.equals(this.settlementPartyRole, account.settlementPartyRole) &&
                Objects.equals(this.purpose, account.purpose) &&
                Objects.equals(this.closingDate, account.closingDate) &&
                Objects.equals(this.liveDate, account.liveDate) &&
                Objects.equals(this.reportedPeriod, account.reportedPeriod) &&
                Objects.equals(this.investmentFundPartyRole, account.investmentFundPartyRole) &&
                Objects.equals(this.relatedCollateralProcess, account.relatedCollateralProcess) &&
                Objects.equals(this.type, account.type) &&
                Objects.equals(this.relatedProceedsDelivery, account.relatedProceedsDelivery) &&
                Objects.equals(this.relatedCorporateActionPartyRole, account.relatedCorporateActionPartyRole) &&
                Objects.equals(this.defaultFundAccountOwner, account.defaultFundAccountOwner) &&
                Objects.equals(this.system, account.system) &&
                Objects.equals(this.balance, account.balance) &&
                Objects.equals(this.entry, account.entry) &&
                Objects.equals(this.accountContract, account.accountContract) &&
                Objects.equals(this.openingDate, account.openingDate) &&
                Objects.equals(this.currencyExchange, account.currencyExchange) &&
                Objects.equals(this.defaultFundContribution, account.defaultFundContribution) &&
                Objects.equals(this.systemMember, account.systemMember) &&
                Objects.equals(this.collateralAccountType, account.collateralAccountType) &&
                Objects.equals(this.accountService, account.accountService) &&
                Objects.equals(this.reconciliation, account.reconciliation) &&
                Objects.equals(this.managedAccountProduct, account.managedAccountProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseCurrency, identification, parentAccount, subAccount, relatedFundProcessingCharacteristics, status, language, partyRole, tradePartyRole, reportingCurrency, accountRestriction, settlementPartyRole, purpose, closingDate, liveDate, reportedPeriod, investmentFundPartyRole, relatedCollateralProcess, type, relatedProceedsDelivery, relatedCorporateActionPartyRole, defaultFundAccountOwner, system, balance, entry, accountContract, openingDate, currencyExchange, defaultFundContribution, systemMember, collateralAccountType, accountService, reconciliation, managedAccountProduct);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Account {\n");

        sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    parentAccount: ").append(toIndentedString(parentAccount)).append("\n");
        sb.append("    subAccount: ").append(toIndentedString(subAccount)).append("\n");
        sb.append("    relatedFundProcessingCharacteristics: ").append(toIndentedString(relatedFundProcessingCharacteristics)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    partyRole: ").append(toIndentedString(partyRole)).append("\n");
        sb.append("    tradePartyRole: ").append(toIndentedString(tradePartyRole)).append("\n");
        sb.append("    reportingCurrency: ").append(toIndentedString(reportingCurrency)).append("\n");
        sb.append("    accountRestriction: ").append(toIndentedString(accountRestriction)).append("\n");
        sb.append("    settlementPartyRole: ").append(toIndentedString(settlementPartyRole)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
        sb.append("    liveDate: ").append(toIndentedString(liveDate)).append("\n");
        sb.append("    reportedPeriod: ").append(toIndentedString(reportedPeriod)).append("\n");
        sb.append("    investmentFundPartyRole: ").append(toIndentedString(investmentFundPartyRole)).append("\n");
        sb.append("    relatedCollateralProcess: ").append(toIndentedString(relatedCollateralProcess)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    relatedProceedsDelivery: ").append(toIndentedString(relatedProceedsDelivery)).append("\n");
        sb.append("    relatedCorporateActionPartyRole: ").append(toIndentedString(relatedCorporateActionPartyRole)).append("\n");
        sb.append("    defaultFundAccountOwner: ").append(toIndentedString(defaultFundAccountOwner)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
        sb.append("    accountContract: ").append(toIndentedString(accountContract)).append("\n");
        sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
        sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
        sb.append("    defaultFundContribution: ").append(toIndentedString(defaultFundContribution)).append("\n");
        sb.append("    systemMember: ").append(toIndentedString(systemMember)).append("\n");
        sb.append("    collateralAccountType: ").append(toIndentedString(collateralAccountType)).append("\n");
        sb.append("    accountService: ").append(toIndentedString(accountService)).append("\n");
        sb.append("    reconciliation: ").append(toIndentedString(reconciliation)).append("\n");
        sb.append("    managedAccountProduct: ").append(toIndentedString(managedAccountProduct)).append("\n");
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
