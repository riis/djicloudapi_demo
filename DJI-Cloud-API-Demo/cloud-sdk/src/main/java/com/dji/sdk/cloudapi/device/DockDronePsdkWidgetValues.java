package com.dji.sdk.cloudapi.device;

import java.util.List;

/**
 * PSDK widget values state reported via dock state topic.
 */
public class DockDronePsdkWidgetValues {

    private List<Object> psdkWidgetValues;

    public DockDronePsdkWidgetValues() {
    }

    @Override
    public String toString() {
        return "DockDronePsdkWidgetValues{" +
                "psdkWidgetValues=" + psdkWidgetValues +
                '}';
    }

    public List<Object> getPsdkWidgetValues() {
        return psdkWidgetValues;
    }

    public DockDronePsdkWidgetValues setPsdkWidgetValues(List<Object> psdkWidgetValues) {
        this.psdkWidgetValues = psdkWidgetValues;
        return this;
    }
}
