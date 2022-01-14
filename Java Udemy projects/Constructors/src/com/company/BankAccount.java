package com.company;

public class BankAccount {
    private String AccNo;
    private double balance;
    private String name;
    private String email;
    private String phno;

    public BankAccount(){
        this("56789",2.50,"default","default address","default phno");
        System.out.println("Empty Constructor called");
    }

    public BankAccount(String name, String email, String phno) {
        this("99999",100.55,name,email,phno);
    }

    public BankAccount(String AccNo, double balance, String name, String email, String phno){
        System.out.println("Account Constructors called");
        this.AccNo = AccNo;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phno = phno;
    }

    public void setAccNo(String AccNo) {
        this.AccNo = AccNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getAccNo() {
        return AccNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }


    public String getPhno() {
        return phno;
    }

    public String getEmail() {
        return email;
    }

    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("New balance is "+ this.balance);
    }

    public void withdraw(double amount){
        if(amount>this.balance){
            System.out.println("Insufficient funds " + this.balance + " is left");
        }
        else{
            this.balance-=amount;
            System.out.println("Withdrawal Successful");
            System.out.println("New balance is "+this.balance);
        }
    }
}
