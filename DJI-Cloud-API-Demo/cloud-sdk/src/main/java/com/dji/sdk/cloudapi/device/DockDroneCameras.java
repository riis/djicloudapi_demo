package com.dji.sdk.cloudapi.device;

import java.util.List;

/**
 * Aircraft camera information reported via dock state topic.
 */
public class DockDroneCameras {

    private List<OsdCamera> cameras;

    public DockDroneCameras() {
    }

    @Override
    public String toString() {
        return "DockDroneCameras{" +
                "cameras=" + cameras +
                '}';
    }

    public List<OsdCamera> getCameras() {
        return cameras;
    }

    public DockDroneCameras setCameras(List<OsdCamera> cameras) {
        this.cameras = cameras;
        return this;
    }
}
