// Create a stock item and manipulate its qunatity.
public class TestStockItem{
    private static void createStock(String stockName, StockItem item) {
        System.out.println("Creating a " + stockName + " stock item, " + item.getQuantityInStock() 
                            + " in stock @ " + item.getPriceExVat() + ".");
        System.out.println(item);
    } // createStock

    private static void buyStock(String stockName, StockItem item, int amount){
        System.out.println("Obtain " + amount + " more " + stockName + ".");
        item.increaseStock(amount);
        System.out.println(item);
    } // buyStock

    private static void sellStock(String stockName, StockItem item, int amount){
        System.out.println("Sell " + amount + " " + stockName + ".");
        item.sellStock(amount);
        System.out.println(item);
    } // sellStock

    private static void changePrice(String stockName, StockItem item, int amount){
        System.out.println("Change " + stockName + " price to " + amount + ".");
        item.setPriceExVat(amount);
        System.out.println(item);
    } // changePrace

    public static void main(String args[]){
        StockItem keyboardStock = new StockItem(499, 10);
        StockItem monitorStock = new StockItem(9999, 20);
        
        createStock("keyboard", keyboardStock);
        createStock("monitor", monitorStock);

        buyStock("keyboards", keyboardStock, 10);
        buyStock("monitors", monitorStock, 20);

        sellStock("keyboards", keyboardStock, 5);
        sellStock("monitors", monitorStock, 10);

        changePrice("keyboard", keyboardStock, 399);
        changePrice("monitor", monitorStock, 7999);
    } // main
} // class TestStockItem