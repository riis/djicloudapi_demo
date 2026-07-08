package com.dji.sdk.cloudapi.device;

import com.dji.sdk.common.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * @author jeff
 * @version ?
 * @date 2026/03/05
 */
public class DockAirTransferEnable extends BaseModel {

    @NotNull
    @JsonProperty("air_transfer_enable")
    private Boolean airTransferEnable;

    public DockAirTransferEnable() {
    }

    @Override
    public String toString() {
        return "DockAirTransferEnable{" +
                "airTransferEnable=" + airTransferEnable +
                '}';
    }

    public Boolean getAirTransferEnable() {
        return airTransferEnable;
    }

    public DockAirTransferEnable setAirTransferEnable(Boolean airTransferEnable) {
        this.airTransferEnable = airTransferEnable;
        return this;
    }
}
