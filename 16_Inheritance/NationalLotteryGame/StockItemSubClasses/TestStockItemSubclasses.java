// Create one of each type of stock item, and increase, sell and change price of stock.
public class TestStockItemSubclasses{
    private static void createStock(StockItem item) {
        System.out.println("Creating a " + item.getStockType() + " stock item, " + item.getQuantityInStock() 
                            + " in stock @ " + item.getPriceExVat() + ".");
        System.out.println(item);
    } // createStock

    private static void buyStock(StockItem item, int amount){
        System.out.println("Obtain " + amount + " more " + item.getStockType() + "s.");
        item.increaseStock(amount);
        System.out.println(item);
    } // buyStock

    private static void sellStock(StockItem item, int amount){
        System.out.println("Sell " + amount + " " + item.getStockType() + "s.");
        item.sellStock(amount);
        System.out.println(item);
    } // sellStock

    private static void changePrice(StockItem item, int amount){
        System.out.println("Change " + item.getStockType() + " price to " + amount + ".");
        item.setPriceExVat(amount);
        System.out.println(item);
    } // changePrice

    public static void main (String args[]){
        StockItem[] stockItems = {
            new Catalogue(100, 10),
            new MouseMat(200, 20),
            new CPU(300, 30),
            new Keyboard(400, 40),
            new HardDisc(500, 50)
        };

        for (StockItem stockItem: stockItems){
            System.out.println("-------------------------------------------------------------");
            createStock(stockItem);
            buyStock(stockItem, 10);
            sellStock(stockItem, 5);
            changePrice(stockItem, 599);
        } // for
    } // main
} // class TestStockItemSubclasess
