package com.dji.sample.manage.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author sean.zhou
 * @date 2021/11/22
 * @version 0.1
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CapacityCameraDTO {

    private String id;

    private String deviceSn;

    private String name;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String index;

    private String type;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private List<CapacityVideoDTO> videosList;
}