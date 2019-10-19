package com.sxq.dao.daoImpl;

import com.sxq.entity.Student;
import com.sxq.dao.StudentDao;
import com.sxq.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

/**
 * @Auther sun
 * @Date 2019/10/17 23:04
 * @Discription example
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate tmplate;

    @Override
    public int add(Student student){
        String sql = "insert into student (sno,sname,ssex) values (:sno,:sname,:sex)";
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(this.tmplate.getDataSource());
        return npjt.update(sql, new BeanPropertySqlParameterSource(student));
    }

    @Override
    public Student queryStudentBySno(String sno) {
        String sql = "select * from student where sno = ?";
        Object[] args = { sno };
        int[] argTypes = { Types.VARCHAR };
        List<Student> studentList = this.tmplate.query(sql, args, argTypes, new StudentMapper());
        if (studentList != null && studentList.size() > 0) {
            return studentList.get(0);
        } else {
            return null;
        }
    }
}
