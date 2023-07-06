/* Add your name here: Pavel Stepanov */
// Do not change the Class name and the main.

import java.io.*;    // for File
import java.util.*;  // for Scanner

public class HoursTask {

    public static void main (String [] args) throws FileNotFoundException { //comeuser input validation in main
        try {
            Scanner input = new Scanner(new File("/Users/pavelstepanov/Desktop/CS/HoursAssignment/src/hours.txt")); // List all Employees.
            Scanner userInput = new Scanner(System.in);
            // user input validation in main
            String answer;
            int searchId;
            do {
                try {
                    // user input validation in main
                    System.out.print("Enter an ID: ");
                    searchId = userInput.nextInt(); // Enter ID

                    String line = findPerson(input, searchId);
                    if (line.length() > 0) {
                        processLine(line);
                    } else {
                        System.out.println("ID #" + searchId + " not found\n");
                    }
                } catch (Exception e) {
                    System.out.println("ID is not valid\n");
                }
                System.out.print("Do you want to search again? ");
                answer = userInput.next();

            }
            while (answer.charAt(0) != 'n' && answer.charAt(0) != 'N');
                System.out.println("\nHave a nice day!");

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }


    public static String findPerson(Scanner input, int searchId) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);
            int id = lineScan.nextInt();
            if (id == searchId) {
                return line;

            }

        }
        return "";
    }
    public static void processLine(String line) {

        Scanner lineScan = new Scanner(line); // process each person

        // process the contents of this line
        int id = lineScan.nextInt();
        String name = lineScan.next();
        double totalHours = 0;
        int day = 0;

        while (lineScan.hasNextDouble()) {
            totalHours += lineScan.nextDouble();
            day++;
        }
        System.out.println(name + " worked " + totalHours + " hours ("
                + (totalHours / day) + " hours/day)");


    }
}