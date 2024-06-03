import java.util.Scanner;

/* this program perfomrs simple calculations and manipulations of simple 
    shapes expressed in two-dimensional coordinate geometry.

    First it asks the user to choose a shape, from a choice of three.
    Then it prompts for details of the shape.
    *   A circle is specified by giving the X and then Y coordinates of its 
        centre, followed by its radius.
    *   A triangle is specified by giving the X and Y coordinates of each of
        its three corner points.
    *   A rectangle (always axis-alligned) is specified by giving the X and Y
        coordinates of two of its diagonally opposite corner points.
    
    Following this date, the user is prompted to specify an X offset and a Y 
    offset.

    The program creates specified shape, and also a similar one, in which
    each point has been shifted by the X and Y offsets.

    The program then reports the following on the standard output.
    *   The details of the original shape -- giving all the points
        (one, tow, or four) and, for a circle, its radius.
    * The area and perimeter of the shape.
    * The details of shifted shape.
*/
public class ShapeShift {
    // A scanner to interact with the user.
    private static Scanner inputScanner = new Scanner(System.in);

    // Helper method to read a point from the input.
    private static Point inputPoint(String prompt){
        System.out.print(prompt);
        double x = inputScanner.nextDouble();
        double y = inputScanner.nextDouble();
        return new Point(x, y);
    } // inputPoint

    // The X and Y amount of shift the first shape to get the second.
    private static double xShift, yShift;

    // Helper method to read a X and Y shifts.
    private static void inputXYShifts(){
        System.out.print("Enter the offset as X Y: ");
        xShift = inputScanner.nextDouble();
        yShift = inputScanner.nextDouble();
    } // inputXYShifts
    
    // The main method
    public static void main(String args[]){
        // Obtain shape choice
        System.out.print("Choose circle (1), triangle (2), rectangle (3): ");
        int shapeChoice = inputScanner.nextInt();

        // Process the shape based on the choice.
        switch (shapeChoice){
            // Circle.
            case 1:
                Point centre = inputPoint("Enter the centre as X and Y: ");
                System.out.print("Enter the radius: ");
                double radius = inputScanner.nextDouble();
                Circle originalCircle = new Circle(centre, radius);
                inputXYShifts();
                Circle shiftedCircle = originalCircle.shift(xShift, yShift);
                System.out.println();
                System.out.println(originalCircle);
                System.out.println("has area " + originalCircle.area()
                                    + ", perimeter " + originalCircle.perimeter());
                System.out.println("and when shifted by X offset " + xShift
                                    + " and Y offset " + yShift + ", gives");
                System.out.println(shiftedCircle);
                break;
            // Triangle.
            case 2:
                Point pointA = inputPoint("Enter the point A as X and Y: ");
                Point pointB = inputPoint("Enter the point B as X and Y: ");
                Point pointC = inputPoint("Enter the point C as X and Y: ");
                Triangle originalTriangle = new Triangle(pointA, pointB, pointC);
                inputXYShifts();
                Triangle shiftedTriangle = originalTriangle.shift(xShift, yShift);
                System.out.println();
                System.out.println(originalTriangle);
                System.out.println("has area " + originalTriangle.area()
                                    + ", perimeter " + originalTriangle.perimeter());
                System.out.println("and when shifted by X offset " + xShift
                                    + " and Y offset " + yShift + ", gives");
                System.out.println(shiftedTriangle);
                break;
            // Rectangle.
            case 3: 
                Point diag1End1 = inputPoint("Enter one corner as X Y: ");
                Point diag1End2 = inputPoint("Enter opposite corner as X Y: ");
                Rectangle originalRectangle = new Rectangle(diag1End1, diag1End2);
                inputXYShifts();
                Rectangle shiftedRectangle = originalRectangle.shift(xShift, yShift);
                System.out.println();
                System.out.println(originalRectangle);
                System.out.println("has area " + originalRectangle.area()
                                    + ", perimeter " + originalRectangle.perimeter());
                System.out.println("and when shifted by X offset " + xShift
                                    + " and Y offset " + yShift + ", gives");
                System.out.println(shiftedRectangle);
                break;
        }
    }
}