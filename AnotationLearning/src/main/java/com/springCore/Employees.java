package com.springCore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component()
@Scope("prototype")
public class Employees {

    @Value("payment")
    private String method;

    @Value("5000")
    private int ammount;

    @Value("#{Name}")
    private List<String> Name;


    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public List<String> getName() {
        return Name;
    }

    public void setName(List<String> name) {
        Name = name;
    }
}
