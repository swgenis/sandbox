package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) -  Instructiondatetime 
 */
@Schema(description = "(DDD Entity) -  Instructiondatetime ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Instructiondatetimetypevalues   {
  /**
   * >  * `DueDate` -   * `ExecutionDate` -   * `FulfillmentDate` - 
   */
  public enum InstructiondatetimetypevaluesEnum {
    DUEDATE("DueDate"),
    
    EXECUTIONDATE("ExecutionDate"),
    
    FULFILLMENTDATE("FulfillmentDate");

    private String value;

    InstructiondatetimetypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstructiondatetimetypevaluesEnum fromValue(String text) {
      for (InstructiondatetimetypevaluesEnum b : InstructiondatetimetypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Instructiondatetimetypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InstructiondatetimetypevaluesEnum instructiondatetimetypevalues = null;


  public Instructiondatetimetypevalues instructiondatetimetypevalues(InstructiondatetimetypevaluesEnum instructiondatetimetypevalues) { 

    this.instructiondatetimetypevalues = instructiondatetimetypevalues;
    return this;
  }

  /**
   * >  * `DueDate` -   * `ExecutionDate` -   * `FulfillmentDate` - 
   * @return instructiondatetimetypevalues
   **/
  
  @Schema(description = ">  * `DueDate` -   * `ExecutionDate` -   * `FulfillmentDate` - ")
  
  public InstructiondatetimetypevaluesEnum getInstructiondatetimetypevalues() {  
    return instructiondatetimetypevalues;
  }



  public void setInstructiondatetimetypevalues(InstructiondatetimetypevaluesEnum instructiondatetimetypevalues) { 
    this.instructiondatetimetypevalues = instructiondatetimetypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instructiondatetimetypevalues instructiondatetimetypevalues = (Instructiondatetimetypevalues) o;
    return Objects.equals(this.instructiondatetimetypevalues, instructiondatetimetypevalues.instructiondatetimetypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructiondatetimetypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instructiondatetimetypevalues {\n");
    
    sb.append("    instructiondatetimetypevalues: ").append(toIndentedString(instructiondatetimetypevalues)).append("\n");
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
