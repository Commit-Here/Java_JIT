public class ValuableCar extends Car implements Valuable{
    private double streetCredibilityIndex;
    public ValuableCar(int requiredNoOfDoors, 
                        double requiredStreetCredibilityIndex) {
        super(requiredNoOfDoors);
        streetCredibilityIndex = requiredStreetCredibilityIndex;
    }

    @Override
    public int value(){
        return (int) (getNoOfDoors() * 2000 * streetCredibilityIndex);
    }

    @Override
    public String toString() {
        return "Car worth " + value();
    }
}