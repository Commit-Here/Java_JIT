public class House extends Building{
    private int noOfBedrooms;
    public House(int requiredNoOfBedrooms){
        noOfBedrooms = requiredNoOfBedrooms;
    }
    public int getNoOfBedrooms(){
        return noOfBedrooms;
    }
}