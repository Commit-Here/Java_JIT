/** 
 * This class represents calendar dates and provides
 * certain manipulations of them.
 * 
 * @author Burhan Khan
 */
public class Date {
    // Class variable to hold the present Date.
    private static Date presentDate = null;

    /**
     * Sets the present date.
     * The date must not have already been set.
     * 
     * @param requiredPresentDate The required date for the present day.
     * 
     * @throws Exception if present date has already been set
     *                      or if given data is null.
     */
    public static void setPresentDate(Date requiredPresentDate) throws Exception{
        if (requiredPresentDate == null)
            throw new Exception("Present date cannot be set to null");
        if (presentDate != null)
            throw new Exception("Present date has already been set");
        presentDate = requiredPresentDate;
    } // setPresentDate

    /**
     * Gets the present date.
     * 
     * @return The present date, or null if it has not been set.
     * 
     * @throws Exception if present date has not been set.
     */
    public static Date getPresentDate() throws Exception{
        if (presentDate == null) 
            throw new Exception("Present date has not been set.");
        return presentDate;
    } // getPresentDate

    // Instance variables: the day, month and year of a date.
    private final int day, month, year;

    /**
     * Constructs a date, If the day and/or month components are zero.
     * or negative, they are treated as being 1; if they are too
     * large, they are treated are being the largest value allowed.
     * 
     * @param requiredDay The required day.
     * @param requiredMonth The required month.
     * @param requiredYear The required year.
     * 
     * @throws Exception if the date components do not form a legal date since
     *                      the start of 1753(post Gregorian Reformation).
     */
    public Date(int requiredDay, int requiredMonth, int requiredYear) throws Exception{
        year = requiredYear;
        month = requiredMonth;
        day = requiredDay;

        // Now check these components are legal, throw exception if not.
        checkDateIsLegal();
    } // Date

    // Check legality of date components and throw exception if illegal.
    private void checkDateIsLegal() throws Exception {
        if (year < 1753)
            throw new Exception("Year " + year + " must be >= 1753");

        if (month < 1 || month > 12)
            throw new Exception("Month " + month + " must be from 1 to 12");
        
        if (day < 1 || day > daysInMonth())
            throw new Exception("Day " + day + " must be from 1 to " + daysInMonth()
                                + " for " + month + "/" + year);
    } // checkDateIsLegal

    /**
     * Constructs a date, given a String holding the
     * day/month/year representation of the date.
     * 
     * @param dateString The required date as day/month/year.
     * 
     * @throws Exception if dateString is not legal.
     */
    public Date(String dateString) throws Exception{
        try {
            String[] dateElements = dateString.split("/");
            if (dateElements.length > 3)
                // This exception will be caught below.
                throw new Exception("Too many date elements");
            day = Integer.parseInt(dateElements[0]);
            month = Integer.parseInt(dateElements[1]);
            year = Integer.parseInt(dateElements[2]);
        } // try
        catch (Exception exception) {
            throw new Exception("Date '" + dateString 
                                + "' is not in day/month/year format", 
                                exception);
        } // catch
        // If we get to here, we just check the date components are legal.
        checkDateIsLegal();
    } // Date

    /**
     * Yields the day component of this date.
     * 
     * @return The day
     */
    public int getDay(){
        return day;
    } // getDay

    /**
     * Yields the month component of this date.
     * 
     * @return The month
     */
    public int getMonth(){
        return month;
    } // getMonth

    /**
     * Yields the year component of this date.
     * 
     * @return The year
     */
    public int getYear(){
        return year;
    } // getYear

    /**
     * Provides the day/month/year representation of this date.
     * 
     * @return A String day/month/year representation of this date.
     */
    public String toString(){
        return day + "/" + month + "/" + year;
    } // toString

    /**
     * Compares this date with a given other one.
     * 
     * @param other The other date to compare with.
     * 
     * @return The value 0 if the other date represents the same date
     * as this one; a value less than 0 if this date is less than the
     * other; and a value greater than 0 if this date is greater than 
     * the other.
     * 
     * @throws NullPointerException if other is null
     */
    public int compareTo(Date other) throws NullPointerException{
        if (year != other.year)         return year - other.year;
        else if (month != other.month)  return month - other.month;
        else                            return day - other.day;
    } // compareTo

    /** 
     * Compares this date with a given other one, for equality.
     * 
     * @param other The other date to compare with.
     * 
     * @return true if and only if they represent the same date.
     * 
     * @throws NullPointerException if other is null
     */
    public boolean equals(Date other) throws NullPointerException{
        return compareTo(other) == 0;
    } // equals

    /**
     * Compares this date with a given other one, for less than.
     * 
     * @param other The other date to compare with.
     * 
     * @return true if and only if this date is less than the other.
     * 
     * @throws NullPointerException if other is null
     */
    public boolean lessThan(Date other) throws NullPointerException{
        return compareTo(other) < 0;
    } // lessThan

    /**
     * Compares this date with a given other one, for greater than.
     * 
     * @param other The other date to compare with.
     * 
     * @return true if and only if this date is greater than the other.
     * 
     * @throws NullPointerException if other is null
     */
    public boolean greaterThan(Date other) throws NullPointerException{
        return compareTo(other) > 0;
    } // greaterThan

    /**
     * Constructs a new date which is one day later than this one.
     * 
     * @return A new date which is one day later than this one.
     */
    public Date addDay(){
        // First try the obvious
        try { return new Date(day + 1, month, year); }
        catch (Exception exception1) {
            // Okay, so day must have been the last in this month.
            // Now try the first of the next month.
            try { return new Date(1, month+1, year); }
            catch (Exception exception2) {
                // Okay, so month must have been 12.
                // Now try the first of the next year.
                // This cannot cuase an excpetion.
                try { return new Date(1, 1, year + 1); }
                catch (Exception exception3) { return null; }
            } // catch
        } // catch
    } // addDay

