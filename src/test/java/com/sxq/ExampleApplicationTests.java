package com.sxq;

import com.sxq.dao.TbSysUserDao;
import com.sxq.entity.TbSysUser;
import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ExampleApplicationTests {
    @Autowired
    ProcessEngine engine;
    @Autowired
    TbSysUserDao dao;
    @Test
    public void contextLoads() {
//        ProcessEngine processEngine = configuration.buildProcessEngine();
//        log.info(processEngine.getName());
        log.info(engine.getName());
    }

    @Test
    public void testInsert(){
        TbSysUser user = new TbSysUser();
        user.setCreator(1);
        user.setLoginName("zhangsan3");
        user.setPassword("123");
        user.setPhoneNo("13312345678");
        user.setEmail("");
        user.setQq("");
        user.setCreateTime(new Date(2019, 10, 20));
        user.setOrgId(1000);
        user.setRealName("张三");
        user.setStatus("有效");
        user.setUpdator(1000);
        dao.add(user);
    }

    @Test
    public void testQuery(){
        List<TbSysUser> users = dao.getUsers();
        for (TbSysUser user:users
             ) {
            System.out.println(user.getUserId());
        }

    }
}
