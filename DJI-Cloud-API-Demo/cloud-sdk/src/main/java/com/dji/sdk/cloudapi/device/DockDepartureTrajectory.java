package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Departure trajectory state reported by Dock 3.
 */
public class DockDepartureTrajectory {

    @JsonProperty("departure_trajectory")
    private List<Object> departureTrajectory;

    public DockDepartureTrajectory() {
    }

    @Override
    public String toString() {
        return "DockDepartureTrajectory{" +
                "departureTrajectory=" + departureTrajectory +
                '}';
    }

    public List<Object> getDepartureTrajectory() {
        return departureTrajectory;
    }

    public DockDepartureTrajectory setDepartureTrajectory(List<Object> departureTrajectory) {
        this.departureTrajectory = departureTrajectory;
        return this;
    }
}
