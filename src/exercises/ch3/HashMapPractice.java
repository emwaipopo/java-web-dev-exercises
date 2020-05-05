package exercises.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newId;
        String newStudent;

        System.out.println("Enter your students (or 0 to finish):");

        // Get student names and ID.
        do {
            System.out.print("Student ID#: ");
            newId = input.nextInt();

            if (newId != 0) {
                System.out.print("Student Name: ");
                newStudent = input.next();
                students.put(newId, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(newId != 0);

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
