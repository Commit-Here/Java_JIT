
// Representation of a Hard disc that is reliable,t is guaranted to keep 
// data safe from disc crash for a specified number of years.
public class ReliableHardDisc extends HardDisc {

    // The guranteed time period for data to be safe.
    private final int guaranteedYears;

    // Constructor is given price, quantity and storage.
    public ReliableHardDisc(int price, int quantity, int storage, int physicalS,
                            int rSpeed, int cacheS, String vend, int years){
        super(price, quantity, storage, physicalS, rSpeed, cacheS, vend);
        guaranteedYears = years;
    } // ReliableHardDisc

    // Returns the string  "A description of the stock item"
    @Override
    public String getDescription(){
        return super.getDescription() + ", guranteed " + guaranteedYears + " years";
    } // getDescription

} // class ReliableHardDisc