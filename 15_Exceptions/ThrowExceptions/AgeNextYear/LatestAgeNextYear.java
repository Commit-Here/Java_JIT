public class LatestAgeNextYear {
    public static void main (String args[]) {
        try {
            int ageNow = Integer.parseInt(args[0]);
            int ageNextYear = ageNow + 1;

            System.out.println("Your age now is " + ageNow);
            System.out.println("Your age next year will be " + ageNextYear);
        } // try

        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Please supply your age");
            System.err.println(exception);
        } // catch

        catch (NumberFormatException exception) {
            System.out.println("Your age must be a whole number");
            System.out.println("Exception message was: '" + exception.getMessage() + "'");
            System.err.println(exception);
        } // catch


        catch (Exception exception) {
            System.out.println("Something unforseen has happened. :-(");
            System.out.println("Exception message was: '" + exception.getMessage() + "'");
            System.err.println(exception);
        } // catch
    } // main
} // class LatestAgeNextYear