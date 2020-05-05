package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        String number = input.nextLine();
        input.close();
        System.out.println(Double.valueOf(number));
        
//        if(Double.isNaN(Double.valueOf())){
//            System.out.println("You entered a non-numerical character");
//        }else {
//            double radius = Double.parseDouble(number);
//            if(radius < 0){
//                System.out.println("Error: " + radius + " is less than 0 and can not be used to calculate area.");
//            }else {
//                double areaOfCircle = Circle.getArea(radius);
//                System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
//            }
//        }
    }
}
