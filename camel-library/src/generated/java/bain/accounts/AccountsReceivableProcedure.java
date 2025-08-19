package bain.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Reference to the party who is involved in Accounts Receivable Procedure AccountsReceivableProcedure ||  |
 */
@Schema(description = "(DDD Entity) - Reference to the party who is involved in Accounts Receivable Procedure AccountsReceivableProcedure ||  |")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")


public class AccountsReceivableProcedure   {
  @JsonProperty("AccountsReceivableProcedure")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String accountsReceivableProcedure = null;


  public AccountsReceivableProcedure accountsReceivableProcedure(String accountsReceivableProcedure) { 

    this.accountsReceivableProcedure = accountsReceivableProcedure;
    return this;
  }

  /**
   * Get accountsReceivableProcedure
   * @return accountsReceivableProcedure
   **/
  
  @Schema(description = "")
  
  public String getAccountsReceivableProcedure() {  
    return accountsReceivableProcedure;
  }



  public void setAccountsReceivableProcedure(String accountsReceivableProcedure) { 
    this.accountsReceivableProcedure = accountsReceivableProcedure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsReceivableProcedure accountsReceivableProcedure = (AccountsReceivableProcedure) o;
    return Objects.equals(this.accountsReceivableProcedure, accountsReceivableProcedure.accountsReceivableProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountsReceivableProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsReceivableProcedure {\n");
    
    sb.append("    accountsReceivableProcedure: ").append(toIndentedString(accountsReceivableProcedure)).append("\n");
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
