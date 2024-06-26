// Representation of a purchase made by customer, comprising of stockitem and quantity.

public class StockItemPurchaseRequest{

    // The purchased stock item.
    private final StockItem stockItem;

    // The quantity of purchased stock item.
    private final int quantity;

    public StockItemPurchaseRequest(StockItem requiredStockItem, int requiredQuantity) {
        stockItem = requiredStockItem;
        quantity = requiredQuantity;
    } // StockItemPurchaseRequest

    // Returns the purchased stock item.
    public StockItem getStockItem() {
        return stockItem;
    } // getStockItem

    // Returns the quantity of purchased stock item.
    public int getQuantity() {
        return quantity;
    } // getQuantity

    // Mainly for testing
    public String toString() {
        return getQuantity() + " of " + getStockItem();
    } // toString

} // class StockItemPurchaseRequest