// Program to decide how to divide a cake in proportion to the age of three
// persons, using the minimum number of equal sized portions.
// THe three arguments are the three positive integer args.
public class DivideCake4 {
    public static int GCD(int multiple1OfGCD, int multiple2OfGCD) {    
        while (multiple1OfGCD != multiple2OfGCD)
            if (multiple1OfGCD > multiple2OfGCD) 
                multiple1OfGCD-=multiple2OfGCD;
            else
                multiple2OfGCD-=multiple1OfGCD;
            return multiple1OfGCD;
    }
    public static int GCD(int multiple1OfGCD, int multiple2OfGCD, int multiple3OfGCD, int multiple4OfGCD) {    
            return (
                GCD(GCD(multiple1OfGCD, multiple2OfGCD),
                    GCD(multiple3OfGCD, multiple4OfGCD))
            );
    }   
    public static void main(String args[]){
        // All ages must be positive
        // First person's age.
        int age1 = Integer.parseInt(args[0]);
        // Second person's age.
        int age2 = Integer.parseInt(args[1]);
        // Third person's age.
        int age3 = Integer.parseInt(args[2]);
        // Fourth person's age.
        int age4 = Integer.parseInt(args[3]);

        // This is a multiple of GCD, intially age1.
        int multiple1OfGCD = age1;
        // This is a multiple of GCD, intially age2.
        int multiple2OfGCD = age2;
        // This is a multiple of GCD, intially age3.
        int multiple3OfGCD = age3;
        // This is a multiple of GCD, intially age4.
        int multiple4OfGCD = age4;

        // Compute the GCD of these four.
        // While the two multiples are not same, the difference
        // between them must also be multiple of GCD.

        // E.g X = x * d, Y = y * d, (X - Y) = (x - y) * d

        // So we keep subtracting the smallest form the largest
        // untill they are equall
        int divisor = GCD(multiple1OfGCD, multiple2OfGCD, multiple3OfGCD, multiple4OfGCD);
        
        // Now multiple1OfGCD == multiple2OfGCD
        // which is the GCd of age 1 and age2.
        System.out.println("The GCD of " + age1 + ", " + age2 + ", " 
                            + age3 + " and " + age4 + " is " + divisor);

        // Calculate the number of portions for each person.
        int noOfPortions1 = age1 / divisor;
        int noOfPortions2 = age2 / divisor;
        int noOfPortions3 = age3 / divisor;
        int noOfPortions4 = age4 / divisor;
        // Report the number of portions.
        System.out.println("So the cake should be divided into "
                            + (noOfPortions1 + noOfPortions2 + noOfPortions3 + noOfPortions4));
        
        // Report the number of portions for each person.
        System.out.println("The " + age1 + " year old gets " + noOfPortions1
                            + ", the " + age2 + " year old gets " + noOfPortions2
                            + ", the " + age3 + " year old gets " + noOfPortions3
                            + " and the " + age4 + " year old gets " + noOfPortions4);
    } // main
} // class DivideCake