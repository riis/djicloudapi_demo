package com.dji.sdk.config.version;

import com.fasterxml.jackson.annotation.JsonValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author jeff
 * @version ?
 * @date 2026/6/30
 */
public enum Dock3ThingVersionEnum implements IThingVersion {

    V1_3_5("1.3.5", CloudSDKVersionEnum.V1_1_0),

    ;

    private static final Logger log = LoggerFactory.getLogger(Dock3ThingVersionEnum.class);

    private final String thingVersion;

    private final CloudSDKVersionEnum cloudSDKVersion;

    Dock3ThingVersionEnum(String thingVersion, CloudSDKVersionEnum cloudSDKVersion) {
        this.thingVersion = thingVersion;
        this.cloudSDKVersion = cloudSDKVersion;
    }

    @JsonValue
    public String getThingVersion() {
        return thingVersion;
    }

    public CloudSDKVersionEnum getCloudSDKVersion() {
        return cloudSDKVersion;
    }

    public static Dock3ThingVersionEnum find(String thingVersion) {
        return Arrays.stream(values()).filter(thingVersionEnum -> thingVersionEnum.thingVersion.equals(thingVersion))
                .findAny().orElseGet(() -> {
                    log.warn("Unknown Dock 3 thing version: {}, falling back to latest supported version ({})",
                            thingVersion, V1_3_5.getThingVersion());
                    return V1_3_5;
                });
    }
}
