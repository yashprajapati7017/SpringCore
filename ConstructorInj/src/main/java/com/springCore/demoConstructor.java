package com.springCore;

public class demoConstructor {

    private int a;
    private int b;

    public demoConstructor(int a, int b) {
        System.out.println("this is int constructor");
        this.a = a;
        this.b = b;
    }

    public demoConstructor(double a, double b) {
        System.out.println("this is double constructor");
        this.a = (int) a;
        this.b = (int)b;
    }
    public int sum(){
        return a+b;
    }
}
