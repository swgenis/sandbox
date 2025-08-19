package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - An identifier that allows to uniquely refer to an instance of an Instruction.  Instructionidentification 
 */
@Schema(description = "(DDD Entity) - An identifier that allows to uniquely refer to an instance of an Instruction.  Instructionidentification ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Instructionidentificationtypevalues   {
  /**
   * >  * `OrderNumber` -   * `InstructionNumber` - 
   */
  public enum InstructionidentificationtypevaluesEnum {
    ORDERNUMBER("OrderNumber"),
    
    INSTRUCTIONNUMBER("InstructionNumber");

    private String value;

    InstructionidentificationtypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstructionidentificationtypevaluesEnum fromValue(String text) {
      for (InstructionidentificationtypevaluesEnum b : InstructionidentificationtypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Instructionidentificationtypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InstructionidentificationtypevaluesEnum instructionidentificationtypevalues = null;


  public Instructionidentificationtypevalues instructionidentificationtypevalues(InstructionidentificationtypevaluesEnum instructionidentificationtypevalues) { 

    this.instructionidentificationtypevalues = instructionidentificationtypevalues;
    return this;
  }

  /**
   * >  * `OrderNumber` -   * `InstructionNumber` - 
   * @return instructionidentificationtypevalues
   **/
  
  @Schema(description = ">  * `OrderNumber` -   * `InstructionNumber` - ")
  
  public InstructionidentificationtypevaluesEnum getInstructionidentificationtypevalues() {  
    return instructionidentificationtypevalues;
  }



  public void setInstructionidentificationtypevalues(InstructionidentificationtypevaluesEnum instructionidentificationtypevalues) { 
    this.instructionidentificationtypevalues = instructionidentificationtypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instructionidentificationtypevalues instructionidentificationtypevalues = (Instructionidentificationtypevalues) o;
    return Objects.equals(this.instructionidentificationtypevalues, instructionidentificationtypevalues.instructionidentificationtypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionidentificationtypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instructionidentificationtypevalues {\n");
    
    sb.append("    instructionidentificationtypevalues: ").append(toIndentedString(instructionidentificationtypevalues)).append("\n");
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
