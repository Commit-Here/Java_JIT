public class MoodyGroup<Type extends MoodyPerson> {
    // Initial size and resize factor
    private final static int INTIAL_ARRAY_SIZE = 2, ARRAY_RESIZE_FACTOR = 2;

    private MoodyPerson[] moodyPersons = new MoodyPerson[INTIAL_ARRAY_SIZE];
    private int noOfPersons = 0;

    // Empty constructor nothing needs to be done.
    public MoodyGroup(){
    }

    public void addMoodyPerson(Type newPerson){
        if (noOfPersons == moodyPersons.length){
            MoodyPerson[] biggerArray = new MoodyPerson[moodyPersons.length * ARRAY_RESIZE_FACTOR];
            for (int index=0; index<moodyPersons.length;index++)
                biggerArray[index] = moodyPersons[index];
            moodyPersons = biggerArray;
        } // if
        moodyPersons[noOfPersons] = newPerson;
        noOfPersons++;
    } // addPerson

    public int getSize(){
        return noOfPersons;
    }

    public Type getMoodyPerson(int index){
        return (Type)moodyPersons[index];
    }

    private int nextTo = 0;
    public void setHappy(boolean status){
        if (noOfPersons > 0)
            for (int index =0; index<noOfPersons;index++){
                moodyPersons[index].setHappy(status);
                nextTo+=1;
            }
    
    }

    @Override 
    public String toString(){
        String result = noOfPersons == 0 ? "" : "" + moodyPersons[0];
        for (int index = 1; index < noOfPersons; index++)
            result += String.format("%n%s", moodyPersons[index]);
        return result;
    } // tostring
}