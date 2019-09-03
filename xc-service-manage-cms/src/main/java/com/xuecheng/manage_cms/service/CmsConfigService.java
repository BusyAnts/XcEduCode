package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsConfig;

/**
 * @author chenz
 * @create 2019-08-22 15:55
 */
public interface CmsConfigService {

    /**
     * 根据id配置信息
     * @param id
     * @return
     */
    CmsConfig getCmsConfigById(String id);
}
