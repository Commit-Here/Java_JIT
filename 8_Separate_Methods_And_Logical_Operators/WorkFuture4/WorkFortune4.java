// Program to print out years left to retirement.
// First argument is present year.
// Second argument is birth year.
public class WorkFortune4 {
    public static void printWorkFortune(int presentYear, int retirementAge, int birthYear) {
        // Person:
        // presentAge of person .
        int presentAge = presentYear - birthYear;
        int someYear = presentYear;
        // years left for retirement age.
        int yearsLeft = presentAge < retirementAge? retirementAge-presentAge: 0;

        // printing years left to work.
        System.out.println("You have " + yearsLeft + " years left to work");
        while (yearsLeft != 1){
            // decreament the years left.
            someYear+=1;
            yearsLeft-=1;
            
            // print out years left in present year.
            System.out.println("In " + someYear + " you will have "
                                + yearsLeft + " years left to work");
        } // while
        System.out.println("You will retire in " + ++someYear);
    } // printWorkFortune

    public static void main(String args[]) {
        // This is current year.
        int presentYear = Integer.parseInt(args[0]);

        // The year of birth: must be less than the present year.
        int birthYear1 = Integer.parseInt(args[1]);
        int birthYear2 = Integer.parseInt(args[2]);
        int birthYear3 = Integer.parseInt(args[3]);
        int birthYear4 = Integer.parseInt(args[4]);

        // The age of retirement.
        int retirementAge = 68;

        // Person1:
        printWorkFortune(presentYear, retirementAge, birthYear1);
        // Person2:
        printWorkFortune(presentYear, retirementAge, birthYear1);
        // Person3;
        printWorkFortune(presentYear, retirementAge, birthYear1);
        // Person4
        printWorkFortune(presentYear, retirementAge, birthYear1); 
         
    } // main
} // class WorkFortune4