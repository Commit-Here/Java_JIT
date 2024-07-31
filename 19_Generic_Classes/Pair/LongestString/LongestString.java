public class LongestString{
    public static Pair<String, Integer> findLongestString(String[] array) throws IllegalArgumentException{
        if (array==null || array.length ==0)
            throw new IllegalArgumentException("Check input array of the following!");
        String longestString = array[0];
        int longestIndex = 0;
        for(int index = 0; index < array.length; index++){
            if (longestString.length() < array[index].length()){
                longestString = array[index];
                longestIndex = index;
            }
        }
        return new Pair<String, Integer>(longestString, new Integer(longestIndex));
    }
}
