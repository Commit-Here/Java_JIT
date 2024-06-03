// Program to print out years left to retirement.
// First argument is present year.
// Second argument is birth year.
public class WorkFortune2 {
    public static void main(String args[]) {
        // This is current year.
        int presentYear = Integer.parseInt(args[0]);

        // The year of birth: must be less than the present year.
        int birthYear1 = Integer.parseInt(args[1]);
        int birthYear2 = Integer.parseInt(args[2]);

        // The age of retirement.
        int retirementAge = 68;

        // Person1:
        // presentAge of person 1.
        int presentAge1 = presentYear - birthYear1;
        int someYear1 = presentYear;
        // years left for retirement age.
        int yearsLeft1 = presentAge1 < retirementAge? retirementAge-presentAge1: 0;

        // printing years left to work.
        System.out.println("You have " + yearsLeft1 + " years left to work");
        while (yearsLeft1 != 1){
            // decreament the years left.
            someYear1+=1;
            yearsLeft1-=1;
            
            // print out years left in present year.
            System.out.println("In " + someYear1 + " you will have "
                                + yearsLeft1 + " years left to work");
        } // while
        System.out.println("You will retire in " + ++someYear1);


        // Person12:
        // presentAge of person 2.
        int presentAge2 = presentYear - birthYear2;
        int someYear2 = presentYear;
        // years left for retirement age.
        int yearsLeft2 = presentAge2 < retirementAge? retirementAge-presentAge2: 0;

        // printing years left to work.
        System.out.println("You have " + yearsLeft1 + " years left to work");
        while (yearsLeft2 != 1){
            // decreament the years left.
            someYear2+=1;
            yearsLeft2-=1;
            
            // print out years left in present year.
            System.out.println("In " + someYear2 + " you will have "
                                + yearsLeft2 + " years left to work");
        } // while
        System.out.println("You will retire in " + ++someYear2);
    } // main
} // WorkFortune2