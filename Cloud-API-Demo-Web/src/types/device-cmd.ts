import { AlarmModeEnum, BatteryStoreModeEnum, DroneBatteryModeEnum, LinkWorkModeEnum } from '/@/types/airport-tsa'
// Dock command set
export enum DeviceCmd {
  // Simple commands
  DebugModeOpen = 'debug_mode_open', // Debug mode open
  DebugModeClose = 'debug_mode_close', // Debug mode close
  SupplementLightOpen = 'supplement_light_open', // Open supplement light
  SupplementLightClose = 'supplement_light_close', // Close supplement light
  ReturnHome = 'return_home', // Return to home
  ReturnHomeCancel = 'return_home_cancel', // Cancel return to home
  // Complex commands
  DeviceReboot = 'device_reboot', // Dock reboot
  DroneOpen = 'drone_open', // Drone power on
  DroneClose = 'drone_close', // Drone power off
  // DeviceCheck = 'device_check', // One-click troubleshooting (pre-flight self-check)
  DeviceFormat = 'device_format', // Dock data format
  DroneFormat = 'drone_format', // Drone data format
  CoverOpen = 'cover_open', // Open cover
  CoverClose = 'cover_close', // Close cover
  PutterOpen = 'putter_open', // Extend putter
  PutterClose = 'putter_close', // Retract putter
  ChargeOpen = 'charge_open', // Start charging
  ChargeClose = 'charge_close', // Stop charging
  AlarmStateSwitch = 'alarm_state_switch', // Dock alarm
  BatteryStoreModeSwitch = 'battery_store_mode_switch', // Battery maintenance
  DroneBatteryModeSwitch = 'battery_maintenance_switch', // Drone battery maintenance
  SdrWorkModeSwitch = 'sdr_workmode_switch', // Enhanced image transmission
}

export type DeviceCmdItemAction = AlarmModeEnum | BatteryStoreModeEnum | DroneBatteryModeEnum | LinkWorkModeEnum

export interface DeviceCmdItem{
  label: string, // Title
  status: string, // Current status
  operateText: string, // Button text
  cmdKey: DeviceCmd, // Request command
  oppositeCmdKey?: DeviceCmd, // Opposite status command
  action?: DeviceCmdItemAction, // Parameter
  func: string, // Handler function
  loading: boolean // Button loading
  disabled?: boolean // Button disabled
}
export const noDebugCmdList: DeviceCmdItem[] = [
  {
    label: 'Return Home',
    status: '--',
    operateText: 'Return Home',
    cmdKey: DeviceCmd.ReturnHome,
    func: 'returnHome',
    loading: false,
  },
  {
    label: 'Return Home Cancel',
    status: '--',
    operateText: 'Return Home Cancel',
    cmdKey: DeviceCmd.ReturnHomeCancel,
    func: 'returnHomeCancel',
    loading: false,
  }
]

