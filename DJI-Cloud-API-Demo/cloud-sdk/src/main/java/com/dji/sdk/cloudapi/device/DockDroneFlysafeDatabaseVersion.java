package com.dji.sdk.cloudapi.device;

/**
 * Flysafe database version reported by the drone.
 */
public class DockDroneFlysafeDatabaseVersion {

    private String flysafeDatabaseVersion;

    public DockDroneFlysafeDatabaseVersion() {
    }

    @Override
    public String toString() {
        return "DockDroneFlysafeDatabaseVersion{" +
                "flysafeDatabaseVersion='" + flysafeDatabaseVersion + '\'' +
                '}';
    }

    public String getFlysafeDatabaseVersion() {
        return flysafeDatabaseVersion;
    }

    public DockDroneFlysafeDatabaseVersion setFlysafeDatabaseVersion(String flysafeDatabaseVersion) {
        this.flysafeDatabaseVersion = flysafeDatabaseVersion;
        return this;
    }
}
