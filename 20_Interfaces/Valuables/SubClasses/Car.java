public class Car extends Vehicle{
    private final int noOfDoors;
    public Car(int requiredNoOfDoors){
        noOfDoors = requiredNoOfDoors;
    }
    public int getNoOfDoors(){
        return noOfDoors;
    }
}