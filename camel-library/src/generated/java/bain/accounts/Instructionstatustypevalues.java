package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - A characteristic of instruction which refers to the LifecycleStatus of instruction (e.g., requested, executed, fulfilled, etc.);  Instructionstatus 
 */
@Schema(description = "(DDD Entity) - A characteristic of instruction which refers to the LifecycleStatus of instruction (e.g., requested, executed, fulfilled, etc.);  Instructionstatus ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Instructionstatustypevalues   {
  /**
   * >  * `Pendingprocessing` - Processing of the instruction is pending.  * `Acknowledgedaccepted` - Instruction has been acknowledged and accepted and is validated for further processing.  * `Rejected` - Instruction has been rejected.  * `Accepted` - Instruction has been accepted and is validated for further processing.  * `Completed` - Processing has been completed.  * `Notreceived` - No instruction has been received (to be used in a reminder).  * `Cancelled` - Instruction has been cancelled.  * `Beingcancelled` - Cancel request is being processed.  * `Receivedbyissuerorregistrar` - Instruction has been received by Issuer.  * `Pending` - Instruction is pending.  * `Standinginstruction` - Standing instruction is applied.  * `Queued` - Instruction is queued.  * `Cancelledbysubcustodian` - Instruction has been cancelled by the agent, for example, due to an event deadline extension.  * `Forwarded` - Accepted and sent along the chain.
   */
  public enum InstructionstatustypevaluesEnum {
    PENDINGPROCESSING("Pendingprocessing"),
    
    ACKNOWLEDGEDACCEPTED("Acknowledgedaccepted"),
    
    REJECTED("Rejected"),
    
    ACCEPTED("Accepted"),
    
    COMPLETED("Completed"),
    
    NOTRECEIVED("Notreceived"),
    
    CANCELLED("Cancelled"),
    
    BEINGCANCELLED("Beingcancelled"),
    
    RECEIVEDBYISSUERORREGISTRAR("Receivedbyissuerorregistrar"),
    
    PENDING("Pending"),
    
    STANDINGINSTRUCTION("Standinginstruction"),
    
    QUEUED("Queued"),
    
    CANCELLEDBYSUBCUSTODIAN("Cancelledbysubcustodian"),
    
    FORWARDED("Forwarded");

    private String value;

    InstructionstatustypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstructionstatustypevaluesEnum fromValue(String text) {
      for (InstructionstatustypevaluesEnum b : InstructionstatustypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Instructionstatustypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InstructionstatustypevaluesEnum instructionstatustypevalues = null;


  public Instructionstatustypevalues instructionstatustypevalues(InstructionstatustypevaluesEnum instructionstatustypevalues) { 

    this.instructionstatustypevalues = instructionstatustypevalues;
    return this;
  }

  /**
   * >  * `Pendingprocessing` - Processing of the instruction is pending.  * `Acknowledgedaccepted` - Instruction has been acknowledged and accepted and is validated for further processing.  * `Rejected` - Instruction has been rejected.  * `Accepted` - Instruction has been accepted and is validated for further processing.  * `Completed` - Processing has been completed.  * `Notreceived` - No instruction has been received (to be used in a reminder).  * `Cancelled` - Instruction has been cancelled.  * `Beingcancelled` - Cancel request is being processed.  * `Receivedbyissuerorregistrar` - Instruction has been received by Issuer.  * `Pending` - Instruction is pending.  * `Standinginstruction` - Standing instruction is applied.  * `Queued` - Instruction is queued.  * `Cancelledbysubcustodian` - Instruction has been cancelled by the agent, for example, due to an event deadline extension.  * `Forwarded` - Accepted and sent along the chain.
   * @return instructionstatustypevalues
   **/
  
  @Schema(description = ">  * `Pendingprocessing` - Processing of the instruction is pending.  * `Acknowledgedaccepted` - Instruction has been acknowledged and accepted and is validated for further processing.  * `Rejected` - Instruction has been rejected.  * `Accepted` - Instruction has been accepted and is validated for further processing.  * `Completed` - Processing has been completed.  * `Notreceived` - No instruction has been received (to be used in a reminder).  * `Cancelled` - Instruction has been cancelled.  * `Beingcancelled` - Cancel request is being processed.  * `Receivedbyissuerorregistrar` - Instruction has been received by Issuer.  * `Pending` - Instruction is pending.  * `Standinginstruction` - Standing instruction is applied.  * `Queued` - Instruction is queued.  * `Cancelledbysubcustodian` - Instruction has been cancelled by the agent, for example, due to an event deadline extension.  * `Forwarded` - Accepted and sent along the chain.")
  
  public InstructionstatustypevaluesEnum getInstructionstatustypevalues() {  
    return instructionstatustypevalues;
  }



  public void setInstructionstatustypevalues(InstructionstatustypevaluesEnum instructionstatustypevalues) { 
    this.instructionstatustypevalues = instructionstatustypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instructionstatustypevalues instructionstatustypevalues = (Instructionstatustypevalues) o;
    return Objects.equals(this.instructionstatustypevalues, instructionstatustypevalues.instructionstatustypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionstatustypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instructionstatustypevalues {\n");
    
    sb.append("    instructionstatustypevalues: ").append(toIndentedString(instructionstatustypevalues)).append("\n");
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
