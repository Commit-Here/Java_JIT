// Program to print out a rectangle.
// The width and then the height are given as arguments.
// We assume the arguments represent positive integers
public class PrintHoledRectangle {
    public static void main(String args[]) {
        // The width of the rectangle, in cells.
        int width = Integer.parseInt(args[0]);
        // The height of the rectangle, in cells.
        int height = Integer.parseInt(args[1]);

        // Print out the height number of rows.
        for (int row = 1; row <= height; row++) {
            // print out width the no of cells, on the same line.
            for (int col = 1; col <= width; col++) {
                if (row == (height+1)/2 && col == (width+1)/2)
                    System.out.print("[@]");
                else 
                    System.out.print("[_]");
            } // for
            // End the line
            System.out.println();
        } // for
    } // main
} // PrintHoledRectangle.