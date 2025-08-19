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
 * (DDD Entity) -  Log 
 */
@Schema(description = "(DDD Entity) -  Log ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Log   {
  @JsonProperty("LogType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Text logType = null;

  @JsonProperty("LogPeriod")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Datetimeperiod logPeriod = null;

  @JsonProperty("LogDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Datetime logDate = null;

  @JsonProperty("LogIdentification")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Identifier logIdentification = null;


  public Log logType(Text logType) { 

    this.logType = logType;
    return this;
  }

  /**
   * Get logType
   * @return logType
   **/
  
  @Schema(description = "")
  
@Valid
  public Text getLogType() {  
    return logType;
  }



  public void setLogType(Text logType) { 
    this.logType = logType;
  }

  public Log logPeriod(Datetimeperiod logPeriod) { 

    this.logPeriod = logPeriod;
    return this;
  }

  /**
   * Get logPeriod
   * @return logPeriod
   **/
  
  @Schema(description = "")
  
@Valid
  public Datetimeperiod getLogPeriod() {  
    return logPeriod;
  }



  public void setLogPeriod(Datetimeperiod logPeriod) { 
    this.logPeriod = logPeriod;
  }

  public Log logDate(Datetime logDate) { 

    this.logDate = logDate;
    return this;
  }

  /**
   * Get logDate
   * @return logDate
   **/
  
  @Schema(description = "")
  
@Valid
  public Datetime getLogDate() {  
    return logDate;
  }



  public void setLogDate(Datetime logDate) { 
    this.logDate = logDate;
  }

  public Log logIdentification(Identifier logIdentification) { 

    this.logIdentification = logIdentification;
    return this;
  }

  /**
   * Get logIdentification
   * @return logIdentification
   **/
  
  @Schema(description = "")
  
@Valid
  public Identifier getLogIdentification() {  
    return logIdentification;
  }



  public void setLogIdentification(Identifier logIdentification) { 
    this.logIdentification = logIdentification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Log log = (Log) o;
    return Objects.equals(this.logType, log.logType) &&
        Objects.equals(this.logPeriod, log.logPeriod) &&
        Objects.equals(this.logDate, log.logDate) &&
        Objects.equals(this.logIdentification, log.logIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logType, logPeriod, logDate, logIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Log {\n");
    
    sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
    sb.append("    logPeriod: ").append(toIndentedString(logPeriod)).append("\n");
    sb.append("    logDate: ").append(toIndentedString(logDate)).append("\n");
    sb.append("    logIdentification: ").append(toIndentedString(logIdentification)).append("\n");
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
