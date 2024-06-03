public class NewAgeNextYear {
    public static void main (String args[]) {
        try {
            int ageNow = Integer.parseInt(args[0]);
            int ageNextYear = ageNow + 1;

            System.out.println("Your age now is " + ageNow);
            System.out.println("Your age next year will be " + ageNextYear);
        } // try
        catch (Exception exception) {
            System.out.println("Please supply your age as a whole number");
            System.out.println("Exception message was: '" + exception.getMessage() + "'");
            System.err.println(exception);
        } // catch
    } // main
} // class NewAgeNextYear
