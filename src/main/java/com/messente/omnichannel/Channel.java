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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Defines the delivery channel
 */
@JsonAdapter(Channel.Adapter.class)
public enum Channel {
  
  SMS("sms"),
  
  VIBER("viber"),
  
  WHATSAPP("whatsapp");

  private String value;

  Channel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Channel fromValue(String text) {
    for (Channel b : Channel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<Channel> {
    @Override
    public void write(final JsonWriter jsonWriter, final Channel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Channel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Channel.fromValue(String.valueOf(value));
    }
  }
}

