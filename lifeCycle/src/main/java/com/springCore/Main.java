package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//

        //this is xml
//        FoodShop fs=(FoodShop)context.getBean("foodShop");
//        System.out.println(fs);
//        context.registerShutdownHook();
//


//        this is interface
//        ClothShop clothShop=(ClothShop) context.getBean("clothShop");
//        System.out.println(clothShop);


//        this is Anotation
        ToyShop toyShop=(ToyShop) context.getBean("toyShop");
        System.out.println(toyShop);

        context.registerShutdownHook();
    }
}