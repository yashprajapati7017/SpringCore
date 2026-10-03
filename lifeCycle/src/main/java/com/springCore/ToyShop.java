package com.springCore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ToyShop {

    private int car;
    private int bike;

    public void setCar(int car) {
        this.car = car;
    }

    public void setBike(int bike) {
        this.bike = bike;
    }

    @Override
    public String toString() {
        return "ToyShop{" +
                "car=" + car +
                ", bike=" + bike +
                '}';
    }


    @PostConstruct
    public void init(){
        System.out.println("this is init method");
    }

    @PreDestroy
    public void destroyed(){
        System.out.println("this is destroyed method");
    }

}
