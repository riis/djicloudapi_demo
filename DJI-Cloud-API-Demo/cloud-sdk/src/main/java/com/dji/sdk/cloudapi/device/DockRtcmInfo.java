package com.dji.sdk.cloudapi.device;

import com.dji.sdk.common.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * @author jeff
 * @version ?
 * @date 2026/03/05
 */
public class DockRtcmInfo extends BaseModel {

    @NotNull
    @JsonProperty("mount_point")
    private String mountPoint;

    @NotNull
    @JsonProperty("port")
    private String port;

    @NotNull
    @JsonProperty("host")
    private String host;

    @NotNull
    @JsonProperty("rtcm_device_type")
    private DockRtcmDeviceTypeEnum rtcmDeviceType;

    @NotNull
    @JsonProperty("source_type")
    private DockRtcmSourceTypeEnum sourceType;

    public DockRtcmInfo() {
    }

    @Override
    public String toString() {
        return "DockRtcmInfo{" +
                "mountPoint='" + mountPoint + '\'' +
                ", port='" + port + '\'' +
                ", host='" + host + '\'' +
                ", rtcmDeviceType=" + rtcmDeviceType +
                ", sourceType=" + sourceType +
                '}';
    }

    public String getMountPoint() {
        return mountPoint;
    }

    public DockRtcmInfo setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    public String getPort() {
        return port;
    }

    public DockRtcmInfo setPort(String port) {
        this.port = port;
        return this;
    }

    public String getHost() {
        return host;
    }

    public DockRtcmInfo setHost(String host) {
        this.host = host;
        return this;
    }

    public DockRtcmDeviceTypeEnum getRtcmDeviceType() {
        return rtcmDeviceType;
    }

    public DockRtcmInfo setRtcmDeviceType(DockRtcmDeviceTypeEnum rtcmDeviceType) {
        this.rtcmDeviceType = rtcmDeviceType;
        return this;
    }

    public DockRtcmSourceTypeEnum getSourceType() {
        return sourceType;
    }

    public DockRtcmInfo setSourceType(DockRtcmSourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
}
