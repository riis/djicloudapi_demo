package com.dji.sdk.cloudapi.device;

import com.dji.sdk.exception.CloudSDKException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;

/**
 * @author jeff
 * @version ?
 * @date 2026/03/05
 */
@Schema(description = "RTCM device type", enumAsRef = true)
public enum DockRtcmDeviceTypeEnum {

    Dock(1);

    private final int deviceType;

    DockRtcmDeviceTypeEnum(int deviceType) {
        this.deviceType = deviceType;
    }

    @JsonValue
    public int getDeviceType() {
        return deviceType;
    }

    @JsonCreator
    public static DockRtcmDeviceTypeEnum find(int deviceType) {
        return Arrays.stream(values()).filter(typeEnum -> typeEnum.deviceType == deviceType).findAny()
                .orElseThrow(() -> new CloudSDKException(DockRtcmDeviceTypeEnum.class, deviceType));
    }
}
