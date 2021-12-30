public class PhoneCall {
    // instances for phoneCall
    private final String phoneDetail;
    private final String phoneNumber;
    private final float cost;
    private final Duration timeDurationInFormat;
    // Constructor
    public PhoneCall(String details) {
        phoneDetail = details;
        String[] detailsParts = details.split("    ");
        phoneNumber = detailsParts[0];
        timeDurationInFormat = new Duration(detailsParts[1]);
        cost = Float.parseFloat(detailsParts[2]);
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

    public String getPhoneDetail() {
        return phoneDetail;
    } // getPhoneDetail
}