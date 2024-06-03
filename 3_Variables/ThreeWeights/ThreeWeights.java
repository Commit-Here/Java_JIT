public class ThreeWeights {
    public static void main(String args[]) {
        int weight1 = Integer.parseInt(args[0]);
        int weight2 = Integer.parseInt(args[1]);
        int weight3 = Integer.parseInt(args[2]);
        
        // Each weight can be written in 3 ways 
        // 3 x 3 x 3 = 27 number of ways.
        System.out.println("" + (-weight1 - weight2 - weight3));
        System.out.println("" + (-weight1 - weight2 + 0));        
        System.out.println("" + (-weight1 - weight2 + weight3));
        System.out.println("" + (-weight1 + 0  - weight3));
        System.out.println("" + (-weight1 + 0  + 0));
        System.out.println("" + (-weight1 + 0  + weight3));
        System.out.println("" + (-weight1 + weight2 - weight3));
        System.out.println("" + (-weight1 + weight2 + 0));
        System.out.println("" + (-weight1 + weight2 + weight3));


        System.out.println("" + (0 - weight2 - weight3));
        System.out.println("" + (0 - weight2 + 0));
        System.out.println("" + (0 - weight2 + weight3));
        System.out.println("" + (0 + 0  - weight3));
        System.out.println("" + (0 + 0  + 0));
        System.out.println("" + (0 + 0  + weight3));
        System.out.println("" + (0 + weight2 - weight3));
        System.out.println("" + (0 + weight2 + 0));
        System.out.println("" + (0 + weight2 + weight3));

        System.out.println("" + (weight1 - weight2 - weight3));
        System.out.println("" + (weight1 - weight2 + 0));
        System.out.println("" + (weight1 - weight2 + weight3));
        System.out.println("" + (weight1 + 0 - weight3));
        System.out.println("" + (weight1 + 0 + 0));
        System.out.println("" + (weight1 + 0 + weight3));
        System.out.println("" + (weight1 + weight2 - weight3));
        System.out.println("" + (weight1 + weight2 + 0));
        System.out.println("" + (weight1 + weight2 + weight3));
    }
}