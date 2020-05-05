package studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class CountingCharacters {
    public static void main(String[] args){
        String quote = "If the product of two terms is zero then common sense says at least one " +
                "of the two terms has to be zero to start with. So if you move all the terms over " +
                "to one side, you can put the quadratics into a form that can be factored allowing " +
                "that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";

        char[] charactersInString = quote.toCharArray();
        HashMap<Character, Integer> letters = new HashMap<>();

        int count = 1;
        for(char letter: charactersInString){
            if(letters.containsKey(letter)){
                count = letters.get(letter);
                count++;
                letters.replace(letter, count);
            }else if(!letters.containsKey(letter)){
                letters.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }

    public static String read() {
        File myObj = new File("studios.Words.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }
}
