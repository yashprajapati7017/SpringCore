package com.springCore;

public class Person {
    private String personname;
    private int age;
    Certificate certi;

    public Person(String name, int age, Certificate certi) {
        this.personname = name;
        this.age = age;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + personname + '\'' +
                ", age=" + age +
                ", certi=" + certi.getCert() +
                '}';
    }
}
