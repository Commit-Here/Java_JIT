// This Class represents a Triangle
public class Triangle{
    // THree corners of triangles
    public final Point cornerA, cornerB, cornerC;
    private final double sideA, sideB, sideC;

    // Constructor
    public Triangle(Point pointA, Point pointB, Point pointC){
        cornerA = pointA;
        cornerB = pointB;
        cornerC = pointC;
        sideA = calculateSide(cornerA, cornerB);
        sideB = calculateSide(cornerA, cornerC);
        sideC = calculateSide(cornerB, cornerC);
    } // Triangle

    // method to shift triangle coOrdinates by some value
    public Triangle shift(double xShift, double yShift){
        return new Triangle(new Point(cornerA.getX()+xShift, cornerA.getY()+yShift), 
                            new Point(cornerB.getX()+xShift, cornerB.getY()+yShift),
                            new Point(cornerC.getX()+xShift, cornerC.getY()+yShift));
    } // shift

    // Class method to calculate area of triangle.
    public double area(){
        double semiPerimeter = (sideA + sideB + sideC)/2;
        return Math.sqrt((semiPerimeter) * (semiPerimeter - sideA) 
                        * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    } // area

    // Class method to calculate perimeter of triangle.
    public double perimeter(){
        return sideA + sideB + sideC;
    } // perimeter

    private static double calculateSide(Point vertixA, Point vertixB){
        return vertixA.distanceFrom(vertixB);
    } // side

    // String representation of a String
    public String toString(){
        return "Triangle(" + cornerA + ", " + cornerB + ", " + cornerC + ")";
    } // toString
} // class Triangle