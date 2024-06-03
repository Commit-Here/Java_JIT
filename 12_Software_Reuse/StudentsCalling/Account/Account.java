/** 
 * This class represents an account linked with a phone and provides
 * certain manipulations on it
 * 
 * @author Burhan Khan
 */
public class Account{
    // A class variable to hold serviceProvider's name.
    private final String accountName;

    // A class variable to hold current remaining balance of account.
    private int accountBalance = 0;

    /**
     * Constructs an account -- with a given service provider's name.
     * 
     * @param requiredAccountName The required account name.
     */
    public Account(String requiredAccountName){
        accountName = requiredAccountName;
    } // Account

    /**
     * Yields the account name.
     * 
     * @return The service provider's name or account name
     */
    public String getName(){
        return accountName;
    } // getName

    /**
     * Yields the remaining account balance.
     * 
     * @return The account balance.
     */
    public int getBalance(){
        return accountBalance;
    } // accountBalance
    
    /**
     * Provides account representation of this account.
     * 
     * @return A String Account(accountName, accountBalance) representation of this account.
     */
    public String toString(){
        return "Account(" + accountName + ", " + accountBalance + ")";
    } // toString

    /**
     * Method to top up with a whole number of pounds.
     * 
     * @param topUpAmount The top up amount
     */
    public void requestTopUp(int topUpAmount){
        addAccountBalance(topUpAmount * 100);
    } // requestTopUp

    /**
     * Method to request a call for desired duration
     * If the requested duration of call is more than the duration left in 
     * account then the duration of call is set to duration left in account
     * .
     * @param desiredDuration The desired call request.
     * 
     * @return actual duration of call that is been held.
     */
    public int requestCall(int desiredDuration){
        int actualDuration = desiredDuration;
        if (actualDuration > accountBalance)
            actualDuration = accountBalance;
        deductAccountBalance(actualDuration);
        return actualDuration;
    } // requestCall

    // Method to add given amount balance to account.
    private void addAccountBalance(int givenAmount){
        accountBalance += givenAmount;
    } // addAccountBalance
    
    // Method to deduct given amount balance from account.
    // account providers charge only one penny per second for any call!
    private void deductAccountBalance(int givenAmount){
        accountBalance -= givenAmount;
    } // deductAccountBalance
} // class Account