// Representation of a shopping basket which can contain
// any number of stock item purchase requests.
public class ShoppingBasket {
    
    // Number of stock item purchase requests
    private StockItemPurchaseRequest[] stockItemPurchaseRequests;
    
    // The number of purchase requests.
    private int noOfPurchaseRequests;

    // The total shopping basket value ex vat.
    private int baseketValueExVat;

    // The total shopping basket value inc vat.
    private int baseketValueIncVat;
    
    // The report of shopping basket.
    private String shoppingBasketReport;

    // Constructor 
    public ShoppingBasket() {
        noOfPurchaseRequests = 0;
        baseketValueExVat = 0;
        baseketValueIncVat = 0;
        stockItemPurchaseRequests = new StockItemPurchaseRequest[noOfPurchaseRequests+1];
    } // ShoppingBasket

    // returns current purchase requests.
    public StockItemPurchaseRequest[] getPurchaseRequests() {
        return stockItemPurchaseRequests;
    } // getPurchaseRequests

    // This is called once array is full and to increase the size.
    private void resizeArrayOfRequests() {
        int index = 0;
        StockItemPurchaseRequest[] newStockItemPurchaseRequests = 
                            new StockItemPurchaseRequest[noOfPurchaseRequests+1];
        for(StockItemPurchaseRequest request : stockItemPurchaseRequests){
               newStockItemPurchaseRequests[index] = request;
               index++;
        } // for
        stockItemPurchaseRequests = newStockItemPurchaseRequests;
    } // resizeArrayOfRequests

    // Add a given stock item with amount 
    public void add(StockItem stockItem, int quantity) {
        StockItemPurchaseRequest request = new StockItemPurchaseRequest(stockItem, quantity);
        if (stockItemPurchaseRequests.length <= noOfPurchaseRequests)
            resizeArrayOfRequests();
        stockItemPurchaseRequests[noOfPurchaseRequests] = request;
        noOfPurchaseRequests++;
    } // add

    //  
    public String checkout() {

        StockItemPurchaseRequest[] newStockItemPurchaseRequests = 
                                new StockItemPurchaseRequest[noOfPurchaseRequests];
        String checkoutReport = "Checkout report: \n";
        int index = 0;

        for (StockItemPurchaseRequest request : stockItemPurchaseRequests) {
            StockItem stockItem = request.getStockItem();
            int quantity = request.getQuantity();


            if (stockItem.sellStock(quantity)){
                baseketValueExVat += stockItem.getPriceExVat() * quantity;
                baseketValueIncVat += stockItem.getPriceIncVat() * quantity;
                checkoutReport += "Purchased " + quantity + " of " + stockItem + "\n";
            }
            else {
                checkoutReport += "Not Purchased " + quantity + " of " + stockItem + "\n";
                newStockItemPurchaseRequests[index] = request;
                index++;
            } // else
        } // for

        stockItemPurchaseRequests = newStockItemPurchaseRequests;

        checkoutReport += "Total price ex vat: " + baseketValueExVat + "p\n";
        checkoutReport += "Total price inc vat: " + baseketValueIncVat + "p\n"; 

        return checkoutReport;
    } // checkout

    public String toString() {
        String result = "Shopping Basket: \n";
        for (StockItemPurchaseRequest request : stockItemPurchaseRequests) 
            if (request != null)
                result += request + "\n";
        return result;
    } // toString
} // class ShoppingBasket