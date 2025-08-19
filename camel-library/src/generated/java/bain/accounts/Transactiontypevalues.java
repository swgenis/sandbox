package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Transactiontypevalues
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Transactiontypevalues   {
  /**
   * >  * `FinancialTransaction` -   * `BusinessTransaction` -   * `BankingTransaction` -   * `AccountingTransaction` -   * `BookingTransaction` -   * `AllocationTransaction` -   * `DeliveryTransaction` -   * `ProductionTransaction` - 
   */
  public enum TransactiontypevaluesEnum {
    FINANCIALTRANSACTION("FinancialTransaction"),
    
    BUSINESSTRANSACTION("BusinessTransaction"),
    
    BANKINGTRANSACTION("BankingTransaction"),
    
    ACCOUNTINGTRANSACTION("AccountingTransaction"),
    
    BOOKINGTRANSACTION("BookingTransaction"),
    
    ALLOCATIONTRANSACTION("AllocationTransaction"),
    
    DELIVERYTRANSACTION("DeliveryTransaction"),
    
    PRODUCTIONTRANSACTION("ProductionTransaction");

    private String value;

    TransactiontypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransactiontypevaluesEnum fromValue(String text) {
      for (TransactiontypevaluesEnum b : TransactiontypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Transactiontypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private TransactiontypevaluesEnum transactiontypevalues = null;


  public Transactiontypevalues transactiontypevalues(TransactiontypevaluesEnum transactiontypevalues) { 

    this.transactiontypevalues = transactiontypevalues;
    return this;
  }

  /**
   * >  * `FinancialTransaction` -   * `BusinessTransaction` -   * `BankingTransaction` -   * `AccountingTransaction` -   * `BookingTransaction` -   * `AllocationTransaction` -   * `DeliveryTransaction` -   * `ProductionTransaction` - 
   * @return transactiontypevalues
   **/
  
  @Schema(description = ">  * `FinancialTransaction` -   * `BusinessTransaction` -   * `BankingTransaction` -   * `AccountingTransaction` -   * `BookingTransaction` -   * `AllocationTransaction` -   * `DeliveryTransaction` -   * `ProductionTransaction` - ")
  
  public TransactiontypevaluesEnum getTransactiontypevalues() {  
    return transactiontypevalues;
  }



  public void setTransactiontypevalues(TransactiontypevaluesEnum transactiontypevalues) { 
    this.transactiontypevalues = transactiontypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transactiontypevalues transactiontypevalues = (Transactiontypevalues) o;
    return Objects.equals(this.transactiontypevalues, transactiontypevalues.transactiontypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactiontypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transactiontypevalues {\n");
    
    sb.append("    transactiontypevalues: ").append(toIndentedString(transactiontypevalues)).append("\n");
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
