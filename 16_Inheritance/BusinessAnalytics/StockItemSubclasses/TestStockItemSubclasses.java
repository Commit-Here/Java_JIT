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

    private static void testStock(StockItem item) {
        System.out.println("-------------------------------------------------------------");
        createStock(item);
        buyStock(item, 10);
        sellStock(item, 5);
        changePrice(item, 599);
        System.out.println("");
        if (item instanceof TextDescriptionStockItem) 
            testTextDescriptionStockItem((TextDescriptionStockItem)item);
    } // testStock

    private static void testTextDescriptionStockItem(TextDescriptionStockItem item) {
        if (item instanceof MouseMat) {
            item.setDescription("this is new mouse mat");
            createStock(item);
            buyStock(item, 10);
            sellStock(item, 5);
            changePrice(item, 599);
        } // if
        if (item instanceof Book) {
            item.setDescription("List of all items and prices");
            createStock(item);
            buyStock(item, 10);
            sellStock(item, 5);
            changePrice(item, 599);
        } // if
    } // testTextDescriptionStockItem

    public static void main (String args[]){
        StockItem[] stockItems = {
            new Book(100, 10),
            new MouseMat(200, 20),
            new CPU(300, 30),
            new Keyboard(400, 40),
            new HardDisc(500, 50, 1000),
            new ReliableHardDisc(500, 40, 200, 20)
        };

        for (StockItem stockItem : stockItems){
            testStock(stockItem);
        } // for
    } // main
} // class TestStockItemSubclasess
