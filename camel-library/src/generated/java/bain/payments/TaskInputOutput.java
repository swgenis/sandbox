package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Details of the mechanism selection TaskInputOutput ||  |
 */
@Schema(description = "(DDD Entity) - Details of the mechanism selection TaskInputOutput ||  |")
@Validated
public class TaskInputOutput {
    @JsonProperty("TaskInputOutput")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String taskInputOutput = null;


    public TaskInputOutput taskInputOutput(String taskInputOutput) {

        this.taskInputOutput = taskInputOutput;
        return this;
    }

    /**
     * Get taskInputOutput
     *
     * @return taskInputOutput
     **/

    @Schema(description = "")

    public String getTaskInputOutput() {
        return taskInputOutput;
    }


    public void setTaskInputOutput(String taskInputOutput) {
        this.taskInputOutput = taskInputOutput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInputOutput taskInputOutput = (TaskInputOutput) o;
        return Objects.equals(this.taskInputOutput, taskInputOutput.taskInputOutput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskInputOutput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInputOutput {\n");

        sb.append("    taskInputOutput: ").append(toIndentedString(taskInputOutput)).append("\n");
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
