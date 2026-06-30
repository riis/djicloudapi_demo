package com.dji.sample.wayline.model.dto;

import com.dji.sdk.cloudapi.wayline.OutOfControlActionEnum;
import com.dji.sdk.cloudapi.wayline.TaskTypeEnum;
import com.dji.sdk.cloudapi.wayline.WaylineTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author sean
 * @version 1.1
 * @date 2022/6/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WaylineJobDTO {

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String jobId;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String jobName;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String fileId;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String fileName;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String dockSn;

    private String dockName;

    private String workspaceId;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private WaylineTypeEnum waylineType;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private TaskTypeEnum taskType;

    private LocalDateTime executeTime;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private LocalDateTime beginTime;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private LocalDateTime endTime;

    private LocalDateTime completedTime;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer status;

    private Integer progress;

    private String username;

    private Integer code;

    private Integer rthAltitude;

    private OutOfControlActionEnum outOfControlAction;

    private Integer mediaCount;

    private Integer uploadedCount;

    private Boolean uploading;

    private WaylineTaskConditionDTO conditions;

    private String parentId;
}
