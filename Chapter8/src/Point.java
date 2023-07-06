/** A Point class representing a point in (x, y) coordinate space. 
 * @author CS141 Class Demo
 * @version 1.0v
 * 
 */
public class Point {
   
   /** The x coordinate of this Point */
   private int x;  
   /** The y coordinate of this Point */
   private int y;
   
   /** Construct and initialize a point at the specified (initialX, initialY) location
    * @param initialX the x coordinate of the newly constructed Point
    * @param initialY the y coordinate of the newly constructed Point
    */
   public Point(int initialX, int initialY) {
      this.x = initialX; 
      this.y = initialY;
   }
   
   /** Construct and initialize a point at the origin (0,0)
    */
   public Point () {
      this(0,0);
   }
   
   /** Returns a string representation of this point and its (x,y) location. 
    *    
    * @return a string representation of this point
    */
    @Override
    
   public String toString () {
      return "(" + x + ", " + y + ")";
   }
   
   /** Access the x coordinate of this Point object and return in int precision
    * @return the x coordinate of this Point object
    */
   public int getX() {
      return x;
   }
   
   /** Sets the x coordinate of this object to the specified int value.
    * @param newX the X coordinate of the new x coordinate
    */
   public void setX(int newX) {
      x = newX;
   }
   
   /** Calculates the distance between this point and the origin (0,0)
    * @return the distance between this point and the origin (0,0)
    */   
   public double distanceFromOrigin () {
      return Math.sqrt (x*x+y*y);
   }
   
   /** Calculates the distance between two point objects
    * @param other the other Point object
    * @return the distnace between this point and other
    */
   public double distance (Point other) {
      return Math.sqrt (Math.pow(x-other.x,2)+Math.pow(y-other.y,2));
   }
}