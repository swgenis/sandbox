package bain.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;

/**
 * (DDD Entity) -  Partyrole
 */
@Schema(description = "(DDD Entity) -  Partyrole ")
@Validated
public class Partyrole {
    @JsonProperty("PartyRoleType")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Text partyRoleType = null;

    @JsonProperty("PartyRoleName")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Name partyRoleName = null;

    @JsonProperty("PartyRoleValidityPeriod")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Datetimeperiod partyRoleValidityPeriod = null;

    @JsonProperty("PartyInvolvementType")

    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private Partyinvolvementtypevalues partyInvolvementType = null;


    public Partyrole partyRoleType(Text partyRoleType) {

        this.partyRoleType = partyRoleType;
        return this;
    }

    /**
     * Get partyRoleType
     *
     * @return partyRoleType
     **/

    @Schema(description = "")

    @Valid
    public Text getPartyRoleType() {
        return partyRoleType;
    }


    public void setPartyRoleType(Text partyRoleType) {
        this.partyRoleType = partyRoleType;
    }

    public Partyrole partyRoleName(Name partyRoleName) {

        this.partyRoleName = partyRoleName;
        return this;
    }

    /**
     * Get partyRoleName
     *
     * @return partyRoleName
     **/

    @Schema(description = "")

    @Valid
    public Name getPartyRoleName() {
        return partyRoleName;
    }


    public void setPartyRoleName(Name partyRoleName) {
        this.partyRoleName = partyRoleName;
    }

    public Partyrole partyRoleValidityPeriod(Datetimeperiod partyRoleValidityPeriod) {

        this.partyRoleValidityPeriod = partyRoleValidityPeriod;
        return this;
    }

    /**
     * Get partyRoleValidityPeriod
     *
     * @return partyRoleValidityPeriod
     **/

    @Schema(description = "")

    @Valid
    public Datetimeperiod getPartyRoleValidityPeriod() {
        return partyRoleValidityPeriod;
    }


    public void setPartyRoleValidityPeriod(Datetimeperiod partyRoleValidityPeriod) {
        this.partyRoleValidityPeriod = partyRoleValidityPeriod;
    }

    public Partyrole partyInvolvementType(Partyinvolvementtypevalues partyInvolvementType) {

        this.partyInvolvementType = partyInvolvementType;
        return this;
    }

    /**
     * Get partyInvolvementType
     *
     * @return partyInvolvementType
     **/

    @Schema(description = "")

    @Valid
    public Partyinvolvementtypevalues getPartyInvolvementType() {
        return partyInvolvementType;
    }


    public void setPartyInvolvementType(Partyinvolvementtypevalues partyInvolvementType) {
        this.partyInvolvementType = partyInvolvementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Partyrole partyrole = (Partyrole) o;
        return Objects.equals(this.partyRoleType, partyrole.partyRoleType) &&
                Objects.equals(this.partyRoleName, partyrole.partyRoleName) &&
                Objects.equals(this.partyRoleValidityPeriod, partyrole.partyRoleValidityPeriod) &&
                Objects.equals(this.partyInvolvementType, partyrole.partyInvolvementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partyRoleType, partyRoleName, partyRoleValidityPeriod, partyInvolvementType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Partyrole {\n");

        sb.append("    partyRoleType: ").append(toIndentedString(partyRoleType)).append("\n");
        sb.append("    partyRoleName: ").append(toIndentedString(partyRoleName)).append("\n");
        sb.append("    partyRoleValidityPeriod: ").append(toIndentedString(partyRoleValidityPeriod)).append("\n");
        sb.append("    partyInvolvementType: ").append(toIndentedString(partyInvolvementType)).append("\n");
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
