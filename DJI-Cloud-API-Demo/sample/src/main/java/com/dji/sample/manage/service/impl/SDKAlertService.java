package com.dji.sample.manage.service.impl;

import com.dji.sdk.cloudapi.airsense.AirsenseWarning;
import com.dji.sdk.cloudapi.airsense.api.AbstractAirsenseService;
import com.dji.sdk.mqtt.ChannelName;
import com.dji.sdk.mqtt.MqttReply;
import com.dji.sdk.mqtt.events.TopicEventsRequest;
import com.dji.sdk.mqtt.events.TopicEventsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Handles Airsense warning events and surfaces them as alerts (future work).
 */
@Service
@Slf4j
public class SDKAlertService extends AbstractAirsenseService {

    @Override
    @SuppressWarnings("rawtypes")
    @ServiceActivator(inputChannel = ChannelName.INBOUND_EVENTS_AIRSENSE_WARNING, outputChannel = ChannelName.OUTBOUND_EVENTS)
    public TopicEventsResponse<MqttReply> airsenseWarning(TopicEventsRequest<List<AirsenseWarning>> request, MessageHeaders headers) {
        log.info("Received Airsense warning: {}", request.getData());
        // TODO: Surface alerts or record them in the database (future/minimal effort)
        // Example: publisher.publishAirsenseWarning(request.getData());
        return new TopicEventsResponse<MqttReply>().setData(MqttReply.success());
    }
}
