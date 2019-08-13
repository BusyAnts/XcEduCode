package com.xuecheng.framework.domain.ucenter.response;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;

/**
 * @author chenz
 */
@Data
public class LoginResult extends ResponseResult {
    private String token;

    public LoginResult(ResultCode resultCode,String token) {
        super(resultCode);
        this.token = token;
    }
}
