package com.xuecheng.framework.domain.ucenter;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author chenz
 */
@Data
@Entity
@Table(name="xc_permission")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class XcPermission {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name="role_id")
    private String roleId;

    @Column(name="menu_id")
    private String menuId;

    @Column(name="create_time")
    private Date createTime;
}
