package com.xuecheng.framework.domain.search;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chenz
 */
@Data
public class CourseSearchParam implements Serializable {
    /**
     * 关键字
     */
    String keyword;

    /**
     * 一级分类
     */
    String mt;

    /**
     * 二级分类
     */
    String st;

    /**
     * 难度等级
     */
    String grade;

    /**
     * 价格区间
     */
    Float priceMin;

    Float priceMax;

    /**
     * 排序字段
     */
    String sort;

    /**
     * 过虑字段
     */
    String filter;

}
