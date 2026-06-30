package com.dji.sdk.cloudapi.livestream;

import com.dji.sdk.cloudapi.device.PayloadIndex;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author sean.zhou
 * @date 2021/11/18
 * @version 0.1
 */
public class RcLiveCapacityCamera {

    /**
     * Total number of video streams that can be used for livestreaming
     * Total number of video streams that the camera can live stream
     */
    private Integer availableVideoNumber;

    /**
     * Maximum number of video streams that the camera can live stream at the same time.
     */
    private Integer coexistVideoNumberMax;

    /**
     * Camera index, composed of product type enumeration and gimbal index.
     */
    private PayloadIndex cameraIndex;

    private List<RcLiveCapacityVideo> videoList;

    @JsonProperty("availabe_camera_positions")
    private List<Integer> availableCameraPositions;

    @JsonProperty("camera_position")
    private Integer cameraPosition;

    public RcLiveCapacityCamera() {
    }

    @Override
    public String toString() {
        return "RcLiveCapacityCamera{" +
                "availableVideoNumber=" + availableVideoNumber +
                ", coexistVideoNumberMax=" + coexistVideoNumberMax +
                ", cameraIndex=" + cameraIndex +
                ", videoList=" + videoList +
                ", availableCameraPositions=" + availableCameraPositions +
                ", cameraPosition=" + cameraPosition +
                '}';
    }

    public Integer getAvailableVideoNumber() {
        return availableVideoNumber;
    }

    public RcLiveCapacityCamera setAvailableVideoNumber(Integer availableVideoNumber) {
        this.availableVideoNumber = availableVideoNumber;
        return this;
    }

    public Integer getCoexistVideoNumberMax() {
        return coexistVideoNumberMax;
    }

    public RcLiveCapacityCamera setCoexistVideoNumberMax(Integer coexistVideoNumberMax) {
        this.coexistVideoNumberMax = coexistVideoNumberMax;
        return this;
    }

    public PayloadIndex getCameraIndex() {
        return cameraIndex;
    }

    public RcLiveCapacityCamera setCameraIndex(PayloadIndex cameraIndex) {
        this.cameraIndex = cameraIndex;
        return this;
    }

    public List<RcLiveCapacityVideo> getVideoList() {
        return videoList;
    }

    public RcLiveCapacityCamera setVideoList(List<RcLiveCapacityVideo> videoList) {
        this.videoList = videoList;
        return this;
    }

    public List<Integer> getAvailableCameraPositions() {
        return availableCameraPositions;
    }

    public RcLiveCapacityCamera setAvailableCameraPositions(List<Integer> availableCameraPositions) {
        this.availableCameraPositions = availableCameraPositions;
        return this;
    }

    public Integer getCameraPosition() {
        return cameraPosition;
    }

    public RcLiveCapacityCamera setCameraPosition(Integer cameraPosition) {
        this.cameraPosition = cameraPosition;
        return this;
    }
}
