package com.springCore.StudentDao;

import com.springCore.Entity.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMappingImp implements RowMapper<Student> {
    @Nullable
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student=new Student();
        student.setRoll_no(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setCourse(rs.getString(3));
        return student;
    }
}
