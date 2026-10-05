package com.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springCore")
public class Config {


    @Bean
    public ClothShop getclothShop(){
        ClothShop clothShop=new ClothShop();
        clothShop.setCloth("Shurt");
        return clothShop;
    }


    @Bean
    public Client getclient(){
        Client client=new Client(getclothShop());
        return client;
    }


}
