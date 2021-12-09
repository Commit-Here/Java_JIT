import java.util.Scanner;

public class StudentAnalysis {
    public static void main(String[] args) {
        // A scanner to take input form user.
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int noOfStudents = inputScanner.nextInt();
        // Skip past the end of this line.
        inputScanner.nextLine();

        // We keep Students in an array
        Student[] students = new Student[noOfStudents];

        // Read the data in pairs.
        // build student objects and store them in an array
        for (int studentCount = 1; studentCount <= noOfStudents; studentCount++) {
            System.out.print("Enter the name of the Student " + studentCount + ": ");
            String inputName = inputScanner.nextLine();
            System.out.print("Enter the marks of '" + inputName +"': ");
            int mark = inputScanner.nextInt();
            // Skip past the end of this line.
            inputScanner.nextLine();
            students[studentCount - 1] = new Student(inputName, mark);
        } // for

        int sumOfMarks = 0, maxOfMarks = -9999, minOfMarks = 9999;
        // now compute the sum of the marks.
        for (Student student : students) {
            sumOfMarks += student.getMark();
            if (student.getMark() > maxOfMarks)
                maxOfMarks = student.getMark();
            if (student.getMark() < minOfMarks)
                minOfMarks = student.getMark();
        } // for

        // Compute the mean of the marks.
        double meanMarks = sumOfMarks / (double) noOfStudents;

        // sorting the students by marks in ascending order.
        sort(students);

        // Produce the results
        System.out.println();
        System.out.println("The mean mark is:\t" + meanMarks);
        System.out.println("The minimum mark is:\t" + minOfMarks);
        System.out.println("The maximum mark is:\t" + maxOfMarks);
        System.out.println();

        System.out.println("Person and Score | difference from mean");
        for (Student student : students) {
            double differenceFromMean = student.getMark() - meanMarks;
            System.out.printf("%s | %6.2f%n", student, differenceFromMean);
        } // for
    } // main
    private static void sort(Student[] anArray) {
        // using bubble sort
        // each pass of the sort reduces the length by 1.
        int unsortedArrayLength = anArray.length;
        // If no change is made on pass, the main loop can stop.
        boolean changedOnThisPass;

        do {
            changedOnThisPass = false;
            for (int pairLeftIndex = 0; pairLeftIndex < unsortedArrayLength - 1; pairLeftIndex++) {
                if (anArray[pairLeftIndex].compareTo(anArray[pairLeftIndex + 1]) > 0) {
                    Student thatWasAtPairLeftIndex = anArray[pairLeftIndex];
                    anArray[pairLeftIndex] = anArray[pairLeftIndex + 1];
                    anArray[pairLeftIndex + 1] = thatWasAtPairLeftIndex;
                    changedOnThisPass = true;
                } // if
            } // for
        } while(changedOnThisPass);
    } // sort

} // class StudentAnalysis