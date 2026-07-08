package com.dji.sdk.cloudapi.device;

/**
 * Camera watermark settings reported via dock drone state topic.
 */
public class DockDroneCameraWatermarkSettings {

    private RcCameraWatermarkSettings cameraWatermarkSettings;

    public DockDroneCameraWatermarkSettings() {
    }

    @Override
    public String toString() {
        return "DockDroneCameraWatermarkSettings{" +
                "cameraWatermarkSettings=" + cameraWatermarkSettings +
                '}';
    }

    public RcCameraWatermarkSettings getCameraWatermarkSettings() {
        return cameraWatermarkSettings;
    }

    public DockDroneCameraWatermarkSettings setCameraWatermarkSettings(RcCameraWatermarkSettings cameraWatermarkSettings) {
        this.cameraWatermarkSettings = cameraWatermarkSettings;
        return this;
    }
}
