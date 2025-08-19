package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - A selected optional business service as subject matter of Accounts Receivable Procedure Feature ||  |
 */
@Schema(description = "(DDD Entity) - A selected optional business service as subject matter of Accounts Receivable Procedure Feature ||  |")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Featuretypevalues   {
  /**
   * >  * `FeeFeature` - This refers to the functionality in a system or platform that manages, calculates, or displays fees associated with specific transactions or services.  * `InterestFeature` - This feature calculates and tracks interest earnings or charges on accounts, loans, or investments over time.  * `WithdrawalFeature` - The withdraw feature typically refers to an option or functionality that allows users to retrieve or remove something from a system or platform.  * `DepositFeature` - This refers to a functionality that allows users to add funds to an account or system, often by transferring money from another source.  * `SweepFeature` -   * `LienFeature` -   * `PaymentFeature` - This refers to the functionality that facilitates or tracks the transfer of funds for a purchase or settlement of dues.  * `RepaymentFeature` - This feature facilitates or manages the process of paying back borrowed funds, such as loans, credit card balances, or advances.  * `LimitFeature` - This feature sets, monitors, or enforces restrictions on the maximum amount that can be accessed, spent, or transacted within a system.  * `OverdraftFeature` - This functionality allows users to withdraw more money than what is available in their account balance, often up to a predefined limit.  * `StatementFeature` - The statement feature refers to a functionality in banking, finance, or digital platforms that provides users with a detailed record of their transactions or activities over a specific period.  * `CurrencyExchangeFeature` - This feature enables users to convert funds from one currency to another at prevailing exchange rates, often within financial or payment platforms.  * `PriceFeature` - This feature involves displaying or managing the price of goods, services, or financial instruments within a platform.
   */
  public enum FeaturetypevaluesEnum {
    FEEFEATURE("FeeFeature"),
    
    INTERESTFEATURE("InterestFeature"),
    
    WITHDRAWALFEATURE("WithdrawalFeature"),
    
    DEPOSITFEATURE("DepositFeature"),
    
    SWEEPFEATURE("SweepFeature"),
    
    LIENFEATURE("LienFeature"),
    
    PAYMENTFEATURE("PaymentFeature"),
    
    REPAYMENTFEATURE("RepaymentFeature"),
    
    LIMITFEATURE("LimitFeature"),
    
    OVERDRAFTFEATURE("OverdraftFeature"),
    
    STATEMENTFEATURE("StatementFeature"),
    
    CURRENCYEXCHANGEFEATURE("CurrencyExchangeFeature"),
    
    PRICEFEATURE("PriceFeature");

    private String value;

    FeaturetypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeaturetypevaluesEnum fromValue(String text) {
      for (FeaturetypevaluesEnum b : FeaturetypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Featuretypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private FeaturetypevaluesEnum featuretypevalues = null;


  public Featuretypevalues featuretypevalues(FeaturetypevaluesEnum featuretypevalues) { 

    this.featuretypevalues = featuretypevalues;
    return this;
  }

  /**
   * >  * `FeeFeature` - This refers to the functionality in a system or platform that manages, calculates, or displays fees associated with specific transactions or services.  * `InterestFeature` - This feature calculates and tracks interest earnings or charges on accounts, loans, or investments over time.  * `WithdrawalFeature` - The withdraw feature typically refers to an option or functionality that allows users to retrieve or remove something from a system or platform.  * `DepositFeature` - This refers to a functionality that allows users to add funds to an account or system, often by transferring money from another source.  * `SweepFeature` -   * `LienFeature` -   * `PaymentFeature` - This refers to the functionality that facilitates or tracks the transfer of funds for a purchase or settlement of dues.  * `RepaymentFeature` - This feature facilitates or manages the process of paying back borrowed funds, such as loans, credit card balances, or advances.  * `LimitFeature` - This feature sets, monitors, or enforces restrictions on the maximum amount that can be accessed, spent, or transacted within a system.  * `OverdraftFeature` - This functionality allows users to withdraw more money than what is available in their account balance, often up to a predefined limit.  * `StatementFeature` - The statement feature refers to a functionality in banking, finance, or digital platforms that provides users with a detailed record of their transactions or activities over a specific period.  * `CurrencyExchangeFeature` - This feature enables users to convert funds from one currency to another at prevailing exchange rates, often within financial or payment platforms.  * `PriceFeature` - This feature involves displaying or managing the price of goods, services, or financial instruments within a platform.
   * @return featuretypevalues
   **/
  
  @Schema(description = ">  * `FeeFeature` - This refers to the functionality in a system or platform that manages, calculates, or displays fees associated with specific transactions or services.  * `InterestFeature` - This feature calculates and tracks interest earnings or charges on accounts, loans, or investments over time.  * `WithdrawalFeature` - The withdraw feature typically refers to an option or functionality that allows users to retrieve or remove something from a system or platform.  * `DepositFeature` - This refers to a functionality that allows users to add funds to an account or system, often by transferring money from another source.  * `SweepFeature` -   * `LienFeature` -   * `PaymentFeature` - This refers to the functionality that facilitates or tracks the transfer of funds for a purchase or settlement of dues.  * `RepaymentFeature` - This feature facilitates or manages the process of paying back borrowed funds, such as loans, credit card balances, or advances.  * `LimitFeature` - This feature sets, monitors, or enforces restrictions on the maximum amount that can be accessed, spent, or transacted within a system.  * `OverdraftFeature` - This functionality allows users to withdraw more money than what is available in their account balance, often up to a predefined limit.  * `StatementFeature` - The statement feature refers to a functionality in banking, finance, or digital platforms that provides users with a detailed record of their transactions or activities over a specific period.  * `CurrencyExchangeFeature` - This feature enables users to convert funds from one currency to another at prevailing exchange rates, often within financial or payment platforms.  * `PriceFeature` - This feature involves displaying or managing the price of goods, services, or financial instruments within a platform.")
  
  public FeaturetypevaluesEnum getFeaturetypevalues() {  
    return featuretypevalues;
  }



  public void setFeaturetypevalues(FeaturetypevaluesEnum featuretypevalues) { 
    this.featuretypevalues = featuretypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Featuretypevalues featuretypevalues = (Featuretypevalues) o;
    return Objects.equals(this.featuretypevalues, featuretypevalues.featuretypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featuretypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Featuretypevalues {\n");
    
    sb.append("    featuretypevalues: ").append(toIndentedString(featuretypevalues)).append("\n");
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