    /**
     * Constructs a new date which is one month later than this one.
     * If the day is too large for that month, it is truncated to 
     * the number of days in that month.
     * 
     * @return A new date which is one month later than this one.
     */
    public Date addMonth(){
        int newDay = day;
        int newMonth = month + 1;
        int newYear = year;
        if (newMonth > 12){
            newMonth = 1;
            newYear++;
        } // if
        if (newDay > daysInMonth(newMonth, newYear)) 
            newDay = daysInMonth(newMonth, newYear);
        try { return new Date(newDay, newMonth, newYear); }
        catch (Exception exception) { return null; }
    } // addMonth

    /**
     * Constructs a new date which is one year later than this one.
     * If this date is a leap day, it returns 28th February of the next year.
     * 
     * @return A new date which is one year later than this one.
     */
    public Date addYear(){
        // This cannout couse an exception but Java does not know that.
        try {
            if (day == 29 && month == 2) 
                return new Date(28, month, year+1);
            else 
                return new Date(day, month, year+1);
        } // try
        catch (Exception exception) { return null; }
    } // addDay

    /**
     * Construcs a new date which is one day earlier than this one.
     * This can throw an exception.
     * if the new date is earlier thatn the start of 1753
     * 
     * @return A new date which is one day earlier than this one.
     * 
     * @throws Exception if the new date is earlier than the start of 1753.
     */
    public Date subtractDay() throws Exception{
        int newDay = day - 1;
        int newMonth = month;
        int newYear = year;
        if (newDay < 1){
            newMonth--;
            if (newMonth < 1){
                newMonth = 12;
                newYear--;
            } // if
            newDay = daysInMonth(newMonth, newYear);
        } // if
        return new Date(newDay, newMonth, newYear);
    } // subtractDay

    /**
     * Constructs a new date which is one month earlier than this one.
     * This can throw an exception.
     * if the new date is earlier thatn the start of 1753
     * 
     * @return A new date which is one month earlier than this one.
     * 
     * @throws Exception if the new date is earlier than the start of this month
     */
    public Date subtractMonth() throws Exception{
        int newDay = day;
        int newMonth = month - 1;
        int newYear = year;
        if (newMonth < 1){
            newMonth = 12;
            newYear--;
        } // if
        if (newDay > daysInMonth(newMonth, newYear)) 
            newDay = daysInMonth(newMonth, newYear);
        return new Date(newDay, newMonth, newYear);
    } // subtractMonth

    /**
     * Constructs a new date which is one year earlier than this one.
     * This can throw an exception.
     * if the new date is earlier thatn the start of 1753
     * If this date is a leap day, it returns 28th Febrauary of the previous year.
     * 
     * @return A new date which is one year earlier than this one.
     * 
     * @throws Exception if the new date is earlier than the start of 1753.
     */
    public Date subtractYear() throws Exception{
        if (day == 29 && month == 2)
            return new Date(28, month, year - 1);
        else
            return new Date(day, month, year - 1);
    } // subtractYear

    /**
     * Calculates how many days this date is from a given other.
     * If the other date is less than this one, then the distance 
     * is negative. It is non-negative otherwise (including zero if
     * they represent the same date).
     * 
     * @param other The other date.
     * 
     * @return The distance in days.
     * 
     * @throws NullPointerException if other is null.
     */
    public int daysFrom(Date other) throws NullPointerException {
        // The code here is a prototype
        // -- the result should be computed more efficiently than this!
        if (equals(other))
            return 0;
        else if (lessThan(other)) {
            Date someDate = addDay();
            int noOfDaysDistance = 1;
            while (someDate.lessThan(other)){
                someDate = someDate.addDay();
                noOfDaysDistance++;
            } // while
            return noOfDaysDistance;
        } // else if
        else {
            // we should not get an exception from subractDay, 
            // because target date is legal is legal. But java does not know this.
            try {
                Date someDate = subtractDay();
                int noOfDaysDistance = -1;
                while(someDate.greaterThan(other)){
                    someDate = someDate.subtractDay();
                    noOfDaysDistance--;
                } // while
            return noOfDaysDistance;
            } 
            // Java does not know we cannot get an exception.
            catch (Exception e) { return 0; }
        } // else
    } // dayFrom

    // Calculate the number of days in the month.
    private int daysInMonth(){
        return daysInMonth(month, year);
    } // daysInMonth

    // Number of days in each month for normal and leap years.
    // The first index (0) is not used.
    private static final int[] 
        DAYS_PER_MONTH_NON_LEAP_YEAR    
            // Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec
             = {0, 31, 28, 31, 30, 30, 31, 31, 30, 31, 30, 31}, 
        DAYS_PER_MONTH_LEAP_YEAR 
             = {0, 31, 29, 31, 30, 30, 31, 31, 30, 31, 30, 31};

    // Calculate the number of days in a given month for a given year.
    // This will never be called with a month out of range 1 to 12.
    private static int daysInMonth(int month, int year) {
        if (isLeapYear(year)) return DAYS_PER_MONTH_LEAP_YEAR[month];
        else                  return DAYS_PER_MONTH_NON_LEAP_YEAR[month];
    } // daysInMonth

    // Return true if and only if year is a leap year.
    // (Ignoring the pre Gregorian Reformation complication -- for now.)
    // Year is a leap year if it is divisible by 4
    //                      and is not divisible by 100
    //                          or is divisible by 400.
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 
                && (year % 100 != 0 || year % 400 == 0);
    } // isLeapYear
} // class Date