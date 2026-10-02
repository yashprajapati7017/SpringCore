package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
//
//        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
//        Student s1=(Student) context.getBean("student");
//        System.out.println(s1);

//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//        Employees emp=(Employees)context.getBean("employees");
//        System.out.println(emp.getName());
//        System.out.println(emp.getPhone());
//        System.out.println(emp.getAddreses());
//        System.out.println(emp.getCourse());
//        System.out.println(emp.getP1());

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        A a=(A)context.getBean("a");
        System.out.println(a.getX());
        System.out.println(a.getOb());

    }
}