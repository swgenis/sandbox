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
 * (DDD Entity) - A selected optional business service as subject matter of Accounts Receivable Procedure Feature ||  |
 */
@Schema(description = "(DDD Entity) - A selected optional business service as subject matter of Accounts Receivable Procedure Feature ||  |")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Feature   {
  @JsonProperty("FeatureType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Featuretypevalues featureType = null;

  @JsonProperty("FeatureIdentification")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Identifier featureIdentification = null;

  @JsonProperty("FeatureName")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Name featureName = null;

  @JsonProperty("FeatureLifecycleStatus")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Status featureLifecycleStatus = null;

  @JsonProperty("FeatureDescription")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Text featureDescription = null;


  public Feature featureType(Featuretypevalues featureType) { 

    this.featureType = featureType;
    return this;
  }

  /**
   * Get featureType
   * @return featureType
   **/
  
  @Schema(description = "")
  
@Valid
  public Featuretypevalues getFeatureType() {  
    return featureType;
  }



  public void setFeatureType(Featuretypevalues featureType) { 
    this.featureType = featureType;
  }

  public Feature featureIdentification(Identifier featureIdentification) { 

    this.featureIdentification = featureIdentification;
    return this;
  }

  /**
   * Get featureIdentification
   * @return featureIdentification
   **/
  
  @Schema(description = "")
  
@Valid
  public Identifier getFeatureIdentification() {  
    return featureIdentification;
  }



  public void setFeatureIdentification(Identifier featureIdentification) { 
    this.featureIdentification = featureIdentification;
  }

  public Feature featureName(Name featureName) { 

    this.featureName = featureName;
    return this;
  }

  /**
   * Get featureName
   * @return featureName
   **/
  
  @Schema(description = "")
  
@Valid
  public Name getFeatureName() {  
    return featureName;
  }



  public void setFeatureName(Name featureName) { 
    this.featureName = featureName;
  }

  public Feature featureLifecycleStatus(Status featureLifecycleStatus) { 

    this.featureLifecycleStatus = featureLifecycleStatus;
    return this;
  }

  /**
   * Get featureLifecycleStatus
   * @return featureLifecycleStatus
   **/
  
  @Schema(description = "")
  
@Valid
  public Status getFeatureLifecycleStatus() {  
    return featureLifecycleStatus;
  }



  public void setFeatureLifecycleStatus(Status featureLifecycleStatus) { 
    this.featureLifecycleStatus = featureLifecycleStatus;
  }

  public Feature featureDescription(Text featureDescription) { 

    this.featureDescription = featureDescription;
    return this;
  }

  /**
   * Get featureDescription
   * @return featureDescription
   **/
  
  @Schema(description = "")
  
@Valid
  public Text getFeatureDescription() {  
    return featureDescription;
  }



  public void setFeatureDescription(Text featureDescription) { 
    this.featureDescription = featureDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(this.featureType, feature.featureType) &&
        Objects.equals(this.featureIdentification, feature.featureIdentification) &&
        Objects.equals(this.featureName, feature.featureName) &&
        Objects.equals(this.featureLifecycleStatus, feature.featureLifecycleStatus) &&
        Objects.equals(this.featureDescription, feature.featureDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureType, featureIdentification, featureName, featureLifecycleStatus, featureDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
    sb.append("    featureIdentification: ").append(toIndentedString(featureIdentification)).append("\n");
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    featureLifecycleStatus: ").append(toIndentedString(featureLifecycleStatus)).append("\n");
    sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
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
