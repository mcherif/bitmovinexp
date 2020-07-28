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
 * Whether to use the Dialogue Intelligence feature, which identifies and analyzes dialogue segments within audio as a basis for speech gating
 */
public enum DolbyAtmosDialogueIntelligence {
  
  /**
   * Enable Dialogue Intelligence feature
   */
  ENABLED("ENABLED"),
  
  /**
   * Disable Dialogue Intelligence feature
   */
  DISABLED("DISABLED");

  private String value;

  DolbyAtmosDialogueIntelligence(String value) {
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
  public static DolbyAtmosDialogueIntelligence fromValue(String text) {
    for (DolbyAtmosDialogueIntelligence b : DolbyAtmosDialogueIntelligence.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

