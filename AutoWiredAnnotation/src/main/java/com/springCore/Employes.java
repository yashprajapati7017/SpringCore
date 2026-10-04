package com.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employes {

//    @Autowired
    working wo;
//
//    public Employes(working wo) {
//        this.wo = wo;
//    }

    @Autowired
    @Qualifier("Working1")
    public void setWo(working wo)
    {
        this.wo = wo;
    }

    @Override
    public String toString() {
        return "Employes{" +
                "working=" + wo.getWork()+
                '}';
    }
}