package com.xuecheng.framework.domain.media;

import com.xuecheng.framework.utils.MD5Util;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


/**
 * @author chenz
 */
@Data
@Document(collection = "media_video_course")
public class MediaVideoCourse {

    @Id
    private String id;

    /**
     * 课程id
     */
    private String courseId;

    /**
     * 章节id
     */
    private String chapter;

    /**
     * 文件id
     */
    private String fileId;

    /**
     * 视频处理方式
     */
    private String processType;

    /**
     * 视频处理状态
     */
    private String processStatus;

    /**
     * HLS处理结果
     */
    private String hlsM3u8;

    /**
     *
     */
    private List<String> hlsTsList;

    public MediaVideoCourse(String fileId,String courseId,String chapter){
        this.fileId = fileId;
        this.courseId = courseId;
        this.chapter = chapter;
        this.id = MD5Util.getStringMD5(courseId+chapter);
        //生成 hls
        this.processType = "302002";
        //未处理
        this.processStatus="303001";
    }

}
