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
 * (DDD Entity) -  Identifier 
 */
@Schema(description = "(DDD Entity) -  Identifier ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Identifier   {
  @JsonProperty("IdentifierValue")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Value identifierValue = null;

  @JsonProperty("IdentifierIssuingAuthority")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Involvedparty identifierIssuingAuthority = null;

  @JsonProperty("Identifier")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String identifier = null;

  @JsonProperty("IdentifierStartDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Datetime identifierStartDate = null;

  @JsonProperty("IdentifierEndDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Datetime identifierEndDate = null;


  public Identifier identifierValue(Value identifierValue) { 

    this.identifierValue = identifierValue;
    return this;
  }

  /**
   * Get identifierValue
   * @return identifierValue
   **/
  
  @Schema(description = "")
  
@Valid
  public Value getIdentifierValue() {  
    return identifierValue;
  }



  public void setIdentifierValue(Value identifierValue) { 
    this.identifierValue = identifierValue;
  }

  public Identifier identifierIssuingAuthority(Involvedparty identifierIssuingAuthority) { 

    this.identifierIssuingAuthority = identifierIssuingAuthority;
    return this;
  }

  /**
   * Get identifierIssuingAuthority
   * @return identifierIssuingAuthority
   **/
  
  @Schema(description = "")
  
@Valid
  public Involvedparty getIdentifierIssuingAuthority() {  
    return identifierIssuingAuthority;
  }



  public void setIdentifierIssuingAuthority(Involvedparty identifierIssuingAuthority) { 
    this.identifierIssuingAuthority = identifierIssuingAuthority;
  }

  public Identifier identifier(String identifier) { 

    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
   **/
  
  @Schema(description = "")
  
  public String getIdentifier() {  
    return identifier;
  }



  public void setIdentifier(String identifier) { 
    this.identifier = identifier;
  }

  public Identifier identifierStartDate(Datetime identifierStartDate) { 

    this.identifierStartDate = identifierStartDate;
    return this;
  }

  /**
   * Get identifierStartDate
   * @return identifierStartDate
   **/
  
  @Schema(description = "")
  
@Valid
  public Datetime getIdentifierStartDate() {  
    return identifierStartDate;
  }



  public void setIdentifierStartDate(Datetime identifierStartDate) { 
    this.identifierStartDate = identifierStartDate;
  }

  public Identifier identifierEndDate(Datetime identifierEndDate) { 

    this.identifierEndDate = identifierEndDate;
    return this;
  }

  /**
   * Get identifierEndDate
   * @return identifierEndDate
   **/
  
  @Schema(description = "")
  
@Valid
  public Datetime getIdentifierEndDate() {  
    return identifierEndDate;
  }



  public void setIdentifierEndDate(Datetime identifierEndDate) { 
    this.identifierEndDate = identifierEndDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identifier identifier = (Identifier) o;
    return Objects.equals(this.identifierValue, identifier.identifierValue) &&
        Objects.equals(this.identifierIssuingAuthority, identifier.identifierIssuingAuthority) &&
        Objects.equals(this.identifier, identifier.identifier) &&
        Objects.equals(this.identifierStartDate, identifier.identifierStartDate) &&
        Objects.equals(this.identifierEndDate, identifier.identifierEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifierValue, identifierIssuingAuthority, identifier, identifierStartDate, identifierEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identifier {\n");
    
    sb.append("    identifierValue: ").append(toIndentedString(identifierValue)).append("\n");
    sb.append("    identifierIssuingAuthority: ").append(toIndentedString(identifierIssuingAuthority)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    identifierStartDate: ").append(toIndentedString(identifierStartDate)).append("\n");
    sb.append("    identifierEndDate: ").append(toIndentedString(identifierEndDate)).append("\n");
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
