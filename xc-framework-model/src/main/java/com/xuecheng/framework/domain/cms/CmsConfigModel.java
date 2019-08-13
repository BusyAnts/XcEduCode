package com.xuecheng.framework.domain.cms;

import lombok.Data;

import java.util.Map;

/**
 * @author chenz
 */
@Data
public class CmsConfigModel {
    private String key;
    private String name;
    private String url;
    private Map mapValue;
    private String value;
}
