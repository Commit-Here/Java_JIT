// Representation of a person.
public class Person{
    // The name and birthday of a person
    private final String name;
    private final Date birthDate;

    // Construct a person -- fiven the required name and birhtday.
    public Person(String requiredName, Date requiredBirthDate){ 
        name = requiredName;
        birthDate = requiredBirthDate;
    } // Person
    
    // The correct line separator for this platform.
    private static String NLS = System.getProperty("line.separator");
    
    // Override the default line separator.
    public static void setLineSeparator(String requiredLineSeparator){
        NLS = requiredLineSeparator;
    } // setLineSeparator

    // return the ageHistory of this person
    public String ageHistory(){
        Date presentDate = Date.getPresentDate();

        // Deal with cases where the person has just been born
        // or is not yet born.
        if (presentDate.equals(birthDate))
            return name + " was, or will be, born today!";
        else if (presentDate.lessThan(birthDate))
            return name + " will be born on " + birthDate;
        else {
            // The person was born before today.
            // Start with the event of birth.
            String result = name + " was born on " + birthDate;

            // Now we will go throught the years since birth but before today.
            // We keep track of the birthday we are considering.
            Date someBirthday = birthDate.addYear();
            int ageOnSomeBirthday = 1;

            while(someBirthday.lessThan(presentDate)){
                result += NLS + name + " was " + ageOnSomeBirthday + " on " + someBirthday;
                someBirthday = someBirthday.addYear();
                ageOnSomeBirthday++;
            } // while

            // Now deal with next birthay.
            if (someBirthday.equals(presentDate))
                result += NLS + name + " is " + ageOnSomeBirthday + " today!";
            else
                result += NLS + name + " will be " + ageOnSomeBirthday + " on " + someBirthday;

            return result;
        } // else
    
    } // ageHistory
} // class Person