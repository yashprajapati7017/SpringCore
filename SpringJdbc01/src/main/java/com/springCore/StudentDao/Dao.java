package com.springCore.StudentDao;


import com.springCore.Entity.Student;

import java.util.List;

public interface Dao {
    public int StudentInterface(Student str);

    public int change(Student str);

    public int delete(Student str);

    public Student getStudent(int roll_no);

    public List<Student> getallStudent();

}