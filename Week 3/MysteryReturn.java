public class MysteryReturn {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        z = mystery(x, y, z);
        System.out.println(x + " " + y + " " + z);
        x = mystery(z, z, x);
        System.out.println(x + " " + y + " " + z);
        y = mystery(y, y, z);
        System.out.println(x + " " + y + " " + z);

    }

    public static int mystery (int z, int x, int y) {
        z--;
        x = 2*y+z;
        System.out.println(y + " " + z);
        return x;

    }
}