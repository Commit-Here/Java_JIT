public class AgeHistory{
    // The present date.
    private static Date presentDate;

    public static void printAgeHistory(int personNumber, Date birthDate){
        // PERSON :
        // Start by printing the event of birth.
        System.out.println("Pn " + personNumber + " was born on " + birthDate.day + "/" + birthDate.month + "/" + birthDate.year);

        // Now we will go through the years between birth and last year.
        int someYear = birthDate.year + 1;
        int ageInSomeYear = 1;
        while (someYear < presentDate.year) {
            System.out.println("Pn " + personNumber + " was " + ageInSomeYear + " on " + birthDate.day + "/" + birthDate.month + "/" + birthDate.year);
            someYear++;
            ageInSomeYear++;
        } // while
        
        if (someYear > presentDate.year)
            System.out.println("Pn " + personNumber + " will be " + ageInSomeYear + " on " + birthDate.day + "/" + birthDate.month + "/" + someYear);
        else
            if (presentDate.month == birthDate.month){
                if (presentDate.day == birthDate.day)
                    System.out.println("Pn " + personNumber + " is " + ageInSomeYear + " today!");
                else {
                    if (presentDate.day < birthDate.day)
                        System.out.println("Pn " + personNumber + " will be " + ageInSomeYear + " on " + birthDate.day + "/" + birthDate.month + "/" + someYear);
                    else
                    System.out.println("Pn " + personNumber + " will be " + (ageInSomeYear+1) + " on " + birthDate.day + "/" + birthDate.month + "/" + (someYear+1));
                }
            }
            else{
                if (presentDate.month > birthDate.month){
                    System.out.println("Pn " + personNumber + " was " + ageInSomeYear + " on " + birthDate.day + "/" + birthDate.month + "/" + someYear);
                    System.out.println("Pn " + personNumber + " will be " + (ageInSomeYear+1) + " on " + birthDate.day + "/" + birthDate.month + "/" + (someYear+1));
                } // if
                else
                    System.out.println("Pn " + personNumber + " will be " + ageInSomeYear + " on " + birthDate.day + "/" + birthDate.month + "/" + someYear);
            } // else         
    } // printAgeHistory

    public static void main(String args[]) {
        // The year of present day.
        presentDate = new Date(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));

        // The four birth years , must be less than the present year.
        Date birthDate1 = new Date(Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));
        Date birthDate2 = new Date(Integer.parseInt(args[6]), Integer.parseInt(args[7]), Integer.parseInt(args[8]));

        // PERSON 1:
        printAgeHistory(1, birthDate1);
        // PERSON 2:
        printAgeHistory(2, birthDate2);
    } // main
}