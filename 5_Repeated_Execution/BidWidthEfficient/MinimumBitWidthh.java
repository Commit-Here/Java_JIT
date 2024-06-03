public class MinimumBitWidthh{
    public static void main(String args[]){
        int numberOfValues = Integer.parseInt(args[0]);
        int noOfBits = 0;
        int represents = 1;

        while(represents < numberOfValues){
            noOfBits+=1;
            represents*=2;
        }
        System.out.println("You need " + noOfBits + " bits to represent " 
                            + numberOfValues + " values");
    }
}