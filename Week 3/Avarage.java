public class Avarage {
    public static void main(String[] args){
        double result = calculateAvg(1,2,3);
        System.out.println(result);
    }

    public static double calculateAvg(int a, int b, int c){
        double avg = (a+b+c)/3.0;
        return avg;
    }
}