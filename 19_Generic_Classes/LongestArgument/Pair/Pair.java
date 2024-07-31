// Two objexts grouped into a pair
public class Pair {
    // The two objects
    private final Object first, second;

    // Constructor is given the two objects.
    public Pair(Object requiredFirst, Object requiredSecond) {
        first = requiredFirst;
        second = requiredSecond;
    } // Pair

    // Return the first object.
    public Object getFirst() {
        return first;
    }

    // Return the second object
    public Object getSecond() {
        return second;
    } // getSecond
} // class Pair
