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
@Table(name="xc_role")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class XcRole {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name="role_name")
    private String roleName;

    @Column(name="role_code")
    private String roleCode;

    private String description;
    private String status;

    @Column(name="create_time")
    private Date createTime;

    @Column(name="update_time")
    private Date updateTime;


}
