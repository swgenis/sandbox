package bain.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Timetable to process AccountsReceivable Schedule ||  |
 */
@Schema(description = "(DDD Entity) - Timetable to process AccountsReceivable Schedule ||  |")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Schedule   {
  @JsonProperty("ScheduleType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Text scheduleType = null;


  public Schedule scheduleType(Text scheduleType) { 

    this.scheduleType = scheduleType;
    return this;
  }

  /**
   * Get scheduleType
   * @return scheduleType
   **/
  
  @Schema(description = "")
  
@Valid
  public Text getScheduleType() {  
    return scheduleType;
  }



  public void setScheduleType(Text scheduleType) { 
    this.scheduleType = scheduleType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.scheduleType, schedule.scheduleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
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
