import java.util.Scanner;

/* This Program analyses integer marks entered by the user.
   It outputs each mark together with its difference from the
   mean of the marks. There must be at least one mark.
 */
public class SortedMarkAnalysis {
    public static void main(String[] args) {
        // Scanner to take marks from the user.
        Scanner marksScanner = new Scanner(System.in);

        System.out.print("Enter the no of marks: ");
        int numberOfMarks = marksScanner.nextInt();

        // marks are ints, stored in an array.
        int[] marks = new int[numberOfMarks];

        // Obtain the marks from the input.
        for (int index = 0; index < numberOfMarks; index++) {
            System.out.print("Enter mark # " + (index + 1) + ": ");
            marks[index] = marksScanner.nextInt();
        } // for

        // computing sum of marks , max , and min of marks.
        int sumOfMarks = 0, maxOfMarks = -9999, minOfMarks = 9999;
        for (int mark : marks) {
            sumOfMarks += mark;
            if (mark > maxOfMarks)
                maxOfMarks = mark;
            if (mark < minOfMarks)
                minOfMarks = mark;
        } // for

        // Compute the mean of marks.
        double meanOfMarks = sumOfMarks / (double) numberOfMarks;

        // sort the marks in ascending order.
        sort(marks);

        // Produce the results.
        System.out.println();
        System.out.println("The mean of marks is: " + meanOfMarks);
        System.out.println("The minimum mark is: " + minOfMarks);
        System.out.println("The maximum mark is: " + maxOfMarks);
        System.out.println();

        System.out.println("Person | Score | difference from mean");
        for (int index = 0; index < numberOfMarks; index++) {
            System.out.printf("%6d | %5d | %6.2f%n", (index + 1), marks[index],
                    (marks[index] - meanOfMarks));
        } // for
    } // main
    
    // Sorting Marks.
    public static void sort(int[] sortedMarks) {
        // Using bubble sort
        // Each pass of the sort reduces the unsortedLength by one.
        int unsortedLength = sortedMarks.length;
        // If no change is made on pass, the main loop can stop.
        boolean changedOnThisPass;
        do {
            changedOnThisPass = false;
            for (int pairLeftIndex = 0; pairLeftIndex < unsortedLength - 1; pairLeftIndex++)
                if (sortedMarks[pairLeftIndex] > sortedMarks[pairLeftIndex + 1]) {
                    int thatWasAtPairLeftIndex = sortedMarks[pairLeftIndex];
                    sortedMarks[pairLeftIndex] = sortedMarks[pairLeftIndex + 1];
                    sortedMarks[pairLeftIndex + 1] = thatWasAtPairLeftIndex;
                    changedOnThisPass = true;
                } // if
            unsortedLength--;
        } while(changedOnThisPass);
    } // sort
} // class SortedMarkAnalysis