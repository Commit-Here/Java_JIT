// A class representing a Job,
// comprising of firm's name and their typical salary.
public class Job {
    // The name of firm for this instance.
    private final String employer;
    // Their typical salary.
    private final int salary;

    // The constructor method.
    public Job(String requiredEmployer, int requiredSalary) {
        employer = requiredEmployer;
        salary = requiredSalary;
    } // Job

    // Get the employer.
    public String getEmployer() {
        return employer;
    } // getEmployer.

    // Get the salary.
    public int getSalary() {
        return salary;
    } // getSalary

    // Compare this Job with the given other,
    // basing the comparison on the salaries, then the employers.
    // Returns -ve(<), 0(=), +ve(>) int. -ve means this one is smaller.
    public int compareTo(Job other) {
        if (salary == other.salary)
            return 0;
        else
            return salary - other.salary;
    } // compareTo

    // Return a string representation.
    public String toString() {
        return String.format("%-15s pays %5d", employer, salary);
    } // toString

/*
    public static final int SORT_BY_EMPLOYER = 1;
    public static final int SORT_BY_SALARY = 2;

    method will take any other int other than these.
    hence we use enum type - enumeration of named values.
*/
    // These are the possible sort orders.
    // If more are required, then add here and update compareTo
    public enum SortOrder { BY_EMPLOYER, BY_SALARY }

    // Compare this Job with the given other.
    // basing the comparison on given sort order.
    // Returns -ve(<), 0(=) and +ve(>).
    public int compareTo(Job other, SortOrder sortOrder) {
        switch (sortOrder) {
            case BY_EMPLOYER:   if (employer.equals(other.employer))
                                    return salary - other.salary;
                                else
                                    return employer.compareTo(other.employer);
            case BY_SALARY:     if (salary == other.salary)
                                    return employer.compareTo(other.employer);
                                else
                                    return salary - other.salary;
            default:            return 0;
        } // switch
    } // compareTo
} // class Job