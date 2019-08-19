package com.xuecheng.manage_cms.service.impl;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.CmsPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.dao.CmsPageRepository;
import com.xuecheng.manage_cms.service.CmsPageService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;


/**
 * @author chenz
 * @create 2019-08-15 14:18
 */
@Service
public class CmsPageServiceImpl implements CmsPageService {

    @Autowired
    private CmsPageRepository cmsPageRepository;

    /**
     * 页面列表分页查询
     *
     * @param page           当前页码
     * @param size           每页显示个数
     * @param cmsPageRequest 查询条件
     * @return
     */
    @Override
    public QueryResponseResult findList(int page, int size, CmsPageRequest cmsPageRequest) {
        if (cmsPageRequest == null) {
            cmsPageRequest = new CmsPageRequest();
        }
        //参数page从1开始，mongodb从0开始
        if (page <= 0) {
            page = 1;
        }
        page = page - 1;
        if (size <= 0) {
            size = 20;
        }

        //条件匹配器
        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("pageAlias", ExampleMatcher.GenericPropertyMatchers.contains());
        //条件值
        CmsPage cmsPage = new CmsPage();
        //站点id
        if (StringUtils.isNotEmpty(cmsPageRequest.getSiteId())) {
            cmsPage.setSiteId(cmsPageRequest.getSiteId());
        }
        //站点别名
        if (StringUtils.isNotEmpty(cmsPageRequest.getPageAlias())) {
            cmsPage.setPageAlias(cmsPageRequest.getPageAlias());
        }
        Example<CmsPage> example = Example.of(cmsPage, exampleMatcher);

        //分页查询
        Pageable pageable = PageRequest.of(page, size);
        Page<CmsPage> all = cmsPageRepository.findAll(example, pageable);
        QueryResult<CmsPage> cmsPageQueryResult = new QueryResult<CmsPage>();
        cmsPageQueryResult.setList(all.getContent());
        cmsPageQueryResult.setTotal(all.getTotalElements());
        return new QueryResponseResult(CommonCode.SUCCESS, cmsPageQueryResult);
    }
}
