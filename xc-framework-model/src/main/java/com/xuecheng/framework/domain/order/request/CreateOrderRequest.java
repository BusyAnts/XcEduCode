package com.xuecheng.framework.domain.order.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

/**
 * @author chenz
 */
@Data
public class CreateOrderRequest extends RequestData {
    String courseId;
}
