// Night lights switch
export enum NightLightsStateEnum {
  CLOSE = 0, // 0-Close
  OPEN = 1, // 1-Open
}

// Distance limit switch
export enum DistanceLimitStatusEnum {
  UNSET = 0, // 0-Not set
  SET = 1, // 1-Set
}

export interface DistanceLimitStatus {
  state?: DistanceLimitStatusEnum;
  distance_limit?: number; // Distance limit
}

// Obstacle avoidance
export enum ObstacleAvoidanceStatusEnum {
  CLOSE = 0, // 0-Close
  OPEN = 1, // 1-Open
}

export interface ObstacleAvoidance {
  horizon?: ObstacleAvoidanceStatusEnum;// Horizontal obstacle avoidance switch
  upside?: ObstacleAvoidanceStatusEnum;// Upward obstacle avoidance switch
  downside?: ObstacleAvoidanceStatusEnum;// Downward obstacle avoidance switch
}

// Device management settings key
export enum DeviceSettingKeyEnum {
  NIGHT_LIGHTS_MODE_SET = 'night_lights_state', // Night lights switch
  HEIGHT_LIMIT_SET = 'height_limit', // Height limit setting
  DISTANCE_LIMIT_SET = 'distance_limit_status', // Distance limit switch
  OBSTACLE_AVOIDANCE_HORIZON = 'obstacle_avoidance_horizon', // Horizontal obstacle avoidance status
  OBSTACLE_AVOIDANCE_UPSIDE = 'obstacle_avoidance_upside', // Upward obstacle avoidance status
  OBSTACLE_AVOIDANCE_DOWNSIDE = 'obstacle_avoidance_downside', // Downward obstacle avoidance status
}

export type DeviceSettingType = Record<DeviceSettingKeyEnum, any>

export const initDeviceSetting = {
  [DeviceSettingKeyEnum.NIGHT_LIGHTS_MODE_SET]:
  {
    label: 'Aircraft Night Lights',
    value: '',
    trueValue: NightLightsStateEnum.CLOSE,
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: 'To ensure flight safety, it is recommended to turn on night lights',
      label: 'Aircraft Night Lights',
    },
    settingKey: DeviceSettingKeyEnum.NIGHT_LIGHTS_MODE_SET,
  },
  [DeviceSettingKeyEnum.HEIGHT_LIMIT_SET]:
  {
    label: 'Height Limit',
    value: '',
    trueValue: 120,
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: 'Height limit: 20 - 1500m',
      // info: 'Modifying the height limit will affect all current airport operations, please confirm before making changes',
      label: 'Height Limit',
    },
    settingKey: DeviceSettingKeyEnum.HEIGHT_LIMIT_SET,
  },
  [DeviceSettingKeyEnum.DISTANCE_LIMIT_SET]:
  {
    label: 'Distance Limit',
    value: '',
    trueValue: DistanceLimitStatusEnum.UNSET,
    // info: 'Distance limit (15 - 8000m) is the maximum operating distance of the aircraft relative to the airport',
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: 'Distance limit (15 - 8000m) is the maximum operating distance of the aircraft relative to the airport',
      // info: 'Modifying the distance limit will affect all current airport operations, please confirm before making changes',
      label: 'Distance Limit',

    },
    settingKey: DeviceSettingKeyEnum.DISTANCE_LIMIT_SET,
  },
  [DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_HORIZON]:
  {
    label: 'Horizontal Obstacle Avoidance',
    value: '',
    trueValue: ObstacleAvoidanceStatusEnum.CLOSE,
    // info: 'Displays the obstacle avoidance working status of the aircraft, you can quickly enable/disable obstacle avoidance, for further settings please go to the device maintenance page',
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: 'Aircraft obstacle avoidance is a basic function to ensure flight safety, it is recommended to keep obstacle avoidance enabled',
      label: 'Horizontal Obstacle Avoidance',

    },
    settingKey: DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_HORIZON,
  },
  [DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_UPSIDE]:
  {
    label: 'Upward Obstacle Avoidance',
    value: '',
    trueValue: ObstacleAvoidanceStatusEnum.CLOSE,
    // info: 'Displays the obstacle avoidance working status of the aircraft, you can quickly enable/disable obstacle avoidance, for further settings please go to the device maintenance page',
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: 'Aircraft obstacle avoidance is a basic function to ensure flight safety, it is recommended to keep obstacle avoidance enabled',
      label: 'Upward Obstacle Avoidance',

    },
    settingKey: DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_UPSIDE,
  },
  [DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_DOWNSIDE]:
  {
    label: 'Downward Obstacle Avoidance',
    value: '',
    trueValue: ObstacleAvoidanceStatusEnum.CLOSE,
    // info: 'Displays the obstacle avoidance working status of the aircraft, you can quickly enable/disable obstacle avoidance, for further settings please go to the device maintenance page',
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: 'Aircraft obstacle avoidance is a basic function to ensure flight safety, it is recommended to keep obstacle avoidance enabled',
      label: 'Downward Obstacle Avoidance',

    },
    settingKey: DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_DOWNSIDE,
  },
} as DeviceSettingType

export const initDeviceSettingFormModel = {
  nightLightsState: false, // Night lights switch
  heightLimit: 20, // Height limit setting
  distanceLimitStatus: { state: false, distanceLimit: 15 }, // Distance limit switch
  obstacleAvoidanceHorizon: false, // Obstacle avoidance - horizontal switch setting
  obstacleAvoidanceUpside: false, // Obstacle avoidance - upward switch setting
  obstacleAvoidanceDownside: false, // Obstacle avoidance - downward switch setting
}

export type DeviceSettingFormModel = typeof initDeviceSettingFormModel
