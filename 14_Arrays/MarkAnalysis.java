import java.util.Scanner;

/* This Program analyses integer marks entered by the user.
   It outputs each mark together with its difference from the
   mean of the marks. There must be at least one mark.
 */

public class MarkAnalysis {
    public static void main(String[] args) {
        // A scanner to take marks from the user.
        Scanner marksScanner = new Scanner(System.in);

        System.out.print("Enter the number of marks: ");
        int numberOfMarks =  marksScanner.nextInt();

        // marks are ints, stored in an array
        int[] marks = new int[numberOfMarks];
        
        int sumOfMarks = 0, maxOfMarks = -99999, minOfMarks = 99999;
        
        // Obtain the marks from the input and compute the total sum.
        for (int index = 0; index < numberOfMarks; index++) {
            System.out.print("Enter mark # " + (index + 1) + ": ");
            marks[index] = marksScanner.nextInt();
            // To find minimum in an array
            if (minOfMarks > marks[index])
                minOfMarks = marks[index];
            // to find maximum in an array
            if (maxOfMarks < marks[index])
                maxOfMarks = marks[index];
            sumOfMarks += marks[index];
        } // for
        
        // Compute the mean, which is double, not an integer.
        double meanOfMarks = sumOfMarks / (double)numberOfMarks;

        // Produce the results.
        System.out.println();
        System.out.println("The mean mark is:\t" + meanOfMarks);
        System.out.println("The minimum mark is:\t" + minOfMarks);
        System.out.println("The maximum mark is:\t" + maxOfMarks);
        System.out.println();

        System.out.println("Person | Score | difference from mean");
        for (int index = 0; index < numberOfMarks; index++) {
            System.out.printf("%6d | %5d | %6.2f%n", (index + 1), marks[index],
                              (marks[index] - meanOfMarks));
        } // for
    } // main
} // class MarkAnalysis