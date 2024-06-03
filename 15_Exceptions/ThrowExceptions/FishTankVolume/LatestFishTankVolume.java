public class LatestFishTankVolume{
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

        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Please supply all the dimensions (width, height, depth)");
            System.err.println(exception);
        } // catch

        catch (NumberFormatException exception) {
            System.out.println("Each Dimension must be a whole number");
            System.out.println("Exception message was: '" + exception.getMessage() + "'");
            System.err.println(exception);
        } // catch


        catch (Exception exception) {
            System.out.println("Something unforseen has happened. :-(");
            System.out.println("Exception message was: '" + exception.getMessage() + "'");
            System.err.println(exception);
        } // catch      
    } // main
} // class LatestFishTankVolume