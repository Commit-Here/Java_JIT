public class FinalAgeNextYear {
    public static void main (String args[]) {
        try {
            int ageNow = Integer.parseInt(args[0]);

            if (args.length > 1)
                throw new ArrayIndexOutOfBoundsException("You have supplied " + args.length 
                                                          + " arguments!");
            if (ageNow < 0)
                throw new NumberFormatException("Your age of " + ageNow + " is negative!");

            int ageNextYear = ageNow + 1;
            System.out.println("Your age now is " + ageNow);
            System.out.println("Your age next year will be " + ageNextYear);
        } // try

        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Please supply your age and nothing else.");
            System.out.println("Exception message was: '" + exception.getMessage() + "'");
            System.err.println(exception);
        } // catch

        catch (NumberFormatException exception) {
            System.out.println("Your age must be a non-negative whole number!");
            System.out.println("Exception message was: '" + exception.getMessage() + "'");
            System.err.println(exception);
        } // catch


        catch (Exception exception) {
            System.out.println("Something unforseen has happened. :-(");
            System.out.println("Exception message was: '" + exception.getMessage() + "'");
            System.err.println(exception);
        } // catch
    } // main
} // class FinalAgeNextYear