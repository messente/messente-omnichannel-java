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
 * Machine-readable error code, &#x60;null&#x60; when the message has not been processed yet * 0 - No error * 1 - Delivery failure * 2 - Sending message expired * 3 - Invalid number * 4 - Error crediting account * 5 - Invalid number format * 6 - Too many identical messages * 7 - Sender name not allowed * 8 - Operator blacklisted * 9 - Unroutable * 999 - General temporary error 
 */
@JsonAdapter(Err.Adapter.class)
public enum Err {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4),
  
  NUMBER_5(5),
  
  NUMBER_6(6),
  
  NUMBER_7(7),
  
  NUMBER_8(8),
  
  NUMBER_9(9),
  
  NUMBER_10(10),
  
  NUMBER_999(999);

  private Integer value;

  Err(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Err fromValue(String text) {
    for (Err b : Err.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<Err> {
    @Override
    public void write(final JsonWriter jsonWriter, final Err enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Err read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return Err.fromValue(String.valueOf(value));
    }
  }
}

