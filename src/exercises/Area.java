package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = input.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int width = input.nextInt();
        input.close();

        System.out.println("The area of the rectangle is: " + (length * width));
    }
}
