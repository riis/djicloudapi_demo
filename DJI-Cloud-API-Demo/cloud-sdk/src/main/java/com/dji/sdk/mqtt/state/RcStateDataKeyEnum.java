package com.dji.sdk.mqtt.state;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import com.dji.sdk.cloudapi.device.CloudControlAuthResult;
import com.dji.sdk.cloudapi.device.DongleInfos;
import com.dji.sdk.cloudapi.device.RcCameras;
import com.dji.sdk.cloudapi.device.FirmwareVersion;
import com.dji.sdk.cloudapi.device.PayloadFirmwareVersion;
import com.dji.sdk.cloudapi.device.PayloadModelConst;
import com.dji.sdk.cloudapi.device.RcCameraWatermarkSettings;
import com.dji.sdk.cloudapi.device.RcDroneControlSource;
import com.dji.sdk.cloudapi.device.RcLiveStatus;
import com.dji.sdk.cloudapi.device.WpmzVersion;
import com.dji.sdk.cloudapi.livestream.RcLivestreamAbilityUpdate;
import com.dji.sdk.exception.CloudSDKException;

/**
 *
 * @author sean.zhou
 * @date 2021/11/18
 * @version 0.1
 */
public enum RcStateDataKeyEnum {

    FIRMWARE_VERSION(Set.of("firmware_version"), FirmwareVersion.class),

    LIVE_CAPACITY(Set.of("live_capacity"), RcLivestreamAbilityUpdate.class),

    CONTROL_SOURCE(Set.of("control_source"), RcDroneControlSource.class),

    LIVE_STATUS(Set.of("live_status"), RcLiveStatus.class),

    PAYLOAD_FIRMWARE(PayloadModelConst.getAllModelWithPosition(), PayloadFirmwareVersion.class),

    DONGLE_INFOS(Set.of("dongle_infos"), DongleInfos.class),

    CAMERA_WATERMARK_SETTINGS(Set.of("camera_watermark_settings"), RcCameraWatermarkSettings.class),

    WPMZ_VERSION(Set.of("wpmz_version"),   WpmzVersion.class),

    IS_CLOUD_CONTROL_AUTH(Set.of("is_cloud_control_auth"), CloudControlAuthResult.class),

    CAMERAS(Set.of("cameras"), RcCameras.class),
    ;


    private final Set<String> keys;

    private final Class classType;


    RcStateDataKeyEnum(Set<String> keys, Class classType) {
        this.keys = keys;
        this.classType = classType;
    }

    public Class getClassType() {
        return classType;
    }

    public Set<String> getKeys() {
        return keys;
    }

    public static RcStateDataKeyEnum find(Set<String> keys) {
        return Arrays.stream(values()).filter(keyEnum -> !Collections.disjoint(keys, keyEnum.keys)).findAny()
                .orElseThrow(() -> new CloudSDKException(RcStateDataKeyEnum.class, keys));
    }

}
