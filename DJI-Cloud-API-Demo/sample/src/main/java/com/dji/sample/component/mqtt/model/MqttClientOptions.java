package com.dji.sample.component.mqtt.model;

import lombok.Data;

/**
 * @author sean
 * @version 1.3
 * @date 2023/1/18
 */
@Data
public class MqttClientOptions {

    private MqttProtocolEnum protocol;

    private String host;

    private Integer port;

    /**
     * The host advertised to clients/devices (Pilot app, web UI, docks/drones) so they can reach
     * the broker. When the backend runs in Docker it connects to {@link #host} over the internal
     * network (e.g. "emqx"), while external clients on the LAN must use a routable address
     * configured here. Falls back to {@link #host} when not set.
     */
    private String publicHost;

    /**
     * The port advertised to clients/devices. Falls back to {@link #port} when not set.
     */
    private Integer publicPort;

    private String username;

    private String password;

    private String clientId;

    private String path;

    /**
     * The topic to subscribe to immediately when client connects. Only required for basic link.
     */
    private String inboundTopic;
}
