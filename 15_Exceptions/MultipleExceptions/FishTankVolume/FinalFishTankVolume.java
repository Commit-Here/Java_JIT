public class FinalFishTankVolume{
    public static void main(String[] args) {
        try{
            int width  = Integer.parseInt(args[0]); 
            int depth = Integer.parseInt(args[1]);
            int height = Integer.parseInt(args[2]);
            if (args.length > 3)
                throw new ArrayIndexOutOfBoundsException("You have supplied " + args.length 
                                                          + " arguments!");
            if (width < 0 || depth < 0 || depth < 0) 
                throw new NumberFormatException("Dimension width, depth or height is negative!");          

            int volume = width * height * depth;
            System.out.println("The volume of a tank with dimensions "
                                + "(" + width + "," + depth + "," + height + ") "
                                + "is " + volume);
        } // try

        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Please supply all three dimensions (width, height, depth)");
            System.out.println("Exception message was: '" + exception.getMessage() + "'");
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
} // class FinalFishTankVolume