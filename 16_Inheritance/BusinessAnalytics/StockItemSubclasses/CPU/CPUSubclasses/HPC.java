// Representation of HPUitem.
public class HPC extends CPU {

    // initially without GPU
    private boolean withGPU;

    // Constructor is given price and quantity.
    public HPC(int price, int quantity, int requiredSpeed){
        super(price, quantity, requiredSpeed, "AMD", "QBSoft");
        withGPU = true;
    } // HPC

    public void withoutGPU(boolean flag) {
        withGPU = false;
    } // setGPU

    // Returns the string "Stock item type"
    public String getStockType(){
        return "HPC";
    } // getStockType

    // Returns the string  "A description of the stock item"
    @Override
    public String getDescription(){
        return "HPC(QBSoft)" +super.getDescription() + (withGPU ? "and has seperate GPU" : 
                                                                    "and has integrated GPU") ;
    } // getDescription

} // class HPC