package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1price;
    private double addition2price;
    private double addition3price;
    private double addition4price;

    public void addHamburgerAddition1(String name,double price){
        this.addition1Name = name;
        this.addition1price = price;

    }

    public void addHamburgerAddition2(String name,double price){
        this.addition2Name = name;
        this.addition2price = price;

    }

    public void addHamburgerAddition3(String name,double price){
        this.addition3Name = name;
        this.addition3price = price;

    }

    public void addHamburgerAddition4(String name,double price){
        this.addition4Name = name;
        this.addition4price = price;

    }

    public double itemizeHamburger(){
        double totalprice = this.price;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price );
        if(this.addition1Name != null){
            totalprice +=this.addition1price;
            System.out.println("Added "+this.addition1Name + " for an extra "+ this.addition1price);
        }
        if(this.addition2Name != null){
            totalprice +=this.addition2price;
            System.out.println("Added "+this.addition2Name + " for an extra "+ this.addition2price);
        }
        if(this.addition3Name != null){
            totalprice +=this.addition3price;
            System.out.println("Added "+this.addition3Name + " for an extra "+ this.addition3price);
        }
        if(this.addition4Name != null){
            totalprice +=this.addition4price;
            System.out.println("Added "+this.addition4Name + " for an extra "+ this.addition4price);
        }
        return totalprice;
    }

}
