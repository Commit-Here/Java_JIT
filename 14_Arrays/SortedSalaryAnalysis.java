import java.util.Scanner;

/* This program anlyses iinteger salaries entered by the user.
   It outputs each salary together with its difference from the
   mean of the salaries. There must be at least one salary.
   The salaries are output in ascending order.
 */
public class SortedSalaryAnalysis {
    public static void main(String[] args) {
        // A scanner for getting data from the user.
        Scanner salariesScanner = new Scanner(System.in);

        System.out.print("Enter the number of salaries: ");
        int numberOfSalaries = salariesScanner.nextInt();

        // Salaries are ints, stored in an array.
        int[] salaries = new int[numberOfSalaries];

        // Obtian the salaries from the input.
        for (int index = 0; index < numberOfSalaries; index++) {
            System.out.print("Enter salary # " + (index + 1) + ": ");
            salaries[index] = salariesScanner.nextInt();
        } // for

        int sumOfSalaries = 0;
        // Now compute the sum of the salaries(for each loop)
        for (int salary : salaries)
            sumOfSalaries += salary;
        /* shortcut for loop of:
            for (int index = 0; index < salaries.length; index++) {
                int salary = salaries[index];
                sumOfSalaries += salary;
            }
         */
        // Compute the mean, which is a double, not an integer
        double meanSalary = sumOfSalaries / (double) numberOfSalaries;

        // But we want to round it to simplify our results.
        int meanSalaryRounded = (int) Math.round(meanSalary);

        // Sort the salaries in ascending order.
        sort(salaries);

        // Produce the results.
        System.out.println();
        System.out.println("The mean salary is:\t" + meanSalary);
        System.out.println("which rounds to:\t" + meanSalaryRounded);
        System.out.println();

        for (int index = 0; index < numberOfSalaries; index++) {
            int differenceFromMean = salaries[index] - meanSalaryRounded;
            String comparisonFromMean = differenceFromMean == 0
                                        ? "zero difference from"
                                        : (differenceFromMean < 0
                                            ? "less than" : "greater than");
            System.out.printf("Person %2d earns %5d, which is %5d %s the mean%n",
                              (index + 1), salaries[index],
                              Math.abs(differenceFromMean), comparisonFromMean);
        } // for
    } // main

    // Sorting salaries.
    public static void sort(int[] sortedSalaries) {
        // Using bubble sort
        // Each pass of the sort reduces the unsortedLength by one.
        int unsortedLength = sortedSalaries.length;
        // If no change is made on pass, the main loop can stop.
        boolean changedOnThisPass;
        do {
            changedOnThisPass = false;
            for (int pairLeftIndex = 0; pairLeftIndex < unsortedLength - 1; pairLeftIndex++)
                if (sortedSalaries[pairLeftIndex] > sortedSalaries[pairLeftIndex + 1]) {
                    int thatWasAtPairLeftIndex = sortedSalaries[pairLeftIndex];
                    sortedSalaries[pairLeftIndex] = sortedSalaries[pairLeftIndex + 1];
                    sortedSalaries[pairLeftIndex + 1] = thatWasAtPairLeftIndex;
                    changedOnThisPass = true;
                } // if
            unsortedLength--;
        } while(changedOnThisPass);
    } // sort
} // class SortedSalaryAnalysis