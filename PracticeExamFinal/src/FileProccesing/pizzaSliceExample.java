package FileProccesing;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class pizzaSliceExample {
    public static void main(String[] args) throws Exception {
        try {
            Scanner input = new Scanner(new File("/Users/pavelstepanov/Desktop/CS/PracticeExamFinal/src/FileProccesing/pizza.txt"));
            pizza(input);


        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     *
     * @param input
     */
    public static void pizza(Scanner input) {

        while (input.hasNextLine()) {
            int slicePizza = 0;
            int boxes = 0;
            String line = input.nextLine().toLowerCase();
            Scanner linescan = new Scanner(line);

            while (linescan.hasNext()) {
                boxes++;
                String oneToken = linescan.next();
                if (oneToken.equals("slice")) {
                    slicePizza++;
                }
                if (oneToken.equals("half")) {
                    slicePizza += 4;
                }
                if (oneToken.equals("whole")) {
                    slicePizza += 8;
                }
            }
            int usedBoxes = slicePizza / 8;
            if (usedBoxes % 8 != 0 ) {
                usedBoxes++;
            }
            System.out.println(usedBoxes + " / " + boxes + " pizza boxes used");

        }


    }
}
