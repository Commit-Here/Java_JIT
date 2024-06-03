/**
 * This class includes mathematics and provides
 * certain manipulations of numbers.
 * 
 * @author Burhan Khan
 */
public class MyMath{
    /**
     * Computes the greatest common divisor of two numbers. 
     * The numbers must be positive
     * 
     * @param multiple1OfGCD One of the numbers.
     * @param multiple2OdGCD The other number.
     * @return The GCD of multiple1OfGCD and multiple2OfGCD.
     */
    public static int greatestCommonDivisor(int multiple1OfGCD, int multiple2OfGCD){
        while (multiple1OfGCD != multiple2OfGCD)
            if (multiple1OfGCD > multiple2OfGCD) 
                multiple1OfGCD-=multiple2OfGCD;
            else
                multiple2OfGCD-=multiple1OfGCD;
        return multiple1OfGCD;
    } // greatestCommonDivisor
}