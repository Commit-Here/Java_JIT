import java.awt.Color;

// Representation of a trainee lottery worker,
// who has an efficiency rating effecting accuracy of ball numbering.
public class TraineeWorker extends Worker {
    // The efficiency of the TraineeWorker.
    private final double efficiency;

    // Constructor is given the person's name and the required efficiency.
    public TraineeWorker(String name, double requiredEfficiency) {
        super(name);
        efficiency = requiredEfficiency;
    } // TraineeWorker

    // Returns the Person's name with efficiency added in brackets.
    public String getPersonName() {
        return super.getPersonName() + " (" + efficiency + " efficiency)";
    } // getPersonName

    // Returns the name of type of Person.
    public String getPersonType() {
        return "Trainee " + super.getPersonType();
    } // getPersonType

    // Returns a newly created Ball with the givne number and colour.
    // The balls number may be wrong depending on the efficiency.
    public Ball makeNewBall(int number, Color colour) {
        if (Math.random() >= efficiency) 
            if (Math.random() < 0.5) 
                number--;
            else
                number++;
        return new Ball(number, colour);
    } // makeNewBall
} // class TraineeWorker