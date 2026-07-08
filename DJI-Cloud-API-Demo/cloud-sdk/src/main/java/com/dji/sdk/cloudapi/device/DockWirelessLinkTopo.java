package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

/**
 * Wireless link topology state message wrapper
 * @author jeff
 * @version ?
 * @date 2026/03/06
 */
public class DockWirelessLinkTopo {

    @NotNull
    @JsonProperty("wireless_link_topo")
    private DockWirelessLinkTopoData wirelessLinkTopo;

    public DockWirelessLinkTopo() {
    }

    @Override
    public String toString() {
        return "DockWirelessLinkTopo{" +
                "wirelessLinkTopo=" + wirelessLinkTopo +
                '}';
    }

    public DockWirelessLinkTopoData getWirelessLinkTopo() {
        return wirelessLinkTopo;
    }

    public DockWirelessLinkTopo setWirelessLinkTopo(DockWirelessLinkTopoData wirelessLinkTopo) {
        this.wirelessLinkTopo = wirelessLinkTopo;
        return this;
    }
}
