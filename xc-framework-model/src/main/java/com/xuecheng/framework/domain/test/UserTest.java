package com.xuecheng.framework.domain.test;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author chenz
 */
@Data
@Document(collection = "user_test")
public class UserTest {

    @Id
    private String id;

    private String name;

    @Column(name="create_time")
    private Date createTime;
}
