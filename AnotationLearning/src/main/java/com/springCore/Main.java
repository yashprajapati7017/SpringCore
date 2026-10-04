package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//        Employees employees=context.getBean("employees",Employees.class);
//        Employees employees2=context.getBean("employees",Employees.class);
//        System.out.println(employees.hashCode());
//        System.out.println(employees2.hashCode());

        Normalxml nx1=context.getBean("normalxml", Normalxml.class);
        Normalxml nx2=context.getBean("normalxml", Normalxml.class);

        System.out.println(nx1.hashCode());
        System.out.println(nx2.hashCode());

    }
}