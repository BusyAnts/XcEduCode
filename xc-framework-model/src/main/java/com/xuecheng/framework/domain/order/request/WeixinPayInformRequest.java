package com.xuecheng.framework.domain.order.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

/**
 * @author chenz
 */
@Data
public class WeixinPayInformRequest extends RequestData {

    /**
     * 返回状态码（SUCCESS/FAIL此字段是通信标识）
     */
    String returnCode;

    /**
     * 返回信息
     */
    String returnMsg;

    /**
     * 公众账号ID
     */
    String appId;

    /**
     * 商户号
     */
    String mchId;

    /**
     * 随机字符串
     */
    String nonceStr;

    /**
     * 签名
     */
    String sign;

    /**
     * 签名类型
     */
    String signType;

    /**
     * 业务结果（SUCCESS/FAIL）
     */
    String resultCode;

    /**
     * 错误代码
     */
    String errCode;

    /**
     * 用户标识（用户在商户appid下的唯一标识）
     */
    String openId;

    /**
     * 交易类型（JsAPI、NATIVE、APP）
     */
    String tradeType;

    /**
     * 付款银行
     */
    String bankType;

    /**
     * 订单金额
     */
    String totalFee;

    /**
     * 现金支付金额
     */
    String cashFee;

    /**
     * 微信支付订单号
     */
    String transactionId;

    /**
     * 商户订单号
     */
    String outTradeNo;

    /**
     * 支付完成时间
     */
    String timeEnd;
}
