// Representation of mouse mat item.
public class MouseMat extends StockItem {

    // Constructor is given price and quantity.
    public MouseMat(int price, int quantity){
        super(price, quantity);
    } // MouseMat

    // Returns the string "Stock item type"
    public String getStockType(){
        return "Mouse mat";
    } // getStockType

    // Returns the string  "A description of the stock item"
    public String getDescription(){
        return "Plain blue cloth, foam backed";
    } // getDescription

} // class MouseMat