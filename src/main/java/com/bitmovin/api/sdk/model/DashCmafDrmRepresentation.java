package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashCmafRepresentation;
import com.bitmovin.api.sdk.model.DashMuxingType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashCmafDrmRepresentation
 */

public class DashCmafDrmRepresentation extends DashCmafRepresentation {
  @JsonProperty("drmId")
  private String drmId;


  /**
   * DRM Id
   * @return drmId
   */
  public String getDrmId() {
    return drmId;
  }

  public void setDrmId(String drmId) {
    this.drmId = drmId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashCmafDrmRepresentation dashCmafDrmRepresentation = (DashCmafDrmRepresentation) o;
    return Objects.equals(this.drmId, dashCmafDrmRepresentation.drmId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drmId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashCmafDrmRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    drmId: ").append(toIndentedString(drmId)).append("\n");
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

