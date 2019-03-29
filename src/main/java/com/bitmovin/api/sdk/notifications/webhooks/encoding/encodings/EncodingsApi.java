package com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.finished.FinishedApi;
import com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.error.ErrorApi;

public class EncodingsApi {
    public final FinishedApi finished;
    public final ErrorApi error;

    public EncodingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.finished = new FinishedApi(clientFactory);
        this.error = new ErrorApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EncodingsApi
     */
    public static BitmovinApiBuilder<EncodingsApi> builder() {
        return new BitmovinApiBuilder<>(EncodingsApi.class);
    }
    
    
}
