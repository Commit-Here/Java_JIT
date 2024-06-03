/** 
 * This class represents a student, A student may purchase 
 * phone, topup their phone and make call of desired duration. in which case they discard previous one if they already have one.
 * A student may top up their phone with whole number of pounds, else dont if
 * they dont have phone. A student can make a call of deisredDuration in seconds,
 * else dont if they dont have phone.
 * 
 * @author Burhan Khan
 */
public class Student {
     // A class variable to hold student name.
    private final String studentName;

     // A class variable to hold studentPhone.
    private Phone studentPhone = null;

    /**
     * Construct a student -- given the required name
     * 
     * @param requiredStudentName The required student name.
     */
    public Student(String requiredStudentName){
        studentName = requiredStudentName;
    } // Student

    /**
     * Yields the studnet name.
     * 
     * @return The name of the student.
     */
    public String getName(){
        return studentName;
    } // getName

    /**
     * Method to fetch balance in student's account
     * 
     * @return The name of the student.
     */
    public int getBalance(){
        return studentPhone.getAccount().getBalance();
    } // getName

    /** 
     * Checks whether the student has phone or not.
     * 
     * @return true if and only if student has phone.
     */
    public boolean getPhoneStatus(){
        return (studentPhone == null ? false : true);
    } // getPhoneStatus

    /**
     * Provides student representation followed by its phone and then account(if there exists, otherwise null).
     * 
     * @return A String Student(studentName, Phone(phoneName phoneModel, overallCallDuration, null or account) 
     * representation of this phone.
     */
    public String toString(){
        return "Student(" + studentName + ", " + (studentPhone==null ? "null":studentPhone.toString()) + ")";
    } // toString

    /**
     * A method for a student to purchase phone.
     * 
     * @param purchasedPhone The given new phone purchased by student.
     */
    public void purchasePhone(Phone purchasedPhone){
        studentPhone = purchasedPhone;
    } // purchasePhone

    /**
     * A method for a student to topup their phone.
     * 
     * @param topUpAmount The amount to top up.
     */
    public void doTopUpFor(int topUpAmount){
        if (getPhoneStatus())
            studentPhone.rechargeFor(topUpAmount);
    } // doTopUpFor

    /**
     * A method for a student to make a call for desired duration.
     * 
     * @param desiredDuration The call duration requested.
     */
    public void doCallFor(int desiredDuration){
        if (getPhoneStatus())
            studentPhone.callFor(desiredDuration);
    } // doCallFor

} // class Student
