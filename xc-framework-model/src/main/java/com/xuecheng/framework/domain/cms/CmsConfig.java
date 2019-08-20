package com.xuecheng.framework.domain.cms;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author chenz
 */
@Data
@Document(collection = "cms_config")
public class CmsConfig {

    @Id
    private String id;
    private String name;
    private List<CmsConfigModel> model;


}
