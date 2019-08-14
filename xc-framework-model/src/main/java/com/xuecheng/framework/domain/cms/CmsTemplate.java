package com.xuecheng.framework.domain.cms;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 站点模板
 *
 * @author chenz
 */
@Data
@Document(collection = "cms_template")
public class CmsTemplate {

    /**
     * 模版ID
     */
    @Id
    private String templateId;

    /**
     * 站点ID
     */
    private String siteId;

    /**
     * 模版名称
     */
    private String templateName;

    /**
     * 模版参数
     */
    private String templateParameter;

    /**
     * 模版文件Id
     */
    private String templateFileId;
}
