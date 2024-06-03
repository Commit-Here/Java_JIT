// A class representing a Student
// comprising a student's name and their marks.
public class Student {
    // The name of the student
    private final String name;
    // Their mark
    private final int mark;

    // The constructor method
    public Student(String requiredName, int requiredMark) {
        name = requiredName;
        mark = requiredMark;
    } // Student

    // Get the Student name
    public String getName() {
        return name;
    } // getName

    // Get the Student mark
    public int getMark() {
        return mark;
    }

    // Compare this Student with the given other.
    // basing the comparison on the marks.
    // Returns -ve(<), 0 (=), +ve(>).
    public int compareTo(Student other) {
        if (this.mark == other.mark)
            return 0;
        else
            return this.mark - other.mark;
    } // compareTo

    // Return a String Representation.
    public String toString() {
        return String.format("%-10s got %3d", name, mark);
    } // toString
} // class Student