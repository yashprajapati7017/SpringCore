package com.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Client {


    private ClothShop clothShop;

    public Client(ClothShop clothShop) {
        this.clothShop = clothShop;
    }

    public void byy(){
        System.out.println("Thanks for bey"+clothShop.getCloth());
    }
}
