// A program to find maximum number
// among the given command line argument.
public class MaxList {
    public static void main(String args[]){
        // Storing first element as the maximum in the list.
        int maxInList = Integer.parseInt(args[0]);
        
        // printing the given list
        System.out.println("The max among list: ");

        // looping through the all elements 
        for (int argsIndex = 1; argsIndex < args.length; argsIndex++) {
            // Value at this index.
            int valueAtIndex = Integer.parseInt(args[argsIndex]);

            // updating maxInList if is smaller than the upcoming integers.
            if (maxInList < valueAtIndex)
                maxInList = valueAtIndex;
            else
                continue;
            
            // end of printing the given list
            System.out.print(valueAtIndex + " ");
        }
        // printing the maximum amoung these.
        System.out.println("is " + maxInList);
    } // main
} // class MaxList