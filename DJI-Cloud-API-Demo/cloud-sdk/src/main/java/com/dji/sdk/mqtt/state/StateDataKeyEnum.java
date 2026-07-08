package com.dji.sdk.mqtt.state;

import com.dji.sdk.cloudapi.device.*;
import com.dji.sdk.cloudapi.livestream.DockLivestreamAbilityUpdate;
import com.dji.sdk.cloudapi.livestream.RcLivestreamAbilityUpdate;
import com.dji.sdk.cloudapi.property.DockDroneCommanderFlightHeight;
import com.dji.sdk.cloudapi.property.DockDroneCommanderModeLostAction;
import com.dji.sdk.cloudapi.property.DockDroneOfflineMapEnable;
import com.dji.sdk.cloudapi.property.DockDroneRthMode;
import com.dji.sdk.mqtt.ChannelName;

import java.util.Arrays;

/**
 *
 * @author sean.zhou
 * @date 2021/11/18
 * @version 0.1
 */
public enum StateDataKeyEnum {

    RC_AND_DRONE_FIRMWARE_VERSION(ChannelName.INBOUND_STATE_RC_AND_DRONE_FIRMWARE_VERSION, FirmwareVersion.class),

    RC_LIVE_CAPACITY(ChannelName.INBOUND_STATE_RC_LIVESTREAM_ABILITY_UPDATE, RcLivestreamAbilityUpdate.class),

    RC_DRONE_CONTROL_SOURCE(ChannelName.INBOUND_STATE_RC_CONTROL_SOURCE, RcDroneControlSource.class),

    RC_LIVE_STATUS(ChannelName.INBOUND_STATE_RC_LIVE_STATUS, RcLiveStatus.class),

    RC_PAYLOAD_FIRMWARE(ChannelName.INBOUND_STATE_RC_PAYLOAD_FIRMWARE, PayloadFirmwareVersion.class),

    RC_CAMERAS(ChannelName.INBOUND_STATE_RC_CAMERAS, RcCameras.class),

    DOCK_FIRMWARE_VERSION(ChannelName.INBOUND_STATE_DOCK_FIRMWARE_VERSION, DockFirmwareVersion.class),

    DOCK_LIVE_CAPACITY(ChannelName.INBOUND_STATE_DOCK_LIVESTREAM_ABILITY_UPDATE, DockLivestreamAbilityUpdate.class),

    DOCK_DRONE_CONTROL_SOURCE(ChannelName.INBOUND_STATE_DOCK_DRONE_CONTROL_SOURCE, DockDroneControlSource.class),

    DOCK_LIVE_STATUS(ChannelName.INBOUND_STATE_DOCK_LIVE_STATUS, DockLiveStatus.class),

    DOCK_DRONE_WPMZ_VERSION(ChannelName.INBOUND_STATE_DOCK_DRONE_WPMZ_VERSION, DockDroneWpmzVersion.class),

    DOCK_DRONE_FLYSAFE_DATABASE_VERSION(ChannelName.INBOUND_STATE_DOCK_DRONE_FLYSAFE_DATABASE_VERSION, DockDroneFlysafeDatabaseVersion.class),

    DOCK_DRONE_THERMAL_SUPPORTED_PALETTE_STYLE(ChannelName.INBOUND_STATE_DOCK_DRONE_THERMAL_SUPPORTED_PALETTE_STYLE, DockDroneThermalSupportedPaletteStyle.class),

    DOCK_DRONE_RTH_MODE(ChannelName.INBOUND_STATE_DOCK_DRONE_RTH_MODE, DockDroneRthMode.class),

    DOCK_DRONE_CURRENT_RTH_MODE(ChannelName.INBOUND_STATE_DOCK_DRONE_CURRENT_RTH_MODE, DockDroneCurrentRthMode.class),

    DOCK_DRONE_COMMANDER_MODE_LOST_ACTION(ChannelName.INBOUND_STATE_DOCK_DRONE_COMMANDER_MODE_LOST_ACTION, DockDroneCommanderModeLostAction.class),

    DOCK_DRONE_CURRENT_COMMANDER_FLIGHT_MODE(ChannelName.INBOUND_STATE_DOCK_DRONE_CURRENT_COMMANDER_FLIGHT_MODE, DockDroneCurrentCommanderFlightMode.class),

    DOCK_DRONE_COMMANDER_FLIGHT_MODE(ChannelName.INBOUND_STATE_DOCK_DRONE_COMMANDER_FLIGHT_MODE, DockDroneCommanderFlightMode.class),

