package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.Category;
import lombok.Data;

import java.util.List;

/**
 * @author chenz
 */
@Data
public class CategoryNode extends Category {
    List<CategoryNode> children;
}
