package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AbstractCondition;
import com.bitmovin.api.sdk.model.AppliedStreamSettings;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.DecodingErrorMode;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.StreamInput;
import com.bitmovin.api.sdk.model.StreamMetadata;
import com.bitmovin.api.sdk.model.StreamMode;
import com.bitmovin.api.sdk.model.StreamPerTitleSettings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Stream
 */

public class Stream extends BitmovinResource {
  @JsonProperty("inputStreams")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StreamInput> inputStreams = new ArrayList<StreamInput>();

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutput> outputs = new ArrayList<EncodingOutput>();

  @JsonProperty("createQualityMetaData")
  private Boolean createQualityMetaData;

  @JsonProperty("codecConfigId")
  private String codecConfigId;

  @JsonProperty("segmentsEncoded")
  private Integer segmentsEncoded;

  @JsonProperty("conditions")
  private AbstractCondition conditions;

  @JsonProperty("ignoredBy")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Ignoring> ignoredBy = new ArrayList<Ignoring>();

  @JsonProperty("mode")
  private StreamMode mode;

  @JsonProperty("selectedEncodingMode")
  private EncodingMode selectedEncodingMode;

  @JsonProperty("perTitleSettings")
  private StreamPerTitleSettings perTitleSettings;

  @JsonProperty("metadata")
  private StreamMetadata metadata;

  @JsonProperty("decodingErrorMode")
  private DecodingErrorMode decodingErrorMode;

  @JsonProperty("appliedSettings")
  private AppliedStreamSettings appliedSettings;


  public Stream addInputStreamsItem(StreamInput inputStreamsItem) {
    this.inputStreams.add(inputStreamsItem);
    return this;
  }

  /**
   * Get inputStreams
   * @return inputStreams
   */
  public List<StreamInput> getInputStreams() {
    return inputStreams;
  }

  /**
   * Set inputStreams
   *
   * @param inputStreams
   */
  public void setInputStreams(List<StreamInput> inputStreams) {
    this.inputStreams = inputStreams;
  }


