package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.request.CmsPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @author chenz
 * @create 2019-08-15 14:16
 */
public interface CmsPageService {

    /**
     * 页面列表分页查询
     * @param page 当前页码
     * @param size 每页显示个数
     * @param cmsPageRequest 查询条件
     * @return
     */
    QueryResponseResult findList(int page, int size, CmsPageRequest cmsPageRequest);
}
