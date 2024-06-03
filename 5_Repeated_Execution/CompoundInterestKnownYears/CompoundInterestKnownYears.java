public class CompoundInterestKnownYears {
    public static void main(String args[]) {
        double initialInvestment = Double.parseDouble(args[0]);
        double interestRate = Double.parseDouble(args[1]);
        int noOfYearsToInvested = Integer.parseInt(args[2]);
        double currentBalance = initialInvestment;

        for (int years = 1; years <= noOfYearsToInvested; years++)
            currentBalance += currentBalance * interestRate / 100;
        
        System.out.println(initialInvestment + " invested at interest rate "
                            + interestRate + "%");
        System.out.println("After " + noOfYearsToInvested + " years,"
                            + " the balance will be " + currentBalance);
    }
}