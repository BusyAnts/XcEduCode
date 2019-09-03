package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author chenz
 * @create 2019-08-22 15:49
 */
@Api(value = "cms配置管理接口", tags = "cms配置管理接口，提供数据模型的管理、查询接口")
public interface CmsConfigControllerApi {

    /**
     * 根据id查询CMS配置信息
     * @param id
     * @return
     */
    @ApiOperation("根据id查询CMS配置信息")
    CmsConfig getCmsConfig(String id);

}
