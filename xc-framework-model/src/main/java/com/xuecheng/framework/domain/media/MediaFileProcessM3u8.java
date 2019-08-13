package com.xuecheng.framework.domain.media;

import lombok.Data;

import java.util.List;

/**
 * @author chenz
 */
@Data
public class MediaFileProcessM3u8 extends MediaFileProcess {

    /**
     * ts列表
     */
    private List<String> tsList;

}
