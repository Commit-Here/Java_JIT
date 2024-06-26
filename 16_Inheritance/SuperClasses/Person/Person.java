// Representation of a person involved somehow in the lottery.
public class Person {

    // The name of the perosn.
    private final String personName;

    // The Person's latest saying.
    private String latestSaying;

    // Constructor is given the person's name.
    public Person(String requiredPersonName) {
        personName = requiredPersonName;
        latestSaying = "I am " + personName;
    } // Person

    // Returns the Person's name.
    public String getPersonName() {
        return personName;
    } // getPersonName

    // Returns the Person's latest saying.
    public String getLatestSaying() {
        return latestSaying;
    } // getLatestSaying

    // Returns the name of the type of Person.
    public String getPersonType() {
        return "Person";
    } // getPersonType.

    // Returns whether or not the Person is happy.
    public boolean isHappy() {
        return true;
    } // isHappy

    // Returns the Person's current saying.
    public String getCurrentSaying() {
        return "I have nothing to say";
    } // getCurrentSaying

    // Causes the person to speak by updating their latest saying from
    // their current saying.
    public void speak() {
        latestSaying = getCurrentSaying();
    } // speak

    // Mainly for testing.
    public String toString() {
        return getPersonType() + " " + getPersonName()
                + " " + isHappy() + " " + getLatestSaying();
    } // toString

} // class Person