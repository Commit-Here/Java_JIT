// Representation of a date.
public class Date {
    // Class vaiable to hold the present date.
    private static Date presentDate = null;

    // Class method to set the present date.
    // This does nothing if it has already been set.
    public static void setPresentDate(Date requiredPresentDate){
        if (presentDate == null)
            presentDate = requiredPresentDate;
    } // setPresentDate

    // Class method to obtain the present date.
    public static Date getPresentDate(){
        return presentDate;
    } // getPresentDate
    
    // The day, month and year of the date.
    public int day, month, year;

    // Construct a date -- given the required day, month and year.
    public Date(int requiredDay, int requiredMonth, int requiredYear){
        day = requiredDay;
        month = requiredMonth;
        year = requiredYear;
    } // Date

    // Compare this date with a given other one, for equality.
    public boolean equals(Date other){
        return day == other.day && month == other.month && year == other.year;
    } // equals

    // Compare this date with a given other one, for less than.
    public boolean lessThan(Date other){
        return year < other.year 
                || year == other.year && (month < other.month 
                || month == other.month && day < other.day);
    } // lessThan

    // Return the day/month/year representation of the date.
    public String toString(){
        return day + "/" + month + "/" + year;
    } // toString

    // NEW TASK
    // Return a new Date which is one year later than this one.
    public Date addYear(){
        return new Date(day, month, year+1);
    } // addYear
} // class Date