package com.xworkz.engineering;

public class BullRunner {
    public static void main(String[] args) {
       
        Bull bull = new Bull();
        bull.name = "Ferdinand";
        bull.age = 5;
        bull.weight = 1200.5;
        bull.breed = "Holstein";
        bull.isTrained = true;
        bull.color = "Black and White";

        bull.graze();
        bull.roar();
        bull.run();
        bull.pullCart();
        bull.plowField();
        bull.showDetails();

        
        Product p = new Bull();
        p.name = "Bruno";
        ((Bull)p).age = 7;
        ((Bull)p).weight = 1500.8;
        ((Bull)p).breed = "Angus";
        ((Bull)p).isTrained = false;
        ((Bull)p).color = "Brown";

        ((Bull)p).graze();
        ((Bull)p).roar();
        ((Bull)p).run();
        ((Bull)p).pullCart();
        ((Bull)p).plowField();
        p.showDetails();
    }
}

