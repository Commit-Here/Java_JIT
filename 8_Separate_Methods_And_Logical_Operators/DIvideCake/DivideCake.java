// Program to decide how to divide a cake in proportion to the age of three
// persons, using the minimum number of equal sized portions.
// THe three arguments are the three positive integer args.
public class DivideCake {
    // Find the GCD of two positive integers
    public static int GCD(int multiple1OfGCD, int multiple2OfGCD) {    
        while (multiple1OfGCD != multiple2OfGCD)
            if (multiple1OfGCD > multiple2OfGCD) 
                multiple1OfGCD-=multiple2OfGCD;
            else
                multiple2OfGCD-=multiple1OfGCD;
            return multiple1OfGCD;
    } // GCD
    public static void main(String args[]){
        // All ages must be positive
        // First person's age.
        int age1 = Integer.parseInt(args[0]);
        // Second person's age.
        int age2 = Integer.parseInt(args[1]);

        // This is a multiple of GCD, intially age1.
        int multiple1OfGCD = age1;
        // This is a multiple of GCD, intially age2.
        int multiple2OfGCD = age2;


        // Compute the GCD of these three.
        // While the two multiples are not same, the difference
        // between them must also be multiple of GCD.

        // E.g X = x * d, Y = y * d, (X - Y) = (x - y) * d

        // So we keep subtracting the smallest form the largest
        // untill they are equall
        multiple1OfGCD = GCD(multiple1OfGCD, multiple2OfGCD);
        
        // Now multiple1OfGCD == multiple2OfGCD
        // which is the GCd of age 1 and age2.
        System.out.println("The GCD of " + age1 + " and " + age2 
                            + " is " + multiple1OfGCD);

        // Calculate the number of portions for each person.
        int noOfPortions1 = age1 / multiple1OfGCD;
        int noOfPortions2 = age2 / multiple1OfGCD;

        // Report the number of portions.
        System.out.println("So the cake should be divided into "
                            + (noOfPortions1 + noOfPortions2));
        
        // Report the number of portions for each person.
        System.out.println("The " + age1 + " year old gets " + noOfPortions1
                            + " and the " + age2 + " year old gets " + noOfPortions2 );
    } // main
} // class DivideCake