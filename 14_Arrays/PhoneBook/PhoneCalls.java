import java.util.Scanner;
import java.io.File;

public class PhoneCalls {
    public static void main(String[] args) throws Exception {
        // Creating instance of PhoneCallList
        PhoneCallList callList = new PhoneCallList(new Scanner(new File(args[0])));

        // Scanner to take input from command line.
        Scanner scanner = new Scanner(System.in);

        String check;
        do {
            System.out.print("Enter phone number prefix, or Q to quit: ");
            check = scanner.nextLine();
            if (! check.equals("Q"))
                System.out.println(callList.matchingCallReport(check));
        }   while (! check.equals("Q"));// while
    } // main
} // PhoneCalls 