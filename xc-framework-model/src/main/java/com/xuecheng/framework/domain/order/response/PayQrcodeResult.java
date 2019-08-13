package com.xuecheng.framework.domain.order.response;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;

/**
 * @author chenz
 */
@Data
public class PayQrcodeResult extends ResponseResult {
    public PayQrcodeResult(ResultCode resultCode) {
        super(resultCode);
    }
}
