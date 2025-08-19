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
 * (DDD Entity) - Request to process AccountsReceivable Instruction ||  |
 */
@Schema(description = "(DDD Entity) - Request to process AccountsReceivable Instruction ||  |")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Instruction   {
  @JsonProperty("InstructionDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Instructiondatetime instructionDate = null;

  @JsonProperty("InstructionStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Instructionstatus instructionStatus = null;

  @JsonProperty("InstructionIdentifier")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Instructionidentification instructionIdentifier = null;

  @JsonProperty("InstructionType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Instructiontypevalues instructionType = null;

  @JsonProperty("InstructionResult")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Text instructionResult = null;

  @JsonProperty("InstructionDescription")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Text instructionDescription = null;

  @JsonProperty("InstructionLog")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Log instructionLog = null;

  @JsonProperty("InstructionPurpose")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Text instructionPurpose = null;


  public Instruction instructionDate(Instructiondatetime instructionDate) { 

    this.instructionDate = instructionDate;
    return this;
  }

  /**
   * Get instructionDate
   * @return instructionDate
   **/
  
  @Schema(description = "")
  
@Valid
  public Instructiondatetime getInstructionDate() {  
    return instructionDate;
  }



  public void setInstructionDate(Instructiondatetime instructionDate) { 
    this.instructionDate = instructionDate;
  }

  public Instruction instructionStatus(Instructionstatus instructionStatus) { 

    this.instructionStatus = instructionStatus;
    return this;
  }

  /**
   * Get instructionStatus
   * @return instructionStatus
   **/
  
  @Schema(description = "")
  
@Valid
  public Instructionstatus getInstructionStatus() {  
    return instructionStatus;
  }



  public void setInstructionStatus(Instructionstatus instructionStatus) { 
    this.instructionStatus = instructionStatus;
  }

  public Instruction instructionIdentifier(Instructionidentification instructionIdentifier) { 

    this.instructionIdentifier = instructionIdentifier;
    return this;
  }

  /**
   * Get instructionIdentifier
   * @return instructionIdentifier
   **/
  
  @Schema(description = "")
  
@Valid
  public Instructionidentification getInstructionIdentifier() {  
    return instructionIdentifier;
  }



  public void setInstructionIdentifier(Instructionidentification instructionIdentifier) { 
    this.instructionIdentifier = instructionIdentifier;
  }

  public Instruction instructionType(Instructiontypevalues instructionType) { 

    this.instructionType = instructionType;
    return this;
  }

  /**
   * Get instructionType
   * @return instructionType
   **/
  
  @Schema(description = "")
  
@Valid
  public Instructiontypevalues getInstructionType() {  
    return instructionType;
  }



  public void setInstructionType(Instructiontypevalues instructionType) { 
    this.instructionType = instructionType;
  }

  public Instruction instructionResult(Text instructionResult) { 

    this.instructionResult = instructionResult;
    return this;
  }

  /**
   * Get instructionResult
   * @return instructionResult
   **/
  
  @Schema(description = "")
  
@Valid
  public Text getInstructionResult() {  
    return instructionResult;
  }



  public void setInstructionResult(Text instructionResult) { 
    this.instructionResult = instructionResult;
  }

  public Instruction instructionDescription(Text instructionDescription) { 

    this.instructionDescription = instructionDescription;
    return this;
  }

  /**
   * Get instructionDescription
   * @return instructionDescription
   **/
  
  @Schema(description = "")
  
@Valid
  public Text getInstructionDescription() {  
    return instructionDescription;
  }



  public void setInstructionDescription(Text instructionDescription) { 
    this.instructionDescription = instructionDescription;
  }

  public Instruction instructionLog(Log instructionLog) { 

    this.instructionLog = instructionLog;
    return this;
  }

  /**
   * Get instructionLog
   * @return instructionLog
   **/
  
  @Schema(description = "")
  
@Valid
  public Log getInstructionLog() {  
    return instructionLog;
  }



  public void setInstructionLog(Log instructionLog) { 
    this.instructionLog = instructionLog;
  }

  public Instruction instructionPurpose(Text instructionPurpose) { 

    this.instructionPurpose = instructionPurpose;
    return this;
  }

  /**
   * Get instructionPurpose
   * @return instructionPurpose
   **/
  
  @Schema(description = "")
  
@Valid
  public Text getInstructionPurpose() {  
    return instructionPurpose;
  }



  public void setInstructionPurpose(Text instructionPurpose) { 
    this.instructionPurpose = instructionPurpose;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instruction instruction = (Instruction) o;
    return Objects.equals(this.instructionDate, instruction.instructionDate) &&
        Objects.equals(this.instructionStatus, instruction.instructionStatus) &&
        Objects.equals(this.instructionIdentifier, instruction.instructionIdentifier) &&
        Objects.equals(this.instructionType, instruction.instructionType) &&
        Objects.equals(this.instructionResult, instruction.instructionResult) &&
        Objects.equals(this.instructionDescription, instruction.instructionDescription) &&
        Objects.equals(this.instructionLog, instruction.instructionLog) &&
        Objects.equals(this.instructionPurpose, instruction.instructionPurpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionDate, instructionStatus, instructionIdentifier, instructionType, instructionResult, instructionDescription, instructionLog, instructionPurpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instruction {\n");
    
    sb.append("    instructionDate: ").append(toIndentedString(instructionDate)).append("\n");
    sb.append("    instructionStatus: ").append(toIndentedString(instructionStatus)).append("\n");
    sb.append("    instructionIdentifier: ").append(toIndentedString(instructionIdentifier)).append("\n");
    sb.append("    instructionType: ").append(toIndentedString(instructionType)).append("\n");
    sb.append("    instructionResult: ").append(toIndentedString(instructionResult)).append("\n");
    sb.append("    instructionDescription: ").append(toIndentedString(instructionDescription)).append("\n");
    sb.append("    instructionLog: ").append(toIndentedString(instructionLog)).append("\n");
    sb.append("    instructionPurpose: ").append(toIndentedString(instructionPurpose)).append("\n");
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
