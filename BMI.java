// Add your name and your section number here
// Do NOT change the file/Class name

public class BMI {

   // add your bmiCalculation method here
    
   // do not change the following main code
   public static void main (String [] args) {    
      bmiCalculation (70, 194.25);
      bmiCalculation (62.5, 130.5);
      bmiCalculation (50, 190);

   }

   public static void bmiCalculation(double weight, double height) {
      double result = height / (weight * weight) * 703;

      if (result < 18.5) {
         System.out.println("underweight " + "[" + result + "]");
      }
      else if (result <= 18.5) {
         System.out.println("normal " + "[" + result + "]");
      }
      else if (result <= 24.9) {
         System.out.println("normal " + "[" + result + "]");
      }
      else if (result <= 25) {
         System.out.println("overweight " + "[" + result + "]");
      }
      else if (result <= 29.9) {
         System.out.println("overweight " + "[" + result + "]");
      }
      else {
         System.out.println("obese " + "[" + result + "]");
      }
   }
}