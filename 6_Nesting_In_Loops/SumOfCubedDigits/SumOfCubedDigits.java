// A program to find 4 numbers that come in range 100 - 999
// Having property that the sum of the cubes of the three digits 
// in the number is equal to number itself eg: 153 = 1^3 + 2^3 + 5^3.
public class SumOfCubedDigits {
    public static int number(int hundredth, int tens, int ones) {
        return hundredth * 100 + tens * 10 + ones;
    }
    public static int sumOfCube(int d3, int d2, int d1) {
        int hun = (int)Math.pow(d3, 3);
        int ten = (int)Math.pow(d2, 3);
        int one = (int)Math.pow(d1, 3);
        return hun+ten+one;
    }
    public static void main(String args[]) {
        for (int hundredPlace = 1; hundredPlace<=9; hundredPlace++) 
            for (int tensPlace = 0; tensPlace<=9; tensPlace++) 
                for (int onesPlace = 0; onesPlace<=9 ;onesPlace++) {
                        int value = number(hundredPlace, tensPlace, onesPlace);
                        int sumValue = sumOfCube(hundredPlace, tensPlace, onesPlace);
                        if (value == sumValue)
                            System.out.println(value);
            } // for
    } // main
} // class SumOfCubedDigits