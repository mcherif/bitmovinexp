package com.bitmovin.api.sdk.analytics.exports;

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

public class ExportsApi {

    private final ExportsApiClient apiClient;

    public ExportsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ExportsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ExportsApi
     */
    public static BitmovinApiBuilder<ExportsApi> builder() {
        return new BitmovinApiBuilder<>(ExportsApi.class);
    }
    
    /**
     * Create Export Task
     * 
     * @param analyticsExportTask The export task to be created (optional)
     * @return AnalyticsExportTaskDetails
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsExportTaskDetails create(AnalyticsExportTask analyticsExportTask) throws BitmovinException {
        return this.apiClient.create(analyticsExportTask).getData().getResult();
    }
    
    /**
     * Get export task
     * 
     * @param exportTaskId Export task id (required)
     * @return AnalyticsExportTaskDetails
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsExportTaskDetails get(String exportTaskId) throws BitmovinException {
        return this.apiClient.get(exportTaskId).getData().getResult();
    }
    
    /**
     * List Export Tasks
     * 
     * @return List&lt;AnalyticsExportTaskDetails&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsExportTaskDetails> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Export Tasks
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AnalyticsExportTaskDetails&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsExportTaskDetails> list(AnalyticsExportTaskDetailsListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface ExportsApiClient {
    
        @RequestLine("POST /analytics/exports")
        ResponseEnvelope<AnalyticsExportTaskDetails> create(AnalyticsExportTask analyticsExportTask) throws BitmovinException;
    
        @RequestLine("GET /analytics/exports/{export_task_id}")
        ResponseEnvelope<AnalyticsExportTaskDetails> get(@Param(value = "export_task_id") String exportTaskId) throws BitmovinException;
    
        @RequestLine("GET /analytics/exports")
        ResponseEnvelope<PaginationResponse<AnalyticsExportTaskDetails>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
