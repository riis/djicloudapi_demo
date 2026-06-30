package com.dji.sdk.mqtt.drc;

import com.dji.sdk.mqtt.MqttGatewayPublish;
import com.dji.sdk.mqtt.TopicConst;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.UUID;

/**
 * @author sean
 * @version 1.7
 * @date 2023/5/24
 */
@Component
public class DrcDownPublish {

    @Resource
    private MqttGatewayPublish gatewayPublish;

    public static final int DEFAULT_PUBLISH_COUNT = 5;

    public void publish(String sn, String method) {
        this.publish(sn, method, null);
    }

    public void publish(String sn, String method, Object data) {
        this.publish(sn, method, data, DEFAULT_PUBLISH_COUNT);
    }

    public void publish(String sn, String method, Object data, int publishCount) {
        String topic = TopicConst.THING_MODEL_PRE + TopicConst.PRODUCT + Objects.requireNonNull(sn) + TopicConst.DRC + TopicConst.DOWN;
        // tid and bid must be unique per message; timestamp must be present.
        // The DJI firmware rejects DRC frames where these fields are null.
        gatewayPublish.publish(topic,
                new TopicDrcRequest<>()
                        .setMethod(method)
                        .setTid(UUID.randomUUID().toString())
                        .setBid(UUID.randomUUID().toString())
                        .setTimestamp(System.currentTimeMillis())
                        .setData(Objects.requireNonNullElse(data, "")),
                publishCount);
    }

}
