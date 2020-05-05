package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        //1.Write a static method to find the sum of all the even numbers in an ArrayList.
        // Within main, create a list with at least 10 integers and call your method on the list.
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(evenSum(numbers));

        //2.Write a static method to print out each word in a list that has exactly 5 letters.
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Fox","Jumps","Java","Script"));
        //printFive(words);

        //3.Modify your code to prompt the user to enter the word length for the search.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int length = input.nextInt();
        input.close();
        printFive(words, length);

        //4.Use the string from the Array Practice section
        words = new ArrayList<>(Arrays.asList());

    }

    public static int evenSum(ArrayList<Integer> numbers){
        int sum = 0;
        for(int i: numbers){
            if(i % 2 == 0){
                sum += i;
            }
        } return(sum);
    }

    public static void printFive(ArrayList<String> words, int length){
        for(String word: words){
            if(word.length() == length){
                System.out.println(word);
            }
        }
    }
}
