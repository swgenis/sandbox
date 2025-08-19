package bain.accounts;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) -  Partyidentification 
 */
@Schema(description = "(DDD Entity) -  Partyidentification ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Partyidentificationtypevalues   {
  /**
   * >  * `Taxidentificationnumber` - Number assigned by a tax authority to an entity.  * `Nationalregistrationnumber` - Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC. (ISO20022)  * `Registrationauthorityidentification` - An identifier for the Legal Entity in a business registry in the jurisdiction of legal registration, or in the appropriate registration authority. (ISO20022)  * `LEI(LegalEntityIdentifier)` -   * `Alienregistrationnumber` - Number assigned by a government agency to identify foreign nationals.  * `Passportnumber` - Number assigned by a passport authority.  * `Taxexemptidentificationnumber` - Number assigned to a tax exempt entity.  * `Corporateidentification` - Number assigned to a corporate entity.  * `Driverlicensenumber` - Number assigned to a driver's license.  * `Foreigninvestmentidentitynumber` - Number assigned to a foreign investor (other than the alien number).  * `Socialsecuritynumber` - Number assigned by a social security agency.  * `Identitycardnumber` - Number assigned by a national authority to an identity card.  * `Concat` - Number assigned by an issuer to identify a customer via the concatenation of the birthdate and characters of the first name and surname.  * `Nationalregistrationidentificationnumber` - National registration identification number. In Singapore this is known as the NRIC.
   */
  public enum PartyidentificationtypevaluesEnum {
    TAXIDENTIFICATIONNUMBER("Taxidentificationnumber"),
    
    NATIONALREGISTRATIONNUMBER("Nationalregistrationnumber"),
    
    LEI_LEGALENTITYIDENTIFIER_("LEI(LegalEntityIdentifier)"),
    
    ALIENREGISTRATIONNUMBER("Alienregistrationnumber"),
    
    PASSPORTNUMBER("Passportnumber"),
    
    CORPORATEIDENTIFICATION("Corporateidentification"),
    
    DRIVERLICENSENUMBER("Driverlicensenumber"),
    
    SOCIALSECURITYNUMBER("Socialsecuritynumber"),
    
    IDENTITYCARDNUMBER("Identitycardnumber"),
    
    CONCAT("Concat");

    private String value;

    PartyidentificationtypevaluesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PartyidentificationtypevaluesEnum fromValue(String text) {
      for (PartyidentificationtypevaluesEnum b : PartyidentificationtypevaluesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Partyidentificationtypevalues")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private PartyidentificationtypevaluesEnum partyidentificationtypevalues = null;


  public Partyidentificationtypevalues partyidentificationtypevalues(PartyidentificationtypevaluesEnum partyidentificationtypevalues) { 

    this.partyidentificationtypevalues = partyidentificationtypevalues;
    return this;
  }

  /**
   * >  * `Taxidentificationnumber` - Number assigned by a tax authority to an entity.  * `Nationalregistrationnumber` - Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC. (ISO20022)  * `Registrationauthorityidentification` - An identifier for the Legal Entity in a business registry in the jurisdiction of legal registration, or in the appropriate registration authority. (ISO20022)  * `LEI(LegalEntityIdentifier)` -   * `Alienregistrationnumber` - Number assigned by a government agency to identify foreign nationals.  * `Passportnumber` - Number assigned by a passport authority.  * `Taxexemptidentificationnumber` - Number assigned to a tax exempt entity.  * `Corporateidentification` - Number assigned to a corporate entity.  * `Driverlicensenumber` - Number assigned to a driver's license.  * `Foreigninvestmentidentitynumber` - Number assigned to a foreign investor (other than the alien number).  * `Socialsecuritynumber` - Number assigned by a social security agency.  * `Identitycardnumber` - Number assigned by a national authority to an identity card.  * `Concat` - Number assigned by an issuer to identify a customer via the concatenation of the birthdate and characters of the first name and surname.  * `Nationalregistrationidentificationnumber` - National registration identification number. In Singapore this is known as the NRIC.
   * @return partyidentificationtypevalues
   **/
  
  @Schema(description = ">  * `Taxidentificationnumber` - Number assigned by a tax authority to an entity.  * `Nationalregistrationnumber` - Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC. (ISO20022)  * `Registrationauthorityidentification` - An identifier for the Legal Entity in a business registry in the jurisdiction of legal registration, or in the appropriate registration authority. (ISO20022)  * `LEI(LegalEntityIdentifier)` -   * `Alienregistrationnumber` - Number assigned by a government agency to identify foreign nationals.  * `Passportnumber` - Number assigned by a passport authority.  * `Taxexemptidentificationnumber` - Number assigned to a tax exempt entity.  * `Corporateidentification` - Number assigned to a corporate entity.  * `Driverlicensenumber` - Number assigned to a driver's license.  * `Foreigninvestmentidentitynumber` - Number assigned to a foreign investor (other than the alien number).  * `Socialsecuritynumber` - Number assigned by a social security agency.  * `Identitycardnumber` - Number assigned by a national authority to an identity card.  * `Concat` - Number assigned by an issuer to identify a customer via the concatenation of the birthdate and characters of the first name and surname.  * `Nationalregistrationidentificationnumber` - National registration identification number. In Singapore this is known as the NRIC.")
  
  public PartyidentificationtypevaluesEnum getPartyidentificationtypevalues() {  
    return partyidentificationtypevalues;
  }



  public void setPartyidentificationtypevalues(PartyidentificationtypevaluesEnum partyidentificationtypevalues) { 
    this.partyidentificationtypevalues = partyidentificationtypevalues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Partyidentificationtypevalues partyidentificationtypevalues = (Partyidentificationtypevalues) o;
    return Objects.equals(this.partyidentificationtypevalues, partyidentificationtypevalues.partyidentificationtypevalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyidentificationtypevalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partyidentificationtypevalues {\n");
    
    sb.append("    partyidentificationtypevalues: ").append(toIndentedString(partyidentificationtypevalues)).append("\n");
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
