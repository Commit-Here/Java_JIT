public class ValuableHouse extends House implements Valuable{
    private double locationDesirabilityIndex;
    public ValuableHouse(int requiredNoOfBedrooms, 
                        double requiredLocationDesirabilityIndex){
        super(requiredNoOfBedrooms);
        locationDesirabilityIndex = requiredLocationDesirabilityIndex;
    }

    @Override
    public int value(){
        return (int) (getNoOfBedrooms() * 50000 * locationDesirabilityIndex);
    } // value

    @Override
    public String toString(){
        return "House worth " + value();
    } // toString
}