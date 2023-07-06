// Java code to illustrate countTokens() method

import java.util.*;

public class Tokens {
    public static void main(String args[])
    {

        // Creating a StringTokenizer
        StringTokenizer str_arr
                = new StringTokenizer(
                "welcome...to  the matrix.\n" +
                        "      4       hello  !");

        // Counting the tokens
        int count = str_arr.countTokens();
        System.out.println("Total number of Tokens: "
                + count);

        // Print the tokens
        for (int i = 1; i <= count; i++)
            System.out.println("token at [" + i + "] : "
                    + str_arr.nextToken());
    }
}
