// Simulates a simple scenario in whcih students purchase and use moblie phones.
public class StudentsCalling{
    
    // print a creating statement for student.
    private static void createStudent(Student student){
        System.out.println("Creating student " + student.getName());
        System.out.println("Result:");
        System.out.println(student);
        System.out.println();
    } // createStudent

    // make a phone call for desiredDuration.
    private static void phoneCall(Student student, int desiredDuration){
        if (!student.getPhoneStatus())
            System.out.println("This next call has no effect, as has no phone!");
        else if (student.getBalance() != 0 && student.getBalance() < desiredDuration)
            System.out.println("This next call should be truncated to " + student.getBalance() + " seconds");
        System.out.println(student);
        System.out.println("is making a call for desired " + desiredDuration + " seconds");
        student.doCallFor(desiredDuration);
        System.out.println("Result:");
        System.out.println(student);
        System.out.println();
    } // phoneCall

    // make a topUp into the account of the phone.
    private static void topUp(Student student, int topUpAmount){
        if (!student.getPhoneStatus())
            System.out.println("This next top up has no effect, as has no phone!");
        System.out.println(student);
        System.out.println("is topping up by " + topUpAmount);
        student.doTopUpFor(topUpAmount);
        System.out.println("Result:");
        System.out.println(student);
        System.out.println();
    }
    
    // purchase a new phone for student
    private static void buyPhone(Student student, Phone phone){
        if (student.getPhoneStatus())
            System.out.println("Now let us discard a phone.");
        System.out.println(student);
        student.purchasePhone(phone);
        System.out.println("is buying phone " + phone.getName());
        System.out.println("with account " + phone.getAccount().getName());
        System.out.println("Result:");
        System.out.println(student);
        System.out.println();
    } // buyPhone

    public static void main(String args[]){
        Student s1 = new Student("Chatty Charlie");
        createStudent(s1);
        Student s2 = new Student("Norman No Friends");
        createStudent(s2);
        Student s3 = new Student("Popular Penny");
        createStudent(s3);

        phoneCall(s1, 300);
        topUp(s2, 20);
    
        buyPhone(s1, new Phone("Snotia", "BIFR", new Account("World@1")));
        buyPhone(s2, new Phone("Cyoo", "L8TR0N", new Account("4FRN Touch")));
        buyPhone(s3, new Phone("Tisonly", "14U", new Account("Foney Friends")));

        topUp(s1, 10);
        topUp(s2, 20);
        topUp(s3, 30);

        phoneCall(s1, 300);
        phoneCall(s1, 1200);
        phoneCall(s1, 10);

        phoneCall(s2, 10);

        phoneCall(s3, 65);
        phoneCall(s3, 115);
        phoneCall(s3, 488);
        phoneCall(s3, 302);
        phoneCall(s3, 510);
        phoneCall(s3, 250);

        
        buyPhone(s3, new Phone("Simm", "UL8R", new Account("VerTuleTyat")));

    }
}