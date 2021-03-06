package com.xuecheng.framework.domain.media.response;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenz
 */
@Data
public class CheckChunkResult extends ResponseResult{

    @ApiModelProperty(value = "文件分块存在标记", example = "true", required = true)
    private boolean fileExist;

    public CheckChunkResult(ResultCode resultCode, boolean fileExist) {
        super(resultCode);
        this.fileExist = fileExist;
    }

}
