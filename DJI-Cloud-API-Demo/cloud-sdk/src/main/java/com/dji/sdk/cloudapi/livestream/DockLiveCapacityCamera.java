package com.dji.sdk.cloudapi.livestream;

import com.dji.sdk.cloudapi.device.PayloadIndex;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author sean.zhou
 * @date 2021/11/18
 * @version 0.1
 */
public class DockLiveCapacityCamera {

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

    private List<DockLiveCapacityVideo> videoList;

    @JsonProperty("availabe_camera_positions")
    private List<Integer> availableCameraPositions;

    @JsonProperty("camera_position")
    private Integer cameraPosition;

    public DockLiveCapacityCamera() {
    }

    @Override
    public String toString() {
        return "DockLiveCapacityCamera{" +
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

    public DockLiveCapacityCamera setAvailableVideoNumber(Integer availableVideoNumber) {
        this.availableVideoNumber = availableVideoNumber;
        return this;
    }

    public Integer getCoexistVideoNumberMax() {
        return coexistVideoNumberMax;
    }

    public DockLiveCapacityCamera setCoexistVideoNumberMax(Integer coexistVideoNumberMax) {
        this.coexistVideoNumberMax = coexistVideoNumberMax;
        return this;
    }

    public PayloadIndex getCameraIndex() {
        return cameraIndex;
    }

    public DockLiveCapacityCamera setCameraIndex(PayloadIndex cameraIndex) {
        this.cameraIndex = cameraIndex;
        return this;
    }

    public List<DockLiveCapacityVideo> getVideoList() {
        return videoList;
    }

    public DockLiveCapacityCamera setVideoList(List<DockLiveCapacityVideo> videoList) {
        this.videoList = videoList;
        return this;
    }

    public List<Integer> getAvailableCameraPositions() {
        return availableCameraPositions;
    }

    public DockLiveCapacityCamera setAvailableCameraPositions(List<Integer> availableCameraPositions) {
        this.availableCameraPositions = availableCameraPositions;
        return this;
    }

    public Integer getCameraPosition() {
        return cameraPosition;
    }

    public DockLiveCapacityCamera setCameraPosition(Integer cameraPosition) {
        this.cameraPosition = cameraPosition;
        return this;
    }
}
