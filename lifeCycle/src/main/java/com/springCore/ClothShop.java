package com.springCore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ClothShop implements InitializingBean, DisposableBean {

    private String tShurt;
    private String shurt;

    public String gettShurt() {
        return tShurt;
    }

    public void settShurt(String tShurt) {
        this.tShurt = tShurt;
    }

    public String getShurt() {
        return shurt;
    }

    public void setShurt(String shurt) {
        this.shurt = shurt;
    }

    @Override
    public String toString() {
        return "ClothShop{" +
                "tShurt='" + tShurt + '\'' +
                ", shurt='" + shurt + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this is init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("this is destroyed method");
    }
}
