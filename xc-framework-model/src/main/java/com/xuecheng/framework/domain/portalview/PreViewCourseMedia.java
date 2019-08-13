package com.xuecheng.framework.domain.portalview;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * @author chenz
 */
@Data
@Document(collection = "pre_view_course_media")
public class PreViewCourseMedia implements Serializable{

    @Id
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
