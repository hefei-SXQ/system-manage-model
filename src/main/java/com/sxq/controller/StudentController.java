package com.sxq.controller;

import com.sxq.entity.Student;
import com.sxq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther sun
 * @Date 2019/10/17 23:25
 * @Discription example
 */
@RestController
@RequestMapping("/student")
public class StudentController {
//    @Qualifier("studentServiceImpl")
//    @Autowired
//    StudentService service;
//
//    @RequestMapping("/query")
//    public Student queryByNo(@RequestParam("sno") String sno){
//        return service.queryStudentByNo(sno);
//    }
}
