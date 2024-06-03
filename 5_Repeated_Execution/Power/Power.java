public class Power {
    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]);
        int raiseTo = Integer.parseInt(args[1]);
        int powOfNumber = number;

        for (int pow = 1; pow < raiseTo; pow++) 
            powOfNumber *= number;
        
        System.out.println(number + " raise to power " + raiseTo 
                            + " is equal to " + powOfNumber);
    }
}