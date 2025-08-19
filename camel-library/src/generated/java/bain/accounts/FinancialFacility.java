package bain.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Reference to the Financial Facility related to  Accounts Receivable Procedure  FinancialFacility ||  |
 */
@Schema(description = "(DDD Entity) - Reference to the Financial Facility related to  Accounts Receivable Procedure  FinancialFacility ||  |")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class FinancialFacility   {
  @JsonProperty("FinancialFacility")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String financialFacility = null;


  public FinancialFacility financialFacility(String financialFacility) { 

    this.financialFacility = financialFacility;
    return this;
  }

  /**
   * Get financialFacility
   * @return financialFacility
   **/
  
  @Schema(description = "")
  
  public String getFinancialFacility() {  
    return financialFacility;
  }



  public void setFinancialFacility(String financialFacility) { 
    this.financialFacility = financialFacility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialFacility financialFacility = (FinancialFacility) o;
    return Objects.equals(this.financialFacility, financialFacility.financialFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialFacility {\n");
    
    sb.append("    financialFacility: ").append(toIndentedString(financialFacility)).append("\n");
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
