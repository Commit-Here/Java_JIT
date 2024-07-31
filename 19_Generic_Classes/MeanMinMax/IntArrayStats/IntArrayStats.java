public class IntArrayStats{
    public static Triple getStats(int[] array) throws IllegalArgumentException{
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Either array is not declared or it is empty!");
        
        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int element : array) {
            sum += element;
            if (min > element) {
                min = element;
            }
            else if (max < element) {
                max = element;
            }
        }
        return new Triple(new Integer(max), new Integer(min), new Double(sum/(1.0 * array.length)));
    }
}
