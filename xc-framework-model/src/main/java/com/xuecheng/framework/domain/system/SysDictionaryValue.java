package com.xuecheng.framework.domain.system;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author chenz
 */
@Data
public class SysDictionaryValue {

    @Field("sd_id")
    private String sdId;

    @Field("sd_name")
    private String sdName;

    @Field("sd_status")
    private String sdStatus;

}
