package com.sxq;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ExampleApplicationTests {
    @Autowired
    private SpringProcessEngineConfiguration configuration;
    @Test
    public void contextLoads() {
        ProcessEngine processEngine = configuration.buildProcessEngine();
        log.info(processEngine.getName());
    }

}
