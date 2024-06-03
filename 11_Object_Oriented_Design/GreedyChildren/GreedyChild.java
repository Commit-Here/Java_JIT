/* Each greedy child has a name and a fixed stomach size, which is an amount
    of ice cream he or she can hold. This capacity can either be specified, or
    be chosen as a random number up to some maximum. A child also has a current
    stomach contents which starts off as being zero, but increases, through
    eating, up to his or her stomach size. Children can visit ice cream
    parlours and attempt to eat an amount of ice cream. Being greedy, they may
    well attempt to eat more than they have room left for, in which case they
    end up spilling the excess ice cream down their T-shirt! A child keeps
    track of how much ice cream he or she has spilt, initially zero.
*/
public class GreedyChild {
    // When a GreedyChild is created with no given capacity
    // a random one is chosen up to this maximum.
    public static final double MAXIMUM_RANDOM_STOMACH_SIZE = 20.0;

    // The name of the child
    private final String name;
    
    // The amount of ice cream that child can hold before being full.
    private final double stomachSize;

    // The total amount of ice cream that the child has spilt by 
    // attempting to eat after being full. Initially zero.
    private double tShirtStainSize = 0;

    // The amount of ice cream currently in the child's stomach.
    // Initially zero.
    private double stomachContents = 0;

    // The ice cream parlour the child is currently in,
    // or null if she is not in one.
    private IceCreamParlour currentParlour = null;

    // Construct a greedy child -- given the required name and size.
    public GreedyChild(String requiredName, double requiredStomachSize){
        name = requiredName;
        stomachSize = requiredStomachSize;
    } // GreedyChild

    // Construct a greedy child -- given the required name.
    // with randomly chosen size.
    public GreedyChild(String requiredName){
        name = requiredName;
        stomachSize = Math.random() * MAXIMUM_RANDOM_STOMACH_SIZE;
    } // GreedyChild

    // Enter an ice cream parlour
    public void enterParlour(IceCreamParlour parlourEntered){
        currentParlour = parlourEntered;
    } // enterParlour

    // Leave an ice cream parlour
    public void leaveParlour(){
        currentParlour = null;
    } // leaveParlour

    // Attempt to eat a given amount of ice cream from the current parlour.
    // No effect if no parlour. Otherwise parlour attempts to serve that amount.
    // Excess is spilt once full.
    public void tryToEat(double amountDesired){
        if (currentParlour == null)
            return;
        
        double amountServed = currentParlour.tryToServe(amountDesired);
        double roomLeft = stomachSize - stomachContents;
        if (amountServed <= roomLeft)
            stomachContents += amountServed;
        else {
            stomachContents = stomachSize;
            tShirtStainSize += amountServed - roomLeft;
        } // if
    } // tryToEat

    // The correct line separator fot this platform.
    private static final String NLS = System.getProperty("line.separator");

    // Return a String giving the name and state.
    public String toString(){
        return name + " is " + stomachContents + "/" + stomachSize + " full"
                +  " and has spilt " + tShirtStainSize + NLS
                + "(currently in )" + currentParlour + ") ";
    } // toString
} // class GreedyChild