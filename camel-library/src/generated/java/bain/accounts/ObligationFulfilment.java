package bain.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Reference to the transaction that is related to  Accounts Receivable Procedure  ObligationFulfilment|ObligationFulfilment (https://www.iso20022.org/standardsrepository/type/ObligationFulfilment)|Standard|ISO20022 BM ()
 */
@Schema(description = "(DDD Entity) - Reference to the transaction that is related to  Accounts Receivable Procedure  ObligationFulfilment|ObligationFulfilment (https://www.iso20022.org/standardsrepository/type/ObligationFulfilment)|Standard|ISO20022 BM ()")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class ObligationFulfilment   {
  @JsonProperty("Date")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String date = null;

  @JsonProperty("ObligationOffset")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String obligationOffset = null;

  @JsonProperty("ResultingObligation")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String resultingObligation = null;


  public ObligationFulfilment date(String date) { 

    this.date = date;
    return this;
  }

  /**
   * (DDD Entity) - Date and time on which assets become available. 
   * @return date
   **/
  
  @Schema(description = "(DDD Entity) - Date and time on which assets become available. ")
  
  public String getDate() {  
    return date;
  }



  public void setDate(String date) { 
    this.date = date;
  }

  public ObligationFulfilment obligationOffset(String obligationOffset) { 

    this.obligationOffset = obligationOffset;
    return this;
  }

  /**
   * (DDD Entity) - Specifies the obligation which has been offset for instance a payment obligation or a securities delivery. 
   * @return obligationOffset
   **/
  
  @Schema(description = "(DDD Entity) - Specifies the obligation which has been offset for instance a payment obligation or a securities delivery. ")
  
  public String getObligationOffset() {  
    return obligationOffset;
  }



  public void setObligationOffset(String obligationOffset) { 
    this.obligationOffset = obligationOffset;
  }

  public ObligationFulfilment resultingObligation(String resultingObligation) { 

    this.resultingObligation = resultingObligation;
    return this;
  }

  /**
   * (DDD Entity) - Specifies the obligation which result from a settlement process, for instance the remaining obligation when the obligations are netted. 
   * @return resultingObligation
   **/
  
  @Schema(description = "(DDD Entity) - Specifies the obligation which result from a settlement process, for instance the remaining obligation when the obligations are netted. ")
  
  public String getResultingObligation() {  
    return resultingObligation;
  }



  public void setResultingObligation(String resultingObligation) { 
    this.resultingObligation = resultingObligation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObligationFulfilment obligationFulfilment = (ObligationFulfilment) o;
    return Objects.equals(this.date, obligationFulfilment.date) &&
        Objects.equals(this.obligationOffset, obligationFulfilment.obligationOffset) &&
        Objects.equals(this.resultingObligation, obligationFulfilment.resultingObligation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, obligationOffset, resultingObligation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObligationFulfilment {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    obligationOffset: ").append(toIndentedString(obligationOffset)).append("\n");
    sb.append("    resultingObligation: ").append(toIndentedString(resultingObligation)).append("\n");
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
