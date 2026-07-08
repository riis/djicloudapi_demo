package com.dji.sdk.cloudapi.device;

/**
 * @author jeff
 * @apiNote Dock's Wayline Mission Library (WPMZ) version
 */
public class WpmzVersion {
    
    private String wpmzVersion;

    public WpmzVersion() {
    }

    @Override
    public String toString() {
        return "WpmzVersion{" +
                "wpmzVersion='" + wpmzVersion + '\'' +
                '}';
    }

    public String getWpmzVersion() {
        return wpmzVersion;
    }

    public WpmzVersion setWpmzVersion(String wpmzVersion) {
        this.wpmzVersion = wpmzVersion;
        return this;
    }

}
