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
 * RequestAccountsReceivableProcedureResponse
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class RequestAccountsReceivableProcedureResponse   {
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


  public RequestAccountsReceivableProcedureResponse accountsReceivableProcedureParameterType(Featuretypevalues accountsReceivableProcedureParameterType) { 

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

  public RequestAccountsReceivableProcedureResponse accountsReceivableProcedureSelectedOption(Feature accountsReceivableProcedureSelectedOption) { 

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

  public RequestAccountsReceivableProcedureResponse accountsReceivableProcedureRequest(Instruction accountsReceivableProcedureRequest) { 

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

  public RequestAccountsReceivableProcedureResponse accountsReceivableProcedureSchedule(Schedule accountsReceivableProcedureSchedule) { 

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

  public RequestAccountsReceivableProcedureResponse accountsReceivableProcedureStatus(Status accountsReceivableProcedureStatus) { 

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestAccountsReceivableProcedureResponse requestAccountsReceivableProcedureResponse = (RequestAccountsReceivableProcedureResponse) o;
    return Objects.equals(this.accountsReceivableProcedureParameterType, requestAccountsReceivableProcedureResponse.accountsReceivableProcedureParameterType) &&
        Objects.equals(this.accountsReceivableProcedureSelectedOption, requestAccountsReceivableProcedureResponse.accountsReceivableProcedureSelectedOption) &&
        Objects.equals(this.accountsReceivableProcedureRequest, requestAccountsReceivableProcedureResponse.accountsReceivableProcedureRequest) &&
        Objects.equals(this.accountsReceivableProcedureSchedule, requestAccountsReceivableProcedureResponse.accountsReceivableProcedureSchedule) &&
        Objects.equals(this.accountsReceivableProcedureStatus, requestAccountsReceivableProcedureResponse.accountsReceivableProcedureStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountsReceivableProcedureParameterType, accountsReceivableProcedureSelectedOption, accountsReceivableProcedureRequest, accountsReceivableProcedureSchedule, accountsReceivableProcedureStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestAccountsReceivableProcedureResponse {\n");
    
    sb.append("    accountsReceivableProcedureParameterType: ").append(toIndentedString(accountsReceivableProcedureParameterType)).append("\n");
    sb.append("    accountsReceivableProcedureSelectedOption: ").append(toIndentedString(accountsReceivableProcedureSelectedOption)).append("\n");
    sb.append("    accountsReceivableProcedureRequest: ").append(toIndentedString(accountsReceivableProcedureRequest)).append("\n");
    sb.append("    accountsReceivableProcedureSchedule: ").append(toIndentedString(accountsReceivableProcedureSchedule)).append("\n");
    sb.append("    accountsReceivableProcedureStatus: ").append(toIndentedString(accountsReceivableProcedureStatus)).append("\n");
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
