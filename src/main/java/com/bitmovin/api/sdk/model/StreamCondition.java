package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AbstractCondition;
import com.bitmovin.api.sdk.model.ConditionOperator;
import com.bitmovin.api.sdk.model.ConditionType;
import com.bitmovin.api.sdk.model.StreamConditionAttribute;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamCondition
 */

public class StreamCondition extends AbstractCondition {
  @JsonProperty("attribute")
  private StreamConditionAttribute attribute = null;

  @JsonProperty("operator")
  private ConditionOperator operator = null;

  @JsonProperty("value")
  private String value;


  /**
   * Get attribute
   * @return attribute
   */
  public StreamConditionAttribute getAttribute() {
    return attribute;
  }

  public void setAttribute(StreamConditionAttribute attribute) {
    this.attribute = attribute;
  }


  /**
   * Get operator
   * @return operator
   */
  public ConditionOperator getOperator() {
    return operator;
  }

  public void setOperator(ConditionOperator operator) {
    this.operator = operator;
  }


  /**
   * The value that should be used for comparison
   * @return value
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamCondition streamCondition = (StreamCondition) o;
    return Objects.equals(this.attribute, streamCondition.attribute) &&
        Objects.equals(this.operator, streamCondition.operator) &&
        Objects.equals(this.value, streamCondition.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, operator, value, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamCondition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
