public class AgeHistory{
    public static void printAgeHistory(int currentDate, int currentMonth, int currentYear, int personNumber, 
                                        int birthDate, int birthMonth, int birthYear){
        // PERSON :
        // Start by printing the event of birth.
        System.out.println("Pn " + personNumber + " was born on " + birthDate + "/" + birthMonth + "/" + birthYear);

        // Now we will go through the years between birth and last year.
        int someYear = birthYear + 1;
        int ageInSomeYear = 1;
        while (someYear < currentYear) {
            System.out.println("Pn " + personNumber + " was " + ageInSomeYear + " on " + currentDate + "/" + currentMonth + "/" + someYear);
            someYear++;
            ageInSomeYear++;
        } // while
        
        if (someYear > currentYear)
            System.out.println("Pn " + personNumber + " will be " + ageInSomeYear + " on " + birthDate + "/" + birthMonth + "/" + someYear);
        else
            if (currentMonth == birthMonth){
                if (currentDate == birthDate)
                    System.out.println("Pn " + personNumber + " is " + ageInSomeYear + " today!");
                else {
                    if (currentDate < birthDate)
                        System.out.println("Pn " + personNumber + " will be " + ageInSomeYear + " on " + birthDate + "/" + birthMonth + "/" + someYear);
                    else
                    System.out.println("Pn " + personNumber + " will be " + (ageInSomeYear+1) + " on " + birthDate + "/" + birthMonth + "/" + (someYear+1));
                }
            }
            else{
                if (currentMonth > birthMonth){
                    System.out.println("Pn " + personNumber + " was " + ageInSomeYear + " on " + birthDate + "/" + birthMonth + "/" + someYear);
                    System.out.println("Pn " + personNumber + " will be " + (ageInSomeYear+1) + " on " + birthDate + "/" + birthMonth + "/" + (someYear+1));
                }
                else
                    System.out.println("Pn " + personNumber + " will be " + ageInSomeYear + " on " + birthDate + "/" + birthMonth + "/" + someYear);
            }
                

                    
            
    }

    public static void main(String args[]) {
        // The year of present day.
        int currentDate = Integer.parseInt(args[0]);
        int currentMonth = Integer.parseInt(args[1]);
        int currentYear = Integer.parseInt(args[2]);

        // The four birth years , must be less than the present year.
        int birthDate1 = Integer.parseInt(args[3]);
        int birthMonth1 = Integer.parseInt(args[4]);
        int birthYear1 = Integer.parseInt(args[5]);
        int birthDate2 = Integer.parseInt(args[6]);
        int birthMonth2 = Integer.parseInt(args[7]);
        int birthYear2 = Integer.parseInt(args[8]);


        // PERSON 1:
        printAgeHistory(currentDate, currentMonth, currentYear, 1, birthDate1, birthMonth1, birthYear1);
        // PERSON 2:
        printAgeHistory(currentDate, currentMonth, currentYear, 2, birthDate2, birthMonth2, birthYear2);
    } // main
}