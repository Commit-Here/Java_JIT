/* This class is used to represent a student which cannot be changed,
    and a mobile phone, although not to begin with. A student may purchase 
    phone, in which case they discard previous one if they already have one.
    A student may top up their phone with whole number of pounds, else dont if
    they dont have phone. A student can make a call of deisredDuration in seconds,
    else dont if they dont have phone.
*/
public class Student {
    // The name of the student
    private final String name;

    // The mobile phone of student
    private Phone currentPhone = null;

    // Construct a student -- given the required name 
    public Student(String requiredName){
        name = requiredName;
    } // Student

    public int balance(){
        return currentPhone.balance();
    }
    public String name(){
        return name;
    }
    public boolean checkPhone(){
        return (currentPhone == null ? false : true);
    }
    // method to purchase a phone.
    public void purchasePhone(Phone purchasedPhone){
        currentPhone = purchasedPhone;
    } // purchasePhone

    // Recharging students phone.
    public void topUp(int topUpAmount){
        if (currentPhone != null)
            currentPhone.recharge(topUpAmount);
    } // topUp

    // makes call for desired amount
    public int callFor(int desiredDuration){
        if (currentPhone != null)
            return currentPhone.makeCall(desiredDuration);
        return 0;
    } // makeCall

    // representation of student with a phone
    public String toString(){
        return "Student(" + name + ", " + (currentPhone==null ? "null":currentPhone.toString()) + ")";
    } // toString
} // class Studentjavac Student 
