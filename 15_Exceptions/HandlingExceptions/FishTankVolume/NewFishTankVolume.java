public class NewFishTankVolume{
    public static void main(String[] args) {
        try{
            int width  = Integer.parseInt(args[0]); 
            int depth = Integer.parseInt(args[1]);
            int height = Integer.parseInt(args[2]);
            int volume = width * height * depth;
            
            System.out.println("The volume of a tank with dimensions "
                                + "(" + width + "," + depth + "," + height + ") "
                                + "is " + volume);
        } // try
        catch (Exception exception) {
            System.out.println("Please supply all three of your dimensions as a whole number"); 
            System.out.println("Exception message was: '" + exception.getMessage() + "'");
            System.err.println(exception);
        }        
    } // main
} // class NewFishTankVolume