package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.CmsPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;

/**
 * @author chenz
 * @create 2019-08-15 14:16
 */
public interface CmsPageService {

    /**
     * 页面列表分页查询
     *
     * @param page           当前页码
     * @param size           每页显示个数
     * @param cmsPageRequest 查询条件
     * @return
     */
    QueryResponseResult findList(int page, int size, CmsPageRequest cmsPageRequest);

    /**
     * 添加页面
     *
     * @param cmsPage
     * @return
     */
    CmsPageResult add(CmsPage cmsPage);

    /**
     * 根据id查询页面
     *
     * @param id
     * @return
     */
    CmsPage getById(String id);

    /**
     * 根据id，更新页面
     *
     * @param id
     * @param cmsPage
     * @return
     */
    CmsPageResult update(String id, CmsPage cmsPage);

    /**
     * 删除页面
     *
     * @param id
     * @return
     */
    ResponseResult delete(String id);

    /**
     * 根据页面id执行静态化
     *
     * @param pageId
     * @return
     */
    String getPageHtml(String pageId);
}
