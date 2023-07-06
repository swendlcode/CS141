public class PointMain {
    public static void main(String[] args) {
        Point p = new Point(2,3);
        Point p1 = new Point();
        p1.setX(10);
        System.out.println(p1.findDistance(p));

    }
}