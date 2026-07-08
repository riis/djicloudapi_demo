package com.dji.sdk.cloudapi.device.api;

import com.dji.sdk.annotations.CloudSDKVersion;
import com.dji.sdk.cloudapi.device.*;
import com.dji.sdk.cloudapi.property.DockDroneCommanderFlightHeight;
import com.dji.sdk.cloudapi.property.DockDroneCommanderModeLostAction;
import com.dji.sdk.cloudapi.property.DockDroneOfflineMapEnable;
import com.dji.sdk.cloudapi.property.DockDroneRthMode;
import com.dji.sdk.config.version.CloudSDKVersionEnum;
import com.dji.sdk.config.version.GatewayTypeEnum;
import com.dji.sdk.mqtt.ChannelName;
import com.dji.sdk.mqtt.MqttReply;
import com.dji.sdk.mqtt.osd.TopicOsdRequest;
import com.dji.sdk.mqtt.state.TopicStateRequest;
import com.dji.sdk.mqtt.state.TopicStateResponse;
import com.dji.sdk.mqtt.status.TopicStatusRequest;
import com.dji.sdk.mqtt.status.TopicStatusResponse;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

/**
 * @author sean
 * @version 1.7
 * @date 2023/6/30
 */
public class AbstractDeviceService {

    /**
     * osd dock
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     * @return status_reply
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_OSD_DOCK)
    public void osdDock(TopicOsdRequest<OsdDock> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("osdDock not implemented");
    }

    /**
     * osd dock drone
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     * @return status_reply
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_OSD_DOCK_DRONE)
    public void osdDockDrone(TopicOsdRequest<OsdDockDrone> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("osdDockDrone not implemented");
    }

    /**
     * osd remote control
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     * @return status_reply
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_OSD_RC)
    public void osdRemoteControl(TopicOsdRequest<OsdRemoteControl> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("osdRemoteControl not implemented");
    }

    /**
     * osd remote control drone
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     * @return status_reply
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_OSD_RC_DRONE)
    public void osdRcDrone(TopicOsdRequest<OsdRcDrone> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("osdRcDrone not implemented");
    }

    /**
     * Gateway device + sub device online
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     * @return status_reply
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATUS_ONLINE, outputChannel = ChannelName.OUTBOUND_STATUS)
    public TopicStatusResponse<MqttReply> updateTopoOnline(TopicStatusRequest<UpdateTopo> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("updateTopoOnline not implemented");
    }

    /**
     * Sub device offline
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     * @return status_reply
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATUS_OFFLINE, outputChannel = ChannelName.OUTBOUND_STATUS)
    public TopicStatusResponse<MqttReply> updateTopoOffline(TopicStatusRequest<UpdateTopo> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("updateTopoOffline not implemented");
    }

    /**
     * Firmware version update for dock and drone
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_FIRMWARE_VERSION)
    public void dockFirmwareVersionUpdate(TopicStateRequest<DockFirmwareVersion> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockFirmwareVersionUpdate not implemented");
    }

    /**
     * Firmware version update for remote control and drone
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_RC_AND_DRONE_FIRMWARE_VERSION)
    public void rcAndDroneFirmwareVersionUpdate(TopicStateRequest<FirmwareVersion> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("rcAndDroneFirmwareVersionUpdate not implemented");
    }

    /**
     * Drone control source update for dock and drone
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_CONTROL_SOURCE)
    public void dockControlSourceUpdate(TopicStateRequest<DockDroneControlSource> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockControlSourceUpdate not implemented");
    }

    /**
     * Drone control source update for remote control and drone
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_RC_CONTROL_SOURCE)
    public void rcControlSourceUpdate(TopicStateRequest<RcDroneControlSource> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("rcControlSourceUpdate not implemented");
    }

    /**
     * Live status update for dock and drone
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_LIVE_STATUS)
    public void dockLiveStatusUpdate(TopicStateRequest<DockLiveStatus> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockLiveStatusUpdate not implemented");
    }

    /**
     * Wireless link topology state update from dock.
     * The dock sends this with need_reply=true, so implementations must return a success reply.
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     * @return success reply
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_WIRELESS_LINK_TOPO, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockWirelessLinkTopo(TopicStateRequest<DockWirelessLinkTopo> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockWirelessLinkTopo not implemented");
    }

    /**
     * Live status source update for remote control and drone
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_RC_LIVE_STATUS)
    public void rcLiveStatusUpdate(TopicStateRequest<RcLiveStatus> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("rcLiveStatusUpdate not implemented");
    }

    /**
     * Payload firmware version update for remote control and drone
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_RC_PAYLOAD_FIRMWARE)
    public void rcPayloadFirmwareVersionUpdate(TopicStateRequest<PayloadFirmwareVersion> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("rcPayloadFirmwareVersionUpdate not implemented");
    }

    /**
     * Wpmz firmware version update for drone
     * The drone sends this with need_reply=true, so implementations must return a success reply.
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     * @return success reply
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_WPMZ_VERSION, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockWpmzVersionUpdate(TopicStateRequest<DockDroneWpmzVersion> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockWpmzVersionUpdate not implemented");
    }

    /**
     * Air transfer (media upload) enabled state.
     * The dock sends this with need_reply=true, so implementations must return a success reply.
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     * @return success reply
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_AIR_TRANSFER_ENABLE, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockAirTransferEnable(TopicStateRequest<DockAirTransferEnable> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockAirTransferEnable not implemented");
    }

    /**
     * Flysafe database version reported by the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_FLYSAFE_DATABASE_VERSION)
    public void dockFlysafeDatabaseVersionUpdate(TopicStateRequest<DockDroneFlysafeDatabaseVersion> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockFlysafeDatabaseVersionUpdate not implemented");
    }

    /**
     * Styles supported by the IR palette
     * @param request  data
     * @param headers   The headers for a {@link Message}.
     */
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_THERMAL_SUPPORTED_PALETTE_STYLE)
    public void dockThermalSupportedPaletteStyle(TopicStateRequest<DockDroneThermalSupportedPaletteStyle> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockThermalSupportedPaletteStyle not implemented");
    }

    /**
     * Under optimal RTH mode, aircraft will automatically plan the optimal return altitude.
     * When the environment and lighting do not meet the requirements of the visual system (such as direct sunlight in the evening or no light at night), the aircraft will perform a straight-line return at the altitude you have set.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_RTH_MODE, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneRthMode(TopicStateRequest<DockDroneRthMode> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockRthMode not implemented");
    }

    /**
     * Current RTH height mode
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_CURRENT_RTH_MODE, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneCurrentRthMode(TopicStateRequest<DockDroneCurrentRthMode> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockCurrentRthMode not implemented");
    }

    /**
     * To-point flight mission out of control action
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_COMMANDER_MODE_LOST_ACTION, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneCommanderModeLostAction(TopicStateRequest<DockDroneCommanderModeLostAction> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneCommanderModeLostAction not implemented");
    }

    /**
     * Current mode of to-point flight mission
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_CURRENT_COMMANDER_FLIGHT_MODE, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneCurrentCommanderFlightMode(TopicStateRequest<DockDroneCurrentCommanderFlightMode> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneCurrentCommanderFlightMode not implemented");
    }

    /**
     * Configured to-point flight mission mode for the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_COMMANDER_FLIGHT_MODE, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneCommanderFlightMode(TopicStateRequest<DockDroneCommanderFlightMode> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneCommanderFlightMode not implemented");
    }

    /**
     * Relative to (airport) takeoff point altitude.
     * ALT.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_COMMANDER_FLIGHT_HEIGHT, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneCommanderFlightHeight(TopicStateRequest<DockDroneCommanderFlightHeight> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneCommanderFlightHeight not implemented");
    }

    /**
     * The reason why the drone enters current state
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_MODE_CODE_REASON, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneModeCodeReason(TopicStateRequest<DockDroneModeCodeReason> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneModeCodeReason not implemented");
    }

    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_GEO_CAGING_STATUS, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneGeoCagingStatus(TopicStateRequest<DockDroneGeoCagingStatus> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneGeoCagingStatus not implemented");
    }

    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_CAMERAS, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneCameras(TopicStateRequest<DockDroneCameras> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneCameras not implemented");
    }

    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_RC_CAMERAS, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> rcCameras(TopicStateRequest<RcCameras> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("rcCameras not implemented");
    }

    /**
     * 4g dongle information
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_1, include = GatewayTypeEnum.DOCK2)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_AND_DRONE_DONGLE_INFOS, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dongleInfos(TopicStateRequest<DongleInfos> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dongleInfos not implemented");
    }

    /**
     * silent mode
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_2, include = GatewayTypeEnum.DOCK)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_SILENT_MODE, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockSilentMode(TopicStateRequest<DockSilentMode> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockSilentMode not implemented");
    }

    /**
     * Whether offline map is enabled on the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_OFFLINE_MAP_ENABLE, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneOfflineMapEnable(TopicStateRequest<DockDroneOfflineMapEnable> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneOfflineMapEnable not implemented");
    }

    /**
     * AR info switch state reported by the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_AR_INFO_SWITCH, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneArInfoSwitch(TopicStateRequest<DockDroneArInfoSwitch> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneArInfoSwitch not implemented");
    }

    /**
     * UOM real-name authentication state reported by the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_UOM_REAL_NAME_STATE, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneUomRealNameState(TopicStateRequest<DockDroneUomRealNameState> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneUomRealNameState not implemented");
    }

    /**
     * Payload devices attached to the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_PAYLOADS, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDronePayloads(TopicStateRequest<DockDronePayloads> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDronePayloads not implemented");
    }

    /**
     * Camera watermark settings reported by the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_CAMERA_WATERMARK_SETTINGS, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneCameraWatermarkSettings(TopicStateRequest<DockDroneCameraWatermarkSettings> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneCameraWatermarkSettings not implemented");
    }

    /**
     * PSDK UI resource state reported by the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_PSDK_UI_RESOURCE, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDronePsdkUiResource(TopicStateRequest<DockDronePsdkUiResource> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDronePsdkUiResource not implemented");
    }

    /**
     * PSDK widget values reported by the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_PSDK_WIDGET_VALUES, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDronePsdkWidgetValues(TopicStateRequest<DockDronePsdkWidgetValues> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDronePsdkWidgetValues not implemented");
    }

    /**
     * Departure trajectory state reported by Dock 3.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DEPARTURE_TRAJECTORY, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDepartureTrajectory(TopicStateRequest<DockDepartureTrajectory> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDepartureTrajectory not implemented");
    }

    /**
     * Remaining battery power for return-to-home reported by the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_REMAINING_POWER_FOR_RETURN_HOME, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneRemainingPowerForReturnHome(TopicStateRequest<DockDroneRemainingPowerForReturnHome> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneRemainingPowerForReturnHome not implemented");
    }

    /**
     * UOM real-name verification tag reported by the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_UOM_REAL_NAME_TAG, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneUomRealNameTag(TopicStateRequest<DockDroneUomRealNameTag> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneUomRealNameTag not implemented");
    }

    /**
     * Whether the drone is using a Beidou-specific firmware version.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_IS_BEIDOU_VERSION, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneIsBeidouVersion(TopicStateRequest<DockDroneIsBeidouVersion> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneIsBeidouVersion not implemented");
    }

    /**
     * AI model list reported by the drone.
     * @param request  data
     * @param headers  The headers for a {@link Message}.
     */
    @CloudSDKVersion(since = CloudSDKVersionEnum.V1_0_0)
    @ServiceActivator(inputChannel = ChannelName.INBOUND_STATE_DOCK_DRONE_AI_MODEL_LIST, outputChannel = ChannelName.OUTBOUND_STATE)
    public TopicStateResponse<MqttReply> dockDroneAiModelList(TopicStateRequest<DockDroneAiModelList> request, MessageHeaders headers) {
        throw new UnsupportedOperationException("dockDroneAiModelList not implemented");
    }

}
