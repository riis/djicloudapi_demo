package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Remaining battery power required for the drone to return home.
 */
public class DockDroneRemainingPowerForReturnHome {

    @JsonProperty("remaining_power_for_return_home")
    private Integer remainingPowerForReturnHome;

    public DockDroneRemainingPowerForReturnHome() {
    }

    @Override
    public String toString() {
        return "DockDroneRemainingPowerForReturnHome{" +
                "remainingPowerForReturnHome=" + remainingPowerForReturnHome +
                '}';
    }

    public Integer getRemainingPowerForReturnHome() {
        return remainingPowerForReturnHome;
    }

    public DockDroneRemainingPowerForReturnHome setRemainingPowerForReturnHome(Integer remainingPowerForReturnHome) {
        this.remainingPowerForReturnHome = remainingPowerForReturnHome;
        return this;
    }
}
