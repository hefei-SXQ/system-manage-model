package com.sxq.mapper;

import com.sxq.entity.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Auther sun
 * @Date 2019/10/17 23:16
 * @Discription example
 */
public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setSno(rs.getString("sno"));
        student.setSname(rs.getString("sname"));
        student.setSsex(rs.getString("ssex"));
        return student;
    }
}
