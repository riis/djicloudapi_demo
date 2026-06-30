package com.dji.sdk.cloudapi.device;

import java.util.List;

/**
 * PSDK UI resource state reported via dock state topic.
 */
public class DockDronePsdkUiResource {

    private List<Object> psdkUiResource;

    public DockDronePsdkUiResource() {
    }

    @Override
    public String toString() {
        return "DockDronePsdkUiResource{" +
                "psdkUiResource=" + psdkUiResource +
                '}';
    }

    public List<Object> getPsdkUiResource() {
        return psdkUiResource;
    }

    public DockDronePsdkUiResource setPsdkUiResource(List<Object> psdkUiResource) {
        this.psdkUiResource = psdkUiResource;
        return this;
    }
}
