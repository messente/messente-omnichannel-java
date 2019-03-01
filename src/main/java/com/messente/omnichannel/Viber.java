/*
 * Omnichannel API
 * Messente's API which allows sending messages via various channels with fallback options.
 *
 * OpenAPI spec version: 0.0.2
 * Contact: messente@messente.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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
 * Viber message content
 */
@ApiModel(description = "Viber message content")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-21T17:59:06.249+02:00[Europe/Tallinn]")
public class Viber {
  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private Integer validity;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_BUTTON_URL = "button_url";
  @SerializedName(SERIALIZED_NAME_BUTTON_URL)
  private String buttonUrl;

  public static final String SERIALIZED_NAME_BUTTON_TEXT = "button_text";
  @SerializedName(SERIALIZED_NAME_BUTTON_TEXT)
  private String buttonText;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel = "viber";

  public Viber sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Phone number or alphanumeric sender name
   * @return sender
  **/
  @ApiModelProperty(value = "Phone number or alphanumeric sender name")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public Viber validity(Integer validity) {
    this.validity = validity;
    return this;
  }

   /**
   * After how many minutes this channel is considered as failed and the next channel is attempted
   * @return validity
  **/
  @ApiModelProperty(example = "360", value = "After how many minutes this channel is considered as failed and the next channel is attempted")
  public Integer getValidity() {
    return validity;
  }

  public void setValidity(Integer validity) {
    this.validity = validity;
  }

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

  public Viber channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(value = "")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
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
    return Objects.equals(this.sender, viber.sender) &&
        Objects.equals(this.validity, viber.validity) &&
        Objects.equals(this.text, viber.text) &&
        Objects.equals(this.imageUrl, viber.imageUrl) &&
        Objects.equals(this.buttonUrl, viber.buttonUrl) &&
        Objects.equals(this.buttonText, viber.buttonText) &&
        Objects.equals(this.channel, viber.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, validity, text, imageUrl, buttonUrl, buttonText, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Viber {\n");
    
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    buttonUrl: ").append(toIndentedString(buttonUrl)).append("\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

