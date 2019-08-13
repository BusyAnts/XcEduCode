package com.xuecheng.framework.domain.media;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author chenz
 */
@Data
@Document(collection = "media_file")
public class MediaFile {

    /**
     * 文件id
     */
    @Id
    private String fileId;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件原始名称
     */
    private String fileOriginalName;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 文件url
     */
    private String fileUrl;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * mimeType
     */
    private String mimeType;

    /**
     * 文件大小
     */
    private Long fileSize;

    /**
     * 文件状态
     */
    private String fileStatus;

    /**
     * 上传时间
     */
    private Date uploadTime;

    /**
     * 处理状态
     */
    private String processStatus;

    /**
     * hls处理
     */
    private MediaFileProcessM3u8 mediaFileProcessM3u8;

    /**
     * 标签，用于查询
     */
    private String tag;


}
