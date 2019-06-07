package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.Muxing;
import com.bitmovin.api.sdk.model.MuxingStream;
import com.bitmovin.api.sdk.model.StreamConditionsMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CmafMuxing
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class CmafMuxing extends Muxing {
  @JsonProperty("segmentLength")
  private Double segmentLength;

  @JsonProperty("segmentNaming")
  private String segmentNaming;

  @JsonProperty("segmentNamingTemplate")
  private String segmentNamingTemplate;

  @JsonProperty("initSegmentName")
  private String initSegmentName;

  @JsonProperty("initSegmentNameTemplate")
  private String initSegmentNameTemplate;

  @JsonProperty("segmentsMuxed")
  private Integer segmentsMuxed;

  @JsonProperty("framesPerCmafChunk")
  private Object framesPerCmafChunk;


  /**
   * Length of the fragments in seconds
   * @return segmentLength
   */
  public Double getSegmentLength() {
    return segmentLength;
  }

  /**
   * Length of the fragments in seconds
   *
   * @param segmentLength
   * Length of the fragments in seconds
   */
  public void setSegmentLength(Double segmentLength) {
    this.segmentLength = segmentLength;
  }


  /**
   * Segment naming policy
   * @return segmentNaming
   */
  public String getSegmentNaming() {
    return segmentNaming;
  }

  /**
   * Segment naming policy
   *
   * @param segmentNaming
   * Segment naming policy
   */
  public void setSegmentNaming(String segmentNaming) {
    this.segmentNaming = segmentNaming;
  }


  /**
   * Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the segmentNaming property. Intended to avoid re-use of segment names after restarting a live encoding. If segmentNamingTemplate is set, segmentNaming must not be set.
   * @return segmentNamingTemplate
   */
  public String getSegmentNamingTemplate() {
    return segmentNamingTemplate;
  }

  /**
   * Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the segmentNaming property. Intended to avoid re-use of segment names after restarting a live encoding. If segmentNamingTemplate is set, segmentNaming must not be set.
   *
   * @param segmentNamingTemplate
   * Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the segmentNaming property. Intended to avoid re-use of segment names after restarting a live encoding. If segmentNamingTemplate is set, segmentNaming must not be set.
   */
  public void setSegmentNamingTemplate(String segmentNamingTemplate) {
    this.segmentNamingTemplate = segmentNamingTemplate;
  }


  /**
   * Init segment name
   * @return initSegmentName
   */
  public String getInitSegmentName() {
    return initSegmentName;
  }

  /**
   * Init segment name
   *
   * @param initSegmentName
   * Init segment name
   */
  public void setInitSegmentName(String initSegmentName) {
    this.initSegmentName = initSegmentName;
  }


  /**
   * Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the initSegmentName property. Intended to avoid re-use of segment names after restarting a live encoding. If initSegmentNameTemplate is set, initSegmentName must not be set.
   * @return initSegmentNameTemplate
   */
  public String getInitSegmentNameTemplate() {
    return initSegmentNameTemplate;
  }

  /**
   * Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the initSegmentName property. Intended to avoid re-use of segment names after restarting a live encoding. If initSegmentNameTemplate is set, initSegmentName must not be set.
   *
   * @param initSegmentNameTemplate
   * Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the initSegmentName property. Intended to avoid re-use of segment names after restarting a live encoding. If initSegmentNameTemplate is set, initSegmentName must not be set.
   */
  public void setInitSegmentNameTemplate(String initSegmentNameTemplate) {
    this.initSegmentNameTemplate = initSegmentNameTemplate;
  }

  /**
   * Number of segments which have been encoded
   * @return segmentsMuxed
   */
  public Integer getSegmentsMuxed() {
    return segmentsMuxed;
  }


  /**
   * Number of media frames per CMAF chunk. Defaults to: Length of a segment in frames. Minimum: 1. Maximum: Length of a segment in frames.
   * @return framesPerCmafChunk
   */
  public Object getFramesPerCmafChunk() {
    return framesPerCmafChunk;
  }

  /**
   * Number of media frames per CMAF chunk. Defaults to: Length of a segment in frames. Minimum: 1. Maximum: Length of a segment in frames.
   *
   * @param framesPerCmafChunk
   * Number of media frames per CMAF chunk. Defaults to: Length of a segment in frames. Minimum: 1. Maximum: Length of a segment in frames.
   */
  public void setFramesPerCmafChunk(Object framesPerCmafChunk) {
    this.framesPerCmafChunk = framesPerCmafChunk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CmafMuxing cmafMuxing = (CmafMuxing) o;
    return Objects.equals(this.segmentLength, cmafMuxing.segmentLength) &&
        Objects.equals(this.segmentNaming, cmafMuxing.segmentNaming) &&
        Objects.equals(this.segmentNamingTemplate, cmafMuxing.segmentNamingTemplate) &&
        Objects.equals(this.initSegmentName, cmafMuxing.initSegmentName) &&
        Objects.equals(this.initSegmentNameTemplate, cmafMuxing.initSegmentNameTemplate) &&
        Objects.equals(this.segmentsMuxed, cmafMuxing.segmentsMuxed) &&
        Objects.equals(this.framesPerCmafChunk, cmafMuxing.framesPerCmafChunk) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentLength, segmentNaming, segmentNamingTemplate, initSegmentName, initSegmentNameTemplate, segmentsMuxed, framesPerCmafChunk, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CmafMuxing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    segmentLength: ").append(toIndentedString(segmentLength)).append("\n");
    sb.append("    segmentNaming: ").append(toIndentedString(segmentNaming)).append("\n");
    sb.append("    segmentNamingTemplate: ").append(toIndentedString(segmentNamingTemplate)).append("\n");
    sb.append("    initSegmentName: ").append(toIndentedString(initSegmentName)).append("\n");
    sb.append("    initSegmentNameTemplate: ").append(toIndentedString(initSegmentNameTemplate)).append("\n");
    sb.append("    segmentsMuxed: ").append(toIndentedString(segmentsMuxed)).append("\n");
    sb.append("    framesPerCmafChunk: ").append(toIndentedString(framesPerCmafChunk)).append("\n");
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

