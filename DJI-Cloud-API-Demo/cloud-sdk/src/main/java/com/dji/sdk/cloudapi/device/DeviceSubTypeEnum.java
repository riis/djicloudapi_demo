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
@Schema(description = "device subType", type = "integer", allowableValues = {"0", "1", "2", "65535"}, enumAsRef = true)
public enum DeviceSubTypeEnum {

    ZERO(0),

    ONE(1),

    TWO(2),

    THREE(3),

    _65535(65535);

    private final int subType;

    DeviceSubTypeEnum(int subType) {
        this.subType = subType;
    }

    @JsonValue
    public int getSubType() {
        return subType;
    }

    @JsonCreator
    public static DeviceSubTypeEnum find(int subType) {
        return Arrays.stream(values()).filter(typeEnum -> typeEnum.subType == subType).findAny()
                .orElseThrow(() -> new CloudSDKException(DeviceSubTypeEnum.class, subType));
    }
}
