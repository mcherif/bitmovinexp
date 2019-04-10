package com.bitmovin.api.sdk.notifications.state;

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

public class StateApi {

    private final StateApiClient apiClient;

    public StateApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StateApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of StateApi
     */
    public static BitmovinApiBuilder<StateApi> builder() {
        return new BitmovinApiBuilder<>(StateApi.class);
    }
    
    /**
     * List Notification State History (Specific Resource)
     * 
     * @param notificationId Id of the notification (required)
     * @param resourceId Id of the resource, e.g. encoding id (required)
     * @return List&lt;NotificationStateEntry&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<NotificationStateEntry> list(String notificationId, String resourceId) throws BitmovinException {
        return this.apiClient.list(notificationId, resourceId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Notification State History (Specific Resource)
     * 
     * @param notificationId Id of the notification (required)
     * @param resourceId Id of the resource, e.g. encoding id (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;NotificationStateEntry&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<NotificationStateEntry> list(String notificationId, String resourceId, NotificationStateEntryListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(notificationId, resourceId, queryParams).getData().getResult();
    }
    
    interface StateApiClient {
    
        @RequestLine("GET /notifications/{notification_id}/state/{resource_id}")
        ResponseEnvelope<PaginationResponse<NotificationStateEntry>> list(@Param(value = "notification_id") String notificationId, @Param(value = "resource_id") String resourceId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}