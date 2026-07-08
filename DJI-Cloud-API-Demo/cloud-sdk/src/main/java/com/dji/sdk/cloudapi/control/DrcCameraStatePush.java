package com.dji.sdk.cloudapi.control;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Payload for DRC up topic method: drc_camera_state_push.
 * Published by the aircraft whenever the active camera lens or mode changes during
 * a DRC (Direct Remote Control) session. The {@code payloadIndex} identifies which
 * physical payload/lens is currently selected.
 */
public class DrcCameraStatePush {

    @JsonProperty("payload_index")
    private String payloadIndex;

    /** Camera mode: 0 = photo, 1 = video. */
    @JsonProperty("camera_mode")
    private Integer cameraMode;

    /** Current optical zoom factor (1.0 = no zoom). */
    @JsonProperty("zoom_factor")
    private Float zoomFactor;

    /** Current IR/thermal zoom factor (1.0 = no zoom). */
    @JsonProperty("ir_zoom_factor")
    private Float irZoomFactor;

    public DrcCameraStatePush() {
    }

    public String getPayloadIndex() {
        return payloadIndex;
    }

    public DrcCameraStatePush setPayloadIndex(String payloadIndex) {
        this.payloadIndex = payloadIndex;
        return this;
    }

    public Integer getCameraMode() {
        return cameraMode;
    }

    public DrcCameraStatePush setCameraMode(Integer cameraMode) {
        this.cameraMode = cameraMode;
        return this;
    }

    public Float getZoomFactor() {
        return zoomFactor;
    }

    public DrcCameraStatePush setZoomFactor(Float zoomFactor) {
        this.zoomFactor = zoomFactor;
        return this;
    }

    public Float getIrZoomFactor() {
        return irZoomFactor;
    }

    public DrcCameraStatePush setIrZoomFactor(Float irZoomFactor) {
        this.irZoomFactor = irZoomFactor;
        return this;
    }

    @Override
    public String toString() {
        return "DrcCameraStatePush{" +
                "payloadIndex='" + payloadIndex + '\'' +
                ", cameraMode=" + cameraMode +
                ", zoomFactor=" + zoomFactor +
                ", irZoomFactor=" + irZoomFactor +
                '}';
    }
}
