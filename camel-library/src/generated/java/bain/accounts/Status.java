package bain.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - The status of Accounts Receivable Procedure Status |Status  (https://www.iso20022.org/standardsrepository/type/Status)|Standard|ISO20022 BM ()
 */
@Schema(description = "(DDD Entity) - The status of Accounts Receivable Procedure Status |Status  (https://www.iso20022.org/standardsrepository/type/Status)|Standard|ISO20022 BM ()")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Status   {
  @JsonProperty("StatusReason")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String statusReason = null;

  @JsonProperty("StatusDateTime")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String statusDateTime = null;

  @JsonProperty("ValidityTime")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String validityTime = null;

  @JsonProperty("StatusDescription")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String statusDescription = null;

  @JsonProperty("InstructionProcessingStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String instructionProcessingStatus = null;

  @JsonProperty("PartyRole")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String partyRole = null;

  @JsonProperty("SettlementStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String settlementStatus = null;

  @JsonProperty("CancellationProcessingStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String cancellationProcessingStatus = null;

  @JsonProperty("TransactionProcessingStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String transactionProcessingStatus = null;

  @JsonProperty("ModificationProcessingStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String modificationProcessingStatus = null;


  public Status statusReason(String statusReason) { 

    this.statusReason = statusReason;
    return this;
  }

  /**
   * (DDD Entity) - Specifies the reasons for the status. 
   * @return statusReason
   **/
  
  @Schema(description = "(DDD Entity) - Specifies the reasons for the status. ")
  
  public String getStatusReason() {  
    return statusReason;
  }



  public void setStatusReason(String statusReason) { 
    this.statusReason = statusReason;
  }

  public Status statusDateTime(String statusDateTime) { 

    this.statusDateTime = statusDateTime;
    return this;
  }

  /**
   * (DDD Entity) - Date and time at which the status was assigned. 
   * @return statusDateTime
   **/
  
  @Schema(description = "(DDD Entity) - Date and time at which the status was assigned. ")
  
  public String getStatusDateTime() {  
    return statusDateTime;
  }



  public void setStatusDateTime(String statusDateTime) { 
    this.statusDateTime = statusDateTime;
  }

  public Status validityTime(String validityTime) { 

    this.validityTime = validityTime;
    return this;
  }

  /**
   * (DDD Entity) - Period of time during which the status is valid. 
   * @return validityTime
   **/
  
  @Schema(description = "(DDD Entity) - Period of time during which the status is valid. ")
  
  public String getValidityTime() {  
    return validityTime;
  }



  public void setValidityTime(String validityTime) { 
    this.validityTime = validityTime;
  }

  public Status statusDescription(String statusDescription) { 

    this.statusDescription = statusDescription;
    return this;
  }

  /**
   * (DDD Entity) - Specifies the state or the condition. 
   * @return statusDescription
   **/
  
  @Schema(description = "(DDD Entity) - Specifies the state or the condition. ")
  
  public String getStatusDescription() {  
    return statusDescription;
  }



  public void setStatusDescription(String statusDescription) { 
    this.statusDescription = statusDescription;
  }

  public Status instructionProcessingStatus(String instructionProcessingStatus) { 

    this.instructionProcessingStatus = instructionProcessingStatus;
    return this;
  }

  /**
   * (DDD Entity) - Status of the processing of an instruction. 
   * @return instructionProcessingStatus
   **/
  
  @Schema(description = "(DDD Entity) - Status of the processing of an instruction. ")
  
  public String getInstructionProcessingStatus() {  
    return instructionProcessingStatus;
  }



  public void setInstructionProcessingStatus(String instructionProcessingStatus) { 
    this.instructionProcessingStatus = instructionProcessingStatus;
  }

  public Status partyRole(String partyRole) { 

    this.partyRole = partyRole;
    return this;
  }

  /**
   * (DDD Entity) - Role played by a party in the context of assigning a status. 
   * @return partyRole
   **/
  
  @Schema(description = "(DDD Entity) - Role played by a party in the context of assigning a status. ")
  
  public String getPartyRole() {  
    return partyRole;
  }



  public void setPartyRole(String partyRole) { 
    this.partyRole = partyRole;
  }

  public Status settlementStatus(String settlementStatus) { 

    this.settlementStatus = settlementStatus;
    return this;
  }

  /**
   * (DDD Entity) - Status of settlement of a transaction. 
   * @return settlementStatus
   **/
  
  @Schema(description = "(DDD Entity) - Status of settlement of a transaction. ")
  
  public String getSettlementStatus() {  
    return settlementStatus;
  }



  public void setSettlementStatus(String settlementStatus) { 
    this.settlementStatus = settlementStatus;
  }

  public Status cancellationProcessingStatus(String cancellationProcessingStatus) { 

    this.cancellationProcessingStatus = cancellationProcessingStatus;
    return this;
  }

  /**
   * (DDD Entity) - Specifies the status of a cancellation request. 
   * @return cancellationProcessingStatus
   **/
  
  @Schema(description = "(DDD Entity) - Specifies the status of a cancellation request. ")
  
  public String getCancellationProcessingStatus() {  
    return cancellationProcessingStatus;
  }



  public void setCancellationProcessingStatus(String cancellationProcessingStatus) { 
    this.cancellationProcessingStatus = cancellationProcessingStatus;
  }

  public Status transactionProcessingStatus(String transactionProcessingStatus) { 

    this.transactionProcessingStatus = transactionProcessingStatus;
    return this;
  }

  /**
   * (DDD Entity) - Status of processing of a transaction at account servicer level. 
   * @return transactionProcessingStatus
   **/
  
  @Schema(description = "(DDD Entity) - Status of processing of a transaction at account servicer level. ")
  
  public String getTransactionProcessingStatus() {  
    return transactionProcessingStatus;
  }



  public void setTransactionProcessingStatus(String transactionProcessingStatus) { 
    this.transactionProcessingStatus = transactionProcessingStatus;
  }

  public Status modificationProcessingStatus(String modificationProcessingStatus) { 

    this.modificationProcessingStatus = modificationProcessingStatus;
    return this;
  }

  /**
   * (DDD Entity) - Provides the status of a modification request. 
   * @return modificationProcessingStatus
   **/
  
  @Schema(description = "(DDD Entity) - Provides the status of a modification request. ")
  
  public String getModificationProcessingStatus() {  
    return modificationProcessingStatus;
  }



  public void setModificationProcessingStatus(String modificationProcessingStatus) { 
    this.modificationProcessingStatus = modificationProcessingStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.statusReason, status.statusReason) &&
        Objects.equals(this.statusDateTime, status.statusDateTime) &&
        Objects.equals(this.validityTime, status.validityTime) &&
        Objects.equals(this.statusDescription, status.statusDescription) &&
        Objects.equals(this.instructionProcessingStatus, status.instructionProcessingStatus) &&
        Objects.equals(this.partyRole, status.partyRole) &&
        Objects.equals(this.settlementStatus, status.settlementStatus) &&
        Objects.equals(this.cancellationProcessingStatus, status.cancellationProcessingStatus) &&
        Objects.equals(this.transactionProcessingStatus, status.transactionProcessingStatus) &&
        Objects.equals(this.modificationProcessingStatus, status.modificationProcessingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusReason, statusDateTime, validityTime, statusDescription, instructionProcessingStatus, partyRole, settlementStatus, cancellationProcessingStatus, transactionProcessingStatus, modificationProcessingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    statusDateTime: ").append(toIndentedString(statusDateTime)).append("\n");
    sb.append("    validityTime: ").append(toIndentedString(validityTime)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    instructionProcessingStatus: ").append(toIndentedString(instructionProcessingStatus)).append("\n");
    sb.append("    partyRole: ").append(toIndentedString(partyRole)).append("\n");
    sb.append("    settlementStatus: ").append(toIndentedString(settlementStatus)).append("\n");
    sb.append("    cancellationProcessingStatus: ").append(toIndentedString(cancellationProcessingStatus)).append("\n");
    sb.append("    transactionProcessingStatus: ").append(toIndentedString(transactionProcessingStatus)).append("\n");
    sb.append("    modificationProcessingStatus: ").append(toIndentedString(modificationProcessingStatus)).append("\n");
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
