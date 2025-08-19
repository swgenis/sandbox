package bain.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Reference to the Financial Transaction Arrangement that is related to  Accounts Receivable Procedure  Obligation|Obligation (https://www.iso20022.org/standardsrepository/type/Obligation)|Standard|ISO20022 BM ()
 */
@Schema(description = "(DDD Entity) - Reference to the Financial Transaction Arrangement that is related to  Accounts Receivable Procedure  Obligation|Obligation (https://www.iso20022.org/standardsrepository/type/Obligation)|Standard|ISO20022 BM ()")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Obligation   {
  @JsonProperty("RequestedSettlementDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String requestedSettlementDate = null;

  @JsonProperty("RequestedSettlementAmount")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String requestedSettlementAmount = null;

  @JsonProperty("Priority")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String priority = null;

  @JsonProperty("Trade")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String trade = null;

  @JsonProperty("TransactionRisk")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String transactionRisk = null;

  @JsonProperty("ParentObligation")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String parentObligation = null;

  @JsonProperty("SubObligation")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String subObligation = null;

  @JsonProperty("Offset")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String offset = null;

  @JsonProperty("OriginalObligationProcess")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String originalObligationProcess = null;

  @JsonProperty("ExposureType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String exposureType = null;


  public Obligation requestedSettlementDate(String requestedSettlementDate) { 

    this.requestedSettlementDate = requestedSettlementDate;
    return this;
  }

  /**
   * (DDD Entity) - Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received. 
   * @return requestedSettlementDate
   **/
  
  @Schema(description = "(DDD Entity) - Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received. ")
  
  public String getRequestedSettlementDate() {  
    return requestedSettlementDate;
  }



  public void setRequestedSettlementDate(String requestedSettlementDate) { 
    this.requestedSettlementDate = requestedSettlementDate;
  }

  public Obligation requestedSettlementAmount(String requestedSettlementAmount) { 

    this.requestedSettlementAmount = requestedSettlementAmount;
    return this;
  }

  /**
   * (DDD Entity) - Total amount of money to be paid or received. 
   * @return requestedSettlementAmount
   **/
  
  @Schema(description = "(DDD Entity) - Total amount of money to be paid or received. ")
  
  public String getRequestedSettlementAmount() {  
    return requestedSettlementAmount;
  }



  public void setRequestedSettlementAmount(String requestedSettlementAmount) { 
    this.requestedSettlementAmount = requestedSettlementAmount;
  }

  public Obligation priority(String priority) { 

    this.priority = priority;
    return this;
  }

  /**
   * (DDD Entity) - Specifies whether the transaction is to be executed with a high priority. 
   * @return priority
   **/
  
  @Schema(description = "(DDD Entity) - Specifies whether the transaction is to be executed with a high priority. ")
  
  public String getPriority() {  
    return priority;
  }



  public void setPriority(String priority) { 
    this.priority = priority;
  }

  public Obligation trade(String trade) { 

    this.trade = trade;
    return this;
  }

  /**
   * (DDD Entity) - Specifies the trade which originates the obligation to deliver a product, cash or securities.. 
   * @return trade
   **/
  
  @Schema(description = "(DDD Entity) - Specifies the trade which originates the obligation to deliver a product, cash or securities.. ")
  
  public String getTrade() {  
    return trade;
  }



  public void setTrade(String trade) { 
    this.trade = trade;
  }

  public Obligation transactionRisk(String transactionRisk) { 

    this.transactionRisk = transactionRisk;
    return this;
  }

  /**
   * (DDD Entity) - Transaction risk calculated per obligation type. 
   * @return transactionRisk
   **/
  
  @Schema(description = "(DDD Entity) - Transaction risk calculated per obligation type. ")
  
  public String getTransactionRisk() {  
    return transactionRisk;
  }



  public void setTransactionRisk(String transactionRisk) { 
    this.transactionRisk = transactionRisk;
  }

  public Obligation parentObligation(String parentObligation) { 

    this.parentObligation = parentObligation;
    return this;
  }

  /**
   * (DDD Entity) - Obligation which is divided into several sub-obligations. 
   * @return parentObligation
   **/
  
  @Schema(description = "(DDD Entity) - Obligation which is divided into several sub-obligations. ")
  
  public String getParentObligation() {  
    return parentObligation;
  }



  public void setParentObligation(String parentObligation) { 
    this.parentObligation = parentObligation;
  }

  public Obligation subObligation(String subObligation) { 

    this.subObligation = subObligation;
    return this;
  }

  /**
   * (DDD Entity) - Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation. 
   * @return subObligation
   **/
  
  @Schema(description = "(DDD Entity) - Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation. ")
  
  public String getSubObligation() {  
    return subObligation;
  }



  public void setSubObligation(String subObligation) { 
    this.subObligation = subObligation;
  }

  public Obligation offset(String offset) { 

    this.offset = offset;
    return this;
  }

  /**
   * (DDD Entity) - Specifies the method used to settle a specific obligation. 
   * @return offset
   **/
  
  @Schema(description = "(DDD Entity) - Specifies the method used to settle a specific obligation. ")
  
  public String getOffset() {  
    return offset;
  }



  public void setOffset(String offset) { 
    this.offset = offset;
  }

  public Obligation originalObligationProcess(String originalObligationProcess) { 

    this.originalObligationProcess = originalObligationProcess;
    return this;
  }

  /**
   * (DDD Entity) - Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting. 
   * @return originalObligationProcess
   **/
  
  @Schema(description = "(DDD Entity) - Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting. ")
  
  public String getOriginalObligationProcess() {  
    return originalObligationProcess;
  }



  public void setOriginalObligationProcess(String originalObligationProcess) { 
    this.originalObligationProcess = originalObligationProcess;
  }

  public Obligation exposureType(String exposureType) { 

    this.exposureType = exposureType;
    return this;
  }

  /**
   * (DDD Entity) - Type of exposure related to this obligation. 
   * @return exposureType
   **/
  
  @Schema(description = "(DDD Entity) - Type of exposure related to this obligation. ")
  
  public String getExposureType() {  
    return exposureType;
  }



  public void setExposureType(String exposureType) { 
    this.exposureType = exposureType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Obligation obligation = (Obligation) o;
    return Objects.equals(this.requestedSettlementDate, obligation.requestedSettlementDate) &&
        Objects.equals(this.requestedSettlementAmount, obligation.requestedSettlementAmount) &&
        Objects.equals(this.priority, obligation.priority) &&
        Objects.equals(this.trade, obligation.trade) &&
        Objects.equals(this.transactionRisk, obligation.transactionRisk) &&
        Objects.equals(this.parentObligation, obligation.parentObligation) &&
        Objects.equals(this.subObligation, obligation.subObligation) &&
        Objects.equals(this.offset, obligation.offset) &&
        Objects.equals(this.originalObligationProcess, obligation.originalObligationProcess) &&
        Objects.equals(this.exposureType, obligation.exposureType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedSettlementDate, requestedSettlementAmount, priority, trade, transactionRisk, parentObligation, subObligation, offset, originalObligationProcess, exposureType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Obligation {\n");
    
    sb.append("    requestedSettlementDate: ").append(toIndentedString(requestedSettlementDate)).append("\n");
    sb.append("    requestedSettlementAmount: ").append(toIndentedString(requestedSettlementAmount)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
    sb.append("    transactionRisk: ").append(toIndentedString(transactionRisk)).append("\n");
    sb.append("    parentObligation: ").append(toIndentedString(parentObligation)).append("\n");
    sb.append("    subObligation: ").append(toIndentedString(subObligation)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    originalObligationProcess: ").append(toIndentedString(originalObligationProcess)).append("\n");
    sb.append("    exposureType: ").append(toIndentedString(exposureType)).append("\n");
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
