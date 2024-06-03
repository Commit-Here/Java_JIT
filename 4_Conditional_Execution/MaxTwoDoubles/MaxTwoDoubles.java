public class MaxTwoDoubles {
    public static void main(String args[]) {
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        double max = number1;
        if (number1>number2)
            max = number1;
        else 
            max = number2;
        
        System.out.println("The maximum number among " + number1 +
                            " and " +  number2 + " is " + max);
    }
}