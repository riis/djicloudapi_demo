package com.dji.sample.media.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author sean
 * @version 0.2
 * @date 2021/12/9
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MediaFileDTO {

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String fileId;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String fileName;

    private String filePath;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private String objectKey;

    private String subFileType;

    private Boolean isOriginal;

    private String drone;

    private String payload;

    private String tinnyFingerprint;

    private String fingerprint;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private LocalDateTime createTime;

    private String jobId;
}
