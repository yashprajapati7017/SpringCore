package com.springCore;

import com.springCore.Dao.Query;
import com.springCore.Dao.daoimp;
import com.springCore.Enenty.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        ApplicationContext context=new AnnotationConfigApplicationContext(config.class);

        daoimp dao=new Query();

        Student student=new Student();
        student.setName("Ankit");
        student.setCourse("javaScript");

        int result=dao.insert(student);
        System.out.println("Data is Insert "+result);
    }
}