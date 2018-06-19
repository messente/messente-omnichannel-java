/*
 * Omnichannel API
 * This is the beta version of Omnichannel API
 *
 * OpenAPI spec version: 0.0.1
 * Contact: admin@messente.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.messente.omnichannel;

import java.util.Objects;
import java.util.Arrays;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-19T09:45:59.838+03:00")
public class Viber {
  @SerializedName("text")
  private String text = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("button_url")
  private String buttonUrl = null;

  @SerializedName("button_text")
  private String buttonText = null;

  @SerializedName("sender")
  private String sender = null;

  public Viber text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Plaintext content for Viber
   * @return text
  **/
  @ApiModelProperty(value = "Plaintext content for Viber")
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
   * URL for the embedded image. Valid combinations: 1) &#39;image_url&#39; 2) &#39;text&#39;, &#39;image_url&#39;, &#39;button_url&#39;, &#39;button_text&#39;
   * @return imageUrl
  **/
  @ApiModelProperty(value = "URL for the embedded image. Valid combinations: 1) 'image_url' 2) 'text', 'image_url', 'button_url', 'button_text'")
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
   * URL of the button, must be specified along with &#39;text&#39;, &#39;button_text&#39;  and &#39;image_url&#39; (optional)
   * @return buttonUrl
  **/
  @ApiModelProperty(value = "URL of the button, must be specified along with 'text', 'button_text'  and 'image_url' (optional)")
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
   * Must be specified along with &#39;text&#39;, &#39;button_url&#39;, &#39;button_text&#39;, &#39;image_url&#39; (optional)
   * @return buttonText
  **/
  @ApiModelProperty(value = "Must be specified along with 'text', 'button_url', 'button_text', 'image_url' (optional)")
  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  public Viber sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Phone number or alphanumeric sender name
   * @return sender
  **/
  @ApiModelProperty(required = true, value = "Phone number or alphanumeric sender name")
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
        Objects.equals(this.sender, viber.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, imageUrl, buttonUrl, buttonText, sender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Viber {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    buttonUrl: ").append(toIndentedString(buttonUrl)).append("\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
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

