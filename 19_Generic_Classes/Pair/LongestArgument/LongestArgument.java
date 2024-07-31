public class LongestArgument{
    public static void main(String args[]) throws IllegalArgumentException{
        try {
            if (args.length < 0)
                throw new IllegalArgumentException("No Input given with command line.");
            else {
                Pair<String, Integer> result = LongestString.findLongestString(args);
                String longestArg = result.getFirst();
                int longestIndex = result.getSecond().intValue();

                System.out.println("A longest argument was '" + longestArg + "'");
                System.out.println("of length " + longestArg.length());
                System.out.println("found at position " + (longestIndex + 1));
            } // else
        } // try
        catch(Exception e){
            System.out.println(e.getMessage());
        } // catch

    }
}