package com.company;

public class Main {

    public static void main(String[] args) {
        double i;
        for(i=8.0;i>=2.0;i--)
        {
            System.out.println("10000 at "+ i +"% interest is " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

    }
    public static double calculateInterest(double amount,double interestRate){
        return (amount *(interestRate/100));
    }

}
