package com.springCore.Dao;

import com.springCore.Enenty.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Query implements daoimp {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {

        String query="insert into student(Student_Name,course)values(?,?)";
        int result =jdbcTemplate.update(query,student.getName(),student.getCourse());
        return result;
    }
}
