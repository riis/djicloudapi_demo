package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

/**
 * Wireless link topology data
 * @author jeff
 * @version ?
 * @date 2026/03/06
 */
public class DockWirelessLinkTopoData {

    @NotNull
    @JsonProperty("secret_code")
    private byte[] secretCode;

    @NotNull
    @JsonProperty("center_node")
    private DockWirelessLinkTopoNode centerNode;

    @NotNull
    @JsonProperty("leaf_nodes")
    private DockWirelessLinkTopoLeafNode[] leafNodes;

    public DockWirelessLinkTopoData() {
    }

    @Override
    public String toString() {
        return "DockWirelessLinkTopoData{" +
                "secretCode=" + (secretCode == null ? null : new String(secretCode)) +
                ", centerNode=" + centerNode +
                ", leafNodes=" + (leafNodes == null ? null : java.util.Arrays.toString(leafNodes)) +
                '}';
    }

    public byte[] getSecretCode() {
        return secretCode;
    }

    public DockWirelessLinkTopoData setSecretCode(byte[] secretCode) {
        this.secretCode = secretCode;
        return this;
    }

    public DockWirelessLinkTopoNode getCenterNode() {
        return centerNode;
    }

    public DockWirelessLinkTopoData setCenterNode(DockWirelessLinkTopoNode centerNode) {
        this.centerNode = centerNode;
        return this;
    }

    public DockWirelessLinkTopoLeafNode[] getLeafNodes() {
        return leafNodes;
    }

    public DockWirelessLinkTopoData setLeafNodes(DockWirelessLinkTopoLeafNode[] leafNodes) {
        this.leafNodes = leafNodes;
        return this;
    }
}
