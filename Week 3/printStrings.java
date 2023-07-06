public class printStrings {
    public static void main(String[] args) {
        printStrings("abc", 5);
    }

    public static void printStrings(String s, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(s);
        }
    }
}
