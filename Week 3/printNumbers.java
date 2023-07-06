public class printNumbers {
    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);
    }
    public static void printNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.print("[" + i + "]");
        }
        System.out.println("");
    }
}
