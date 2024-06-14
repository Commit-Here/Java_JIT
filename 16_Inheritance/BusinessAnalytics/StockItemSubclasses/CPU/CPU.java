// Representation of CPU item.
public class CPU extends StockItem {

    // Constructor is given price and quantity.
    public CPU(int price, int quantity){
        super(price, quantity);
    } // CPU

    // Returns the string "Stock item type"
    public String getStockType(){
        return "CPU";
    } // getStockType

    // Returns the string  "A description of the stock item"
    public String getDescription(){
        return "Really fast";
    } // getDescription

} // class CPU