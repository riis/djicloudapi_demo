package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jeff
 */
public class CloudControlAuthResult {

    @JsonProperty("is_cloud_control_auth")
    private Boolean isCloudControlAuth;

    public CloudControlAuthResult() {
    }

    @Override
    public String toString() {
        return "CloudControlAuthResult{" +
                "isCloudControlAuth=" + isCloudControlAuth +
                '}';
    }

    public Boolean getIsCloudControlAuth() {
        return isCloudControlAuth;
    }

    public CloudControlAuthResult setIsCloudControlAuth(Boolean isCloudControlAuth) {
        this.isCloudControlAuth = isCloudControlAuth;
        return this;
    }

}
