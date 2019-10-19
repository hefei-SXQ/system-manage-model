package com.sxq.service.serviceImpl;

import com.sxq.dao.StudentDao;
import com.sxq.entity.Student;
import com.sxq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther sun
 * @Date 2019/10/17 23:24
 * @Discription example
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao dao;
    @Override
    public Student queryStudentByNo(String sno) {
        return dao.queryStudentBySno(sno);
    }
}
