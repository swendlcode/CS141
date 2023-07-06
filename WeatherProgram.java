import java.util.Random;
import java.util.Scanner;

public class WeatherProgram {
    public static void main(String[] args) {
        Scanner userKeyboard = new Scanner(System.in);
        Random randomWeather = new Random();
        double sum = 0;
        double avarage = 0;
        int count = 0;

        System.out.print("How many days' temperatures: ");
        int days = userKeyboard.nextInt();
        int[] temperature = new int[days];
        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Day " + (i + 1) + "'s " + "high temp: ");
            temperature[i] = userKeyboard.nextInt();
            sum += temperature[i];

        }
        avarage = sum/days;
        System.out.println();
        System.out.printf("Average temp = %.1f  ", avarage );
        System.out.println();
        for (int  i = 0; i < temperature.length; i++) {
            if (temperature[i] > avarage) {
                count++;

            }
        }
        System.out.println(count + " days were above average.");

    }

}
