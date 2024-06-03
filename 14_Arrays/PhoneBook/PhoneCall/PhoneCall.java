public class PhoneCall {
    // instances for phoneCall
    private final String phoneNumber;
    private final float cost;
    private final Duration timeDurationInFormat;
    // Constructor
    public PhoneCall(String requiredNumber, Duration requiredDuration, float requiredCost) {
        phoneNumber = requiredNumber;
        timeDurationInFormat = requiredDuration;
        cost = requiredCost;
    } // PhoneCall

    public float getCost() {
        return cost; 
    } // getCost.

    public Duration getTimeDurationInFormat() {
        return timeDurationInFormat;
    } // getTimeDurationInFormat.

    public String getPhoneNumber() {
        return phoneNumber;
    } // getPhoneNumber

    public String toString(){
        return String.format("%-11s\t%8s\t%.2f", phoneNumber, timeDurationInFormat, cost);
    }
} // class PhoneCall