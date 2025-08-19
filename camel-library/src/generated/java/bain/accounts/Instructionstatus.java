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
 * (DDD Entity) - A characteristic of instruction which refers to the LifecycleStatus of instruction (e.g., requested, executed, fulfilled, etc.);  Instructionstatus 
 */
@Schema(description = "(DDD Entity) - A characteristic of instruction which refers to the LifecycleStatus of instruction (e.g., requested, executed, fulfilled, etc.);  Instructionstatus ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Instructionstatus   {
  @JsonProperty("InstructionStatusType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Instructionstatustypevalues instructionStatusType = null;

  @JsonProperty("InstructionStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Status instructionStatus = null;


  public Instructionstatus instructionStatusType(Instructionstatustypevalues instructionStatusType) { 

    this.instructionStatusType = instructionStatusType;
    return this;
  }

  /**
   * Get instructionStatusType
   * @return instructionStatusType
   **/
  
  @Schema(description = "")
  
@Valid
  public Instructionstatustypevalues getInstructionStatusType() {  
    return instructionStatusType;
  }



  public void setInstructionStatusType(Instructionstatustypevalues instructionStatusType) { 
    this.instructionStatusType = instructionStatusType;
  }

  public Instructionstatus instructionStatus(Status instructionStatus) { 

    this.instructionStatus = instructionStatus;
    return this;
  }

  /**
   * Get instructionStatus
   * @return instructionStatus
   **/
  
  @Schema(description = "")
  
@Valid
  public Status getInstructionStatus() {  
    return instructionStatus;
  }



  public void setInstructionStatus(Status instructionStatus) { 
    this.instructionStatus = instructionStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instructionstatus instructionstatus = (Instructionstatus) o;
    return Objects.equals(this.instructionStatusType, instructionstatus.instructionStatusType) &&
        Objects.equals(this.instructionStatus, instructionstatus.instructionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionStatusType, instructionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instructionstatus {\n");
    
    sb.append("    instructionStatusType: ").append(toIndentedString(instructionStatusType)).append("\n");
    sb.append("    instructionStatus: ").append(toIndentedString(instructionStatus)).append("\n");
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
