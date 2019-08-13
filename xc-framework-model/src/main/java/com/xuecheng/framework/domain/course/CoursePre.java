package com.xuecheng.framework.domain.course;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author chenz
 */
@Data
@Entity
@Table(name="course_pre")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class CoursePre implements Serializable {
    private static final long serialVersionUID = -916357110051689488L;
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(length = 32)
    private String id;
    private String name;
    private String users;
    private String mt;
    private String st;
    private String grade;
    private String studyModel;
    private String description;
    private String pic;
    private Date timestamp;
    private String charge;
    private String valid;
    private String qq;
    private Float price;
    private Float priceOld;
    private Date expires;
    private String teachPlan;
}
