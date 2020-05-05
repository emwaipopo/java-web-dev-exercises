package exercises.ch3;

public class ArrayPractice {
    public static void main(String[] args){
        //1.Create and initialize an array with the following values in a single line.
        int[] numbers = {1, 1, 2, 3, 5, 8};

        //2.Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        for(int i : numbers){
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        //3.Divide the string at each space and store the individual words in an array.
        //5.change the delimiter to split the string into separate sentences.
        String verse = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] list = verse.split("\\.");

        //4.Print the array of words to verify that your code works.
        System.out.println(java.util.Arrays.toString(list));
    }
//    public static String passString(){
//        return
//    }
}
