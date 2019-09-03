package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author chenz
 * @create 2019-08-22 15:52
 */
public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {
}
