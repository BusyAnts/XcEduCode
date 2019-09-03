package com.xuecheng.manage_cms.service.impl;

import com.xuecheng.framework.domain.cms.CmsConfig;
import com.xuecheng.manage_cms.dao.CmsConfigRepository;
import com.xuecheng.manage_cms.service.CmsConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author chenz
 * @create 2019-08-22 16:02
 */
@Service
public class CmsConfigServiceImpl implements CmsConfigService {

    @Autowired
    private CmsConfigRepository cmsConfigRepository;

    /**
     * 根据id配置信息
     *
     * @param id
     * @return
     */
    @Override
    public CmsConfig getCmsConfigById(String id) {
        Optional<CmsConfig> optionalCmsConfig = cmsConfigRepository.findById(id);
        if(optionalCmsConfig.isPresent()){
            CmsConfig cmsConfig = optionalCmsConfig.get();
            return cmsConfig;
        }
        return null;
    }
}
