/* A class to represent Phone, which has a name (ie. make, model number) 
    and a account, both of which are fixed. It also keeps track of the 
    total number of seconds of phone calls made on it, starting with zero.
    Phone may be topped with a whole number of pounds, which causes its account
    to be topped up with that same amount. A phone can have a call made on it, 
    of a desired duration, which causes it to request that call on its account.
    The account returns the actual duration of the call, which may be less than 
    that desired (i.e. when there is not enough balance to pay for it). 
    The phone keeps track of the total actual duration of all calls made on it.
*/
public class Phone{
    // Brand of phone
    private final String makerName;

    // model number of phone
    private final String modelNumber;

    // linked account of phone
    private Account phoneAccount = null;
    
    // total number of seconds 
    public int overallCallDuration = 0;

    // total number of seconds of phone call made.
    public int actualCallDuration = 0;

    // Construct a phone with maker and modelNumber
    public Phone(String requiredMakerName, String requiredModelNumber, Account requiredAccount){ 
        makerName = requiredMakerName;
        modelNumber = requiredModelNumber;
        phoneAccount = requiredAccount;
    } // Phone

    public String makerName(){
        return makerName;
    }
    public Account phoneAccount(){
        return phoneAccount;
    } 
    public int balance(){
        return phoneAccount.currentBalance();
    }
    // recharges account in the phone
    public void recharge(int amount){
        phoneAccount.addCharge(amount*100);
    } // recharge

    // makes call and then requests ot account.
    public int makeCall(int duration){
        int actualDuration = phoneAccount.requestCall(duration);
        overallCallDuration += duration;
        actualCallDuration += actualDuration;
        return actualDuration;
    } // makeCall

    // The correct line separator fot this platform.
    private static final String NLS = System.getProperty("line.separator");

    // representation of student with a phone
    public String toString(){
        return "Phone(" + makerName + " " + modelNumber + ", " + actualCallDuration + ", " + (phoneAccount!=null ? phoneAccount.toString():"null") + ")";
    } // toString
}
