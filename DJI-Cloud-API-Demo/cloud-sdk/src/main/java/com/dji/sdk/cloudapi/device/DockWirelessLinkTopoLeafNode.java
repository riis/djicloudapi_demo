package com.dji.sdk.cloudapi.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

/**
 * @author jeff
 * @version ?
 * @date 2026/03/06
 */
public class DockWirelessLinkTopoLeafNode extends DockWirelessLinkTopoNode {

    @NotNull
    @JsonProperty("control_source_index")
    private int controlSourceIndex;

    @NotNull
    @JsonProperty("valid")
    private Boolean valid;

    public DockWirelessLinkTopoLeafNode() {
        super();
    }

    @Override
    public String toString() {
        return "DockWirelessLinkTopoLeafNode{" +
                "controlSourceIndex=" + controlSourceIndex +
                ", valid=" + valid +
                ", sdrId=" + getSdrId() +
                ", sn=" + getSn() +
                '}';
    }

    public int getControlSourceIndex() {
        return controlSourceIndex;
    }

    public DockWirelessLinkTopoLeafNode setControlSourceIndex(int controlSourceIndex) {
        this.controlSourceIndex = controlSourceIndex;
        return this;
    }

    public Boolean getValid() {
        return valid;
    }

    public DockWirelessLinkTopoLeafNode setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
}
