package com.dji.sdk.cloudapi.device;

/**
 * Geo-caging status for the drone inside a dock.
 */
public class DockDroneGeoCagingStatus {

    private Integer state;

    public DockDroneGeoCagingStatus() {
    }

    @Override
    public String toString() {
        return "DockDroneGeoCagingStatus{" +
                "state=" + state +
                '}';
    }

    public Integer getState() {
        return state;
    }

    public DockDroneGeoCagingStatus setState(Integer state) {
        this.state = state;
        return this;
    }
}
