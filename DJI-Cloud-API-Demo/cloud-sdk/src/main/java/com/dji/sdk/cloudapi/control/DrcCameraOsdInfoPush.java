package com.dji.sdk.cloudapi.control;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Payload for DRC up topic method: drc_camera_osd_info_push.
 * Carries per-payload zoom factor data for the optical and IR lenses.
 */
public class DrcCameraOsdInfoPush {

    @JsonProperty("payload_index")
    private String payloadIndex;

    @JsonProperty("zoom_lense")
    private ZoomLense zoomLense;

    @JsonProperty("ir_lense")
    private IrLense irLense;

    public DrcCameraOsdInfoPush() {
    }

    public String getPayloadIndex() {
        return payloadIndex;
    }

    public DrcCameraOsdInfoPush setPayloadIndex(String payloadIndex) {
        this.payloadIndex = payloadIndex;
        return this;
    }

    public ZoomLense getZoomLense() {
        return zoomLense;
    }

    public DrcCameraOsdInfoPush setZoomLense(ZoomLense zoomLense) {
        this.zoomLense = zoomLense;
        return this;
    }

    public IrLense getIrLense() {
        return irLense;
    }

    public DrcCameraOsdInfoPush setIrLense(IrLense irLense) {
        this.irLense = irLense;
        return this;
    }

    @Override
    public String toString() {
        return "DrcCameraOsdInfoPush{" +
                "payloadIndex='" + payloadIndex + '\'' +
                ", zoomLense=" + zoomLense +
                ", irLense=" + irLense +
                '}';
    }

    public static class ZoomLense {

        @JsonProperty("zoom_factor")
        private Float zoomFactor;

        public ZoomLense() {
        }

        public Float getZoomFactor() {
            return zoomFactor;
        }

        public ZoomLense setZoomFactor(Float zoomFactor) {
            this.zoomFactor = zoomFactor;
            return this;
        }

        @Override
        public String toString() {
            return "ZoomLense{zoomFactor=" + zoomFactor + '}';
        }
    }

    public static class IrLense {

        @JsonProperty("ir_zoom_factor")
        private Float irZoomFactor;

        public IrLense() {
        }

        public Float getIrZoomFactor() {
            return irZoomFactor;
        }

        public IrLense setIrZoomFactor(Float irZoomFactor) {
            this.irZoomFactor = irZoomFactor;
            return this;
        }

        @Override
        public String toString() {
            return "IrLense{irZoomFactor=" + irZoomFactor + '}';
        }
    }
}
