public class MeanMinMax{
    public static void main(String args[]) throws IllegalArgumentException{
        try{
            int[] array = new int[args.length];
            for (int index =0; index<args.length;index++){
                array[index] = Integer.parseInt(args[index]);
            }
            Triple<Integer, Integer, Double> stats= IntArrayStats.getStats(array);
            int max = stats.getFirst();
            int min = stats.getSecond();
            double mean = stats.getThird();

            System.out.println((min+max)/ 2.0 -mean);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}