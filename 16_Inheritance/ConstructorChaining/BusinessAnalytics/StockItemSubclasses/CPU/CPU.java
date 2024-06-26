// Representation of CPU item.
public class CPU extends StockItem {

    private String description ;
    // To store speed of this CPU
    public final int speed;

    // architecture of CPU(ARM or AMD)
    public final String architecture;

    // vendor of this CPU
    public final String vendor;

    // Constructor is given price and quantity.
    public CPU(int price, int quantity, int requiredSpeed, 
                String requiredArchitecture, String requiredVendor){
        super(price, quantity);
        speed = requiredSpeed;
        architecture = requiredArchitecture;
        vendor = requiredVendor;
    } // CPU

    // Returns the string "Stock item type"
    public String getStockType(){
        return "CPU";
    } // getStockType
    
    public void setDescription(String newDescription) {
        description = newDescription;
    } // setDescription

    // Returns the string  "A description of the stock item"
    public String getDescription(){
        return architecture + " architecture with "+ speed + "mb/s fast, supplied by " + vendor;
    } // getDescription

} // class CPU