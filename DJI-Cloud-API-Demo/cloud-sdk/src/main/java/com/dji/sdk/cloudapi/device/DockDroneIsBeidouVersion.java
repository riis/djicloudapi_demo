package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Whether the drone is using a Beidou-specific firmware version.
 */
public class DockDroneIsBeidouVersion {

    @JsonProperty("is_beidou_version")
    private Boolean isBeidouVersion;

    public DockDroneIsBeidouVersion() {
    }

    @Override
    public String toString() {
        return "DockDroneIsBeidouVersion{" +
                "isBeidouVersion=" + isBeidouVersion +
                '}';
    }

    public Boolean getIsBeidouVersion() {
        return isBeidouVersion;
    }

    public DockDroneIsBeidouVersion setIsBeidouVersion(Boolean isBeidouVersion) {
        this.isBeidouVersion = isBeidouVersion;
        return this;
    }
}
