package com.dji.sdk.cloudapi.device;

import com.dji.sdk.cloudapi.control.CommanderFlightModeEnum;

/**
 * The configured to-point flight mission mode for the drone.
 */
public class DockDroneCommanderFlightMode {

    private CommanderFlightModeEnum commanderFlightMode;

    public DockDroneCommanderFlightMode() {
    }

    @Override
    public String toString() {
        return "DockDroneCommanderFlightMode{" +
                "commanderFlightMode=" + commanderFlightMode +
                '}';
    }

    public CommanderFlightModeEnum getCommanderFlightMode() {
        return commanderFlightMode;
    }

    public DockDroneCommanderFlightMode setCommanderFlightMode(CommanderFlightModeEnum commanderFlightMode) {
        this.commanderFlightMode = commanderFlightMode;
        return this;
    }
}
