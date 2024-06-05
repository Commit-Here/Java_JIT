// Create a Mouse mat stock and manipulate parameters.
public class TestMouseMat{
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

    public static void main(String args[]){
        MouseMat mouseMat = new MouseMat(399, 10);

        createStock(mouseMat);
        buyStock(mouseMat, 10);
        sellStock(mouseMat, 5);
        changePrice(mouseMat, 599);
    } // main
} // class TestMouseMat