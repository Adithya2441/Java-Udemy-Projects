package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.13);
        System.out.println("Total Burger price is "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addHamburgerAddition1("Egg",5.43);
        healthyBurger.addHealthAddition1("Lentils",3.41);
        System.out.println("Total burger price is "+healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        db.addHamburgerAddition1("Should not do this",50.34);
    }
}
