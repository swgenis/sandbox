package bain.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Reference to the business unit which is involved in Accounts Receivable Procedure BusinessUnit ||  |
 */
@Schema(description = "(DDD Entity) - Reference to the business unit which is involved in Accounts Receivable Procedure BusinessUnit ||  |")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")


public class BusinessUnit   {
  @JsonProperty("BusinessFunction")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String businessFunction = null;

  @JsonProperty("Goal")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String goal = null;


  public BusinessUnit businessFunction(String businessFunction) { 

    this.businessFunction = businessFunction;
    return this;
  }

  /**
   * Get businessFunction
   * @return businessFunction
   **/
  
  @Schema(description = "")
  
  public String getBusinessFunction() {  
    return businessFunction;
  }



  public void setBusinessFunction(String businessFunction) { 
    this.businessFunction = businessFunction;
  }

  public BusinessUnit goal(String goal) { 

    this.goal = goal;
    return this;
  }

  /**
   * Get goal
   * @return goal
   **/
  
  @Schema(description = "")
  
  public String getGoal() {  
    return goal;
  }



  public void setGoal(String goal) { 
    this.goal = goal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessUnit businessUnit = (BusinessUnit) o;
    return Objects.equals(this.businessFunction, businessUnit.businessFunction) &&
        Objects.equals(this.goal, businessUnit.goal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessFunction, goal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessUnit {\n");
    
    sb.append("    businessFunction: ").append(toIndentedString(businessFunction)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
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
