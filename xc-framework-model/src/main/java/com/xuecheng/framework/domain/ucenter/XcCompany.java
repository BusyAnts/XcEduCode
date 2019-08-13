package com.xuecheng.framework.domain.ucenter;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author chenz
 */
@Data
@Entity
@Table(name="xc_company")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class XcCompany implements Serializable {
    private static final long serialVersionUID = -916357110051689786L;
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    private String name;
    private String logo;
    private String intro;
    private String email;
    private String mobile;
    private String linkName;
    private String identityPic;
    private String workType;
    private String businessPic;
    private String status;

}