    DOCK_DRONE_COMMANDER_FLIGHT_HEIGHT(ChannelName.INBOUND_STATE_DOCK_DRONE_COMMANDER_FLIGHT_HEIGHT, DockDroneCommanderFlightHeight.class),

    DOCK_DRONE_MODE_CODE_REASON(ChannelName.INBOUND_STATE_DOCK_DRONE_MODE_CODE_REASON, DockDroneModeCodeReason.class),

    DOCK_DRONE_GEO_CAGING_STATUS(ChannelName.INBOUND_STATE_DOCK_DRONE_GEO_CAGING_STATUS, DockDroneGeoCagingStatus.class),

    DOCK_DRONE_CAMERAS(ChannelName.INBOUND_STATE_DOCK_DRONE_CAMERAS, DockDroneCameras.class),

    DOCK_DRONE_UOM_REAL_NAME_STATE(ChannelName.INBOUND_STATE_DOCK_DRONE_UOM_REAL_NAME_STATE, DockDroneUomRealNameState.class),

    DOCK_DRONE_PAYLOADS(ChannelName.INBOUND_STATE_DOCK_DRONE_PAYLOADS, DockDronePayloads.class),

    DOCK_DRONE_OFFLINE_MAP_ENABLE(ChannelName.INBOUND_STATE_DOCK_DRONE_OFFLINE_MAP_ENABLE, DockDroneOfflineMapEnable.class),

    DOCK_AND_DRONE_DONGLE_INFOS(ChannelName.INBOUND_STATE_DOCK_AND_DRONE_DONGLE_INFOS, DongleInfos.class),

    DOCK_AIR_TRANSFER_ENABLE(ChannelName.INBOUND_STATE_DOCK_AIR_TRANSFER_ENABLE, DockAirTransferEnable.class),

    DOCK_SILENT_MODE(ChannelName.INBOUND_STATE_DOCK_SILENT_MODE, DockSilentMode.class),

    DOCK_DRONE_CAMERA_WATERMARK_SETTINGS(ChannelName.INBOUND_STATE_DOCK_DRONE_CAMERA_WATERMARK_SETTINGS, DockDroneCameraWatermarkSettings.class),

    DOCK_DRONE_PSDK_UI_RESOURCE(ChannelName.INBOUND_STATE_DOCK_DRONE_PSDK_UI_RESOURCE, DockDronePsdkUiResource.class),

    DOCK_DRONE_PSDK_WIDGET_VALUES(ChannelName.INBOUND_STATE_DOCK_DRONE_PSDK_WIDGET_VALUES, DockDronePsdkWidgetValues.class),

    DOCK_WIRELESS_LINK_TOPO(ChannelName.INBOUND_STATE_DOCK_WIRELESS_LINK_TOPO, DockWirelessLinkTopo.class),

    DOCK_DEPARTURE_TRAJECTORY(ChannelName.INBOUND_STATE_DOCK_DEPARTURE_TRAJECTORY, DockDepartureTrajectory.class),

    DOCK_DRONE_REMAINING_POWER_FOR_RETURN_HOME(ChannelName.INBOUND_STATE_DOCK_DRONE_REMAINING_POWER_FOR_RETURN_HOME, DockDroneRemainingPowerForReturnHome.class),

    DOCK_DRONE_UOM_REAL_NAME_TAG(ChannelName.INBOUND_STATE_DOCK_DRONE_UOM_REAL_NAME_TAG, DockDroneUomRealNameTag.class),

    DOCK_DRONE_IS_BEIDOU_VERSION(ChannelName.INBOUND_STATE_DOCK_DRONE_IS_BEIDOU_VERSION, DockDroneIsBeidouVersion.class),

    DOCK_DRONE_AI_MODEL_LIST(ChannelName.INBOUND_STATE_DOCK_DRONE_AI_MODEL_LIST, DockDroneAiModelList.class),

    UNKNOWN(ChannelName.DEFAULT, Object.class);

    private final String channelName;

    private final Class classType;

    StateDataKeyEnum(String channelName, Class classType) {
        this.channelName = channelName;
        this.classType = classType;
    }

    public Class getClassType() {
        return classType;
    }

    public String getChannelName() {
        return channelName;
    }

    public static StateDataKeyEnum find(Class clazz) {
        return Arrays.stream(values()).filter(keyEnum -> keyEnum.classType == clazz).findAny()
                .orElse(UNKNOWN);
    }

}
