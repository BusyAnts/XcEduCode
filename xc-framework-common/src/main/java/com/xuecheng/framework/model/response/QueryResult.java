package com.xuecheng.framework.model.response;

import lombok.Data;

import java.util.List;

/**
 * @author chenz
 * @param <T>
 */
@Data
public class QueryResult<T> {
    /**
     * 数据列表
     */
    private List<T> list;

    /**
     * 数据总数
     */
    private long total;
}
