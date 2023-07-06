package ObjectsandClasses;

public class Rectangle {
    private double width;
    private double height;

    /**
     * Default settings
     */
    public Rectangle() {
        width = 1;
        height = 1;

    }

    /**
     *
     * @param w
     * @param h
     */
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return width * height;
    }

    /**
     *
     * @return
     */
    public double getPerimetr() {
        return 2 * (width + height);
    }

    /**
     *
     * @return
     */
    public String toString() {
        return ("Rectangle width = " + width + ",height = " + height);
    }

    /**
     *
     * @param rec
     * @return sameHeight && sameWidth
     * @version Part 1
     */
    public boolean equals(Rectangle rec) {
        boolean sameHeight, sameWidth;

        sameHeight = (getHeight() == rec.getHeight());
        sameWidth = (getWidth() == rec.getWidth());
        return sameHeight && sameWidth;
    }

}
