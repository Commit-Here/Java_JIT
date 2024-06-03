public class LargestSquare {
    public static void main(String args[]) {
        int givenNo = Integer.parseInt(args[0]);
        int largestSqNo = givenNo;

        while (Math.pow(largestSqNo, 2) > givenNo)
            largestSqNo -= 1;
        
        System.out.println(largestSqNo);
    }
}