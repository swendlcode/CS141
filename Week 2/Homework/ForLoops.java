public class ForLoops {
    public static void main(String[] args) {
        First();
        System.out.println();
        Second();
    }

    public static void First() {
        for (int colume = 1; colume <= 5; colume++) { // Colume
            for (int i = 1; i <= 9; i++) { // How many digits?
                for (int j = 0; j < 2; j++) { // How many do I need to repaete?
                    System.out.print(i);
                }
            }
            System.out.println(" "); // New line
        }
    }

    public static void Second() {
        for (int i = 0; i < 4; i++) {
            System.out.print("!###");
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.print("!");
            System.out.println("");
        }
    }
}