package com.dji.sdk.cloudapi.device;

/**
 * UOM (Unified Operational Mode) real-name authentication state reported by the drone via dock state topic.
 */
public class DockDroneUomRealNameState {

    private String uomRealNameState;

    public DockDroneUomRealNameState() {
    }

    @Override
    public String toString() {
        return "DockDroneUomRealNameState{" +
                "uomRealNameState='" + uomRealNameState + '\'' +
                '}';
    }

    public String getUomRealNameState() {
        return uomRealNameState;
    }

    public DockDroneUomRealNameState setUomRealNameState(String uomRealNameState) {
        this.uomRealNameState = uomRealNameState;
        return this;
    }
}
