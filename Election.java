/* Add your name here: Pavel Stepanov */
// Do not change the Class name and the main.

import java.io.*;    // for File
import java.util.*;  // for Scanner

public class Election {

   public static void main (String [] args)  {
      try {
         Scanner input = new Scanner (new File ("/Users/pavelstepanov/Desktop/CS/ElectionFileProcessing/src/poll.txt"));
         pollResult (input);
      } catch (FileNotFoundException e) {
         System.out.println (e);    
      }

   }

   public static void pollResult(Scanner input) {
      int totalvotesObiWan = 0;
      int totalvotesDarthVader = 0;

      while (input.hasNext()) {
         String line = input.nextLine();
         Scanner lineScan = new Scanner(line);
         String state = lineScan.next();
         int votesObiWan = lineScan.nextInt();
         int votesDarthVader = lineScan.nextInt();
         int additionalVotes = lineScan.nextInt();
         if(votesObiWan > votesDarthVader){
            totalvotesObiWan += additionalVotes;
         }
         else if (votesObiWan < votesDarthVader ){
            totalvotesDarthVader += additionalVotes;
         }

      }
      System.out.println("Obiwan: " + totalvotesObiWan);
      System.out.println("DarthVader: " + totalvotesDarthVader);


   }


}