// Night navigation light switch
export enum NightLightsStateEnum {
  CLOSE = 0, // 0-off
  OPEN = 1, // 1-on
}

// Distance limit switch
export enum DistanceLimitStatusEnum {
  UNSET = 0, // 0-not set
  SET = 1, // 1-set
}

export interface DistanceLimitStatus {
  state?: DistanceLimitStatusEnum;
  distance_limit?: number; // Distance limit
}

// Obstacle avoidance
export enum ObstacleAvoidanceStatusEnum {
  CLOSE = 0, // 0-off
  OPEN = 1, // 1-on
}

export interface ObstacleAvoidance {
  // horizon?: ObstacleAvoidanceStatusEnum;// 水平避障开关
  // upside?: ObstacleAvoidanceStatusEnum;// 上行方向避障开关
  horizon?: ObstacleAvoidanceStatusEnum; // Horizontal obstacle avoidance switch
  upside?: ObstacleAvoidanceStatusEnum; // Upward obstacle avoidance switch
  downside?: ObstacleAvoidanceStatusEnum; // Downward obstacle avoidance switch
}

// Device management setting keys
export enum DeviceSettingKeyEnum {
  NIGHT_LIGHTS_MODE_SET = 'night_lights_state', // Night navigation light switch
  HEIGHT_LIMIT_SET = 'height_limit', // Height limit setting
  DISTANCE_LIMIT_SET = 'distance_limit_status', // Distance limit switch
  OBSTACLE_AVOIDANCE_HORIZON = 'obstacle_avoidance_horizon', // Horizontal obstacle avoidance status
  OBSTACLE_AVOIDANCE_UPSIDE = 'obstacle_avoidance_upside', // Upward obstacle avoidance status
  OBSTACLE_AVOIDANCE_DOWNSIDE = 'obstacle_avoidance_downside', // Downward obstacle avoidance status
}

export type DeviceSettingType = Record<DeviceSettingKeyEnum, any>;

export const initDeviceSetting = {
  [DeviceSettingKeyEnum.NIGHT_LIGHTS_MODE_SET]: {
    label: 'Aircraft Night Navigation Light',
    value: '',
    trueValue: NightLightsStateEnum.CLOSE,
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: 'To ensure the operational safety of the aircraft, it is recommended to turn on the night navigation light',
      label: 'Aircraft Night Navigation Light',
    },
    settingKey: DeviceSettingKeyEnum.NIGHT_LIGHTS_MODE_SET,
  },
  [DeviceSettingKeyEnum.HEIGHT_LIMIT_SET]: {
    label: 'Height Limit',
    value: '',
    trueValue: 120,
    label: 'Height Limit',
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: 'Height limit: 20 - 1500m',
      // info: 'Modifying the height limit will affect all current airport operation tasks. It is recommended to confirm the operation situation before making changes.',
      label: 'Height Limit',
    },
    settingKey: DeviceSettingKeyEnum.HEIGHT_LIMIT_SET,
    label: 'Height Limit',
  },
  [DeviceSettingKeyEnum.DISTANCE_LIMIT_SET]: {
    label: 'Distance Limit',
    value: '',
    trueValue: DistanceLimitStatusEnum.UNSET,

    // info: 'Distance limit (15 - 8000m) is the maximum operational distance of the aircraft relative to the airport',
    editable: false,
    popConfirm: {
      // info: 'Distance limit (15 - 8000m) is the maximum operational distance of the aircraft relative to the airport',
      visible: false,
      loading: false,
      // content: 'Distance limit (15-8000m) is the maximum operational distance of the aircraft relative to the airport',
      // info: 'Modifying the distance limit will affect all current airport operation tasks. It is recommended to confirm the operation situation before making changes.',
      label: 'Distance Limit',
    },
    label: 'Distance Limit',
    settingKey: DeviceSettingKeyEnum.DISTANCE_LIMIT_SET,
  },
  [DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_HORIZON]: {
    label: 'Horizontal Obstacle Avoidance',
    value: '',
    trueValue: ObstacleAvoidanceStatusEnum.CLOSE,
    // info: 'Displays the working status of the aircraft obstacle avoidance. You can quickly enable/disable obstacle avoidance. For further settings, please go to the device maintenance page.',
    editable: false,
    // info: 'Displays the working status of the aircraft obstacle avoidance. You can quickly enable/disable obstacle avoidance. For further settings, please go to the device maintenance page.',
    popConfirm: {
      visible: false,
      loading: false,
      // content: 'Aircraft obstacle avoidance is a basic function to ensure flight operation safety. It is recommended to keep obstacle avoidance enabled.',
      label: 'Horizontal Obstacle Avoidance',
    },
    settingKey: DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_HORIZON,
  },
  [DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_UPSIDE]: {
    label: 'Upward Obstacle Avoidance',
    value: '',
    trueValue: ObstacleAvoidanceStatusEnum.CLOSE,
    // info: 'Displays the working status of the aircraft obstacle avoidance. You can quickly enable/disable obstacle avoidance. For further settings, please go to the device maintenance page.',
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: 'Aircraft obstacle avoidance is a basic function to ensure flight operation safety. It is recommended to keep obstacle avoidance enabled.',
      label: 'Upward Obstacle Avoidance',
    },
    settingKey: DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_UPSIDE,
  },
  [DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_DOWNSIDE]: {
    label: 'Downward Obstacle Avoidance',
    value: '',
    trueValue: ObstacleAvoidanceStatusEnum.CLOSE,
    // info: 'Displays the working status of the aircraft obstacle avoidance. You can quickly enable/disable obstacle avoidance. For further settings, please go to the device maintenance page.',
    editable: false,
    popConfirm: {
      visible: false,
      // content: 'Aircraft obstacle avoidance is a basic function to ensure flight operation safety. It is recommended to keep obstacle avoidance enabled.',
      label: 'Downward Obstacle Avoidance',
    },
    settingKey: DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_DOWNSIDE,
  },
} as DeviceSettingType

export const initDeviceSettingFormModel = {
  nightLightsState: false, // Night navigation light switch
  heightLimit: 20, // Height limit setting
  distanceLimitStatus: { state: false, distanceLimit: 15 }, // Distance limit switch
  obstacleAvoidanceHorizon: false, // Aircraft obstacle avoidance - horizontal switch setting
  obstacleAvoidanceUpside: false, // Aircraft obstacle avoidance - upward switch setting
  obstacleAvoidanceDownside: false, // Aircraft obstacle avoidance - downward switch setting
}

export type DeviceSettingFormModel = typeof initDeviceSettingFormModel;
