public class returnValue {
    public static void main(String[] args) {
        double result = Volume(10, 20);
        System.out.println(result);
    }

    public static double Volume(int minorRadius, int majorRadius) {
        pi = 3.14;
        return (pi*(minorRadius * minorRadius))*(2*pi*majorRadius);
}