package com.dji.sdk.cloudapi.control;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Payload for DRC up topic method: drc_camera_photo_info_push.
 * Published after each photo capture during a DRC (Direct Remote Control) session,
 * providing storage and file metadata for the captured image.
 */
public class DrcCameraPhotoInfoPush {

    @JsonProperty("payload_index")
    private String payloadIndex;

    /** Sequential index of the captured file on the aircraft's storage. */
    @JsonProperty("file_index")
    private Integer fileIndex;

    /** Number of files remaining in available storage. */
    @JsonProperty("storage_count")
    private Integer storageCount;

    public DrcCameraPhotoInfoPush() {
    }

    public String getPayloadIndex() {
        return payloadIndex;
    }

    public DrcCameraPhotoInfoPush setPayloadIndex(String payloadIndex) {
        this.payloadIndex = payloadIndex;
        return this;
    }

    public Integer getFileIndex() {
        return fileIndex;
    }

    public DrcCameraPhotoInfoPush setFileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }

    public Integer getStorageCount() {
        return storageCount;
    }

    public DrcCameraPhotoInfoPush setStorageCount(Integer storageCount) {
        this.storageCount = storageCount;
        return this;
    }

    @Override
    public String toString() {
        return "DrcCameraPhotoInfoPush{" +
                "payloadIndex='" + payloadIndex + '\'' +
                ", fileIndex=" + fileIndex +
                ", storageCount=" + storageCount +
                '}';
    }
}
