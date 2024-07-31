public class IntArrayStats{
    public static Triple<Integer, Integer, Double> getStats(int[] array) throws IllegalArgumentException{
        if(array == null || array.length == 0)
            throw new IllegalArgumentException("Kindly pass cmd arguments");
        int min= array[0],max = array[0], sum = 0;
        for (int element: array){
            sum+=element;
            if(min > element){
                min = element;
            }
            else if(max < element){
                max = element;
            }
        }
        return new Triple<Integer, Integer, Double>(max, min, sum/(1.0 * array.length));
    }
}