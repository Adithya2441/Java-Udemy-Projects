package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("default",1000.00,"defaultemail@gmail.com");
        System.out.println("1st Constructor Called");
    }

    public VipCustomer(String name,double creditLimit){
        this(name,creditLimit,"adi@gmail.com");
        System.out.println("2nd Constructor Called");
    }

    public VipCustomer(String name,double creditLimit,String email){
        System.out.println("3rd Constructor Called");
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
