import java.util.Random;
import java.util.Scanner;

public class AdditionGameEdit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random AmountProblemsNumber = new Random();

        //data game
        int points = 0;
        int failAnswer = 0;
        int result;

        // main: 2 incorrect answers in a row, then exit
        while (failAnswer < 2) {
            result = play(console, AmountProblemsNumber);
            if (result == 1) {
                points++;
            }
            else {
                failAnswer++;
            }
        }

        // main : awarding points and game summary on exit
        System.out.println("You earned " + points + " total points.");

    }
    public static int play(Scanner console, Random AmountProblemsNumber) {

        int amount = AmountProblemsNumber.nextInt(3) + 3;
        String generateProblem = "";
        int sum = 0;

        // Generator Number
        for (int i = 1; i <= amount; i++) {
            // Generate Problem
            int RandomNumbers = AmountProblemsNumber.nextInt(10) + 1;
            sum += RandomNumbers;
            System.out.print(RandomNumbers);
            if (i == amount) {
                break;
            }
            System.out.print(" + ");

        }
        System.out.print(generateProblem + " = ");
        int userAnswer = console.nextInt();
        if (userAnswer == sum) {
            return 1;
        }
        else {

            System.out.println("Wrong! The answer was " + sum);
            return 0;
        }
    }
}
