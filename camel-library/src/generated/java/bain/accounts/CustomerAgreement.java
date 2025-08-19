package bain.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Reference to the Customer Agreement that is related to  Accounts Receivable Procedure  CustomerAgreement ||  |
 */
@Schema(description = "(DDD Entity) - Reference to the Customer Agreement that is related to  Accounts Receivable Procedure  CustomerAgreement ||  |")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class CustomerAgreement   {
  @JsonProperty("CustomerAgreement")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String customerAgreement = null;


  public CustomerAgreement customerAgreement(String customerAgreement) { 

    this.customerAgreement = customerAgreement;
    return this;
  }

  /**
   * Get customerAgreement
   * @return customerAgreement
   **/
  
  @Schema(description = "")
  
  public String getCustomerAgreement() {  
    return customerAgreement;
  }



  public void setCustomerAgreement(String customerAgreement) { 
    this.customerAgreement = customerAgreement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAgreement customerAgreement = (CustomerAgreement) o;
    return Objects.equals(this.customerAgreement, customerAgreement.customerAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAgreement {\n");
    
    sb.append("    customerAgreement: ").append(toIndentedString(customerAgreement)).append("\n");
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
