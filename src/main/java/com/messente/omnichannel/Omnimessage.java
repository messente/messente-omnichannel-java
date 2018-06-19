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
import com.messente.omnichannel.SMS;
import com.messente.omnichannel.Scenarios;
import com.messente.omnichannel.Viber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Omnimessage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-19T09:45:59.838+03:00")
public class Omnimessage {
  @SerializedName("scenarios")
  private Scenarios scenarios = null;

  @SerializedName("viber")
  private Viber viber = null;

  @SerializedName("sms")
  private SMS sms = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("drl_url")
  private String drlUrl = null;

  public Omnimessage scenarios(Scenarios scenarios) {
    this.scenarios = scenarios;
    return this;
  }

   /**
   * Get scenarios
   * @return scenarios
  **/
  @ApiModelProperty(required = true, value = "")
  public Scenarios getScenarios() {
    return scenarios;
  }

  public void setScenarios(Scenarios scenarios) {
    this.scenarios = scenarios;
  }

  public Omnimessage viber(Viber viber) {
    this.viber = viber;
    return this;
  }

   /**
   * Viber message content
   * @return viber
  **/
  @ApiModelProperty(value = "Viber message content")
  public Viber getViber() {
    return viber;
  }

  public void setViber(Viber viber) {
    this.viber = viber;
  }

  public Omnimessage sms(SMS sms) {
    this.sms = sms;
    return this;
  }

   /**
   * SMS message content
   * @return sms
  **/
  @ApiModelProperty(value = "SMS message content")
  public SMS getSms() {
    return sms;
  }

  public void setSms(SMS sms) {
    this.sms = sms;
  }

  public Omnimessage to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Phone number of the recipient in international number format
   * @return to
  **/
  @ApiModelProperty(required = true, value = "Phone number of the recipient in international number format")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Omnimessage drlUrl(String drlUrl) {
    this.drlUrl = drlUrl;
    return this;
  }

   /**
   * URL where the delivery report will be sent
   * @return drlUrl
  **/
  @ApiModelProperty(value = "URL where the delivery report will be sent")
  public String getDrlUrl() {
    return drlUrl;
  }

  public void setDrlUrl(String drlUrl) {
    this.drlUrl = drlUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Omnimessage omnimessage = (Omnimessage) o;
    return Objects.equals(this.scenarios, omnimessage.scenarios) &&
        Objects.equals(this.viber, omnimessage.viber) &&
        Objects.equals(this.sms, omnimessage.sms) &&
        Objects.equals(this.to, omnimessage.to) &&
        Objects.equals(this.drlUrl, omnimessage.drlUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarios, viber, sms, to, drlUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Omnimessage {\n");
    
    sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
    sb.append("    viber: ").append(toIndentedString(viber)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    drlUrl: ").append(toIndentedString(drlUrl)).append("\n");
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
