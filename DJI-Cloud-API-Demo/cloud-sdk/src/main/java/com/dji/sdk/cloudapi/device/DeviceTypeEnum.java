package com.dji.sdk.cloudapi.device;

import com.dji.sdk.exception.CloudSDKException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;

/**
 * @author sean
 * @version 1.7
 * @date 2023/5/26
 */
// SpringDoc 1.x (swagger-core 2.1.x) does not derive type/enum values from @JsonValue;
// type and allowableValues must be declared explicitly. Remove when upgraded to Spring Boot 3.x / SpringDoc 2.x.
@Schema(description = "device type", type = "integer", allowableValues = {"1", "2", "20", "26", "39", "41", "42", "43", "50", "52", "53", "56", "60", "61", "66", "67", "68", "77", "80", "81", "89", "91", "119", "144", "165", "90742"}, enumAsRef = true)
public enum DeviceTypeEnum {

    M350(89),

    M300(60),

    M30_OR_M3T_CAMERA(67),

    M3E(77),

    Z30(20),

    XT2(26),

    FPV(39),

    XTS(41),

    H20(42),

    H20T(43),

    P1(50),

    M30_CAMERA(52),

    M30T_CAMERA(53),

    H20N(61),

    DOCK_CAMERA(165),

    L1(90742),

    M3E_CAMERA(66),

    M3M_CAMERA(68),

    RC(56),

    RC_PLUS(119),

    RC_PRO(144),

    DOCK(1),

    DOCK2(2),

    DOCK3(3),

    M3D(91),

    M4D(100),

    M3D_CAMERA(80),

    M3TD_CAMERA(81),
    ;

    private final int type;

    DeviceTypeEnum(int type) {
        this.type = type;
    }

    @JsonValue
    public int getType() {
        return type;
    }

    @JsonCreator
    public static DeviceTypeEnum find(int type) {
        return Arrays.stream(values()).filter(typeEnum -> typeEnum.type == type).findAny()
                .orElseThrow(() -> new CloudSDKException(DeviceTypeEnum.class, type));
    }
}
