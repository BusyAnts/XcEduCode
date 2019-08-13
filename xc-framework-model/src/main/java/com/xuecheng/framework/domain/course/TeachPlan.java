package com.xuecheng.framework.domain.course;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author chenz
 */
@Data
@ToString
@Entity
@Table(name="teach_plan")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class TeachPlan implements Serializable {
    private static final long serialVersionUID = -916357110051689485L;
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    @Column(name = "p_name")
    private String pName;
    private String parentId;
    private String grade;
    @Column(name = "p_type")
    private String pType;
    private String description;
    private String courseId;
    private String status;
    private Integer orderBy;
    private Double timeLength;
    private String tryLearn;

}
