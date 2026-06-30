package com.dji.sample.manage.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author sean
 * @version 1.1
 * @date 2022/7/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeviceHmsDTO implements Cloneable {

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String hmsId;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String tid;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String bid;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String sn;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer level;

    private Integer module;

    private String key;

    private String messageZh;

    private String messageEn;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @Override
    public DeviceHmsDTO clone() {
        try {
            return (DeviceHmsDTO) super.clone();
        } catch (CloneNotSupportedException e) {
            return DeviceHmsDTO.builder()
                    .sn(this.sn)
                    .bid(this.bid)
                    .tid(this.tid)
                    .createTime(this.createTime)
                    .updateTime(this.updateTime)
                    .build();
        }
    }
}
