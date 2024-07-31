// Find the longest command line argument and report it and its position.
public class LongestArgument {
    public static void main(String[] args) throws NullPointerException{
        try {
            if (args.length < 0)
                throw new NullPointerException("No Input given with command line.");
            else {
                Pair result = LongestString.findLongestString(args);
                String longestArg = (String) result.getFirst();
                int longestIndex = ((Integer)result.getSecond()).intValue();

                System.out.println("A longest argument was '" + longestArg + "'");
                System.out.println("of length " + longestArg.length());
                System.out.println("found at position " + (longestIndex + 1));
            } // else
        } // try
        catch(Exception e){
            System.out.println(e.getMessage());
        } // catch
    } // main
} // class LongestArgument