package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.CmsPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @author chenz
 */
public interface CmsPageControllerApi {

    /**
     * 查询列表
     * @param page
     * @param size
     * @param cmsPageRequest
     * @return
     */
    QueryResponseResult findList(int page, int size, CmsPageRequest cmsPageRequest);
}