package com.xuecheng.framework.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenz
 */
@NoArgsConstructor
@Data
public class ResponseResult implements Response {

    /**
     * 操作是否成功
     */
    boolean success;

    /**
     * 操作代码
     */
    int code;

    /**
     * 提示信息
     */
    String message;

    public ResponseResult(ResultCode resultCode){
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public static ResponseResult success(){
        return new ResponseResult(CommonCode.SUCCESS);
    }
    public static ResponseResult fail(){
        return new ResponseResult(CommonCode.FAIL);
    }

}
