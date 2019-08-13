package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.TeachPlan;
import lombok.Data;

import java.util.List;

/**
 * @author chenz
 */
@Data
public class TeachPlanNode extends TeachPlan {
    List<TeachPlanNode> children;
}
