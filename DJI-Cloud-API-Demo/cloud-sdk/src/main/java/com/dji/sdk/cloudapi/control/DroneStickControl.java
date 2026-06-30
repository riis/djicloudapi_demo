package com.dji.sdk.cloudapi.control;

import com.dji.sdk.common.BaseModel;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author sean
 * @version 1.7
 * @date 2023/6/29
 */
public class DroneStickControl extends BaseModel {

    @NotNull
    private Long seq;

    @Min(364)
    @Max(1684)
    private Integer roll;

    @Min(364)
    @Max(1684)
    private Integer pitch;

    @Min(364)
    @Max(1684)
    private Integer throttle;

    @Min(364)
    @Max(1684)
    private Integer yaw;

    public DroneStickControl() {
    }

    @Override
    public String toString() {
        return "DroneStickControl{" +
                "seq=" + seq +
                ", roll=" + roll +
                ", pitch=" + pitch +
                ", throttle=" + throttle +
                ", yaw=" + yaw +
                '}';
    }

    public Long getSeq() {
        return seq;
    }

    public DroneStickControl setSeq(Long seq) {
        this.seq = seq;
        return this;
    }

    public Integer getRoll() {
        return roll;
    }

    public DroneStickControl setRoll(Integer roll) {
        this.roll = roll;
        return this;
    }

    public Integer getPitch() {
        return pitch;
    }

    public DroneStickControl setPitch(Integer pitch) {
        this.pitch = pitch;
        return this;
    }

    public Integer getThrottle() {
        return throttle;
    }

    public DroneStickControl setThrottle(Integer throttle) {
        this.throttle = throttle;
        return this;
    }

    public Integer getYaw() {
        return yaw;
    }

    public DroneStickControl setYaw(Integer yaw) {
        this.yaw = yaw;
        return this;
    }
}

