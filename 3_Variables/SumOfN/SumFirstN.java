public class SumFirstN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sumOfFirstN = (1+n) / 2 * n;
        System.out.println("The sum of the first " + n + " numbers is "
                            + sumOfFirstN);
    }
}