import java.util.Random;
import java.util.Scanner;

public class AdditionGame {
    public static void main(String[] args) {
        int Result = play();
        int delay = 50; // number of delays load
        for(int i = 0; i <= 25; i++) { // For loading answer :)
            long start = System.currentTimeMillis();
            while(start >= System.currentTimeMillis() - delay); // wait

            System.out.print("-");

        }
        System.out.println();
        System.out.println("You earned " + Result + " total points.");

    }

    public static int play() {
        Random AmountProblemsNumber = new Random();
        int Live = 2; // Player Live
        int Points = 0; // Win Points
        // Scanner Class
        Scanner console = new Scanner(System.in); // Scanner Class

        while (Live > 0) {
            // Generator for game
            int amount = AmountProblemsNumber.nextInt(3) + 3;
            int sum  = 0;

            // Generator Number
            for (int i = 1; i <= amount; i++) { // Generate Problem
                int RandomNumbers = AmountProblemsNumber.nextInt(10) + 1;
                sum += RandomNumbers;
                System.out.print(RandomNumbers);
                if (i == amount) {
                    break;
                }
                System.out.print(" + ");

            }

            System.out.print(" = ");
            int Answer = console.nextInt();


            if(Answer == sum) {
                Points++;
            }
            else {
                System.out.println("Wrong! The answer was " + sum);
                Live--;
            }


        }


        return Points;
    }

}
