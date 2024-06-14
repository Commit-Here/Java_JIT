// Representation of hard disc item.
public class HardDisc extends StockItem {

    // Constructor is given price and quantity.
    public HardDisc(int price, int quantity){
        super(price, quantity);
    } // HardDisc

    // Returns the string "Stock item type"
    public String getStockType(){
        return "Hard disc";
    } // getStockType

    // Returns the string  "A description of the stock item"
    public String getDescription(){
        return "Lots of space";
    } // getDescription

} // class HardDisc