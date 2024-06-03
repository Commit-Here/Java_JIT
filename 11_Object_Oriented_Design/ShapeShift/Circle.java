// This Class represents a Rectangle
public class Circle{
    // Fourth corners of Rectangle
    private Point centre;
    private double radius;

    // Constructor
    public Circle(Point requiredCentre, double requiredRadius){
        centre = requiredCentre;
        radius = requiredRadius;
    } // Rectangle

    // method to shift Rectangle coOrdinates by some value
    public Circle shift(double xShift, double yShift){
        return new Circle(new Point(centre.getX() + xShift, centre.getY() + yShift), radius);
    } // shift

    // Class method to calculate area of triangle.
    public double area(){
        return Math.PI * radius * radius;
    } // area

    // Class method to calculate perimeter of triangle.
    public double perimeter(){
        return 2 * Math.PI * radius;
    } // perimeter

    // String representation of a rectangle
    public String toString(){
        return "Circle(" + centre + ", " + radius + ")";    
    } // toString
} // class Rectangle