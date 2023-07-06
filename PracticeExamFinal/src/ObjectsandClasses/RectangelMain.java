package ObjectsandClasses;

/**
 * 2. Write a code segment that might be found in a main
 * method that creates two Rectangle objects.
 */


public class RectangelMain {
    public static void main(String[] args) {
        /**
         * Using the appropriate constructor, assign width
         * 6 and height 20 to the first object and width 2.5
         * and height 3.9 to the second object.
         */
        Rectangle p1 = new Rectangle(6, 20);
        Rectangle p2 = new Rectangle(2.5, 3.9);

        /**
         * Display the properties of both objects
         */

        System.out.println(p1);
        System.out.println(p2);

        /**
         * find their perimeters
         */
        System.out.println(p1.getPerimetr());
        System.out.println(p2.getPerimetr());
    }
}
