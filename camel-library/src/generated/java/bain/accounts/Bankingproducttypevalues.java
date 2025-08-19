package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Bankingproducttypevalues
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")


public class Bankingproducttypevalues   {
  /**
   * >  * `LoanProduct` -   * `CurrentAccountProduct` -   * `SavingAccountProduct` -   * `BrokeredProduct` -   * `TermDepositProduct` - 
   */
  public enum BankingproducttypevaluesEnum {
    LOANPRODUCT("LoanProduct"),
    
    CURRENTACCOUNTPRODUCT("CurrentAccountProduct"),
    
    SAVINGACCOUNTPRODUCT("SavingAccountProduct"),
    
    BROKEREDPRODUCT("BrokeredProduct"),
    
    TERMDEPOSITPRODUCT("TermDepositProduct");

    private String value;

    BankingproducttypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BankingproducttypevaluesEnum fromValue(String text) {
      for (BankingproducttypevaluesEnum b : BankingproducttypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Bankingproducttypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private BankingproducttypevaluesEnum bankingproducttypevalues = null;


  public Bankingproducttypevalues bankingproducttypevalues(BankingproducttypevaluesEnum bankingproducttypevalues) { 

    this.bankingproducttypevalues = bankingproducttypevalues;
    return this;
  }

  /**
   * >  * `LoanProduct` -   * `CurrentAccountProduct` -   * `SavingAccountProduct` -   * `BrokeredProduct` -   * `TermDepositProduct` - 
   * @return bankingproducttypevalues
   **/
  
  @Schema(description = ">  * `LoanProduct` -   * `CurrentAccountProduct` -   * `SavingAccountProduct` -   * `BrokeredProduct` -   * `TermDepositProduct` - ")
  
  public BankingproducttypevaluesEnum getBankingproducttypevalues() {  
    return bankingproducttypevalues;
  }



  public void setBankingproducttypevalues(BankingproducttypevaluesEnum bankingproducttypevalues) { 
    this.bankingproducttypevalues = bankingproducttypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bankingproducttypevalues bankingproducttypevalues = (Bankingproducttypevalues) o;
    return Objects.equals(this.bankingproducttypevalues, bankingproducttypevalues.bankingproducttypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankingproducttypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bankingproducttypevalues {\n");
    
    sb.append("    bankingproducttypevalues: ").append(toIndentedString(bankingproducttypevalues)).append("\n");
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
