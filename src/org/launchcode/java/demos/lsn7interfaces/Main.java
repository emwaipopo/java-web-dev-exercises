//package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        //  (*Modify FlavorComparator to sort Flavor objects by the number of allergens, from highest to lowest)
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());

        //TODO:(Bonus) Use a Comparator class to sort the 'toppings' array in increasing order by the 'name' field.
        toppings.sort(new ToppingComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("******Flavors & Allergens*******");
        for(Flavor flavor: flavors) {
            System.out.println(flavor.getName() + ":\t" + flavor.getAllergens());
        }
        System.out.println("******CostOfCones*******");
        for(Cone cone: cones) {
            System.out.println(cone.getName() + ":\t$" + cone.getCost());
        }
        System.out.println("******Toppings*******");
        for(Topping topping: toppings) {
            System.out.println(topping.getName());
        }
    }
}
