package bain.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ExecuteAccountsReceivableProcedureRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class ExecuteAccountsReceivableProcedureRequest   {
  @JsonProperty("AccountsReceivableProcedureParameterType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Featuretypevalues accountsReceivableProcedureParameterType = null;

  @JsonProperty("AccountsReceivableProcedureSelectedOption")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Feature accountsReceivableProcedureSelectedOption = null;

  @JsonProperty("AccountsReceivableProcedureRequest")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Instruction accountsReceivableProcedureRequest = null;

  @JsonProperty("AccountsReceivableProcedureSchedule")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Schedule accountsReceivableProcedureSchedule = null;

  @JsonProperty("AccountsReceivableProcedureStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Status accountsReceivableProcedureStatus = null;

  @JsonProperty("AccountsReceivableProcedureReference")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private AccountsReceivableProcedure accountsReceivableProcedureReference = null;

  @JsonProperty("AccountsReceivableProcedureBusinessUnitReference")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private BusinessUnit accountsReceivableProcedureBusinessUnitReference = null;

  @JsonProperty("AccountsReceivableProcedureServiceProviderReference")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String accountsReceivableProcedureServiceProviderReference = null;

  @JsonProperty("AccountsReceivableProcedureFinancialFacilityReference")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private FinancialFacility accountsReceivableProcedureFinancialFacilityReference = null;

  @JsonProperty("AccountsReceivableProcedureEmployeeReference")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Employee accountsReceivableProcedureEmployeeReference = null;

  @JsonProperty("AccountsReceivableProcedureCustomerReference")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Involvedparty accountsReceivableProcedureCustomerReference = null;

  @JsonProperty("AccountsReceivableProcedureType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Proceduretypevalues accountsReceivableProcedureType = null;

  @JsonProperty("AccountsReceivableProcedureServiceProviderSchedule")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Schedule accountsReceivableProcedureServiceProviderSchedule = null;

  @JsonProperty("AccountsReceivableProcedureServiceType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Servicetypevalues accountsReceivableProcedureServiceType = null;

  @JsonProperty("AccountsReceivableProcedureProductandServiceType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Bankingproducttypevalues accountsReceivableProcedureProductandServiceType = null;

  @JsonProperty("AccountsReceivableProcedureProductandServiceInstance")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Product accountsReceivableProcedureProductandServiceInstance = null;

  @JsonProperty("AccountsReceivableProcedureTransactionType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Transactiontypevalues accountsReceivableProcedureTransactionType = null;

  @JsonProperty("AccountsReceivableProcedureFinancialTransactionArrangement")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Obligation accountsReceivableProcedureFinancialTransactionArrangement = null;

  @JsonProperty("AccountsReceivableProcedureCustomerAgreementReference")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private CustomerAgreement accountsReceivableProcedureCustomerAgreementReference = null;


  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureParameterType(Featuretypevalues accountsReceivableProcedureParameterType) { 

    this.accountsReceivableProcedureParameterType = accountsReceivableProcedureParameterType;
    return this;
  }

  /**
   * Get accountsReceivableProcedureParameterType
   * @return accountsReceivableProcedureParameterType
   **/
  
  @Schema(description = "")
  
@Valid
  public Featuretypevalues getAccountsReceivableProcedureParameterType() {  
    return accountsReceivableProcedureParameterType;
  }



  public void setAccountsReceivableProcedureParameterType(Featuretypevalues accountsReceivableProcedureParameterType) { 
    this.accountsReceivableProcedureParameterType = accountsReceivableProcedureParameterType;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureSelectedOption(Feature accountsReceivableProcedureSelectedOption) { 

    this.accountsReceivableProcedureSelectedOption = accountsReceivableProcedureSelectedOption;
    return this;
  }

  /**
   * Get accountsReceivableProcedureSelectedOption
   * @return accountsReceivableProcedureSelectedOption
   **/
  
  @Schema(description = "")
  
@Valid
  public Feature getAccountsReceivableProcedureSelectedOption() {  
    return accountsReceivableProcedureSelectedOption;
  }



  public void setAccountsReceivableProcedureSelectedOption(Feature accountsReceivableProcedureSelectedOption) { 
    this.accountsReceivableProcedureSelectedOption = accountsReceivableProcedureSelectedOption;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureRequest(Instruction accountsReceivableProcedureRequest) { 

    this.accountsReceivableProcedureRequest = accountsReceivableProcedureRequest;
    return this;
  }

  /**
   * Get accountsReceivableProcedureRequest
   * @return accountsReceivableProcedureRequest
   **/
  
  @Schema(description = "")
  
@Valid
  public Instruction getAccountsReceivableProcedureRequest() {  
    return accountsReceivableProcedureRequest;
  }



  public void setAccountsReceivableProcedureRequest(Instruction accountsReceivableProcedureRequest) { 
    this.accountsReceivableProcedureRequest = accountsReceivableProcedureRequest;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureSchedule(Schedule accountsReceivableProcedureSchedule) { 

    this.accountsReceivableProcedureSchedule = accountsReceivableProcedureSchedule;
    return this;
  }

  /**
   * Get accountsReceivableProcedureSchedule
   * @return accountsReceivableProcedureSchedule
   **/
  
  @Schema(description = "")
  
@Valid
  public Schedule getAccountsReceivableProcedureSchedule() {  
    return accountsReceivableProcedureSchedule;
  }



  public void setAccountsReceivableProcedureSchedule(Schedule accountsReceivableProcedureSchedule) { 
    this.accountsReceivableProcedureSchedule = accountsReceivableProcedureSchedule;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureStatus(Status accountsReceivableProcedureStatus) { 

    this.accountsReceivableProcedureStatus = accountsReceivableProcedureStatus;
    return this;
  }

  /**
   * Get accountsReceivableProcedureStatus
   * @return accountsReceivableProcedureStatus
   **/
  
  @Schema(description = "")
  
@Valid
  public Status getAccountsReceivableProcedureStatus() {  
    return accountsReceivableProcedureStatus;
  }



  public void setAccountsReceivableProcedureStatus(Status accountsReceivableProcedureStatus) { 
    this.accountsReceivableProcedureStatus = accountsReceivableProcedureStatus;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureReference(AccountsReceivableProcedure accountsReceivableProcedureReference) { 

    this.accountsReceivableProcedureReference = accountsReceivableProcedureReference;
    return this;
  }

  /**
   * Get accountsReceivableProcedureReference
   * @return accountsReceivableProcedureReference
   **/
  
  @Schema(description = "")
  
@Valid
  public AccountsReceivableProcedure getAccountsReceivableProcedureReference() {  
    return accountsReceivableProcedureReference;
  }



  public void setAccountsReceivableProcedureReference(AccountsReceivableProcedure accountsReceivableProcedureReference) { 
    this.accountsReceivableProcedureReference = accountsReceivableProcedureReference;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureBusinessUnitReference(BusinessUnit accountsReceivableProcedureBusinessUnitReference) { 

    this.accountsReceivableProcedureBusinessUnitReference = accountsReceivableProcedureBusinessUnitReference;
    return this;
  }

  /**
   * Get accountsReceivableProcedureBusinessUnitReference
   * @return accountsReceivableProcedureBusinessUnitReference
   **/
  
  @Schema(description = "")
  
@Valid
  public BusinessUnit getAccountsReceivableProcedureBusinessUnitReference() {  
    return accountsReceivableProcedureBusinessUnitReference;
  }



  public void setAccountsReceivableProcedureBusinessUnitReference(BusinessUnit accountsReceivableProcedureBusinessUnitReference) { 
    this.accountsReceivableProcedureBusinessUnitReference = accountsReceivableProcedureBusinessUnitReference;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureServiceProviderReference(String accountsReceivableProcedureServiceProviderReference) { 

    this.accountsReceivableProcedureServiceProviderReference = accountsReceivableProcedureServiceProviderReference;
    return this;
  }

  /**
   * ||  |
   * @return accountsReceivableProcedureServiceProviderReference
   **/
  
  @Schema(description = "||  |")
  
  public String getAccountsReceivableProcedureServiceProviderReference() {  
    return accountsReceivableProcedureServiceProviderReference;
  }



  public void setAccountsReceivableProcedureServiceProviderReference(String accountsReceivableProcedureServiceProviderReference) { 
    this.accountsReceivableProcedureServiceProviderReference = accountsReceivableProcedureServiceProviderReference;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureFinancialFacilityReference(FinancialFacility accountsReceivableProcedureFinancialFacilityReference) { 

    this.accountsReceivableProcedureFinancialFacilityReference = accountsReceivableProcedureFinancialFacilityReference;
    return this;
  }

  /**
   * Get accountsReceivableProcedureFinancialFacilityReference
   * @return accountsReceivableProcedureFinancialFacilityReference
   **/
  
  @Schema(description = "")
  
@Valid
  public FinancialFacility getAccountsReceivableProcedureFinancialFacilityReference() {  
    return accountsReceivableProcedureFinancialFacilityReference;
  }



  public void setAccountsReceivableProcedureFinancialFacilityReference(FinancialFacility accountsReceivableProcedureFinancialFacilityReference) { 
    this.accountsReceivableProcedureFinancialFacilityReference = accountsReceivableProcedureFinancialFacilityReference;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureEmployeeReference(Employee accountsReceivableProcedureEmployeeReference) { 

    this.accountsReceivableProcedureEmployeeReference = accountsReceivableProcedureEmployeeReference;
    return this;
  }

  /**
   * Get accountsReceivableProcedureEmployeeReference
   * @return accountsReceivableProcedureEmployeeReference
   **/
  
  @Schema(description = "")
  
@Valid
  public Employee getAccountsReceivableProcedureEmployeeReference() {  
    return accountsReceivableProcedureEmployeeReference;
  }



  public void setAccountsReceivableProcedureEmployeeReference(Employee accountsReceivableProcedureEmployeeReference) { 
    this.accountsReceivableProcedureEmployeeReference = accountsReceivableProcedureEmployeeReference;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureCustomerReference(Involvedparty accountsReceivableProcedureCustomerReference) { 

    this.accountsReceivableProcedureCustomerReference = accountsReceivableProcedureCustomerReference;
    return this;
  }

  /**
   * Get accountsReceivableProcedureCustomerReference
   * @return accountsReceivableProcedureCustomerReference
   **/
  
  @Schema(description = "")
  
@Valid
  public Involvedparty getAccountsReceivableProcedureCustomerReference() {  
    return accountsReceivableProcedureCustomerReference;
  }



  public void setAccountsReceivableProcedureCustomerReference(Involvedparty accountsReceivableProcedureCustomerReference) { 
    this.accountsReceivableProcedureCustomerReference = accountsReceivableProcedureCustomerReference;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureType(Proceduretypevalues accountsReceivableProcedureType) { 

    this.accountsReceivableProcedureType = accountsReceivableProcedureType;
    return this;
  }

  /**
   * Get accountsReceivableProcedureType
   * @return accountsReceivableProcedureType
   **/
  
  @Schema(description = "")
  
@Valid
  public Proceduretypevalues getAccountsReceivableProcedureType() {  
    return accountsReceivableProcedureType;
  }



  public void setAccountsReceivableProcedureType(Proceduretypevalues accountsReceivableProcedureType) { 
    this.accountsReceivableProcedureType = accountsReceivableProcedureType;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureServiceProviderSchedule(Schedule accountsReceivableProcedureServiceProviderSchedule) { 

    this.accountsReceivableProcedureServiceProviderSchedule = accountsReceivableProcedureServiceProviderSchedule;
    return this;
  }

  /**
   * Get accountsReceivableProcedureServiceProviderSchedule
   * @return accountsReceivableProcedureServiceProviderSchedule
   **/
  
  @Schema(description = "")
  
@Valid
  public Schedule getAccountsReceivableProcedureServiceProviderSchedule() {  
    return accountsReceivableProcedureServiceProviderSchedule;
  }



  public void setAccountsReceivableProcedureServiceProviderSchedule(Schedule accountsReceivableProcedureServiceProviderSchedule) { 
    this.accountsReceivableProcedureServiceProviderSchedule = accountsReceivableProcedureServiceProviderSchedule;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureServiceType(Servicetypevalues accountsReceivableProcedureServiceType) { 

    this.accountsReceivableProcedureServiceType = accountsReceivableProcedureServiceType;
    return this;
  }

  /**
   * Get accountsReceivableProcedureServiceType
   * @return accountsReceivableProcedureServiceType
   **/
  
  @Schema(description = "")
  
@Valid
  public Servicetypevalues getAccountsReceivableProcedureServiceType() {  
    return accountsReceivableProcedureServiceType;
  }



  public void setAccountsReceivableProcedureServiceType(Servicetypevalues accountsReceivableProcedureServiceType) { 
    this.accountsReceivableProcedureServiceType = accountsReceivableProcedureServiceType;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureProductandServiceType(Bankingproducttypevalues accountsReceivableProcedureProductandServiceType) { 

    this.accountsReceivableProcedureProductandServiceType = accountsReceivableProcedureProductandServiceType;
    return this;
  }

  /**
   * Get accountsReceivableProcedureProductandServiceType
   * @return accountsReceivableProcedureProductandServiceType
   **/
  
  @Schema(description = "")
  
@Valid
  public Bankingproducttypevalues getAccountsReceivableProcedureProductandServiceType() {  
    return accountsReceivableProcedureProductandServiceType;
  }



  public void setAccountsReceivableProcedureProductandServiceType(Bankingproducttypevalues accountsReceivableProcedureProductandServiceType) { 
    this.accountsReceivableProcedureProductandServiceType = accountsReceivableProcedureProductandServiceType;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureProductandServiceInstance(Product accountsReceivableProcedureProductandServiceInstance) { 

    this.accountsReceivableProcedureProductandServiceInstance = accountsReceivableProcedureProductandServiceInstance;
    return this;
  }

  /**
   * Get accountsReceivableProcedureProductandServiceInstance
   * @return accountsReceivableProcedureProductandServiceInstance
   **/
  
  @Schema(description = "")
  
@Valid
  public Product getAccountsReceivableProcedureProductandServiceInstance() {  
    return accountsReceivableProcedureProductandServiceInstance;
  }



  public void setAccountsReceivableProcedureProductandServiceInstance(Product accountsReceivableProcedureProductandServiceInstance) { 
    this.accountsReceivableProcedureProductandServiceInstance = accountsReceivableProcedureProductandServiceInstance;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureTransactionType(Transactiontypevalues accountsReceivableProcedureTransactionType) { 

    this.accountsReceivableProcedureTransactionType = accountsReceivableProcedureTransactionType;
    return this;
  }

  /**
   * Get accountsReceivableProcedureTransactionType
   * @return accountsReceivableProcedureTransactionType
   **/
  
  @Schema(description = "")
  
@Valid
  public Transactiontypevalues getAccountsReceivableProcedureTransactionType() {  
    return accountsReceivableProcedureTransactionType;
  }



  public void setAccountsReceivableProcedureTransactionType(Transactiontypevalues accountsReceivableProcedureTransactionType) { 
    this.accountsReceivableProcedureTransactionType = accountsReceivableProcedureTransactionType;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureFinancialTransactionArrangement(Obligation accountsReceivableProcedureFinancialTransactionArrangement) { 

    this.accountsReceivableProcedureFinancialTransactionArrangement = accountsReceivableProcedureFinancialTransactionArrangement;
    return this;
  }

  /**
   * Get accountsReceivableProcedureFinancialTransactionArrangement
   * @return accountsReceivableProcedureFinancialTransactionArrangement
   **/
  
  @Schema(description = "")
  
@Valid
  public Obligation getAccountsReceivableProcedureFinancialTransactionArrangement() {  
    return accountsReceivableProcedureFinancialTransactionArrangement;
  }



  public void setAccountsReceivableProcedureFinancialTransactionArrangement(Obligation accountsReceivableProcedureFinancialTransactionArrangement) { 
    this.accountsReceivableProcedureFinancialTransactionArrangement = accountsReceivableProcedureFinancialTransactionArrangement;
  }

  public ExecuteAccountsReceivableProcedureRequest accountsReceivableProcedureCustomerAgreementReference(CustomerAgreement accountsReceivableProcedureCustomerAgreementReference) { 

    this.accountsReceivableProcedureCustomerAgreementReference = accountsReceivableProcedureCustomerAgreementReference;
    return this;
  }

  /**
   * Get accountsReceivableProcedureCustomerAgreementReference
   * @return accountsReceivableProcedureCustomerAgreementReference
   **/
  
  @Schema(description = "")
  
@Valid
  public CustomerAgreement getAccountsReceivableProcedureCustomerAgreementReference() {  
    return accountsReceivableProcedureCustomerAgreementReference;
  }



  public void setAccountsReceivableProcedureCustomerAgreementReference(CustomerAgreement accountsReceivableProcedureCustomerAgreementReference) { 
    this.accountsReceivableProcedureCustomerAgreementReference = accountsReceivableProcedureCustomerAgreementReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteAccountsReceivableProcedureRequest executeAccountsReceivableProcedureRequest = (ExecuteAccountsReceivableProcedureRequest) o;
    return Objects.equals(this.accountsReceivableProcedureParameterType, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureParameterType) &&
        Objects.equals(this.accountsReceivableProcedureSelectedOption, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureSelectedOption) &&
        Objects.equals(this.accountsReceivableProcedureRequest, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureRequest) &&
        Objects.equals(this.accountsReceivableProcedureSchedule, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureSchedule) &&
        Objects.equals(this.accountsReceivableProcedureStatus, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureStatus) &&
        Objects.equals(this.accountsReceivableProcedureReference, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureReference) &&
        Objects.equals(this.accountsReceivableProcedureBusinessUnitReference, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureBusinessUnitReference) &&
        Objects.equals(this.accountsReceivableProcedureServiceProviderReference, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureServiceProviderReference) &&
        Objects.equals(this.accountsReceivableProcedureFinancialFacilityReference, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureFinancialFacilityReference) &&
        Objects.equals(this.accountsReceivableProcedureEmployeeReference, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureEmployeeReference) &&
        Objects.equals(this.accountsReceivableProcedureCustomerReference, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureCustomerReference) &&
        Objects.equals(this.accountsReceivableProcedureType, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureType) &&
        Objects.equals(this.accountsReceivableProcedureServiceProviderSchedule, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureServiceProviderSchedule) &&
        Objects.equals(this.accountsReceivableProcedureServiceType, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureServiceType) &&
        Objects.equals(this.accountsReceivableProcedureProductandServiceType, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureProductandServiceType) &&
        Objects.equals(this.accountsReceivableProcedureProductandServiceInstance, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureProductandServiceInstance) &&
        Objects.equals(this.accountsReceivableProcedureTransactionType, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureTransactionType) &&
        Objects.equals(this.accountsReceivableProcedureFinancialTransactionArrangement, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureFinancialTransactionArrangement) &&
        Objects.equals(this.accountsReceivableProcedureCustomerAgreementReference, executeAccountsReceivableProcedureRequest.accountsReceivableProcedureCustomerAgreementReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountsReceivableProcedureParameterType, accountsReceivableProcedureSelectedOption, accountsReceivableProcedureRequest, accountsReceivableProcedureSchedule, accountsReceivableProcedureStatus, accountsReceivableProcedureReference, accountsReceivableProcedureBusinessUnitReference, accountsReceivableProcedureServiceProviderReference, accountsReceivableProcedureFinancialFacilityReference, accountsReceivableProcedureEmployeeReference, accountsReceivableProcedureCustomerReference, accountsReceivableProcedureType, accountsReceivableProcedureServiceProviderSchedule, accountsReceivableProcedureServiceType, accountsReceivableProcedureProductandServiceType, accountsReceivableProcedureProductandServiceInstance, accountsReceivableProcedureTransactionType, accountsReceivableProcedureFinancialTransactionArrangement, accountsReceivableProcedureCustomerAgreementReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteAccountsReceivableProcedureRequest {\n");
    
    sb.append("    accountsReceivableProcedureParameterType: ").append(toIndentedString(accountsReceivableProcedureParameterType)).append("\n");
    sb.append("    accountsReceivableProcedureSelectedOption: ").append(toIndentedString(accountsReceivableProcedureSelectedOption)).append("\n");
    sb.append("    accountsReceivableProcedureRequest: ").append(toIndentedString(accountsReceivableProcedureRequest)).append("\n");
    sb.append("    accountsReceivableProcedureSchedule: ").append(toIndentedString(accountsReceivableProcedureSchedule)).append("\n");
    sb.append("    accountsReceivableProcedureStatus: ").append(toIndentedString(accountsReceivableProcedureStatus)).append("\n");
    sb.append("    accountsReceivableProcedureReference: ").append(toIndentedString(accountsReceivableProcedureReference)).append("\n");
    sb.append("    accountsReceivableProcedureBusinessUnitReference: ").append(toIndentedString(accountsReceivableProcedureBusinessUnitReference)).append("\n");
    sb.append("    accountsReceivableProcedureServiceProviderReference: ").append(toIndentedString(accountsReceivableProcedureServiceProviderReference)).append("\n");
    sb.append("    accountsReceivableProcedureFinancialFacilityReference: ").append(toIndentedString(accountsReceivableProcedureFinancialFacilityReference)).append("\n");
    sb.append("    accountsReceivableProcedureEmployeeReference: ").append(toIndentedString(accountsReceivableProcedureEmployeeReference)).append("\n");
    sb.append("    accountsReceivableProcedureCustomerReference: ").append(toIndentedString(accountsReceivableProcedureCustomerReference)).append("\n");
    sb.append("    accountsReceivableProcedureType: ").append(toIndentedString(accountsReceivableProcedureType)).append("\n");
    sb.append("    accountsReceivableProcedureServiceProviderSchedule: ").append(toIndentedString(accountsReceivableProcedureServiceProviderSchedule)).append("\n");
    sb.append("    accountsReceivableProcedureServiceType: ").append(toIndentedString(accountsReceivableProcedureServiceType)).append("\n");
    sb.append("    accountsReceivableProcedureProductandServiceType: ").append(toIndentedString(accountsReceivableProcedureProductandServiceType)).append("\n");
    sb.append("    accountsReceivableProcedureProductandServiceInstance: ").append(toIndentedString(accountsReceivableProcedureProductandServiceInstance)).append("\n");
    sb.append("    accountsReceivableProcedureTransactionType: ").append(toIndentedString(accountsReceivableProcedureTransactionType)).append("\n");
    sb.append("    accountsReceivableProcedureFinancialTransactionArrangement: ").append(toIndentedString(accountsReceivableProcedureFinancialTransactionArrangement)).append("\n");
    sb.append("    accountsReceivableProcedureCustomerAgreementReference: ").append(toIndentedString(accountsReceivableProcedureCustomerAgreementReference)).append("\n");
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
