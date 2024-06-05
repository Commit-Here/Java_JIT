// Create a Catalogue stock and manipulate parameters.
public class TestCatalogue{
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
        Catalogue catalogue = new Catalogue(399, 10);

        createStock(catalogue);
        buyStock(catalogue, 10);
        sellStock(catalogue, 5);
        changePrice(catalogue, 599);
    } // main
} // class TestMouseMat