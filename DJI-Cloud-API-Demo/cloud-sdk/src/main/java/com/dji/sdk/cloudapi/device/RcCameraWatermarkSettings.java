package com.dji.sdk.cloudapi.device;

import com.dji.sdk.exception.CloudSDKException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

/**
 * @author jeff
 * @apiNote User configuration for watermarks on photos and video files taken by the camera. Currently, live stream watermarks are not supported.
 */
public class RcCameraWatermarkSettings {

    public enum EnableEnum {
        DISABLE(0),
        ENABLE(1);

        private final int value;

        EnableEnum(int value) {
            this.value = value;
        }

        @JsonValue
        public int getValue() {
            return value;
        }

        @JsonCreator
        public static EnableEnum find(int value) {
            return Arrays.stream(values()).filter(e -> e.value == value).findAny()
                    .orElseThrow(() -> new CloudSDKException(EnableEnum.class, value));
        }
    }

    public enum LayoutEnum {
        TOP_LEFT(0),
        BOTTOM_LEFT(1),
        TOP_RIGHT(2),
        BOTTOM_RIGHT(3);

        private final int value;

        LayoutEnum(int value) {
            this.value = value;
        }

        @JsonValue
        public int getValue() {
            return value;
        }

        @JsonCreator
        public static LayoutEnum find(int value) {
            return Arrays.stream(values()).filter(e -> e.value == value).findAny()
                    .orElseThrow(() -> new CloudSDKException(LayoutEnum.class, value));
        }
    }

    @JsonProperty("global_enable")
    private EnableEnum globalEnable;

    @JsonProperty("drone_type_enable")
    private EnableEnum droneTypeEnable;

    @JsonProperty("drone_sn_enable")
    private EnableEnum droneSnEnable;

    @JsonProperty("datetime_enable")
    private EnableEnum datetimeEnable;

    @JsonProperty("gps_enable")
    private EnableEnum gpsEnable;

    @JsonProperty("user_custom_string_enable")
    private EnableEnum userCustomStringEnable;

    @JsonProperty("user_custom_string")
    private String userCustomString;

    @JsonProperty("layout")
    private LayoutEnum layout;

    public RcCameraWatermarkSettings() {
    }

    @Override
    public String toString() {
        return "RcCameraWatermarkSettings{" +
                "globalEnable=" + globalEnable +
                ", droneTypeEnable=" + droneTypeEnable +
                ", droneSnEnable=" + droneSnEnable +
                ", datetimeEnable=" + datetimeEnable +
                ", gpsEnable=" + gpsEnable +
                ", userCustomStringEnable=" + userCustomStringEnable +
                ", userCustomString='" + userCustomString + '\'' +
                ", layout=" + layout +
                '}';
    }

    public EnableEnum getGlobalEnable() {
        return globalEnable;
    }

    public RcCameraWatermarkSettings setGlobalEnable(EnableEnum globalEnable) {
        this.globalEnable = globalEnable;
        return this;
    }

    public EnableEnum getDroneTypeEnable() {
        return droneTypeEnable;
    }

    public RcCameraWatermarkSettings setDroneTypeEnable(EnableEnum droneTypeEnable) {
        this.droneTypeEnable = droneTypeEnable;
        return this;
    }

    public EnableEnum getDroneSnEnable() {
        return droneSnEnable;
    }

    public RcCameraWatermarkSettings setDroneSnEnable(EnableEnum droneSnEnable) {
        this.droneSnEnable = droneSnEnable;
        return this;
    }

    public EnableEnum getDatetimeEnable() {
        return datetimeEnable;
    }

    public RcCameraWatermarkSettings setDatetimeEnable(EnableEnum datetimeEnable) {
        this.datetimeEnable = datetimeEnable;
        return this;
    }

    public EnableEnum getGpsEnable() {
        return gpsEnable;
    }

    public RcCameraWatermarkSettings setGpsEnable(EnableEnum gpsEnable) {
        this.gpsEnable = gpsEnable;
        return this;
    }

    public EnableEnum getUserCustomStringEnable() {
        return userCustomStringEnable;
    }

    public RcCameraWatermarkSettings setUserCustomStringEnable(EnableEnum userCustomStringEnable) {
        this.userCustomStringEnable = userCustomStringEnable;
        return this;
    }

    public String getUserCustomString() {
        return userCustomString;
    }

    public RcCameraWatermarkSettings setUserCustomString(String userCustomString) {
        this.userCustomString = userCustomString;
        return this;
    }

    public LayoutEnum getLayout() {
        return layout;
    }

    public RcCameraWatermarkSettings setLayout(LayoutEnum layout) {
        this.layout = layout;
        return this;
    }
}
