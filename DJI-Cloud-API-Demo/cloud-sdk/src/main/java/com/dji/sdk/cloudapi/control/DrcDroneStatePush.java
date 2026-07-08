package com.dji.sdk.cloudapi.control;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Payload for DRC up topic method: drc_drone_state_push.
 * Published at high frequency during a DRC (Direct Remote Control) session,
 * containing real-time aircraft position and attitude data.
 */
public class DrcDroneStatePush {

    @JsonProperty("longitude")
    private Double longitude;

    @JsonProperty("latitude")
    private Double latitude;

    /** Height above takeoff point in metres. */
    @JsonProperty("height")
    private Double height;

    /** Horizontal ground speed in m/s. */
    @JsonProperty("horizontal_speed")
    private Double horizontalSpeed;

    /** Vertical speed in m/s (positive = ascending). */
    @JsonProperty("vertical_speed")
    private Double verticalSpeed;

    /** Aircraft pitch in degrees. */
    @JsonProperty("attitude_pitch")
    private Double attitudePitch;

    /** Aircraft roll in degrees. */
    @JsonProperty("attitude_roll")
    private Double attitudeRoll;

    /** Aircraft heading in degrees (-180..180, 0 = North). */
    @JsonProperty("attitude_head")
    private Double attitudeHead;

    public DrcDroneStatePush() {
    }

    public Double getLongitude() {
        return longitude;
    }

    public DrcDroneStatePush setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public DrcDroneStatePush setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Double getHeight() {
        return height;
    }

    public DrcDroneStatePush setHeight(Double height) {
        this.height = height;
        return this;
    }

    public Double getHorizontalSpeed() {
        return horizontalSpeed;
    }

    public DrcDroneStatePush setHorizontalSpeed(Double horizontalSpeed) {
        this.horizontalSpeed = horizontalSpeed;
        return this;
    }

    public Double getVerticalSpeed() {
        return verticalSpeed;
    }

    public DrcDroneStatePush setVerticalSpeed(Double verticalSpeed) {
        this.verticalSpeed = verticalSpeed;
        return this;
    }

    public Double getAttitudePitch() {
        return attitudePitch;
    }

    public DrcDroneStatePush setAttitudePitch(Double attitudePitch) {
        this.attitudePitch = attitudePitch;
        return this;
    }

    public Double getAttitudeRoll() {
        return attitudeRoll;
    }

    public DrcDroneStatePush setAttitudeRoll(Double attitudeRoll) {
        this.attitudeRoll = attitudeRoll;
        return this;
    }

    public Double getAttitudeHead() {
        return attitudeHead;
    }

    public DrcDroneStatePush setAttitudeHead(Double attitudeHead) {
        this.attitudeHead = attitudeHead;
        return this;
    }

    @Override
    public String toString() {
        return "DrcDroneStatePush{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", height=" + height +
                ", horizontalSpeed=" + horizontalSpeed +
                ", verticalSpeed=" + verticalSpeed +
                ", attitudePitch=" + attitudePitch +
                ", attitudeRoll=" + attitudeRoll +
                ", attitudeHead=" + attitudeHead +
                '}';
    }
}
