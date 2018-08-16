/*
 * Omnichannel API
 * This is the beta version of Omnichannel API
 *
 * OpenAPI spec version: 0.0.1
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
 * Matches the following ResponseErrorTitles This field is a constant. * 101 - Not found * 102 - Forbidden * 103 - Unauthorized * 104 - Invalid data * 105 - Internal Server Error * 106 - Missing data * 107 - Method not allowed 
 */
@JsonAdapter(ResponseErrorCode.Adapter.class)
public enum ResponseErrorCode {
  
  _101("101"),
  
  _102("102"),
  
  _103("103"),
  
  _104("104"),
  
  _105("105"),
  
  _106("106"),
  
  _107("107");

  private String value;

  ResponseErrorCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResponseErrorCode fromValue(String text) {
    for (ResponseErrorCode b : ResponseErrorCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ResponseErrorCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseErrorCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResponseErrorCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseErrorCode.fromValue(String.valueOf(value));
    }
  }
}

