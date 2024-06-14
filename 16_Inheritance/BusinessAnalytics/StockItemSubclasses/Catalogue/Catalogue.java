// Representation of a stock item catalogue
public class Catalogue extends StockItem {
    // Consturctor is given price and quantity.
    public Catalogue(int price, int quantity){
        super(price, quantity);
        vatRate = 0.0;
    } // Catalogue

    // Returns the string "Stock item type"
    public String getStockType(){
        return "Catalogue";
    } // getStockType

    // Returns the string  "A description of the stock item"
    public String getDescription(){
        return "List of all items and prices";
    } // getDescription

    // Returns the standard percentage VAT rate.
    public Double getVatRate(){
        return vatRate;
    } // getVatRate
} // class Catalogue.