package com.dji.sample.manage.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author sean
 * @version 1.1
 * @date 2022/7/7
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HmsMessage {

    private String zh;

    private String en;

    private String de;
}
