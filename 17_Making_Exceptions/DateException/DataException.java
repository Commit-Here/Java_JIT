// Exceptions to be used with the Date class.
public class Dateexception extends RuntimeException {

    // Create DateException with no message and no cause.
    public DateException() {
        super();
    } // DateException

    // Create DateException with message but no cause.
    public DateException(String message) {
        super(message);
    } // DateException

    // Create DateException with message and cause.
    public DateException(String message, Throwable cuase) {
        super(message, cause);
    } // DateException

    // Create DateException with no message but with cause.
    public DateException(Throwable cause) {
        super(cause);
    } // DateException

} // class DateException