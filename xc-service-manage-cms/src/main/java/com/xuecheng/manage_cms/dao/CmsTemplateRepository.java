package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author chenz
 * @create 2019-09-04 9:57
 */
public interface CmsTemplateRepository extends MongoRepository<CmsTemplate, String> {
}
