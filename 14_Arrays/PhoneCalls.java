import java.util.Scanner;

public class PhoneCalls {
    public static void main(String[] args) {
        // Scanner to take input from file.
        Scanner fileScanner = new Scanner(new File(args[0]));

        // Scanner to take input from command line.
        Scanner scanner = new Scanner(System.in);

        // Creating instance of PhoneCallList
        PhoneCallList list = new PhoneCallList(fileScanner);

        String check = scanner.nextLine();
        while (check.compareTo("Q") != 0) {
            System.out.print()
        } // while


    } // main
} // PhoneCalls