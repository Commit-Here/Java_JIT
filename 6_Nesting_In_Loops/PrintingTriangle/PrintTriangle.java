// Program to print out an isoceles right angle triangle.
// The height (which is also the width) is given as an argument.
// We assume the argument represent the positive integer.
public class PrintTriangle {
    public static void main(String args[]) {
        // The height (also the width) of the triangle
        int height = Integer.parseInt(args[0]);

        // Print out height number of rows.
        for (int row = 1; row <= height; row++) {
            // Print out width number of rows.
            for (int col = 1; col <= row; col++)
                System.out.print("[_]");
            // End the line.
            System.out.println();
        } // for
    } // main
} // class PrintTriangle.