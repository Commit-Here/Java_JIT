// A program to estimate PI using Leibniz's formula
// Argument is desired tolerance between successive terms.
// Reports the estimate, the number of terms.
// and the library constant for comparison.
public class PiEstimation {
    public static void main(String args[]) {
        // The tolerance is the minimum difference between successive
        // terms before we stop esimating.
        double tolerance = Double.parseDouble(args[0]);

        // The value of the next term denominator, initially 1.
        double latestTerm;

        // The result from our latest estimate, eventually the final result.
        double latestEstimate = 4;

        // we count the terms, initially 1 for the 4.
        int termCountSoFar = 1;

        // The value of the next term denominator, initially 3.
        int nextDenominator = 3;

        // The sign of the next term, initially -ve.
        int nextNumeratorSign = -1;
        
        // Keep addding terms until change is within tolerance.
        do {
            latestTerm = nextNumeratorSign * 4.0 / nextDenominator;
            latestEstimate += latestTerm;
            termCountSoFar++;
            nextDenominator += 2;
            nextNumeratorSign *= -1;
        } while(Math.abs(latestTerm) > tolerance);

        System.out.println("The estimated value of Pi to tolerance " + tolerance
                            + " is " + latestEstimate);
        System.out.println("The estimate used " + termCountSoFar + " terms");
        System.out.println("The library value of Pi is " + Math.PI);
    } // main
} // class PiEstimation