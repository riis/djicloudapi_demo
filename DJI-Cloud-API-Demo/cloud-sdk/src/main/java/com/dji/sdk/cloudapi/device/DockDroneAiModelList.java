package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * List of AI models loaded on the drone.
 */
public class DockDroneAiModelList {

    @JsonProperty("ai_model_list")
    private List<Object> aiModelList;

    public DockDroneAiModelList() {
    }

    @Override
    public String toString() {
        return "DockDroneAiModelList{" +
                "aiModelList=" + aiModelList +
                '}';
    }

    public List<Object> getAiModelList() {
        return aiModelList;
    }

    public DockDroneAiModelList setAiModelList(List<Object> aiModelList) {
        this.aiModelList = aiModelList;
        return this;
    }
}
