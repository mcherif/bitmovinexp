package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * KubernetesClusterPatch
 */

public class KubernetesClusterPatch {
  @JsonProperty("connected")
  private Boolean connected;


  /**
   * Shows if the Kubernetes cluster is accessible by the Bitmovin Agent
   * @return connected
   */
  public Boolean getConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesClusterPatch kubernetesClusterPatch = (KubernetesClusterPatch) o;
    return Objects.equals(this.connected, kubernetesClusterPatch.connected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesClusterPatch {\n");
    
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
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

