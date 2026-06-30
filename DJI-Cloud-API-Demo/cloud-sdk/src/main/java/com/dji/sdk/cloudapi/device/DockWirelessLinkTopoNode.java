package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

/**
 * @author jeff
 * @version ?
 * @date 2026/03/06
 */
public class DockWirelessLinkTopoNode {

    @NotNull
    @JsonProperty("sdr_id")
    private long sdrId;

    @NotNull
    @JsonProperty("sn")
    private String sn;

    public DockWirelessLinkTopoNode() {
    }

    @Override
    public String toString() {
        return "DockWirelessLinkTopoNode{" +
                "sdr_id=" + sdrId +
                ", sn=" + sn +
                '}';
    }

    public long getSdrId() {
        return sdrId;
    }

    public DockWirelessLinkTopoNode setSdrId(long sdrId) {
        this.sdrId = sdrId;
        return this;
    }

    public String getSn() {
        return sn;
    }

    public DockWirelessLinkTopoNode setSn(String sn) {
        this.sn = sn;
        return this;
    }
}
