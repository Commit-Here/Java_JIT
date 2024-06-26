import java.awt.Color;

// Representation of keyboard item.
public class Keyboard extends StockItem {

    // The description suitable to particular stock item.
    private String description; 

    // Different attributes
    private final Color colour;
    private final String vendor;
    private final int noOfKeys;
    private final String specialFeature;

    // Constructor is given price and quantity.
    public Keyboard(int price, int quantity, Color requiredColor, 
                    String vend, int keys, String feature){
        super(price, quantity);
        colour = requiredColor;
        vendor = vend;
        noOfKeys = keys;
        specialFeature = feature;
        description = "colour " + requiredColor + ", supplied by " + vend 
                    + ", no of keys " + keys + ", with speciality " + feature;
    } // Keyboard

    // Returns the color of the keyborad.
    public Color getColour() {
        return colour;
    } // getColour

    // Returns the string "Stock item type"
    public String getStockType(){
        return "Keyboard";
    } // getStockType

    public void setDescription(String newDescription) {
        description = newDescription;
    } // setDescription
    
    // Returns the string  "A description of the stock item"
    public String getDescription(){
        return description;
    } // getDescription

} // class Keyboard