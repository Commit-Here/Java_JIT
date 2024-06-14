// Representation of StockItem to keep track of stock and prices.
public abstract class StockItem{

    // The number of stock items created so far.
    private static int noOfStockItemsCreated = 0;   

    // Fixed Vat rate value.
    private static double CURRENT_VAT_RATE = 17.51;

    // The fixed stock code of this item.
    private final int stockCode;

    // The price of stock itme exclusive of VAT(sales tax).
    private int priceExVat;

    // The quantity of stock itme.
    private int quantityInStock;

    // The standard percetage VAT rate.
    public double vatRate;

    // Constructor 
    public StockItem(int initialPriceExVat, int initialQuantityInStock){
        noOfStockItemsCreated++;
        stockCode = noOfStockItemsCreated;
        priceExVat = initialPriceExVat;
        quantityInStock = initialQuantityInStock;
        vatRate = CURRENT_VAT_RATE;
    } // StockItem

    // Returns the stock code for this stock itme.
    public int getStockCode(){ 
        return stockCode;
    } // getStockCode

    // Returns the string "Stock item type"
    public abstract String getStockType();

    // Returns the string  "A description of the stock item"
    public abstract String getDescription();

    // Returns the quantity in stock of this stock item.
    public int getQuantityInStock(){
        return quantityInStock;
    } // getQuantityInStock

    // Increases the stock level by the given amount.
    public void increaseStock(int givenAmount){
        // If less than one, throw an exception.
        if (givenAmount < 1) 
            throw new IllegalArgumentException("The increase in stock by " + givenAmount + " is inadequate!");
        quantityInStock += givenAmount;
    } // increaseStock

    // Reduce the stock level by the given amount.
    public boolean sellStock(int givenAmount){
        // If less than one, throw an exception.
        if (givenAmount < 1) 
            throw new IllegalArgumentException("The decrease in stock by " + givenAmount + " is inadequate!");
        
        // if the amount is more than that of stock return false.
        if (givenAmount > quantityInStock) 
            return false;

        // otherwise true
        quantityInStock -= givenAmount;
        return true;
    } // sellStock

    // Sets the price of this item with given rate.
    public void setPriceExVat(int givenRate){
        // This is the rate before VAT.
        priceExVat = givenRate;
    } // setPriceExVat

    // Returns the price before VAT
    public int getPriceExVat(){
        return priceExVat;
    } // getPriceVat

    // Returns the standard percentage VAT rate.
    public Double getVatRate(){
        return vatRate;
    } // getVatRate

    // Returns the price inlcluding VAT 
    public int getPriceIncVat(){
        return priceExVat + (int)((vatRate / 100) * priceExVat);
    } // getPriceIncVat

    // Returns a string representation of stock item.
    public String toString(){
        return "SC" + getStockCode() + ": " + getStockType() + ", "
                + getDescription() + " (" + getQuantityInStock() + " @ " 
                + getPriceExVat() + "p/" + getPriceIncVat() + "p)";
    } // toString

} // class StockItem