// Dock commands
export const cmdList: DeviceCmdItem[] = [
  {
    // iconName: ,
    label: 'Dock System',
    status: 'Working',
    operateText: 'Reboot',
    cmdKey: DeviceCmd.DeviceReboot,
    func: 'deviceReboot',
    loading: false,
    // btnAnimationIconName: '',
    // operateTips: '',
    // statusColor: '',
  },
  {
    label: 'Aircraft',
    status: 'Off',
    operateText: 'Power On',
    cmdKey: DeviceCmd.DroneOpen,
    oppositeCmdKey: DeviceCmd.DroneClose,
    func: 'droneStatus',
    loading: false,
  },
  {
    label: 'Cover',
    status: 'Closed',
    operateText: 'Open',
    cmdKey: DeviceCmd.CoverOpen,
    oppositeCmdKey: DeviceCmd.CoverClose,
    func: 'coverStatus',
    loading: false,
  },
  {
    label: 'Putter',
    status: 'Retracted',
    operateText: 'Extend',
    cmdKey: DeviceCmd.PutterOpen,
    oppositeCmdKey: DeviceCmd.PutterClose,
    func: 'putterStatus',
    loading: false,
  },
  {
    label: 'Charging Status',
    status: 'Not Charging',
    operateText: 'Charge',
    cmdKey: DeviceCmd.ChargeOpen,
    oppositeCmdKey: DeviceCmd.ChargeClose,
    func: 'chargeStatus',
    loading: false,
  },
  {
    label: 'Dock Storage',
    status: '--',
    operateText: 'Format',
    cmdKey: DeviceCmd.DeviceFormat,
    func: 'deviceFormat',
    loading: false,
  },
  {
    label: 'Aircraft Storage',
    status: '--',
    operateText: 'Format',
    cmdKey: DeviceCmd.DroneFormat,
    func: 'droneFormat',
    loading: false,
  },
  {
    label: 'Supplement Light',
    status: 'Off',
    operateText: 'Turn On',
    cmdKey: DeviceCmd.SupplementLightOpen,
    oppositeCmdKey: DeviceCmd.SupplementLightClose,
    func: 'supplementLightStatus',
    loading: false,
  },
  {
    label: 'Dock Alarm',
    status: 'Off',
    operateText: 'Turn On',
    cmdKey: DeviceCmd.AlarmStateSwitch,
    action: AlarmModeEnum.OPEN,
    func: 'alarmState',
    loading: false,
  },
  {
    label: 'Dock Battery Storage Mode',
    status: 'Plan',
    operateText: 'Emergency',
    cmdKey: DeviceCmd.BatteryStoreModeSwitch,
    action: BatteryStoreModeEnum.BATTERY_EMERGENCY_STORE,
    func: 'batteryStoreMode',
    loading: false,
  },
  {
    label: 'Aircraft Battery Maintenance',
    status: '--',
    operateText: 'Maintain',
    cmdKey: DeviceCmd.DroneBatteryModeSwitch,
    action: DroneBatteryModeEnum.OPEN,
    func: 'droneBatteryMode',
    loading: false,
    disabled: true,
  },
  {
    label: '4G Enhancement',
    status: '--',
    operateText: 'Enable',
    cmdKey: DeviceCmd.SdrWorkModeSwitch,
    action: LinkWorkModeEnum.FourG_FUSION_MODE,
    func: 'sdrWorkMode',
    loading: false,
  },
]

export enum DeviceCmdStatusText {
  DeviceRebootNormalText = 'Working',
  DeviceRebootInProgressText = 'Rebooting...',
  DeviceRebootFailedText = 'Reboot Failed',

  DroneStatusOpenNormalText = 'On',
  DroneStatusOpenInProgressText = 'Powering On...',
  DroneStatusOpenFailedText = 'Off',
  DroneStatusOpenBtnText = 'Power Off',

  DroneStatusCloseNormalText = 'Off',
  DroneStatusCloseInProgressText = 'Powering Off...',
  DroneStatusCloseFailedText = 'On',
  DroneStatusCloseBtnText = 'Power On',

  DeviceCoverOpenNormalText = 'Open',
  DeviceCoverOpenInProgressText = 'Opening...',
  DeviceCoverOpenFailedText = 'Closed',
  DeviceCoverOpenBtnText = 'Close',

  DeviceCoverCloseNormalText = 'Closed',
  DeviceCoverCloseInProgressText = 'Closing...',
  DeviceCoverCloseFailedText = 'Open',
  DeviceCoverCloseBtnText = 'Open',

  DevicePutterOpenNormalText = 'Extended',
  DevicePutterOpenBtnText = 'Retract',
  DevicePutterOpenInProgressText = 'Extending Putter',
  DevicePutterOpenFailedText = 'Retracted',

  DevicePutterCloseNormalText = 'Retracted',
  DevicePutterCloseInProgressText = 'Retracting Putter',
  DevicePutterCloseFailedText = 'Extended',
  DevicePutterCloseBtnText = 'Extend',

