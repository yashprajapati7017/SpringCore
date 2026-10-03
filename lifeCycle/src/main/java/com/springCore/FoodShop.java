package com.springCore;


public class FoodShop {

    private String samosa;
    private String pizza;

    public String getSamosa() {
        return samosa;
    }

    public void setSamosa(String samosa) {
        this.samosa = samosa;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return "FoodShop{" +
                "samosa='" + samosa + '\'' +
                ", pizza='" + pizza + '\'' +
                '}';
    }


    public void init(){
        System.out.println("this is init method");
    }

    public void destroyed(){
        System.out.println("this is destroyed method");
    }


}
