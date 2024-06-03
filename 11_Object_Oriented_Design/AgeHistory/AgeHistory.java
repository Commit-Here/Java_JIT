import java.util.Scanner;

public class AgeHistory{
    public static void main(String args[]){
        // For interaction with the user.
        Scanner inputScanner = new Scanner(System.in);

        // The Date class needs to be told the present date.
        System.out.print("Enter today's date as three numbers, dd mm yyyy: ");
        int day = inputScanner.nextInt();
        int month = inputScanner.nextInt();
        int year = inputScanner.nextInt();
        Date.setPresentDate(new Date(day, month, year));

        // Now find how many people there are.
        System.out.print("Enter the number of people: ");
        int noOfPeople = inputScanner.nextInt();
        // Skip to the next line of input
        // or else first name will be blank;
        inputScanner.nextLine();

        // For each person..
        for (int personNumber = 1; personNumber <= noOfPeople; personNumber++){
            // Obtain name and birthday.
            System.out.print("Enter the name of the person " + personNumber + ": ");
            String personName = inputScanner.nextLine();
            System.out.print("Enter his/her birthday (dd mm yyyy): ");
            int birthDay = inputScanner.nextInt();
            int birthMonth = inputScanner.nextInt();
            int birthYear = inputScanner.nextInt();
            // Skip to next line, or else next name will be blank!
            inputScanner.nextLine();

            Date birthDate = new Date(birthDay, birthMonth, birthYear);
            Person person = new Person(personName, birthDate);
            System.out.println(person.ageHistory());
        } // for
    } // main
} // class AgeHistory