public class Main {
    public static void main(String[] args) {
        printFence(8,5);


    }

    public static  void printFence(int a, int b) {
        int i = 0;
        int j = 0;
        System.out.print("+");
        while (j < b - 1) {
            j ++;
            while (i < a) {
                i++;
                System.out.print("-");
                if (i == a) {
                    System.out.print("+");
                    i = 0;
                    break;
                }
            }

        }

    }
}
