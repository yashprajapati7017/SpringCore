package com.springCore;

public class Order {

    private Payment payment;
//
//    public Order(Payment payment) {
//        this.payment = payment;
//    }


    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "payment=" + payment.getMethod() +
                '}';
    }
}
