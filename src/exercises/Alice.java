package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String verse = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?'";
        String lowerCaseVerse = verse.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Alice search term:");
        String term = input.nextLine().toLowerCase();
        input.close();

        int location = lowerCaseVerse.indexOf(term);
        int length = term.length();
        String newVerse = lowerCaseVerse.substring(location + length + 1);
        if(location > 0) {
            newVerse = lowerCaseVerse.substring(0, location - 1) + newVerse;
        }

        if(lowerCaseVerse.contains(term)){
            System.out.println("Search term '" + term + "' is found in the verse.");
            System.out.println("Search term '" + term + "' is found at index " + location + ".");
            System.out.println("Search term '" + term + "' has a length of " + length + ".");
            System.out.println("New Verse:" + newVerse);

        }else{
            System.out.println("Search term '" + term + "' is NOT found in the verse.");
        }
    }
}
