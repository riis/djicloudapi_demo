package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AR info switch state reported by the drone.
 * ar_info_switch: 0 = off, 1 = on
 *
 * @version 1.7
 */
public class DockDroneArInfoSwitch {

    @JsonProperty("ar_info_switch")
    private Integer arInfoSwitch;

    public DockDroneArInfoSwitch() {
    }

    @Override
    public String toString() {
        return "DockDroneArInfoSwitch{" +
                "arInfoSwitch=" + arInfoSwitch +
                '}';
    }

    public Integer getArInfoSwitch() {
        return arInfoSwitch;
    }

    public DockDroneArInfoSwitch setArInfoSwitch(Integer arInfoSwitch) {
        this.arInfoSwitch = arInfoSwitch;
        return this;
    }
}
