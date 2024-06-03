public class MinimumBitWidth {
    public static void main(String args[]) {
        int noOfBits = 0;
        int numberOfValues = Integer.parseInt(args[0]);
        while (Math.pow(2, noOfBits) < numberOfValues)
            noOfBits += 1;

        System.out.println("You need " + noOfBits + " bits to represent " 
                            + numberOfValues + " values");
    }
}