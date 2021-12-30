import java.util.Scanner;

public class PhoneCallList {
    private final PhoneCall[] calls;
    private final int noOfPhoneCalls;
    // vars used for array extension.
    private final int INITIAL_ARRAY_SIZE = 100, ARRAY_RESIZE_FACTOR = 2;
    // Constructor
    public PhoneCallList(Scanner scanner) {
        // reading phone calls and storing them in array.
        PhoneCall[] phoneCallsSoFar = new PhoneCall[INITIAL_ARRAY_SIZE];
        int noOfPhoneCallsSoFar = 0;

        while (scanner.hasNextLine()) {
            // PhoneCall constructor parses whole line.
            PhoneCall latestCall = new PhoneCall(scanner.nextLine());
            // if the array is full extend the array
            if (noOfPhoneCallsSoFar == phoneCallsSoFar.length) {
                PhoneCall[] biggerArray = new PhoneCall[phoneCallsSoFar.length * ARRAY_RESIZE_FACTOR];
                for (int index = 0; index < phoneCallsSoFar.length; index++)
                    biggerArray[index] = phoneCallsSoFar[index];
                phoneCallsSoFar = biggerArray;
            } // if
            phoneCallsSoFar[noOfPhoneCallsSoFar] = latestCall;
            noOfPhoneCallsSoFar++;
        } // while
        calls = phoneCallsSoFar;
        noOfPhoneCalls = noOfPhoneCallsSoFar;
    } // PhoneCallList

    public String matchingCallReport(String userInput) {
        int callsMatched = 0;
        float totalCost = 0;
        Duration totalDuration = new Duration(0);
        String result = "";
        for (int phoneIndex = 0; phoneIndex < noOfPhoneCalls; phoneIndex++) {
            // returns 0 or 1, 0 for different and 1 for same.
            String phoneNumber = calls[phoneIndex].getPhoneNumber();
            boolean callCheck = phoneNumber.startsWith(userInput);
            if (callCheck) {
                result += calls[phoneIndex].getPhoneDetail() + "\n";
                totalDuration = totalDuration.add(calls[phoneIndex].getTimeDurationInFormat());
                totalCost += calls[phoneIndex].getCost();
                callsMatched++;
            } // if
        } // for
        result += "Calls matched:\t" + callsMatched + "\n" + "Total duration:\t";
        result += totalDuration.toString() + "\n" + "Total cost:\t" + totalCost;
        return result;
    } // matchingCallReport
} // class PhoneCallList