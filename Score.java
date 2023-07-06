// Pavel Stepanov

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("/Users/pavelstepanov/Desktop/CS/histogramMidterm/src/midterm.txt")); //File pathway
            int [] dataBase = new int[101]; // Array
            while (input.hasNextLine()) {
                int score = input.nextInt(); // Select data / score
                dataBase[score]++; // Count student score
            }
            for (int i = 0; i < dataBase.length; i++) { //Format print
                System.out.print(i + ": ");
                for (int j = 0; j < (dataBase[i]); j++) {
                    System.out.print("*");
                }
                System.out.println(); // Space

            }



        }
        catch (Exception e) { //Check Error
            System.out.println("Error :( ");
        }
    }
}
