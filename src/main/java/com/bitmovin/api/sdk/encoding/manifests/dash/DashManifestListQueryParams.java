package com.bitmovin.api.sdk.encoding.manifests.dash;

import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class DashManifestListQueryParams extends HashMap<String, Object> {

    public Integer getOffset() {
        return (Integer) this.get("offset");
    }

    /**
    * @param offset Index of the first item to return, starting at 0. Default is 0 (optional)
    */
    public void setOffset(Integer offset) {
        this.put("offset", offset);
    }

    public Integer getLimit() {
        return (Integer) this.get("limit");
    }

    /**
    * @param limit Maximum number of items to return. Default is 25, maximum is 100 (optional)
    */
    public void setLimit(Integer limit) {
        this.put("limit", limit);
    }

    public String getEncodingId() {
        return (String) this.get("encodingId");
    }

    /**
    * @param encodingId Get the manifests that belong to that encoding id (optional)
    */
    public void setEncodingId(String encodingId) {
        this.put("encodingId", encodingId);
    }
}