  DeviceChargeOpenNormalText = 'Charging',
  DeviceChargeOpenInProgressText = 'Charging...',
  DeviceChargeOpenFailedText = 'Not Charging',
  DeviceChargeOpenBtnText = 'Disconnect',

  DeviceChargeCloseNormalText = 'Disconnected',
  DeviceChargeCloseInProgressText = 'Disconnecting...',
  DeviceChargeCloseFailedText = 'Charging',
  DeviceChargeCloseBtnText = 'Charge',

  DeviceFormatInProgressText = 'Formatting...',
  DeviceFormatFailedText = 'Format Failed',

  DroneFormatInProgressText = 'Formatting...',
  DroneFormatFailedText = 'Format Failed',

  DeviceSupplementLightOpenNormalText = 'On',
  DeviceSupplementLightOpenInProgressText = 'Turning On...',
  DeviceSupplementLightOpenFailedText = 'Off',
  DeviceSupplementLightOpenBtnText = 'Turn Off',

  DeviceSupplementLightCloseNormalText = 'Off',
  DeviceSupplementLightCloseText = 'Turning Off...',
  DeviceSupplementLightCloseFailedText = 'On',
  DeviceSupplementLightCloseBtnText = 'Turn On',

  AlarmStateOpenNormalText = 'On',
  AlarmStateOpenText = 'Turning On...',
  AlarmStateOpenFailedText = 'Off',
  AlarmStateOpenBtnText = 'Turn Off',

  AlarmStateCloseNormalText = 'Off',
  AlarmStateCloseText = 'Turning Off...',
  AlarmStateCloseFailedText = 'On',
  AlarmStateCloseBtnText = 'Turn On',

  BatteryStoreModePlanNormalText = 'Plan',
  BatteryStoreModePlanText = 'Switching...',
  BatteryStoreModePlanFailedText = 'Emergency',
  BatteryStoreModePlanBtnText = 'Emergency',

  BatteryStoreModeEmergencyNormalText = 'Emergency',
  BatteryStoreModeEmergencyText = 'Switching...',
  BatteryStoreModeEmergencyFailedText = 'Plan',
  BatteryStoreModeEmergencyBtnText = 'Plan',

  DroneBatteryModeMaintenanceInProgressText = 'Maintaining',
  DroneBatteryModeMaintenanceNotNeedText = 'No Maintenance Needed',
  DroneBatteryModeMaintenanceNeedText = 'Maintenance Needed',
  DroneBatteryModeOpenBtnText = 'Maintain',
  DroneBatteryModeCloseBtnText = 'Stop Maintenance',

  SdrWorkModeFourGOpenNormalText = 'On',
  SdrWorkModeFourGOpenText = 'Enabling...',
  SdrWorkModeFourGOpenFailedText = '--',
  SdrWorkModeFourGOpenBtnText = 'Disable',

  SdrWorkModeFourGCloseNormalText = '--',
  SdrWorkModeFourGCloseText = 'Disabling...',
  SdrWorkModeFourGCloseFailedText = 'On',
  SdrWorkModeFourCloseBtnText = 'Enable',
}

// cmd ws message status
export enum DeviceCmdExecuteStatus {
  Sent = 'sent', // Sent
  InProgress = 'in_progress', // In progress
  OK = 'ok', // Success
  Failed = 'failed', // Failed
  Canceled = 'canceled', // Canceled
  Timeout = 'timeout' // Timeout
}

export interface DeviceCmdExecuteInfo {
  biz_code: string,
  timestamp: number,
  sn: string,
  bid: string,
  output:{
    status: DeviceCmdExecuteStatus,
    progress?: {
      percent: number,
      step_key: string,
      step_result: number
    },
    ext?: {
      rate?: number
    }
  }
  result: number,
}

// Command execution status for all docks
export interface DevicesCmdExecuteInfo {
  [key: string]: DeviceCmdExecuteInfo[], // sn --- DeviceCmdExecuteInfo
}
