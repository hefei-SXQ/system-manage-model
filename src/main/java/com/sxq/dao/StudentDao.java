package com.sxq.dao;

import com.sxq.entity.Student;

public interface StudentDao {
    public int add(Student student);

    public Student queryStudentBySno(String sno);
}
