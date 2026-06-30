package com.dji.sdk.config.version;

import com.fasterxml.jackson.annotation.JsonValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author sean
 * @version 1.7
 * @date 2023/5/19
 */
public enum DroneThingVersionEnum implements IThingVersion {

    V1_0_0("1.0.0", CloudSDKVersionEnum.V0_0_1),

    V1_1_0("1.1.0", CloudSDKVersionEnum.V1_0_0),

    V1_1_2("1.1.2", CloudSDKVersionEnum.V1_0_0),

    V1_1_3("1.1.3", CloudSDKVersionEnum.V1_0_2),

    V1_2_0("1.2.0", CloudSDKVersionEnum.V1_0_3),

    V1_3_1("1.3.1", CloudSDKVersionEnum.V1_1_0),

    V1_3_5("1.3.5", CloudSDKVersionEnum.V1_1_0),

    ;

    private static final DroneThingVersionEnum FALLBACK_VERSION = V1_3_5;
    
    private static final Logger log = LoggerFactory.getLogger(DroneThingVersionEnum.class);

    private final String thingVersion;

    private final CloudSDKVersionEnum cloudSDKVersion;

    DroneThingVersionEnum(String thingVersion, CloudSDKVersionEnum cloudSDKVersion) {
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

    public static DroneThingVersionEnum find(String thingVersion) {
        Optional<DroneThingVersionEnum> opt = Arrays.stream(values())
                .filter(thingVersionEnum -> thingVersionEnum.thingVersion.equals(thingVersion)).findAny();
        if (opt.isPresent()) {
            return opt.get();
        }
        log.warn("Unknown drone thing version: {}, falling back to latest supported version ({})",
                thingVersion, FALLBACK_VERSION.getThingVersion());
        return FALLBACK_VERSION;
    }
}
