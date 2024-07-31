// Find the longest command line argument and report it and its position.
public class LongestArgumentOops {
    public static void main(String[] args) throws NullPointerException{
        try {
            if (args.length < 0)
                throw new NullPointerException("No Input given with command line.");
            else {
                Pair result = LongestString.findLongestString(args);
                int longestIndex = ((Integer)result.getFirst()).intValue();
                String longestArg = (String) result.getSecond();

                System.out.println("A longest argument was '" + longestArg + "'");
                System.out.println("of length " + longestArg.length());
                System.out.println("found at position " + (longestIndex + 1));
            } // else
        } // try
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        } // catch
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Daya kuch toh gadbad hai!");
        }
    } // main
} // class LongestArgument