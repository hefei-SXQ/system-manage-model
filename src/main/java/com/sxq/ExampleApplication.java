package com.sxq;

import com.sxq.common.constant.SystemConstant;
import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@MapperScan("com.sxq.**.mapper")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @RequestMapping("start")
    public String start(){
        return "starting springboot application..." + SystemConstant.map;
    }
}
