// A class to represent a point.
public class Point{
    // X and Y cooridnate of a point
    private double xOrdinate, yOrdinate;

    // Constructor
    public Point(double requiredX, double requiredY){
        xOrdinate = requiredX;
        yOrdinate = requiredY;
    } // Point

    // Getter
    public double getX(){
        return xOrdinate;
    }
    public double getY(){
        return yOrdinate;
    }
    public double distanceFrom(Point other){
        return Math.sqrt(Math.pow((xOrdinate - other.getX()), 2) 
                            + Math.pow((yOrdinate - other.getY()), 2));
    } // distanceFrom
    // used to shift a point by some value.
    // public Point shift(double shiftX, double shiftY){
    //     return new Point(xOrdinate + shiftX, yOrdinate + shiftY);
    // }// shift

    // String representation of a point.
    public String toString(){
        return "(" + xOrdinate + ", " + yOrdinate + ")";
    } // toString
} // class Point