public class RoundPennies {
    public static void main(String args[]){
        int pennies = Integer.parseInt(args[0]);
        int roundedPennies = pennies/100;
        if (pennies%100 >= 50)
            roundedPennies+=1;
        System.out.println("You have " + pennies + " no of pennies which is rounded to "
                            + roundedPennies + "$");
            
    }
}