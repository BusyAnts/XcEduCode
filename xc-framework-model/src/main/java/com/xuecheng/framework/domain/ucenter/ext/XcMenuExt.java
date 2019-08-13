package com.xuecheng.framework.domain.ucenter.ext;

import com.xuecheng.framework.domain.course.ext.CategoryNode;
import com.xuecheng.framework.domain.ucenter.XcMenu;
import lombok.Data;

import java.util.List;

/**
 * @author chenz
 */
@Data
public class XcMenuExt extends XcMenu {
    List<CategoryNode> children;
}
