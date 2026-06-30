package com.dji.sdk.cloudapi.device;

import com.dji.sdk.exception.CloudSDKException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;

/**
 *
 * @author sean.zhou
 * @date 2021/11/15
 * @version 0.1
 */
// SpringDoc 1.x (swagger-core 2.1.x) does not derive type/enum values from @JsonValue;
// type and allowableValues must be declared explicitly. Remove when upgraded to Spring Boot 3.x / SpringDoc 2.x.
@Schema(description = "device domain", type = "integer", allowableValues = {"0", "1", "2", "3"}, enumAsRef = true)
public enum DeviceDomainEnum {

    DRONE(0),

    PAYLOAD(1),

    REMOTER_CONTROL(2),

    DOCK (3),

    ;

    private final int domain;

    DeviceDomainEnum(int domain) {
        this.domain = domain;
    }

    @JsonCreator
    public static DeviceDomainEnum find(int domain) {
        return Arrays.stream(values()).filter(domainEnum -> domainEnum.domain == domain).findAny()
                .orElseThrow(() -> new CloudSDKException(DeviceDomainEnum.class, domain));
    }

    @JsonValue
    public int getDomain() {
        return domain;
    }
}
