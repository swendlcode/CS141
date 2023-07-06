// Do not change this code. 
// run this client code with your Cipher.java
// 1. compile Cipher.java
// 2. run CaesarCipherClient.java 
// do not submit this code on Canvas. Only submit the Cipher.java

import java.util.*; // for Scanner

public class CaesarCipherClient {
   public static void main (String [] args) {
      Scanner console = new Scanner (System.in);
      
      System.out.print ("Your Message? ");
      String message = console.nextLine();
      System.out.print ("Encoding Key? ");
      int key = console.nextInt();
      
      // Place your Cipher.java in the same directory where you saved the main. 
      // you have to use the following names: Cipher.java and cipher for the method.
      Cipher.cipher(message, key);
   }
}


