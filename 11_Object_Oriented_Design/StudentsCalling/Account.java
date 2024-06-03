/* A class to represent Account linked with a phone, in which case they discard their
    previous one if they have previous purchased one. An account may be topped up with 
    a whole number of pounds. This add to the current balance.
    An account may havae a call requested on it for a desired duration. All account
    providers charge only one penny per second for any call! The actual call duration will 
    be limited to current balance in the account. The balance is reduced by the actual
    duration. The actual duration is aslo returned as the result of the call request.
*/
public class Account{
    // A provider name for the account in a phone.
    private final String providerName;

    // current remaining balance in account
    public int currentBalance = 0;
    
    // Construct an account -- with a given name and model number.
    public Account(String requiredProviderName){
        providerName = requiredProviderName;
    } // Account

    public String providerName(){
        return providerName;
    }
    // Add recharge to account.
    public void addCharge(int addAmount){
        currentBalance += addAmount;
    } // addCharge

    public int currentBalance(){
        return currentBalance;
    }

    // Call requested for desired duration
    public int requestCall(int desiredDuration){
        int actualDuration = desiredDuration;
        if (actualDuration > currentBalance)
            actualDuration = currentBalance;
        currentBalance -= actualDuration;
        return actualDuration;
    } // requestCall

    // representation of account name with model number of phone.
    public String toString(){
        return "Account(" + providerName + ", " + currentBalance + ")";
    } // toString
} // class ccount