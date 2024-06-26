// Representation of book item.
public class Book extends TextDescriptionStockItem {

    // Constructor is given description, price and quantity
    public Book(String desc, int price, int quantity){
        super(desc, price, quantity);
        vatRate = 0.0;
    } // Book

    // Constructor is given price and quantity
    public Book(int price, int quantity){
        this("default book item", price, quantity);
    } // Book

    // Returns the string "Stock item type"
    public String getStockType(){
        return "Book";
    } // getStockType

} // class Book