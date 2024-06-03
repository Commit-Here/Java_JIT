// This Class represents a Rectangle
public class Rectangle{
    // Fourth corners of Rectangle
    private Point cornerA, cornerB, cornerC, cornerD, diag1End1, diag1End2;
    private double length, breadth;
    // Constructor
    public Rectangle(Point requiredDiag1End1, Point requiredDiag1End2){
        diag1End1 = requiredDiag1End1;
        diag1End2 = requiredDiag1End2;
        cornerA = diag1End1;
        cornerC = diag1End2;
        cornerB = new Point(diag1End1.getX(), diag1End2.getY());
        cornerD = new Point(diag1End2.getX(), diag1End1.getY());
        length = calculateSide(cornerA, cornerB);
        breadth = calculateSide(cornerB, cornerC);
    } // Rectangle

    // method to shift Rectangle coOrdinates by some value
    public Rectangle shift(double xShift, double yShift){
        return new Rectangle(new Point(diag1End1.getX()+xShift, diag1End1.getY()+yShift), 
                            new Point(diag1End2.getX()+xShift, diag1End2.getY()+yShift));
    } // shift

    // Class method to calculate area of triangle.
    public double area(){
        return length * breadth;
    } // area

    // Class method to calculate perimeter of triangle.
    public double perimeter(){
        return 2 * (length + breadth);
    } // perimeter

    private static double calculateSide(Point vertixA, Point vertixB){
        return vertixA.distanceFrom(vertixB);
    } // side


    // String representation of a rectangle
    public String toString(){
        return "Rectangle(" + cornerA + ", " + cornerB + ", " + cornerC + ", " + cornerD + ")";    
    } // toString
} // class Rectangle