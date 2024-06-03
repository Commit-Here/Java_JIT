public class Variance {
    public static void main(String args[]) {
        int sumSoFar = Integer.parseInt(args[0]);
        double sumOfDeviations = 0;
        double average;
        for (int argIndex = 1; argIndex < args.length; argIndex++) 
            sumSoFar += Integer.parseInt(args[argIndex]); 
        
        average = sumSoFar / (double)args.length;

        for (int argIndex = 0; argIndex < args.length; argIndex++) 
            sumOfDeviations += Math.pow((Integer.parseInt(args[argIndex]) - average), 2);

        System.out.println("The mean average is " + average);
        System.out.println("The variance is " + sumOfDeviations / args.length);
    }
}