package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.Category;
import lombok.Data;

import java.util.List;

/**
 * @author chenz
 */
@Data
public class CategoryParameter extends Category {

    /**
     * 二级分类ids
     */
    List<String> bIds;

    /**
     * 三级分类ids
     */
    List<String> cIds;

}
