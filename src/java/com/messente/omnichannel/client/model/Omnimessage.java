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
import io.swagger.client.model.SMS;
import io.swagger.client.model.Scenario;
import io.swagger.client.model.Viber;
import java.io.IOException;

/**
 * Omnimessage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-30T13:29:03.525Z")
public class Omnimessage {
  @SerializedName("scenario")
  private Scenario scenario = null;

  @SerializedName("viber")
  private Viber viber = null;

  @SerializedName("sms")
  private SMS sms = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("drl_url")
  private String drlUrl = null;

  @SerializedName("time_to_send")
  private String timeToSend = null;

  public Omnimessage scenario(Scenario scenario) {
    this.scenario = scenario;
    return this;
  }

   /**
   * Get scenario
   * @return scenario
  **/
  @ApiModelProperty(required = true, value = "")
  public Scenario getScenario() {
    return scenario;
  }

  public void setScenario(Scenario scenario) {
    this.scenario = scenario;
  }

  public Omnimessage viber(Viber viber) {
    this.viber = viber;
    return this;
  }

   /**
   * Get viber
   * @return viber
  **/
  @ApiModelProperty(value = "")
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
   * Get sms
   * @return sms
  **/
  @ApiModelProperty(value = "")
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
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")
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
   * Get drlUrl
   * @return drlUrl
  **/
  @ApiModelProperty(value = "")
  public String getDrlUrl() {
    return drlUrl;
  }

  public void setDrlUrl(String drlUrl) {
    this.drlUrl = drlUrl;
  }

  public Omnimessage timeToSend(String timeToSend) {
    this.timeToSend = timeToSend;
    return this;
  }

   /**
   * Get timeToSend
   * @return timeToSend
  **/
  @ApiModelProperty(value = "")
  public String getTimeToSend() {
    return timeToSend;
  }

  public void setTimeToSend(String timeToSend) {
    this.timeToSend = timeToSend;
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
    return Objects.equals(this.scenario, omnimessage.scenario) &&
        Objects.equals(this.viber, omnimessage.viber) &&
        Objects.equals(this.sms, omnimessage.sms) &&
        Objects.equals(this.to, omnimessage.to) &&
        Objects.equals(this.drlUrl, omnimessage.drlUrl) &&
        Objects.equals(this.timeToSend, omnimessage.timeToSend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenario, viber, sms, to, drlUrl, timeToSend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Omnimessage {\n");
    
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    viber: ").append(toIndentedString(viber)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    drlUrl: ").append(toIndentedString(drlUrl)).append("\n");
    sb.append("    timeToSend: ").append(toIndentedString(timeToSend)).append("\n");
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

