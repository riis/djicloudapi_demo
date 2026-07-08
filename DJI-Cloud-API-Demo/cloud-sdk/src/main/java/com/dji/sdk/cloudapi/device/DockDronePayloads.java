package com.dji.sdk.cloudapi.device;

import java.util.List;

/**
 * Payload devices attached to the drone, reported via dock state topic.
 */
public class DockDronePayloads {

    private List<DockDronePayload> payloads;

    public DockDronePayloads() {
    }

    @Override
    public String toString() {
        return "DockDronePayloads{" +
                "payloads=" + payloads +
                '}';
    }

    public List<DockDronePayload> getPayloads() {
        return payloads;
    }

    public DockDronePayloads setPayloads(List<DockDronePayload> payloads) {
        this.payloads = payloads;
        return this;
    }
}
