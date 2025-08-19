package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) -  Datetime 
 */
@Schema(description = "(DDD Entity) -  Datetime ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")


public class Datetimetypevalues   {
  /**
   * >  * `MaturityDate` -   * `InitiatedDate` -   * `RequestedDate` -   * `ExecutedDate` -   * `OpenDate` -   * `CloseDate` -   * `ExpiryDate` -   * `EffectiveDate` -   * `CreatingDate` -   * `ActivationDate` -   * `DeactivationDate` -   * `BlockingDate` -   * `SendingDate` -   * `ValidFromDate` -   * `ValidToDate` -   * `ReceivingDate` -   * `SigningDate` -   * `DueDate` -   * `ValueDate` -   * `FulfillmentDate` - 
   */
  public enum DatetimetypevaluesEnum {
    MATURITYDATE("MaturityDate"),
    
    INITIATEDDATE("InitiatedDate"),
    
    REQUESTEDDATE("RequestedDate"),
    
    EXECUTEDDATE("ExecutedDate"),
    
    OPENDATE("OpenDate"),
    
    CLOSEDATE("CloseDate"),
    
    EXPIRYDATE("ExpiryDate"),
    
    EFFECTIVEDATE("EffectiveDate"),
    
    CREATINGDATE("CreatingDate"),
    
    ACTIVATIONDATE("ActivationDate"),
    
    DEACTIVATIONDATE("DeactivationDate"),
    
    BLOCKINGDATE("BlockingDate"),
    
    SENDINGDATE("SendingDate"),
    
    VALIDFROMDATE("ValidFromDate"),
    
    VALIDTODATE("ValidToDate"),
    
    RECEIVINGDATE("ReceivingDate"),
    
    SIGNINGDATE("SigningDate"),
    
    DUEDATE("DueDate"),
    
    VALUEDATE("ValueDate"),
    
    FULFILLMENTDATE("FulfillmentDate");

    private String value;

    DatetimetypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DatetimetypevaluesEnum fromValue(String text) {
      for (DatetimetypevaluesEnum b : DatetimetypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Datetimetypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private DatetimetypevaluesEnum datetimetypevalues = null;


  public Datetimetypevalues datetimetypevalues(DatetimetypevaluesEnum datetimetypevalues) { 

    this.datetimetypevalues = datetimetypevalues;
    return this;
  }

  /**
   * >  * `MaturityDate` -   * `InitiatedDate` -   * `RequestedDate` -   * `ExecutedDate` -   * `OpenDate` -   * `CloseDate` -   * `ExpiryDate` -   * `EffectiveDate` -   * `CreatingDate` -   * `ActivationDate` -   * `DeactivationDate` -   * `BlockingDate` -   * `SendingDate` -   * `ValidFromDate` -   * `ValidToDate` -   * `ReceivingDate` -   * `SigningDate` -   * `DueDate` -   * `ValueDate` -   * `FulfillmentDate` - 
   * @return datetimetypevalues
   **/
  
  @Schema(description = ">  * `MaturityDate` -   * `InitiatedDate` -   * `RequestedDate` -   * `ExecutedDate` -   * `OpenDate` -   * `CloseDate` -   * `ExpiryDate` -   * `EffectiveDate` -   * `CreatingDate` -   * `ActivationDate` -   * `DeactivationDate` -   * `BlockingDate` -   * `SendingDate` -   * `ValidFromDate` -   * `ValidToDate` -   * `ReceivingDate` -   * `SigningDate` -   * `DueDate` -   * `ValueDate` -   * `FulfillmentDate` - ")
  
  public DatetimetypevaluesEnum getDatetimetypevalues() {  
    return datetimetypevalues;
  }



  public void setDatetimetypevalues(DatetimetypevaluesEnum datetimetypevalues) { 
    this.datetimetypevalues = datetimetypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datetimetypevalues datetimetypevalues = (Datetimetypevalues) o;
    return Objects.equals(this.datetimetypevalues, datetimetypevalues.datetimetypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetimetypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datetimetypevalues {\n");
    
    sb.append("    datetimetypevalues: ").append(toIndentedString(datetimetypevalues)).append("\n");
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
