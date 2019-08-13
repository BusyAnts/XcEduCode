package com.xuecheng.framework.domain.order.response;

import com.xuecheng.framework.domain.order.XcOrdersPay;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;

/**
 * @author chenz
 */
@Data
public class PayOrderResult extends ResponseResult {
    private XcOrdersPay xcOrdersPay;

    public PayOrderResult(ResultCode resultCode) {
        super(resultCode);
    }

    public PayOrderResult(ResultCode resultCode,XcOrdersPay xcOrdersPay) {
        super(resultCode);
        this.xcOrdersPay = xcOrdersPay;
    }

}
