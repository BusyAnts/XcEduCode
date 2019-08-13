package com.xuecheng.framework.domain.ucenter.ext;

import com.xuecheng.framework.domain.ucenter.XcMenu;
import com.xuecheng.framework.domain.ucenter.XcUser;
import lombok.Data;

import java.util.List;

/**
 * @author chenz
 */
@Data
public class XcUserExt extends XcUser {

    /**
     * 权限信息
     */
    private List<XcMenu> permissions;

    /**
     * 企业信息
     */
    private String companyId;
}
