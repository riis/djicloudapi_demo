package com.dji.sdk.cloudapi.device;

import java.util.List;

/**
 * Aircraft camera information reported via RC state topic.
 */
public class RcCameras {

    private List<OsdCamera> cameras;

    public RcCameras() {
    }

    @Override
    public String toString() {
        return "RcCameras{" +
                "cameras=" + cameras +
                '}';
    }

    public List<OsdCamera> getCameras() {
        return cameras;
    }

    public RcCameras setCameras(List<OsdCamera> cameras) {
        this.cameras = cameras;
        return this;
    }
}
