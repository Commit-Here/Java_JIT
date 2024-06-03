// Program to print out an isoceles right angle triangle mirrored.
// The height (which is also the width) is given as an argument.
// We assume the argument represent the positive integer.
public class PrintTriangleMirror {
    public static void main(String args[]) {
        // The height (also the width) of the triangle
        int height = Integer.parseInt(args[0]);

        // Print out height number of rows.
        for (int row = 1; row <= height; row++) {
            for (int space = 1; space <= row-1; space++)
                System.out.print("   ");
            // Print out width number of rows. 
            for (int col = height; col >= row; col--)
                System.out.print("[_]");
            // End the line.
            System.out.println();
        } // for
    } // main
} // class PrintTriangle.