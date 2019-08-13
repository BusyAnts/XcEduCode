package com.xuecheng.framework.domain.ucenter.ext;

import lombok.Data;

/**
 * @author chenz
 */
@Data
public class UserBasicInfo {

    private String id;
    private String username;
    private String userPic;
    private String name;
    private String uType;

    /**
     * 所属企业信息
     */
    private String companyId;

    /**
     * jwt令牌
     */
    private String jwtToken;

}
