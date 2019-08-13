package com.xuecheng.framework.domain.ucenter.ext;

import lombok.Data;

/**
 * @author chenz
 */
@Data
public class AuthToken {
    /**
     * 访问token
     */
    private String accessToken;

    /**
     * 刷新token
     */
    String refreshToken;

    /**
     * jwt令牌
     */
    String jwtToken;
}
