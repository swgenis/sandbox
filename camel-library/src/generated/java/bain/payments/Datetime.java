package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) -  Datetime
 */
@Schema(description = "(DDD Entity) -  Datetime ")
@Validated
public class Datetime {
    @JsonProperty("DateTimeContent")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Text dateTimeContent = null;

    @JsonProperty("TimeZoneCode")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Text timeZoneCode = null;

    @JsonProperty("DaylightSavingIndicator")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Text daylightSavingIndicator = null;

    @JsonProperty("DateTimeType")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Datetimetypevalues dateTimeType = null;

    @JsonProperty("Datetime")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String datetime = null;


    public Datetime dateTimeContent(Text dateTimeContent) {

        this.dateTimeContent = dateTimeContent;
        return this;
    }

    /**
     * Get dateTimeContent
     *
     * @return dateTimeContent
     **/

    @Schema(description = "")

    @Valid
    public Text getDateTimeContent() {
        return dateTimeContent;
    }


    public void setDateTimeContent(Text dateTimeContent) {
        this.dateTimeContent = dateTimeContent;
    }

    public Datetime timeZoneCode(Text timeZoneCode) {

        this.timeZoneCode = timeZoneCode;
        return this;
    }

    /**
     * Get timeZoneCode
     *
     * @return timeZoneCode
     **/

    @Schema(description = "")

    @Valid
    public Text getTimeZoneCode() {
        return timeZoneCode;
    }


    public void setTimeZoneCode(Text timeZoneCode) {
        this.timeZoneCode = timeZoneCode;
    }

    public Datetime daylightSavingIndicator(Text daylightSavingIndicator) {

        this.daylightSavingIndicator = daylightSavingIndicator;
        return this;
    }

    /**
     * Get daylightSavingIndicator
     *
     * @return daylightSavingIndicator
     **/

    @Schema(description = "")

    @Valid
    public Text getDaylightSavingIndicator() {
        return daylightSavingIndicator;
    }


    public void setDaylightSavingIndicator(Text daylightSavingIndicator) {
        this.daylightSavingIndicator = daylightSavingIndicator;
    }

    public Datetime dateTimeType(Datetimetypevalues dateTimeType) {

        this.dateTimeType = dateTimeType;
        return this;
    }

    /**
     * Get dateTimeType
     *
     * @return dateTimeType
     **/

    @Schema(description = "")

    @Valid
    public Datetimetypevalues getDateTimeType() {
        return dateTimeType;
    }


    public void setDateTimeType(Datetimetypevalues dateTimeType) {
        this.dateTimeType = dateTimeType;
    }

    public Datetime datetime(String datetime) {

        this.datetime = datetime;
        return this;
    }

    /**
     * Get datetime
     *
     * @return datetime
     **/

    @Schema(description = "")

    public String getDatetime() {
        return datetime;
    }


    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Datetime datetime = (Datetime) o;
        return Objects.equals(this.dateTimeContent, datetime.dateTimeContent) &&
                Objects.equals(this.timeZoneCode, datetime.timeZoneCode) &&
                Objects.equals(this.daylightSavingIndicator, datetime.daylightSavingIndicator) &&
                Objects.equals(this.dateTimeType, datetime.dateTimeType) &&
                Objects.equals(this.datetime, datetime.datetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTimeContent, timeZoneCode, daylightSavingIndicator, dateTimeType, datetime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Datetime {\n");

        sb.append("    dateTimeContent: ").append(toIndentedString(dateTimeContent)).append("\n");
        sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
        sb.append("    daylightSavingIndicator: ").append(toIndentedString(daylightSavingIndicator)).append("\n");
        sb.append("    dateTimeType: ").append(toIndentedString(dateTimeType)).append("\n");
        sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
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
