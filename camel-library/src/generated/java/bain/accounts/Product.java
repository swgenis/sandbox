package bain.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * (DDD Entity) - Reference to the product or service that is related to  Accounts Receivable Procedure Product_x000D_ |Product (https://www.iso20022.org/standardsrepository/type/Product)|Standard|ISO20022 BM ()
 */
@Schema(description = "(DDD Entity) - Reference to the product or service that is related to  Accounts Receivable Procedure Product_x000D_ |Product (https://www.iso20022.org/standardsrepository/type/Product)|Standard|ISO20022 BM ()")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-08-18T09:29:27.310288528Z[GMT]")
public class Product   {
  @JsonProperty("CardPayment")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String cardPayment = null;

  @JsonProperty("UnitPrice")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String unitPrice = null;

  @JsonProperty("ProductCategory")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String productCategory = null;

  @JsonProperty("LineItem")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String lineItem = null;

  @JsonProperty("ProductIdentification")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String productIdentification = null;

  @JsonProperty("Name")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String name = null;

  @JsonProperty("Description")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String description = null;

  @JsonProperty("Origin")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String origin = null;

  @JsonProperty("Characteristics")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String characteristics = null;

  @JsonProperty("NetPrice")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String netPrice = null;

  @JsonProperty("Quantity")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String quantity = null;

  @JsonProperty("GrossPrice")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String grossPrice = null;

  @JsonProperty("Quality")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String quality = null;

  @JsonProperty("Delivery")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String delivery = null;

  @JsonProperty("PurchaseOrder")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String purchaseOrder = null;

  @JsonProperty("Tax")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String tax = null;


  public Product cardPayment(String cardPayment) { 

    this.cardPayment = cardPayment;
    return this;
  }

  /**
   * (DDD Entity) - Card payment for which a product was specified. 
   * @return cardPayment
   **/
  
  @Schema(description = "(DDD Entity) - Card payment for which a product was specified. ")
  
  public String getCardPayment() {  
    return cardPayment;
  }



  public void setCardPayment(String cardPayment) { 
    this.cardPayment = cardPayment;
  }

  public Product unitPrice(String unitPrice) { 

    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * (DDD Entity) - Price per unit of product. 
   * @return unitPrice
   **/
  
  @Schema(description = "(DDD Entity) - Price per unit of product. ")
  
  public String getUnitPrice() {  
    return unitPrice;
  }



  public void setUnitPrice(String unitPrice) { 
    this.unitPrice = unitPrice;
  }

  public Product productCategory(String productCategory) { 

    this.productCategory = productCategory;
    return this;
  }

  /**
   * (DDD Entity) - Category of the product. 
   * @return productCategory
   **/
  
  @Schema(description = "(DDD Entity) - Category of the product. ")
  
  public String getProductCategory() {  
    return productCategory;
  }



  public void setProductCategory(String productCategory) { 
    this.productCategory = productCategory;
  }

  public Product lineItem(String lineItem) { 

    this.lineItem = lineItem;
    return this;
  }

  /**
   * (DDD Entity) - Specifies the line item in which the product is specified. 
   * @return lineItem
   **/
  
  @Schema(description = "(DDD Entity) - Specifies the line item in which the product is specified. ")
  
  public String getLineItem() {  
    return lineItem;
  }



  public void setLineItem(String lineItem) { 
    this.lineItem = lineItem;
  }

  public Product productIdentification(String productIdentification) { 

    this.productIdentification = productIdentification;
    return this;
  }

  /**
   * (DDD Entity) - Identification of the product. 
   * @return productIdentification
   **/
  
  @Schema(description = "(DDD Entity) - Identification of the product. ")
  
  public String getProductIdentification() {  
    return productIdentification;
  }



  public void setProductIdentification(String productIdentification) { 
    this.productIdentification = productIdentification;
  }

  public Product name(String name) { 

    this.name = name;
    return this;
  }

  /**
   * (DDD Entity) - Name of a product. 
   * @return name
   **/
  
  @Schema(description = "(DDD Entity) - Name of a product. ")
  
  public String getName() {  
    return name;
  }



  public void setName(String name) { 
    this.name = name;
  }

  public Product description(String description) { 

    this.description = description;
    return this;
  }

  /**
   * (DDD Entity) - Information about the goods and/or services of a trade transaction. 
   * @return description
   **/
  
  @Schema(description = "(DDD Entity) - Information about the goods and/or services of a trade transaction. ")
  
  public String getDescription() {  
    return description;
  }



  public void setDescription(String description) { 
    this.description = description;
  }

  public Product origin(String origin) { 

    this.origin = origin;
    return this;
  }

  /**
   * (DDD Entity) - Country from which the product originates. 
   * @return origin
   **/
  
  @Schema(description = "(DDD Entity) - Country from which the product originates. ")
  
  public String getOrigin() {  
    return origin;
  }



  public void setOrigin(String origin) { 
    this.origin = origin;
  }

  public Product characteristics(String characteristics) { 

    this.characteristics = characteristics;
    return this;
  }

  /**
   * (DDD Entity) - Characteristics of the product. 
   * @return characteristics
   **/
  
  @Schema(description = "(DDD Entity) - Characteristics of the product. ")
  
  public String getCharacteristics() {  
    return characteristics;
  }



  public void setCharacteristics(String characteristics) { 
    this.characteristics = characteristics;
  }

  public Product netPrice(String netPrice) { 

    this.netPrice = netPrice;
    return this;
  }

  /**
   * (DDD Entity) - Net price of the goods and/or service. 
   * @return netPrice
   **/
  
  @Schema(description = "(DDD Entity) - Net price of the goods and/or service. ")
  
  public String getNetPrice() {  
    return netPrice;
  }



  public void setNetPrice(String netPrice) { 
    this.netPrice = netPrice;
  }

  public Product quantity(String quantity) { 

    this.quantity = quantity;
    return this;
  }

  /**
   * (DDD Entity) - Specifies the quantity of the product. 
   * @return quantity
   **/
  
  @Schema(description = "(DDD Entity) - Specifies the quantity of the product. ")
  
  public String getQuantity() {  
    return quantity;
  }



  public void setQuantity(String quantity) { 
    this.quantity = quantity;
  }

  public Product grossPrice(String grossPrice) { 

    this.grossPrice = grossPrice;
    return this;
  }

  /**
   * (DDD Entity) - Gross price of the goods and/or service. 
   * @return grossPrice
   **/
  
  @Schema(description = "(DDD Entity) - Gross price of the goods and/or service. ")
  
  public String getGrossPrice() {  
    return grossPrice;
  }



  public void setGrossPrice(String grossPrice) { 
    this.grossPrice = grossPrice;
  }

  public Product quality(String quality) { 

    this.quality = quality;
    return this;
  }

  /**
   * (DDD Entity) - Quality of the product. 
   * @return quality
   **/
  
  @Schema(description = "(DDD Entity) - Quality of the product. ")
  
  public String getQuality() {  
    return quality;
  }



  public void setQuality(String quality) { 
    this.quality = quality;
  }

  public Product delivery(String delivery) { 

    this.delivery = delivery;
    return this;
  }

  /**
   * (DDD Entity) - Delivery process of a product 
   * @return delivery
   **/
  
  @Schema(description = "(DDD Entity) - Delivery process of a product ")
  
  public String getDelivery() {  
    return delivery;
  }



  public void setDelivery(String delivery) { 
    this.delivery = delivery;
  }

  public Product purchaseOrder(String purchaseOrder) { 

    this.purchaseOrder = purchaseOrder;
    return this;
  }

  /**
   * (DDD Entity) - Specifies the purchase order in which a specific product is ordered. 
   * @return purchaseOrder
   **/
  
  @Schema(description = "(DDD Entity) - Specifies the purchase order in which a specific product is ordered. ")
  
  public String getPurchaseOrder() {  
    return purchaseOrder;
  }



  public void setPurchaseOrder(String purchaseOrder) { 
    this.purchaseOrder = purchaseOrder;
  }

  public Product tax(String tax) { 

    this.tax = tax;
    return this;
  }

  /**
   * (DDD Entity) - Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction. 
   * @return tax
   **/
  
  @Schema(description = "(DDD Entity) - Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction. ")
  
  public String getTax() {  
    return tax;
  }



  public void setTax(String tax) { 
    this.tax = tax;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.cardPayment, product.cardPayment) &&
        Objects.equals(this.unitPrice, product.unitPrice) &&
        Objects.equals(this.productCategory, product.productCategory) &&
        Objects.equals(this.lineItem, product.lineItem) &&
        Objects.equals(this.productIdentification, product.productIdentification) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.origin, product.origin) &&
        Objects.equals(this.characteristics, product.characteristics) &&
        Objects.equals(this.netPrice, product.netPrice) &&
        Objects.equals(this.quantity, product.quantity) &&
        Objects.equals(this.grossPrice, product.grossPrice) &&
        Objects.equals(this.quality, product.quality) &&
        Objects.equals(this.delivery, product.delivery) &&
        Objects.equals(this.purchaseOrder, product.purchaseOrder) &&
        Objects.equals(this.tax, product.tax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardPayment, unitPrice, productCategory, lineItem, productIdentification, name, description, origin, characteristics, netPrice, quantity, grossPrice, quality, delivery, purchaseOrder, tax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    cardPayment: ").append(toIndentedString(cardPayment)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
    sb.append("    productIdentification: ").append(toIndentedString(productIdentification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
    sb.append("    netPrice: ").append(toIndentedString(netPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    grossPrice: ").append(toIndentedString(grossPrice)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    purchaseOrder: ").append(toIndentedString(purchaseOrder)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
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
