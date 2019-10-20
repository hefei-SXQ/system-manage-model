package com.sxq.service;

import com.sxq.entity.Student;
import org.springframework.stereotype.Service;


public interface StudentService {
    public Student queryStudentByNo(String sno);
}
