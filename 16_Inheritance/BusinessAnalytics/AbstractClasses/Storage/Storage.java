// Representation of storage item.
public abstract class Storage extends StockItem {

    public int size, rotatationalSpeed, physicalSize, cacheSize;
    public String vendor;


    // Constructor is given price, quantity and storage.
    public Storage(int price, int quantity, int storage, int physicalS,
                    int rSpeed, int cacheS, String vend){
        super(price, quantity);
        size = storage;
        rotatationalSpeed = rSpeed;
        physicalSize = physicalS;
        cacheSize = cacheS;
        vendor = vend;

    } // HardDisc

    public int getSize(){
        return size;
    } // getSize

    public void setSize(int newSize){
        size = newSize;
    } // setSize

    // Returns the string "Stock item type"
    public abstract String getStockType();

    // Returns the string  "A description of the stock item"
    public abstract String getDescription();

} // class HardDisc