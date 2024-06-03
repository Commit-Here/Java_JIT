// Print out an age history of two people.
// Arguments: present year, first birth year, second birth year.
public class AgeHistory4 {
    public static void printAgeHistory(int presentYear, int personNumber, int birthYear) {
        // PERSON :
        // Start by printing the event of birth.
        System.out.println("Pn " + personNumber + " was born in " + birthYear);

        // Now we will go through the years between birth and last year.
        int someYear = birthYear + 1;
        int ageInSomeYear = 1;
        while (someYear != presentYear) {
            System.out.println("Pn " + personNumber + " was " + ageInSomeYear + " in " + someYear);
            someYear++;
            ageInSomeYear++;
        } // while

        // Finally, the age of the person this year.
        System.out.println("Pn " + personNumber + " is " + ageInSomeYear + " this year");
    } // printAgeHistory


    public static void main(String args[]) {
        // The year of present day.
        int presentYear = Integer.parseInt(args[0]);

        // The four birth years , must be less than the present year.
        int birthYear1 = Integer.parseInt(args[1]);
        int birthYear2 = Integer.parseInt(args[2]);
        int birthYear3 = Integer.parseInt(args[3]);
        int birthYear4 = Integer.parseInt(args[4]);

        // PERSON 1:
            printAgeHistory(presentYear, 1, birthYear1);
        // PERSON 2:
            printAgeHistory(presentYear, 2, birthYear2);
        // PERSON 3:
            printAgeHistory(presentYear, 3, birthYear3);
        // PERSON 4:
            printAgeHistory(presentYear, 4, birthYear4);
    } // main
} // class AgeHistory4