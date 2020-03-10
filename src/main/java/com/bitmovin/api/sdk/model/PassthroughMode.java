package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Configure if the encoding should use the video stream as the passthrough mode or a dedicated caption stream.
 */
public enum PassthroughMode {
  
  /**
   * Configure if the encoding should use the video stream as the passthrough mode or a dedicated caption stream.
   */
  VIDEO_STREAM("VIDEO_STREAM"),
  
  /**
   * Configure if the encoding should use the video stream as the passthrough mode or a dedicated caption stream.
   */
  CAPTION_STREAM("CAPTION_STREAM");

  private String value;

  PassthroughMode(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PassthroughMode fromValue(String text) {
    for (PassthroughMode b : PassthroughMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
