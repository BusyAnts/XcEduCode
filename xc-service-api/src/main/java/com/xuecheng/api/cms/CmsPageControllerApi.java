package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.CmsPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

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

    /**
     * 添加页面
     *
     * @param cmsPage
     * @return
     */
    @ApiOperation("添加页面")
    CmsPageResult add(CmsPage cmsPage);

    /**
     * 通过Id查询页面
     *
     * @param id
     * @return
     */
    @ApiOperation("通过Id查询页面")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "页面Id", required = true, paramType = "path", dataType = "String"),
    })
    CmsPage findById(String id);

    /**
     * 修改页面
     *
     * @param id
     * @param cmsPage
     * @return
     */
    @ApiOperation("修改页面")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "页面Id", required = true, paramType = "path", dataType = "String"),
    })
    CmsPageResult edit(String id, CmsPage cmsPage);

    /**
     * 通过ID删除页面
     *
     * @param id
     * @return
     */
    @ApiOperation("通过ID删除页面")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "页面Id", required = true, paramType = "path", dataType = "String"),
    })
    ResponseResult delete(String id);
}