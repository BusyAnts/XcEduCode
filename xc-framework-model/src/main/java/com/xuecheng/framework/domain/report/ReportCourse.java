package com.xuecheng.framework.domain.report;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chenz
 */
@Data
@Document(collection = "report_course")
public class ReportCourse {

    @Id
    private String id;

    /**
     * 评价分数
     */
    private Float evaluationScore;

    /**
     * 收藏次数
     */
    private Long collectNum;

    /**
     * 播放次数
     */
    private Long playNum;

    /**
     * 学生人数
     */
    private Long studentNum;

    /**
     * 课程时长
     */
    private Long timeLength;

}
