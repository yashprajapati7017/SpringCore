package com.springCore;

import java.util.*;

public class Employees {

    private String Name;
    private List<String> Phone;
    private Set<String> Addreses;
    private Map<String,String> course;
    private Properties p1;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<String> getPhone() {
        return Phone;
    }

    public void setPhone(List<String> phone) {
        Phone = phone;
    }

    public Set<String> getAddreses() {
        return Addreses;
    }

    public void setAddreses(Set<String> addreses) {
        Addreses = addreses;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public Properties getP1() {
        return p1;
    }

    public void setP1(Properties p1) {
        this.p1 = p1;
    }
}
