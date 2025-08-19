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
 * (DDD Entity) - An identifier that allows to uniquely refer to an instance of an Instruction.  Instructionidentification 
 */
@Schema(description = "(DDD Entity) - An identifier that allows to uniquely refer to an instance of an Instruction.  Instructionidentification ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Instructionidentification   {
  @JsonProperty("InstructionIdentification")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Identifier instructionIdentification = null;

  @JsonProperty("InstructionIdentificationType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Instructionidentificationtypevalues instructionIdentificationType = null;


  public Instructionidentification instructionIdentification(Identifier instructionIdentification) { 

    this.instructionIdentification = instructionIdentification;
    return this;
  }

  /**
   * Get instructionIdentification
   * @return instructionIdentification
   **/
  
  @Schema(description = "")
  
@Valid
  public Identifier getInstructionIdentification() {  
    return instructionIdentification;
  }



  public void setInstructionIdentification(Identifier instructionIdentification) { 
    this.instructionIdentification = instructionIdentification;
  }

  public Instructionidentification instructionIdentificationType(Instructionidentificationtypevalues instructionIdentificationType) { 

    this.instructionIdentificationType = instructionIdentificationType;
    return this;
  }

  /**
   * Get instructionIdentificationType
   * @return instructionIdentificationType
   **/
  
  @Schema(description = "")
  
@Valid
  public Instructionidentificationtypevalues getInstructionIdentificationType() {  
    return instructionIdentificationType;
  }



  public void setInstructionIdentificationType(Instructionidentificationtypevalues instructionIdentificationType) { 
    this.instructionIdentificationType = instructionIdentificationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instructionidentification instructionidentification = (Instructionidentification) o;
    return Objects.equals(this.instructionIdentification, instructionidentification.instructionIdentification) &&
        Objects.equals(this.instructionIdentificationType, instructionidentification.instructionIdentificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionIdentification, instructionIdentificationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instructionidentification {\n");
    
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    instructionIdentificationType: ").append(toIndentedString(instructionIdentificationType)).append("\n");
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
