package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * @author chenz
 * @create 2019-08-19 16:25
 */
public class ExceptionCast {

    /**
     * 使用静态方法抛出自定义异常
     * @param resultCode
     */
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
