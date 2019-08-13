package com.xuecheng.framework.domain.course.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

/**
 * @author chenz
 */
@Data
public class CourseListRequest extends RequestData {
    /**
     * 公司Id
     */
    private String companyId;
}
