package bain.payments;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) -  Partyrole
 */
@Schema(description = "(DDD Entity) -  Partyrole ")
@Validated
public class Partyinvolvementtypevalues {
    @JsonProperty("Partyinvolvementtypevalues")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private PartyinvolvementtypevaluesEnum partyinvolvementtypevalues = null;

    public Partyinvolvementtypevalues partyinvolvementtypevalues(PartyinvolvementtypevaluesEnum partyinvolvementtypevalues) {

        this.partyinvolvementtypevalues = partyinvolvementtypevalues;
        return this;
    }

    /**
     * >  * `Agreementinvolvement` -   * `Partyinvolvement` -   * `Arrangementinvolvement` -   * `Designspecificationinvolvement` -   * `Relationshipinvolvement` -   * `Locationinvolvement` -   * `Bankguaranteeinvolvement` -
     *
     * @return partyinvolvementtypevalues
     **/

    @Schema(description = ">  * `Agreementinvolvement` -   * `Partyinvolvement` -   * `Arrangementinvolvement` -   * `Designspecificationinvolvement` -   * `Relationshipinvolvement` -   * `Locationinvolvement` -   * `Bankguaranteeinvolvement` - ")

    public PartyinvolvementtypevaluesEnum getPartyinvolvementtypevalues() {
        return partyinvolvementtypevalues;
    }

    public void setPartyinvolvementtypevalues(PartyinvolvementtypevaluesEnum partyinvolvementtypevalues) {
        this.partyinvolvementtypevalues = partyinvolvementtypevalues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Partyinvolvementtypevalues partyinvolvementtypevalues = (Partyinvolvementtypevalues) o;
        return Objects.equals(this.partyinvolvementtypevalues, partyinvolvementtypevalues.partyinvolvementtypevalues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partyinvolvementtypevalues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Partyinvolvementtypevalues {\n");

        sb.append("    partyinvolvementtypevalues: ").append(toIndentedString(partyinvolvementtypevalues)).append("\n");
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
     * >  * `Agreementinvolvement` -   * `Partyinvolvement` -   * `Arrangementinvolvement` -   * `Designspecificationinvolvement` -   * `Relationshipinvolvement` -   * `Locationinvolvement` -   * `Bankguaranteeinvolvement` -
     */
    public enum PartyinvolvementtypevaluesEnum {
        AGREEMENTINVOLVEMENT("Agreementinvolvement"),

        PARTYINVOLVEMENT("Partyinvolvement"),

        ARRANGEMENTINVOLVEMENT("Arrangementinvolvement"),

        RELATIONSHIPINVOLVEMENT("Relationshipinvolvement"),

        LOCATIONINVOLVEMENT("Locationinvolvement"),

        BANKGUARANTEEINVOLVEMENT("Bankguaranteeinvolvement");

        private String value;

        PartyinvolvementtypevaluesEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static PartyinvolvementtypevaluesEnum fromValue(String text) {
            for (PartyinvolvementtypevaluesEnum b : PartyinvolvementtypevaluesEnum.values()) {
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
