// Representation of stocks with simple variations in their descriptions
public abstract class TextDescriptionStockItem extends StockItem {
    // The description suitable to particular stock item.
    private String description;

    // Constructor is given description, price and quantity.
    public TextDescriptionStockItem(String initialDescription, int initialPriceExVat, 
                                    int initialQuantityInStock) {
        super(initialPriceExVat, initialQuantityInStock);
        description = initialDescription;
    } // TextDescriptionStockItem

    // Returns the description of the stock item.
    public String getDescription() {
        return description;
    } // getDescription

    // sets the description of the stock item.
    public void setDescription(String newDescription) {
        description = newDescription;
    } // setDescription

} // class TextDescriptionStockItem