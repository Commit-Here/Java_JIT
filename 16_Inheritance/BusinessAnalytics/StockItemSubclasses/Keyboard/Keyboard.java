// Representation of keyboard item.
public class Keyboard extends StockItem {

    // Constructor is given price and quantity.
    public Keyboard(int price, int quantity){
        super(price, quantity);
    } // Keyboard

    // Returns the string "Stock item type"
    public String getStockType(){
        return "Keyboard";
    } // getStockType

    // Returns the string  "A description of the stock item"
    public String getDescription(){
        return "Cream, non-click";
    } // getDescription

} // class Keyboard