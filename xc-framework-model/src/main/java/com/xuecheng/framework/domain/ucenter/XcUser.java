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
@Table(name="xc_user")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class XcUser {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    private String username;
    private String password;
    private String salt;
    private String name;
    private String uType;
    private String birthday;
    private String userPic;
    private String sex;
    private String email;
    private String phone;
    private String status;
    @Column(name="create_time")
    private Date createTime;

    @Column(name="update_time")
    private Date updateTime;


}
