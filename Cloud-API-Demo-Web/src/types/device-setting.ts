// 夜航灯开关
export enum NightLightsStateEnum {
  CLOSE = 0, // 0-关闭
  // Night navigation light switch
  OPEN = 1, // 1-打开
    CLOSE = 0, // 0-off
    OPEN = 1, // 1-on
// 限远开关
export enum DistanceLimitStatusEnum {
  UNSET = 0, // 0-未设置
  // Distance limit switch
  SET = 1, // 1-已设置
    UNSET = 0, // 0-not set
    SET = 1, // 1-set
export interface DistanceLimitStatus {
  state?: DistanceLimitStatusEnum;
  distance_limit?: number; // 限远
}
    distance_limit?: number; // Distance limit
// 避障
export enum ObstacleAvoidanceStatusEnum {
  CLOSE = 0, // 0-关闭
  // Obstacle avoidance
  OPEN = 1, // 1-开启
    CLOSE = 0, // 0-off
    OPEN = 1, // 1-on
export interface ObstacleAvoidance {
  horizon?: ObstacleAvoidanceStatusEnum;// 水平避障开关
  upside?: ObstacleAvoidanceStatusEnum;// 上行方向避障开关
    horizon?: ObstacleAvoidanceStatusEnum; // Horizontal obstacle avoidance switch
    upside?: ObstacleAvoidanceStatusEnum; // Upward obstacle avoidance switch
    downside?: ObstacleAvoidanceStatusEnum; // Downward obstacle avoidance switch
// 设备管理设置key
export enum DeviceSettingKeyEnum {
  NIGHT_LIGHTS_MODE_SET = 'night_lights_state', // 夜航灯开关
  // Device management setting keys
  HEIGHT_LIMIT_SET = 'height_limit', // 限高设置
    NIGHT_LIGHTS_MODE_SET = 'night_lights_state', // Night navigation light switch
    HEIGHT_LIMIT_SET = 'height_limit', // Height limit setting
    DISTANCE_LIMIT_SET = 'distance_limit_status', // Distance limit switch
    OBSTACLE_AVOIDANCE_HORIZON = 'obstacle_avoidance_horizon', // Horizontal obstacle avoidance status
    OBSTACLE_AVOIDANCE_UPSIDE = 'obstacle_avoidance_upside', // Upward obstacle avoidance status
    OBSTACLE_AVOIDANCE_DOWNSIDE = 'obstacle_avoidance_downside', // Downward obstacle avoidance status
export type DeviceSettingType = Record<DeviceSettingKeyEnum, any>

export const initDeviceSetting = {
  [DeviceSettingKeyEnum.NIGHT_LIGHTS_MODE_SET]:
  {
    label: '飞行器夜航灯',
    value: '',
    trueValue: NightLightsStateEnum.CLOSE,
      label: 'Aircraft Night Navigation Light',
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: '为保证飞行器的作业安全，建议打开夜航灯',
      label: '飞行器夜航灯',
        // content: 'To ensure the operational safety of the aircraft, it is recommended to turn on the night navigation light',
    settingKey: DeviceSettingKeyEnum.NIGHT_LIGHTS_MODE_SET,
        label: 'Aircraft Night Navigation Light',
  },
  [DeviceSettingKeyEnum.HEIGHT_LIMIT_SET]:
  {
    label: '限高',
    value: '',
    trueValue: 120,
      label: 'Height Limit',
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
      // content: '限高：20 - 1500m',
      // info: '修改限高会影响当前机场的所有作业任务，建议确认作业情况后再进行修改',
        // content: 'Height limit: 20 - 1500m',
        // info: 'Modifying the height limit will affect all current airport operation tasks. It is recommended to confirm the operation situation before making changes.',
    settingKey: DeviceSettingKeyEnum.HEIGHT_LIMIT_SET,
        label: 'Height Limit',
  },
  [DeviceSettingKeyEnum.DISTANCE_LIMIT_SET]:
  {
    label: '限远',
    value: '',
    trueValue: DistanceLimitStatusEnum.UNSET,
      label: 'Distance Limit',
    // info: '限远（15 - 8000m）是约束飞行器相对机场的最大作业距离',
    editable: false,
    popConfirm: {
      // info: 'Distance limit (15 - 8000m) is the maximum operational distance of the aircraft relative to the airport',
      visible: false,
      loading: false,
      // content: '限远 (15- 8000m) 是约束飞行器相对机场的最大作业距离',
      // info: '修改限远会影响当前机场的所有作业任务，建议确认作业情况后再进行修改',
        // content: 'Distance limit (15-8000m) is the maximum operational distance of the aircraft relative to the airport',
        // info: 'Modifying the distance limit will affect all current airport operation tasks. It is recommended to confirm the operation situation before making changes.',
    },
        label: 'Distance Limit',
    settingKey: DeviceSettingKeyEnum.DISTANCE_LIMIT_SET,
  },
  [DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_HORIZON]:
  {
    label: '水平避障',
    value: '',
      label: 'Horizontal Obstacle Avoidance',
    trueValue: ObstacleAvoidanceStatusEnum.CLOSE,
    // info: '飞行器的避障工作状态显示，可以快速开启/关闭飞行器避障，如需进一步设置请在设备运维页面设置',
    editable: false,
      // info: 'Displays the working status of the aircraft obstacle avoidance. You can quickly enable/disable obstacle avoidance. For further settings, please go to the device maintenance page.',
    popConfirm: {
      visible: false,
      loading: false,
      // content: '飞行器避障是保障飞行作业安全的基础功能，建议保持飞行器避障开启',
        // content: 'Aircraft obstacle avoidance is a basic function to ensure flight operation safety. It is recommended to keep obstacle avoidance enabled.',
        label: '水平避障',
        label: 'Horizontal Obstacle Avoidance',
    },
    settingKey: DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_HORIZON,
  },
  [DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_UPSIDE]:
  {
    label: '上视避障',
      label: 'Upward Obstacle Avoidance',
    value: '',
    trueValue: ObstacleAvoidanceStatusEnum.CLOSE,
    // info: '飞行器的避障工作状态显示，可以快速开启/关闭飞行器避障，如需进一步设置请在设备运维页面设置',
      // info: 'Displays the working status of the aircraft obstacle avoidance. You can quickly enable/disable obstacle avoidance. For further settings, please go to the device maintenance page.',
    editable: false,
    popConfirm: {
      visible: false,
      loading: false,
        // content: 'Aircraft obstacle avoidance is a basic function to ensure flight operation safety. It is recommended to keep obstacle avoidance enabled.',
        label: '上视避障',
        label: 'Upward Obstacle Avoidance',

    },
    settingKey: DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_UPSIDE,
  },
  [DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_DOWNSIDE]:
  {
      label: 'Downward Obstacle Avoidance',
    label: '下视避障',
    value: '',
    trueValue: ObstacleAvoidanceStatusEnum.CLOSE,
      // info: 'Displays the working status of the aircraft obstacle avoidance. You can quickly enable/disable obstacle avoidance. For further settings, please go to the device maintenance page.',
    // info: '飞行器的避障工作状态显示，可以快速开启/关闭飞行器避障，如需进一步设置请在设备运维页面设置',
    editable: false,
    popConfirm: {
      visible: false,
        // content: 'Aircraft obstacle avoidance is a basic function to ensure flight operation safety. It is recommended to keep obstacle avoidance enabled.',
        label: '下视避障',
        label: 'Downward Obstacle Avoidance',
      label: '下视避障',

    },
    settingKey: DeviceSettingKeyEnum.OBSTACLE_AVOIDANCE_DOWNSIDE,
  },
} as DeviceSettingType
    nightLightsState: false, // Night navigation light switch
    heightLimit: 20, // Height limit setting
    distanceLimitStatus: { state: false, distanceLimit: 15 }, // Distance limit switch
    obstacleAvoidanceHorizon: false, // Aircraft obstacle avoidance - horizontal switch setting
    obstacleAvoidanceUpside: false, // Aircraft obstacle avoidance - upward switch setting
    obstacleAvoidanceDownside: false, // Aircraft obstacle avoidance - downward switch setting
  obstacleAvoidanceUpside: false, // 飞行器避障-上视开关设置
  obstacleAvoidanceDownside: false, // 飞行器避障-下视开关设置
}

export type DeviceSettingFormModel = typeof initDeviceSettingFormModel
