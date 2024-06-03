// Program to print out the history of a person's age.
// First argument is an integer for the present year.
// Second argument is the birth year, which must be less than the present year.

public class AgeHistory
{
    public static void main(String[] args) {
        // The year of the present day.
        int presentYear = Integer.parseInt(args[0]);

        // The year of birth: must be less than the present year.
        int birthYear = Integer.parseInt(args[1]);

        // Start by printing the the event of birth.
        System.out.println("You were born in " + birthYear);

        // Now we will go through the years between birth and last year.
        int someYear = birthYear + 1;

        // We keep track of the age, starting with 1.
        int ageInSomeYear = 1;

        // We deal with each year while it has not reached the present year.
        while (someYear != presentYear) {
            // Print out the age in that Year.
            System.out.println("You were " + ageInSomeYear + " in " + someYear);
            
            // Add one to the year and to the age.
            someYear += 1;
            ageInSomeYear += 1;
        } // while

        // At this point someYear will be equal to presentYear
        // So ageInSomeYear must be the age in the present year.
        System.out.println("You are " + ageInSomeYear + " this year");
    } // main
} // class ageHistory