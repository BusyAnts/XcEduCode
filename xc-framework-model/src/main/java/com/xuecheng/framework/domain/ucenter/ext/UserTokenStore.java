package com.xuecheng.framework.domain.ucenter.ext;

import lombok.Data;

/**
 * @author chenz
 */
@Data
public class UserTokenStore extends AuthToken {
    /**
     * 用户id
     */
    String userId;

    /**
     * 用户类型
     */
    String uType;

    /**
     * 用户所属企业信息
     */
    String companyId;
}
