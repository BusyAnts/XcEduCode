package com.xuecheng.framework.domain.course.response;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;

/**
 * @author chenz
 */
@Data
public class DeleteCourseResult extends ResponseResult {
    private String courseId;

    public DeleteCourseResult(ResultCode resultCode, String courseId) {
        super(resultCode);
        this.courseId = courseId;
    }
}
