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
 * (DDD Entity) -  Datetimeperiod 
 */
@Schema(description = "(DDD Entity) -  Datetimeperiod ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")


public class Datetimeperiod   {
  @JsonProperty("FromDateTime")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Datetime fromDateTime = null;

  @JsonProperty("ToDateTime")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Datetime toDateTime = null;

  @JsonProperty("Datetimeperiod")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String datetimeperiod = null;


  public Datetimeperiod fromDateTime(Datetime fromDateTime) { 

    this.fromDateTime = fromDateTime;
    return this;
  }

  /**
   * Get fromDateTime
   * @return fromDateTime
   **/
  
  @Schema(description = "")
  
@Valid
  public Datetime getFromDateTime() {  
    return fromDateTime;
  }



  public void setFromDateTime(Datetime fromDateTime) { 
    this.fromDateTime = fromDateTime;
  }

  public Datetimeperiod toDateTime(Datetime toDateTime) { 

    this.toDateTime = toDateTime;
    return this;
  }

  /**
   * Get toDateTime
   * @return toDateTime
   **/
  
  @Schema(description = "")
  
@Valid
  public Datetime getToDateTime() {  
    return toDateTime;
  }



  public void setToDateTime(Datetime toDateTime) { 
    this.toDateTime = toDateTime;
  }

  public Datetimeperiod datetimeperiod(String datetimeperiod) { 

    this.datetimeperiod = datetimeperiod;
    return this;
  }

  /**
   * Get datetimeperiod
   * @return datetimeperiod
   **/
  
  @Schema(description = "")
  
  public String getDatetimeperiod() {  
    return datetimeperiod;
  }



  public void setDatetimeperiod(String datetimeperiod) { 
    this.datetimeperiod = datetimeperiod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datetimeperiod datetimeperiod = (Datetimeperiod) o;
    return Objects.equals(this.fromDateTime, datetimeperiod.fromDateTime) &&
        Objects.equals(this.toDateTime, datetimeperiod.toDateTime) &&
        Objects.equals(this.datetimeperiod, datetimeperiod.datetimeperiod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDateTime, toDateTime, datetimeperiod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datetimeperiod {\n");
    
    sb.append("    fromDateTime: ").append(toIndentedString(fromDateTime)).append("\n");
    sb.append("    toDateTime: ").append(toIndentedString(toDateTime)).append("\n");
    sb.append("    datetimeperiod: ").append(toIndentedString(datetimeperiod)).append("\n");
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
