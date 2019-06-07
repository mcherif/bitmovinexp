package com.bitmovin.api.sdk.encoding.configurations.video.vp8;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import feign.Body;
import feign.Headers;

import com.bitmovin.api.sdk.model.*;
import com.bitmovin.api.sdk.common.BitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.configurations.video.vp8.customdata.CustomdataApi;

public class Vp8Api {
    public final CustomdataApi customdata;

    private final Vp8ApiClient apiClient;

    public Vp8Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Vp8ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Vp8Api
     */
    public static BitmovinApiBuilder<Vp8Api> builder() {
        return new BitmovinApiBuilder<>(Vp8Api.class);
    }
    
    /**
     * Create VP8 Codec Configuration
     * 
     * @param vp8VideoConfiguration  (required)
     * @return Vp8VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Vp8VideoConfiguration create(Vp8VideoConfiguration vp8VideoConfiguration) throws BitmovinException {
        return this.apiClient.create(vp8VideoConfiguration).getData().getResult();
    }
    
    /**
     * Delete VP8 Codec Configuration
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String configurationId) throws BitmovinException {
        return this.apiClient.delete(configurationId).getData().getResult();
    }
    
    /**
     * VP8 Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return Vp8VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Vp8VideoConfiguration get(String configurationId) throws BitmovinException {
        return this.apiClient.get(configurationId).getData().getResult();
    }
    
    /**
     * 
     * 
     * @return List&lt;Vp8VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Vp8VideoConfiguration> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * 
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Vp8VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Vp8VideoConfiguration> list(Vp8VideoConfigurationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface Vp8ApiClient {
    
        @RequestLine("POST /encoding/configurations/video/vp8")
        ResponseEnvelope<Vp8VideoConfiguration> create(Vp8VideoConfiguration vp8VideoConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/video/vp8/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/vp8/{configuration_id}")
        ResponseEnvelope<Vp8VideoConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/vp8")
        ResponseEnvelope<PaginationResponse<Vp8VideoConfiguration>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