  public Stream addOutputsItem(EncodingOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  public List<EncodingOutput> getOutputs() {
    return outputs;
  }

  /**
   * Set outputs
   *
   * @param outputs
   */
  public void setOutputs(List<EncodingOutput> outputs) {
    this.outputs = outputs;
  }


  /**
   * Set true to create quality metadata for this stream
   * @return createQualityMetaData
   */
  public Boolean getCreateQualityMetaData() {
    return createQualityMetaData;
  }

  /**
   * Set true to create quality metadata for this stream
   *
   * @param createQualityMetaData
   *        Set true to create quality metadata for this stream
   */
  public void setCreateQualityMetaData(Boolean createQualityMetaData) {
    this.createQualityMetaData = createQualityMetaData;
  }


  /**
   * Id of the codec configuration (required)
   * @return codecConfigId
   */
  public String getCodecConfigId() {
    return codecConfigId;
  }

  /**
   * Id of the codec configuration (required)
   *
   * @param codecConfigId
   *        Id of the codec configuration (required)
   */
  public void setCodecConfigId(String codecConfigId) {
    this.codecConfigId = codecConfigId;
  }

  /**
   * Number of encoded segments. Available after encoding finishes.
   * @return segmentsEncoded
   */
  public Integer getSegmentsEncoded() {
    return segmentsEncoded;
  }


  /**
   * Conditions to evaluate before creating the stream. If this evaluation fails, the stream won&#39;t be created. All muxings that depend on the stream will also not be created.
   * @return conditions
   */
  public AbstractCondition getConditions() {
    return conditions;
  }

  /**
   * Conditions to evaluate before creating the stream. If this evaluation fails, the stream won&#39;t be created. All muxings that depend on the stream will also not be created.
   *
   * @param conditions
   *        Conditions to evaluate before creating the stream. If this evaluation fails, the stream won&#39;t be created. All muxings that depend on the stream will also not be created.
   */
  public void setConditions(AbstractCondition conditions) {
    this.conditions = conditions;
  }


  public Stream addIgnoredByItem(Ignoring ignoredByItem) {
    this.ignoredBy.add(ignoredByItem);
    return this;
  }

  /**
   * If this is set and contains objects, then this stream has been ignored during the encoding process
   * @return ignoredBy
   */
  public List<Ignoring> getIgnoredBy() {
    return ignoredBy;
  }

  /**
   * If this is set and contains objects, then this stream has been ignored during the encoding process
   *
   * @param ignoredBy
   *        If this is set and contains objects, then this stream has been ignored during the encoding process
   */
  public void setIgnoredBy(List<Ignoring> ignoredBy) {
    this.ignoredBy = ignoredBy;
  }


  /**
   * Mode of the stream
   * @return mode
   */
  public StreamMode getMode() {
    return mode;
  }

  /**
   * Mode of the stream
   *
   * @param mode
   *        Mode of the stream
   */
  public void setMode(StreamMode mode) {
    this.mode = mode;
  }

  /**
   * The encoding mode of the stream which was applied by the assigned codec configuration
   * @return selectedEncodingMode
   */
  public EncodingMode getSelectedEncodingMode() {
    return selectedEncodingMode;
  }


  /**
   * Settings to configure Per-Title on stream level
   * @return perTitleSettings
   */
  public StreamPerTitleSettings getPerTitleSettings() {
    return perTitleSettings;
  }

  /**
   * Settings to configure Per-Title on stream level
   *
   * @param perTitleSettings
   *        Settings to configure Per-Title on stream level
   */
  public void setPerTitleSettings(StreamPerTitleSettings perTitleSettings) {
    this.perTitleSettings = perTitleSettings;
  }


  /**
   * Get metadata
   * @return metadata
   */
  public StreamMetadata getMetadata() {
    return metadata;
  }

  /**
   * Set metadata
   *
   * @param metadata
   */
  public void setMetadata(StreamMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   * Determines how to react to errors during decoding
   * @return decodingErrorMode
   */
  public DecodingErrorMode getDecodingErrorMode() {
    return decodingErrorMode;
  }

  /**
   * Determines how to react to errors during decoding
   *
   * @param decodingErrorMode
   *        Determines how to react to errors during decoding
   */
  public void setDecodingErrorMode(DecodingErrorMode decodingErrorMode) {
    this.decodingErrorMode = decodingErrorMode;
  }

  /**
   * Contains stream properties which may not have been defined in the configuration
   * @return appliedSettings
   */
  public AppliedStreamSettings getAppliedSettings() {
    return appliedSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stream stream = (Stream) o;
    return Objects.equals(this.inputStreams, stream.inputStreams) &&
        Objects.equals(this.outputs, stream.outputs) &&
        Objects.equals(this.createQualityMetaData, stream.createQualityMetaData) &&
        Objects.equals(this.codecConfigId, stream.codecConfigId) &&
        Objects.equals(this.segmentsEncoded, stream.segmentsEncoded) &&
        Objects.equals(this.conditions, stream.conditions) &&
        Objects.equals(this.ignoredBy, stream.ignoredBy) &&
        Objects.equals(this.mode, stream.mode) &&
        Objects.equals(this.selectedEncodingMode, stream.selectedEncodingMode) &&
        Objects.equals(this.perTitleSettings, stream.perTitleSettings) &&
        Objects.equals(this.metadata, stream.metadata) &&
        Objects.equals(this.decodingErrorMode, stream.decodingErrorMode) &&
        Objects.equals(this.appliedSettings, stream.appliedSettings) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputStreams, outputs, createQualityMetaData, codecConfigId, segmentsEncoded, conditions, ignoredBy, mode, selectedEncodingMode, perTitleSettings, metadata, decodingErrorMode, appliedSettings, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputStreams: ").append(toIndentedString(inputStreams)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    createQualityMetaData: ").append(toIndentedString(createQualityMetaData)).append("\n");
    sb.append("    codecConfigId: ").append(toIndentedString(codecConfigId)).append("\n");
    sb.append("    segmentsEncoded: ").append(toIndentedString(segmentsEncoded)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    ignoredBy: ").append(toIndentedString(ignoredBy)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    selectedEncodingMode: ").append(toIndentedString(selectedEncodingMode)).append("\n");
    sb.append("    perTitleSettings: ").append(toIndentedString(perTitleSettings)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    decodingErrorMode: ").append(toIndentedString(decodingErrorMode)).append("\n");
    sb.append("    appliedSettings: ").append(toIndentedString(appliedSettings)).append("\n");
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

