package com.springCore;

import com.springCore.Entity.Student;
import com.springCore.StudentDao.Dao;
import com.springCore.StudentDao.Update;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        Dao dao =context.getBean("update", Dao.class);

//        Insert querry


//        Student student=new Student();
//        student.setName("Amit");
//        student.setCourse("Java");
//
//        int result=dao.StudentInterface(student);
//        System.out.println("Student add "+result);


//        Update querry
//        Student student=new Student();
//        student.setName("ankit");
//        student.setCourse("Phyton");
//        student.setRoll_no(6);
//
//        int result=dao.change(student);
//        System.out.println("Update student data "+result);



//        delete query
//        Student student=new Student();
//        student.setRoll_no(5);
//
//        int result=dao.delete(student);
//        System.out.println("delete student "+result);



//        select only one student
//        Student student=dao.getStudent(1);
//        System.out.println(student);


          List<Student> list=dao.getallStudent();
          for(Student s:list){
              System.out.println(s);
          }

    }
}