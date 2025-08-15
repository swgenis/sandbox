package bain.payments;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) -  Party
 */
@Schema(description = "(DDD Entity) -  Party ")
@Validated
public class Partytypevalues {
    @JsonProperty("Partytypevalues")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private PartytypevaluesEnum partytypevalues = null;

    public Partytypevalues partytypevalues(PartytypevaluesEnum partytypevalues) {

        this.partytypevalues = partytypevalues;
        return this;
    }

    /**
     * >  * `Person` - Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person'). ISO20022  * `Organisation` - Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution. ISO20022
     *
     * @return partytypevalues
     **/

    @Schema(description = ">  * `Person` - Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person'). ISO20022  * `Organisation` - Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution. ISO20022")

    public PartytypevaluesEnum getPartytypevalues() {
        return partytypevalues;
    }

    public void setPartytypevalues(PartytypevaluesEnum partytypevalues) {
        this.partytypevalues = partytypevalues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Partytypevalues partytypevalues = (Partytypevalues) o;
        return Objects.equals(this.partytypevalues, partytypevalues.partytypevalues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partytypevalues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Partytypevalues {\n");

        sb.append("    partytypevalues: ").append(toIndentedString(partytypevalues)).append("\n");
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

    /**
     * >  * `Person` - Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person'). ISO20022  * `Organisation` - Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution. ISO20022
     */
    public enum PartytypevaluesEnum {
        PERSON("Person"),

        ORGANISATION("Organisation");

        private String value;

        PartytypevaluesEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static PartytypevaluesEnum fromValue(String text) {
            for (PartytypevaluesEnum b : PartytypevaluesEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}
