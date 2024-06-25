// Representation of hard disc item.
public class HardDisc extends StockItem {

    private final int size;

    // Constructor is given price, quantity and storage.
    public HardDisc(int price, int quantity, int storage){
        super(price, quantity);
        size = storage;
    } // HardDisc

    // Returns the string "Stock item type"
    public String getStockType(){
        return "Hard disc";
    } // getStockType

    // Returns the string  "A description of the stock item"
    public String getDescription(){
        return size + "GB of space";
    } // getDescription

} // class HardDisc