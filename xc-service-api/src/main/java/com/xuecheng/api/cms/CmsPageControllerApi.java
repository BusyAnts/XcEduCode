package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.CmsPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.*;

/**
 * @author chenz
 */
@Api(value = "cms页面管理接口", tags = "cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi {

    /**
     * 查询列表
     *
     * @param page
     * @param size
     * @param cmsPageRequest
     * @return
     */
    @ApiOperation("分页查询页面列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int"),
    })
    QueryResponseResult findList(int page, int size, CmsPageRequest cmsPageRequest);
}