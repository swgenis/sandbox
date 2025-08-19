package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Servicetypevalues
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Servicetypevalues   {
  /**
   * >  * `ITService` -   * `AdministrativeService` -   * `SystemService` -   * `FinancialService` -   * `InformationService` -   * `BusinessService` - 
   */
  public enum ServicetypevaluesEnum {
    ITSERVICE("ITService"),
    
    ADMINISTRATIVESERVICE("AdministrativeService"),
    
    SYSTEMSERVICE("SystemService"),
    
    FINANCIALSERVICE("FinancialService"),
    
    INFORMATIONSERVICE("InformationService"),
    
    BUSINESSSERVICE("BusinessService");

    private String value;

    ServicetypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServicetypevaluesEnum fromValue(String text) {
      for (ServicetypevaluesEnum b : ServicetypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Servicetypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private ServicetypevaluesEnum servicetypevalues = null;


  public Servicetypevalues servicetypevalues(ServicetypevaluesEnum servicetypevalues) { 

    this.servicetypevalues = servicetypevalues;
    return this;
  }

  /**
   * >  * `ITService` -   * `AdministrativeService` -   * `SystemService` -   * `FinancialService` -   * `InformationService` -   * `BusinessService` - 
   * @return servicetypevalues
   **/
  
  @Schema(description = ">  * `ITService` -   * `AdministrativeService` -   * `SystemService` -   * `FinancialService` -   * `InformationService` -   * `BusinessService` - ")
  
  public ServicetypevaluesEnum getServicetypevalues() {  
    return servicetypevalues;
  }



  public void setServicetypevalues(ServicetypevaluesEnum servicetypevalues) { 
    this.servicetypevalues = servicetypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicetypevalues servicetypevalues = (Servicetypevalues) o;
    return Objects.equals(this.servicetypevalues, servicetypevalues.servicetypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicetypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicetypevalues {\n");
    
    sb.append("    servicetypevalues: ").append(toIndentedString(servicetypevalues)).append("\n");
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
