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
public class Partylegalstructuretypevalues {
    @JsonProperty("Partylegalstructuretypevalues")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private PartylegalstructuretypevaluesEnum partylegalstructuretypevalues = null;

    public Partylegalstructuretypevalues partylegalstructuretypevalues(PartylegalstructuretypevaluesEnum partylegalstructuretypevalues) {

        this.partylegalstructuretypevalues = partylegalstructuretypevalues;
        return this;
    }

    /**
     * >  * `Individual` -   * `CommunityInterestCompany` -   * `CharitableIncorporatedOrganisation` -   * `Co-Operative` -   * `Charity` -   * `GeneralPartnership` -   * `LimitedLiabilityPartnership` -   * `ScottishLimitedPartnership` -   * `LimitedPartnership` -   * `PrivateLimitedCompany` -   * `PublicLimitedCompany` -   * `Sole(SoleTrader)` -
     *
     * @return partylegalstructuretypevalues
     **/

    @Schema(description = ">  * `Individual` -   * `CommunityInterestCompany` -   * `CharitableIncorporatedOrganisation` -   * `Co-Operative` -   * `Charity` -   * `GeneralPartnership` -   * `LimitedLiabilityPartnership` -   * `ScottishLimitedPartnership` -   * `LimitedPartnership` -   * `PrivateLimitedCompany` -   * `PublicLimitedCompany` -   * `Sole(SoleTrader)` - ")

    public PartylegalstructuretypevaluesEnum getPartylegalstructuretypevalues() {
        return partylegalstructuretypevalues;
    }

    public void setPartylegalstructuretypevalues(PartylegalstructuretypevaluesEnum partylegalstructuretypevalues) {
        this.partylegalstructuretypevalues = partylegalstructuretypevalues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Partylegalstructuretypevalues partylegalstructuretypevalues = (Partylegalstructuretypevalues) o;
        return Objects.equals(this.partylegalstructuretypevalues, partylegalstructuretypevalues.partylegalstructuretypevalues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partylegalstructuretypevalues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Partylegalstructuretypevalues {\n");

        sb.append("    partylegalstructuretypevalues: ").append(toIndentedString(partylegalstructuretypevalues)).append("\n");
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
     * >  * `Individual` -   * `CommunityInterestCompany` -   * `CharitableIncorporatedOrganisation` -   * `Co-Operative` -   * `Charity` -   * `GeneralPartnership` -   * `LimitedLiabilityPartnership` -   * `ScottishLimitedPartnership` -   * `LimitedPartnership` -   * `PrivateLimitedCompany` -   * `PublicLimitedCompany` -   * `Sole(SoleTrader)` -
     */
    public enum PartylegalstructuretypevaluesEnum {
        INDIVIDUAL("Individual"),

        COMMUNITYINTERESTCOMPANY("CommunityInterestCompany"),

        CO_OPERATIVE("Co-Operative"),

        CHARITY("Charity"),

        GENERALPARTNERSHIP("GeneralPartnership"),

        LIMITEDLIABILITYPARTNERSHIP("LimitedLiabilityPartnership"),

        SCOTTISHLIMITEDPARTNERSHIP("ScottishLimitedPartnership"),

        LIMITEDPARTNERSHIP("LimitedPartnership"),

        PRIVATELIMITEDCOMPANY("PrivateLimitedCompany"),

        PUBLICLIMITEDCOMPANY("PublicLimitedCompany"),

        SOLE_SOLETRADER_("Sole(SoleTrader)");

        private String value;

        PartylegalstructuretypevaluesEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static PartylegalstructuretypevaluesEnum fromValue(String text) {
            for (PartylegalstructuretypevaluesEnum b : PartylegalstructuretypevaluesEnum.values()) {
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
