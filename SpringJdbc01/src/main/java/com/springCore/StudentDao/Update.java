package com.springCore.StudentDao;

import com.springCore.Entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class Update implements Dao{

    private JdbcTemplate jdbcTemplate;

    @Override
    public int StudentInterface(Student str) {

        String query ="insert into student(Student_Name,course)values(?,?)";
        int result=jdbcTemplate.update(query,str.getName(),str.getCourse());
        return result;
    }

    @Override
    public int change(Student str) {
        String querry="update student set Student_Name=?,course=? where roll_no=?";
        int result=jdbcTemplate.update(querry,str.getName(),str.getCourse(),str.getRoll_no());
        return result;
    }

    @Override
    public int delete(Student str) {
        String querry="delete from student where roll_no=?";
        int result=jdbcTemplate.update(querry,str.getRoll_no());
        return result;
    }

    @Override
    public Student getStudent(int roll_no) {
        String querry="select*from student where roll_no=?";
        RowMapper<Student> rowMapper=new RowMappingImp();
        Student student=jdbcTemplate.queryForObject(querry,rowMapper,roll_no);
        return student;
    }

    @Override
    public List<Student> getallStudent() {
        String querry="select* from student";
        List<Student>students=jdbcTemplate.query(querry,new RowMappingImp());
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
