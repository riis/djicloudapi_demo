package com.dji.sdk.cloudapi.device;

import com.dji.sdk.exception.CloudSDKException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;

/**
 * @author jeff
 * @version 1.7
 * @date 2023/5/26
 */
@Schema(description = "RTCM source type", enumAsRef = true)
public enum DockRtcmSourceTypeEnum {

    NotCalibrated(0),
    SelfConvergenceCalibration(1),
    ManualCalibration(2),
    NetworkRtkCalibration(3);

    private final int sourceType;

    DockRtcmSourceTypeEnum(int sourceType) {
        this.sourceType = sourceType;
    }

    @JsonValue
    public int getSourceType() {
        return sourceType;
    }

    @JsonCreator
    public static DockRtcmSourceTypeEnum find(int sourceType) {
        return Arrays.stream(values()).filter(typeEnum -> typeEnum.sourceType == sourceType).findAny()
                .orElseThrow(() -> new CloudSDKException(DockRtcmSourceTypeEnum.class, sourceType));
    }
}
