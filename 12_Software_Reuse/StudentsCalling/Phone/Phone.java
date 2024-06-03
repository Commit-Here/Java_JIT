/** 
 * This class represents an Phone, which has a name (ie. make, model number) and a account
 * and provides certain functionalities on it.
 * 
 * @author Burhan Khan
 */
public class Phone{
    // A class variable to hold phone name.
    private final String phoneName;

    // A class variable to hold phone model.
    private final String phoneModel;

    // A class variable to hold account connected with phone
    private Account phoneAccount = null;
    
    // A class variable to hold total duration of phone calls.
    private int overallCallDuration = 0;

    /**
     * Constructs an phone with given phone name, model and account
     * 
     * @param requiredPhoneName The required phone name.
     * @param requiredPhoneModel The required phone model.
     * @param requiredPhoneAccount The required phone account.
     */
    public Phone(String requiredPhoneName, String requiredPhoneModel, Account requiredPhoneAccount){ 
        phoneName = requiredPhoneName;
        phoneModel = requiredPhoneModel;
        phoneAccount = requiredPhoneAccount;
    } // Phone

    /**
     * Yields the phone name.
     * 
     * @return The maker of the phone.
     */
    public String getName(){
        return phoneName;
    } // getName

    /**
     * Yields the phone model.
     * 
     * @return The model of the phone.
     */
    public String getModel(){
        return phoneModel;
    } // getModel

    /**
     * Yields the phone account.
     * 
     * @return The account of the phone.
     */
    public Account getAccount(){
        return phoneAccount;
    } // getAccount

    /**
     * Provides phone representation following with its account(if there exists, otherwise null).
     * 
     * @return A String Phone(phoneName phoneModel, overallCallDuration, null or account) representation of this phone.
     */
    public String toString(){
        return "Phone(" + phoneName + " " + phoneModel + ", " + overallCallDuration + ", " + (phoneAccount!=null ? phoneAccount.toString():"null") + ")";
    } // toString

    /**
     * Method to recharge with a whole number of pounds.
     * 
     * @param givenAmount The recharge amount.
     */
    public void rechargeFor(int givenAmount){
        phoneAccount.requestTopUp(givenAmount);
    } // recharge

    /**
     * Method to call with a phone for given duration
     * 
     * @param givenDuration The call time to be made.
     */
    public void callFor(int givenDuration){
        int callDuration = phoneAccount.requestCall(givenDuration);
        overallCallDuration += callDuration;
    } // call
} // class Phone
