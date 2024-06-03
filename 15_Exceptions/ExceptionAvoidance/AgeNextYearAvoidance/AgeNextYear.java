public class AgeNextYear {
    private static boolean isNonEmptyDigits(String shouldbeDigits) {
        boolean okaySoFar = shouldbeDigits.length() != 0;
        int index = 0;
        while (okaySoFar && index < shouldbeDigits.length()) {
            okaySoFar = Character.isDigit(shouldbeDigits.charAt(index));
            index++;
        }
        return okaySoFar;
    }
    public static void main (String args[]) {
        if (args.length > 0 && isNonEmptyDigits(args[0])) {
            int ageNow = Integer.parseInt(args[0]);
            int ageNextYear = ageNow + 1;

            System.out.println("Your age now is " + ageNow);
            System.out.println("Your age next year will be " + ageNextYear);
        }
        else
            System.out.println("Please supply your age as a whole number");
    } // main
} // class AgeNextYear
