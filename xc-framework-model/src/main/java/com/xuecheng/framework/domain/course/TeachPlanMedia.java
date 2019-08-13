package com.xuecheng.framework.domain.course;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author chenz
 */
@Data
@Entity
@Table(name="teach_plan_media")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TeachPlanMedia implements Serializable {
    private static final long serialVersionUID = -916357110051689485L;
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(name="teach_plan_id")
    private String teachPlanId;

    @Column(name="media_id")
    private String mediaId;

    @Column(name="media_file_original_name")
    private String mediaFileOriginalName;

    @Column(name="media_url")
    private String mediaUrl;
    private String courseId;

}
