// Representation of mouse mat item.
public class MouseMat extends TextDescriptionStockItem {

    // Constructor is given description, price and quantity
    public MouseMat(String desc, int price, int quantity) {
        super(desc, price, quantity);   
    } // MouseMat

    // Constructor is given price and quantity.
    public MouseMat(int price, int quantity){
        this("default Mouse description", price, quantity);
    } // MouseMat

    // Returns the string "Stock item type"
    public String getStockType(){
        return "Mouse mat";
    } // getStockType

} // class MouseMat