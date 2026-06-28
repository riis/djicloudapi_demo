package com.dji.sample.component.mqtt.config;

import com.auth0.jwt.algorithms.Algorithm;
import com.dji.sample.common.util.JwtUtil;
import com.dji.sample.component.mqtt.model.MqttClientOptions;
import com.dji.sample.component.mqtt.model.MqttProtocolEnum;
import com.dji.sample.component.mqtt.model.MqttUseEnum;
import com.dji.sdk.cloudapi.control.DrcModeMqttBroker;
import lombok.Data;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 *
 * @author sean.zhou
 * @date 2021/11/10
 * @version 0.1
 */
@Configuration
@Data
@ConfigurationProperties
public class MqttPropertyConfiguration {

    private static Map<MqttUseEnum, MqttClientOptions> mqtt;

    public void setMqtt(Map<MqttUseEnum, MqttClientOptions> mqtt) {
        MqttPropertyConfiguration.mqtt = mqtt;
    }

    /**
     * Get the configuration options of the basic link of the mqtt client.
     * @return
     */
    static MqttClientOptions getBasicClientOptions() {
        if (!mqtt.containsKey(MqttUseEnum.BASIC)) {
            throw new Error("Please configure the basic mqtt connection parameters first, otherwise application cannot be started.");
        }
        return mqtt.get(MqttUseEnum.BASIC);
    }

    /**
     * Get the mqtt address of the basic link used by the backend to connect to the broker.
     * In containerized deployments this is the internal/in-network address (e.g. "emqx").
     * @return
     */
    public static String getBasicMqttAddress() {
        return getMqttAddress(getBasicClientOptions());
    }

    /**
     * Get the mqtt address of the basic link advertised to clients/devices (Pilot app, web UI,
     * docks/drones). This may differ from {@link #getBasicMqttAddress()} when the backend reaches
     * the broker over an internal network while clients must use a LAN-routable address.
     * @return
     */
    public static String getExternalBasicMqttAddress() {
        return getExternalMqttAddress(getBasicClientOptions());
    }

    /**
     * Splice the mqtt address the backend uses to connect, from the client's connection host/port.
     * @param options
     * @return
     */
    private static String getMqttAddress(MqttClientOptions options) {
        return buildMqttAddress(options.getProtocol(), options.getHost(), options.getPort(), options.getPath());
    }

    /**
     * Splice the mqtt address advertised to external clients, preferring the public host/port and
     * falling back to the connection host/port when they are not configured.
     * @param options
     * @return
     */
    private static String getExternalMqttAddress(MqttClientOptions options) {
        String host = StringUtils.hasText(options.getPublicHost()) ? options.getPublicHost() : options.getHost();
        Integer port = options.getPublicPort() != null ? options.getPublicPort() : options.getPort();
        return buildMqttAddress(options.getProtocol(), host, port, options.getPath());
    }

    /**
     * Splice an mqtt address from its parts. The path is only appended for ws/wss protocols.
     * @return
     */
    private static String buildMqttAddress(MqttProtocolEnum protocol, String host, Integer port, String path) {
        StringBuilder addr = new StringBuilder()
                .append(protocol.getProtocolAddr())
                .append(host.trim())
                .append(":")
                .append(port);
        if ((protocol == MqttProtocolEnum.WS || protocol == MqttProtocolEnum.WSS)
                && StringUtils.hasText(path)) {
            addr.append(path);
        }
        return addr.toString();
    }

    /**
     * Get the connection parameters of the mqtt client of the drc link.
     * @param clientId
     * @param username
     * @param age   The validity period of the token. unit: s
     * @param map   Custom data added in token.
     * @return
     */
    public static DrcModeMqttBroker getMqttBrokerWithDrc(String clientId, String username, Long age, Map<String, ?> map) {
        if (!mqtt.containsKey(MqttUseEnum.DRC)) {
            throw new RuntimeException("Please configure the drc link parameters of mqtt in the backend configuration file first.");
        }
        Algorithm algorithm = JwtUtil.algorithm;

        String token = JwtUtil.createToken(map, age, algorithm, null, null);

        return new DrcModeMqttBroker()
                .setAddress(getExternalMqttAddress(mqtt.get(MqttUseEnum.DRC)))
                .setUsername(username)
                .setClientId(clientId)
                .setExpireTime(System.currentTimeMillis() / 1000 + age)
                .setPassword(token)
                .setEnableTls(false);
    }


    @Bean
    public MqttConnectOptions mqttConnectOptions() {
        MqttClientOptions customizeOptions = getBasicClientOptions();
        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
        mqttConnectOptions.setServerURIs(new String[]{ getBasicMqttAddress() });
        mqttConnectOptions.setUserName(customizeOptions.getUsername());
        mqttConnectOptions.setPassword(StringUtils.hasText(customizeOptions.getPassword()) ?
                customizeOptions.getPassword().toCharArray() : new char[0]);
        mqttConnectOptions.setAutomaticReconnect(true);
        mqttConnectOptions.setKeepAliveInterval(10);
        return mqttConnectOptions;
    }

    @Bean
    public MqttPahoClientFactory mqttClientFactory() {
        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
        factory.setConnectionOptions(mqttConnectOptions());
        return factory;
    }
}
