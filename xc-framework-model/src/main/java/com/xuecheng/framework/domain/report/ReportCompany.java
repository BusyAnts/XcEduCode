package com.xuecheng.framework.domain.report;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chenz
 */
@Data
@Document(collection = "report_company")
public class ReportCompany {

    @Id
    private String id;

    /**
     * 评价分数（平均分）
     */
    private Float evaluationScore;

    /**
     * 好评率
     */
    private Float goodScale;

    /**
     * 课程数
     */
    private Long courseNum;

    /**
     * 学生人数
     */
    private Long studentNum;

    /**
     * 播放次数
     */
    private Long playNum;

}
