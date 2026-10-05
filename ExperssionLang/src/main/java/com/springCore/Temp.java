package com.springCore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Temp {

    @Value("12")
    private int x;

    @Value("25")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double z;

    @Value("#{T(java.lang.Math).E}")
    private double e;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }


    @Override
    public String toString() {
        return "Temp{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                '}';
    }
}
