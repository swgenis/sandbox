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
 * (DDD Entity) -  Instructiondatetime 
 */
@Schema(description = "(DDD Entity) -  Instructiondatetime ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Instructiondatetime   {
  @JsonProperty("InstructionDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Datetime instructionDate = null;

  @JsonProperty("InstructionDateType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Instructiondatetimetypevalues instructionDateType = null;


  public Instructiondatetime instructionDate(Datetime instructionDate) { 

    this.instructionDate = instructionDate;
    return this;
  }

  /**
   * Get instructionDate
   * @return instructionDate
   **/
  
  @Schema(description = "")
  
@Valid
  public Datetime getInstructionDate() {  
    return instructionDate;
  }



  public void setInstructionDate(Datetime instructionDate) { 
    this.instructionDate = instructionDate;
  }

  public Instructiondatetime instructionDateType(Instructiondatetimetypevalues instructionDateType) { 

    this.instructionDateType = instructionDateType;
    return this;
  }

  /**
   * Get instructionDateType
   * @return instructionDateType
   **/
  
  @Schema(description = "")
  
@Valid
  public Instructiondatetimetypevalues getInstructionDateType() {  
    return instructionDateType;
  }



  public void setInstructionDateType(Instructiondatetimetypevalues instructionDateType) { 
    this.instructionDateType = instructionDateType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instructiondatetime instructiondatetime = (Instructiondatetime) o;
    return Objects.equals(this.instructionDate, instructiondatetime.instructionDate) &&
        Objects.equals(this.instructionDateType, instructiondatetime.instructionDateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionDate, instructionDateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instructiondatetime {\n");
    
    sb.append("    instructionDate: ").append(toIndentedString(instructionDate)).append("\n");
    sb.append("    instructionDateType: ").append(toIndentedString(instructionDateType)).append("\n");
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
