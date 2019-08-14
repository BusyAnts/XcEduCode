package com.xuecheng.manage_cms.web.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.CmsPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenz
 * @create 2019-08-15 0:01
 */
@RestController
public class CmsPageController implements CmsPageControllerApi {
    /**
     * 查询列表
     *
     * @param page
     * @param size
     * @param cmsPageRequest
     * @return
     */
    @Override
    public QueryResponseResult findList(int page, int size, CmsPageRequest cmsPageRequest) {
        //暂时采用测试数据，测试接口是否可以正常运行
        QueryResult queryResult = new QueryResult();
        queryResult.setTotal(2);
        //静态数据列表
        List list = new ArrayList();
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("测试页面");
        list.add(cmsPage);
        queryResult.setList(list);
        QueryResponseResult queryResponseResult = new
                QueryResponseResult(CommonCode.SUCCESS, queryResult);
        return queryResponseResult;
    }
}
