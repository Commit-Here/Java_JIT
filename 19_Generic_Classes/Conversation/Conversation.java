// Representation of a group of lottery people talking in turn.
public class Conversation<Type extends Person>{
    // Initial size and resize factor
    private final static int INTIAL_ARRAY_SIZE = 2, ARRAY_RESIZE_FACTOR = 2;

    // The array, together with the number of Persons objects in it.
    private Person[] persons = new Person[INTIAL_ARRAY_SIZE];
    private int noOfPersons = 0;

    // Empty constructor nothing needs to be done.
    public Conversation(){
    }
    // Add given Person to the Conversation (extend array as required)
    public void addPerson(Type newPerson){
        if (noOfPersons == persons.length){
            Person[] biggerArray = new Person[persons.length * ARRAY_RESIZE_FACTOR];
            for (int index=0; index<persons.length;index++)
                biggerArray[index] = persons[index];
            persons = biggerArray;
        } // if
        persons[noOfPersons] = newPerson;
        noOfPersons++;
    } // addPerson

    // Return the number of people in the conversation.
    public int getSize(){
        return noOfPersons;
    }

    // Used to keep track of whose turn it is to speak.
    private int nextToSpeak = 0;
    
    // Make the next person speak and update who is next after that.
    public void speak(){
        if (noOfPersons > 0){
            persons[nextToSpeak].speak();
            nextToSpeak = (nextToSpeak + 1) % noOfPersons;
        }
    }

    // Mainly for testing.
    @Override 
    public String toString(){
        String result = noOfPersons == 0 ? "" : "" + persons[0];
        for (int index = 1; index < noOfPersons; index++)
            result += String.format("%n%s", persons[index]);
        return result;
    } // tostring
} // class Conversation 