package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.TeachPlan;
import lombok.Data;

import java.util.List;

/**
 * @author chenz
 */
@Data
public class TeachPlanParameter extends TeachPlan {

    /**
     * 二级分类ids
     */
    List<String> bIds;

    /**
     * 三级分类ids
     */
    List<String> cIds;

}
