// Representation of book item.
public class Book extends TextDescriptionStockItem {

    // Constructor is given price and quantity
    public Book(int price, int quantity){
        super("default book item", price, quantity);
        vatRate = 0.0;
    } // Book

    // Returns the string "Stock item type"
    public String getStockType(){
        return "Book";
    } // getStockType

} // class Book