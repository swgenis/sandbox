package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Request to process AccountsReceivable Instruction ||  |
 */
@Schema(description = "(DDD Entity) - Request to process AccountsReceivable Instruction ||  |")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Instructiontypevalues   {
  /**
   * >  * `PaymentInstruction` -   * `DeliveryOrder` -   * `InformationRequest` -   * `ExchangeInstruction` -   * `AllocationInstruction` -   * `MaintenanceInstruction` - 
   */
  public enum InstructiontypevaluesEnum {
    PAYMENTINSTRUCTION("PaymentInstruction"),
    
    DELIVERYORDER("DeliveryOrder"),
    
    INFORMATIONREQUEST("InformationRequest"),
    
    EXCHANGEINSTRUCTION("ExchangeInstruction"),
    
    ALLOCATIONINSTRUCTION("AllocationInstruction"),
    
    MAINTENANCEINSTRUCTION("MaintenanceInstruction");

    private String value;

    InstructiontypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstructiontypevaluesEnum fromValue(String text) {
      for (InstructiontypevaluesEnum b : InstructiontypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Instructiontypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InstructiontypevaluesEnum instructiontypevalues = null;


  public Instructiontypevalues instructiontypevalues(InstructiontypevaluesEnum instructiontypevalues) { 

    this.instructiontypevalues = instructiontypevalues;
    return this;
  }

  /**
   * >  * `PaymentInstruction` -   * `DeliveryOrder` -   * `InformationRequest` -   * `ExchangeInstruction` -   * `AllocationInstruction` -   * `MaintenanceInstruction` - 
   * @return instructiontypevalues
   **/
  
  @Schema(description = ">  * `PaymentInstruction` -   * `DeliveryOrder` -   * `InformationRequest` -   * `ExchangeInstruction` -   * `AllocationInstruction` -   * `MaintenanceInstruction` - ")
  
  public InstructiontypevaluesEnum getInstructiontypevalues() {  
    return instructiontypevalues;
  }



  public void setInstructiontypevalues(InstructiontypevaluesEnum instructiontypevalues) { 
    this.instructiontypevalues = instructiontypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instructiontypevalues instructiontypevalues = (Instructiontypevalues) o;
    return Objects.equals(this.instructiontypevalues, instructiontypevalues.instructiontypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructiontypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instructiontypevalues {\n");
    
    sb.append("    instructiontypevalues: ").append(toIndentedString(instructiontypevalues)).append("\n");
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
