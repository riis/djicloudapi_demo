package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UOM (Unmanned Operations Management) real-name verification tag reported by the drone.
 */
public class DockDroneUomRealNameTag {

    @JsonProperty("uom_real_name_tag")
    private String uomRealNameTag;

    public DockDroneUomRealNameTag() {
    }

    @Override
    public String toString() {
        return "DockDroneUomRealNameTag{" +
                "uomRealNameTag='" + uomRealNameTag + '\'' +
                '}';
    }

    public String getUomRealNameTag() {
        return uomRealNameTag;
    }

    public DockDroneUomRealNameTag setUomRealNameTag(String uomRealNameTag) {
        this.uomRealNameTag = uomRealNameTag;
        return this;
    }
}
