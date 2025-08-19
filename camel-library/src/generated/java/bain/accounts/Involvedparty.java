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
 * (DDD Entity) - Reference to the account primary party/owner
 */
@Schema(description = "(DDD Entity) - Reference to the account primary party/owner")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Involvedparty   {
  @JsonProperty("PartyReference")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Party partyReference = null;

  @JsonProperty("PartyInvolvement")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Partyrole partyInvolvement = null;


  public Involvedparty partyReference(Party partyReference) { 

    this.partyReference = partyReference;
    return this;
  }

  /**
   * Get partyReference
   * @return partyReference
   **/
  
  @Schema(description = "")
  
@Valid
  public Party getPartyReference() {  
    return partyReference;
  }



  public void setPartyReference(Party partyReference) { 
    this.partyReference = partyReference;
  }

  public Involvedparty partyInvolvement(Partyrole partyInvolvement) { 

    this.partyInvolvement = partyInvolvement;
    return this;
  }

  /**
   * Get partyInvolvement
   * @return partyInvolvement
   **/
  
  @Schema(description = "")
  
@Valid
  public Partyrole getPartyInvolvement() {  
    return partyInvolvement;
  }



  public void setPartyInvolvement(Partyrole partyInvolvement) { 
    this.partyInvolvement = partyInvolvement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Involvedparty involvedparty = (Involvedparty) o;
    return Objects.equals(this.partyReference, involvedparty.partyReference) &&
        Objects.equals(this.partyInvolvement, involvedparty.partyInvolvement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReference, partyInvolvement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Involvedparty {\n");
    
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    partyInvolvement: ").append(toIndentedString(partyInvolvement)).append("\n");
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
