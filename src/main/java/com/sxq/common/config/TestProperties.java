package com.sxq.common.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Auther sun
 * @Date 2019/10/17 21:52
 * @Discription example
 */
@Component
@Getter
public class TestProperties {
    @Value("${com.sxq.name}")
    private String name;
    @Value("${com.sxq.age}")
    private Integer age;
}
