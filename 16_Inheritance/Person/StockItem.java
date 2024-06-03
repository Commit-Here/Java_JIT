public class StockItem{
    // The number of stock items created so far.
    private static int noOfStockItemsCreated = 0;   
    // The fixed stock code of this item.
    private final int stockCode;
    private static int price;
    public StockItem(int initialPriceExVat, int initialQuantityInStock){
        noOfStockItemsCreated++;
        stockCode = noOfStockItemsCreated;
        price = initialPriceExVat
    } 

    public static int getStockCode(){
        return this->stockCode;
    }
    public static String getStockType(){
        return "Stock item type";
    }
    public static String getDescription(){
        return "A description of the stock item";
    }
    public static int getQunatityInStock(){
        return this->stokeCode;
    }
    public static void increaseStock(int){

    }
    public static boolean sellStock(int){

    }
    public static void setPriceExVat(int){

    }
    public static int getPriceExVat(){

    }
    public static Double getVatRate(){

    }
    public static int getPriceIncVat(){

    }
    public static String toString(){

    }
}