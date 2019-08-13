package com.xuecheng.framework.domain.media.response;

import com.xuecheng.framework.domain.media.MediaVideoCourse;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenz
 */
@Data
@NoArgsConstructor
public class MediaCourseResult extends ResponseResult {
    private MediaVideoCourse mediaVideoCourse;

    public MediaCourseResult(ResultCode resultCode, MediaVideoCourse mediaVideoCourse) {
        super(resultCode);
        this.mediaVideoCourse = mediaVideoCourse;
    }
}
