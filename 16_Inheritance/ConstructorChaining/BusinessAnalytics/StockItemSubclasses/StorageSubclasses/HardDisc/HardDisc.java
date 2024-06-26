// Representation of hard disc item.
public class HardDisc extends Storage {

    // The description suitable to particular stock item.
    private String description;
    
    // Constructor is given price, quantity and storage.
    public HardDisc(int price, int quantity, int storage, int physicalS,
                    int rSpeed, int cacheS, String vend){
        super(price, quantity, storage, physicalS, rSpeed, cacheS, vend);
        System.out.println("This is Hard Disc Class and will now call");
        description = size + "GB of space" + " with speed, "  + rSpeed +
                ", physical size of " + storage + ", cache size of " + cacheS
                + ", supplied by " + vend;
    } // HardDisc

    // Returns the string "Stock item type"
    public String getStockType(){
        return "Hard disc";
    } // getStockType

    public void setDescription(String newDescription) {
        description = newDescription;
    } // setDescription

    // Returns the string  "A description of the stock item"
    public String getDescription(){
        return description;
    } // getDescription
 
} // class HardDisc