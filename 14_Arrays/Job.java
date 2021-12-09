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
} // class Job