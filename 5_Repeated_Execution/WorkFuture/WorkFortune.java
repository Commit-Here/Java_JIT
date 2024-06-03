// Program to print out years left to retirement.
// First argument is present year.
// Second argument is birth year.

public class WorkFortune {
    public static void main(String args[]) {
        // The year of the present day.
        int presentYear = Integer.parseInt(args[0]);

        // The year of birth: must be less than the present year.
        int birthYear = Integer.parseInt(args[1]);

        // The retirement age is 68
        int retirementAge = 68;

        // The preset age of employee
        int presentAge = presentYear - birthYear;

        // years left to work is retirement age - present age
        int yearsLeft = retirementAge > presentAge? retirementAge-presentAge: 0;

        // printing years left to work
        System.out.println("You have " + yearsLeft + " years left to work");
        while (yearsLeft != 1){
            // decreament the years left.
            presentYear+=1;
            yearsLeft-=1;
            
            // print out years left in present year.
            System.out.println("In " + presentYear + " you will have "
                                + yearsLeft + " years left to work");
        } // while
        System.out.println("You will retire in " + ++presentYear);
    } // main
} // class WorkFortune