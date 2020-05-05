package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args){
        HouseCat garfield = new HouseCat("Garfield", 12);

        garfield.sleep();
        garfield.eat();
        System.out.println(garfield.noise());   // prints true
    }
}
