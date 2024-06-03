public class FishTankVolume{
    private static boolean isNonEmptyDigits(String shouldbeDigits) {
        boolean okaySoFar = shouldbeDigits.length() != 0;
        int index = 0;
        while (okaySoFar && index < shouldbeDigits.length()) {
            okaySoFar = Character.isDigit(shouldbeDigits.charAt(index));
            index++;
        } // while
        return okaySoFar;
    } // isNonEmptyDigits

    private static boolean checkAllArgs(String[] dimensions) {
        boolean allCheck = dimensions.length != 0;
        int index =  0;
        while (allCheck && index < dimensions.length){
            allCheck = isNonEmptyDigits(dimensions[index]);
            index++;
        }
        return allCheck;
    } // checkAllArgs
    
    public static void main(String[] args) {
        if (args.length > 0 && checkAllArgs(args)){
            int width  = Integer.parseInt(args[0]); 
            int depth = Integer.parseInt(args[1]);
            int height = Integer.parseInt(args[2]);
            int volume = width * height * depth;
            
            System.out.println("The volume of a tank with dimensions "
                                + "(" + width + "," + depth + "," + height + ") "
                                + "is " + volume);
        } // if
        else
            System.out.println("Please supply all three of your dimensions as a whole number");         
    } // main
} // class FishTankVolume