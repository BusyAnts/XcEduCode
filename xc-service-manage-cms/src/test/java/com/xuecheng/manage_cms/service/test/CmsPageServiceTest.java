package com.xuecheng.manage_cms.service.test;

import com.xuecheng.manage_cms.service.CmsPageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author chenz
 * @create 2019-09-04 10:37
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageServiceTest {

    @Autowired
    private CmsPageService cmsPageService;

    @Test
    public void testGetPageHtml() {
        String page = cmsPageService.getPageHtml("5a795ac7dd573c04508f3a56");
        System.out.println(page);
    }

}
