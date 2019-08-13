package com.xuecheng.framework.model.response;

import lombok.Data;

/**
 * @author chenz
 */
@Data
public class QueryResponseResult extends ResponseResult {

    private QueryResult queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){
        super(resultCode);
        this.queryResult = queryResult;
    }

}
