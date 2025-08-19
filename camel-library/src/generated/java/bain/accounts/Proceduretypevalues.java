package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Proceduretypevalues
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Proceduretypevalues   {
  /**
   * >  * `Proceduretypevalues` - A Classification value that distinguishes between the type of process undertaken within Procedure
   */
  public enum ProceduretypevaluesEnum {
    PROCEDURETYPEVALUES("Proceduretypevalues");

    private String value;

    ProceduretypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProceduretypevaluesEnum fromValue(String text) {
      for (ProceduretypevaluesEnum b : ProceduretypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Proceduretypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private ProceduretypevaluesEnum proceduretypevalues = null;


  public Proceduretypevalues proceduretypevalues(ProceduretypevaluesEnum proceduretypevalues) { 

    this.proceduretypevalues = proceduretypevalues;
    return this;
  }

  /**
   * >  * `Proceduretypevalues` - A Classification value that distinguishes between the type of process undertaken within Procedure
   * @return proceduretypevalues
   **/
  
  @Schema(description = ">  * `Proceduretypevalues` - A Classification value that distinguishes between the type of process undertaken within Procedure")
  
  public ProceduretypevaluesEnum getProceduretypevalues() {  
    return proceduretypevalues;
  }



  public void setProceduretypevalues(ProceduretypevaluesEnum proceduretypevalues) { 
    this.proceduretypevalues = proceduretypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Proceduretypevalues proceduretypevalues = (Proceduretypevalues) o;
    return Objects.equals(this.proceduretypevalues, proceduretypevalues.proceduretypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proceduretypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Proceduretypevalues {\n");
    
    sb.append("    proceduretypevalues: ").append(toIndentedString(proceduretypevalues)).append("\n");
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
