/*
 * Omnichannel API
 * This is the beta version of Omnichannel API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: admin@messente.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Viber
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-14T08:47:17.173Z")
public class Viber {
  @SerializedName("text")
  private String text = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("button_url")
  private String buttonUrl = null;

  @SerializedName("button_text")
  private String buttonText = null;

  @SerializedName("is_promotional")
  private Boolean isPromotional = null;

  @SerializedName("sender")
  private String sender = null;

  public Viber text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(required = true, value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Viber imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Viber buttonUrl(String buttonUrl) {
    this.buttonUrl = buttonUrl;
    return this;
  }

   /**
   * Get buttonUrl
   * @return buttonUrl
  **/
  @ApiModelProperty(value = "")
  public String getButtonUrl() {
    return buttonUrl;
  }

  public void setButtonUrl(String buttonUrl) {
    this.buttonUrl = buttonUrl;
  }

  public Viber buttonText(String buttonText) {
    this.buttonText = buttonText;
    return this;
  }

   /**
   * Get buttonText
   * @return buttonText
  **/
  @ApiModelProperty(value = "")
  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  public Viber isPromotional(Boolean isPromotional) {
    this.isPromotional = isPromotional;
    return this;
  }

   /**
   * Get isPromotional
   * @return isPromotional
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPromotional() {
    return isPromotional;
  }

  public void setIsPromotional(Boolean isPromotional) {
    this.isPromotional = isPromotional;
  }

  public Viber sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Viber viber = (Viber) o;
    return Objects.equals(this.text, viber.text) &&
        Objects.equals(this.imageUrl, viber.imageUrl) &&
        Objects.equals(this.buttonUrl, viber.buttonUrl) &&
        Objects.equals(this.buttonText, viber.buttonText) &&
        Objects.equals(this.isPromotional, viber.isPromotional) &&
        Objects.equals(this.sender, viber.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, imageUrl, buttonUrl, buttonText, isPromotional, sender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Viber {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    buttonUrl: ").append(toIndentedString(buttonUrl)).append("\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    isPromotional: ").append(toIndentedString(isPromotional)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

