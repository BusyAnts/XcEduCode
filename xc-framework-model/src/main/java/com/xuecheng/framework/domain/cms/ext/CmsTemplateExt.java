package com.xuecheng.framework.domain.cms.ext;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import lombok.Data;

/**
 * @author chenz
 */
@Data
public class CmsTemplateExt extends CmsTemplate {

    /**
     * 模版内容
     */
    private String templateValue;

}
