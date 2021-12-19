import java.io.File;
import java.util.Scanner;

/* Program to report jobs and their salaries.
    Each Command line argument is the name of a text file containing:
        The first line is a name or description of the jobs.
        Subsequent lines describe one job, in the format:
            Employer (including spaces but not tabs) <TAB> salary
    Output is a report for each file containing:
        Name or description of the jobs, average salary
        Job details in name order and again salary order.
 */
public class JobSurvey {
    public static void main(String[] args) throws Exception {
        for (String fileName : args) {
            JobList jobList = new JobList(new Scanner(new File(fileName)));
            System.out.println(jobList);
            System.out.println();
        } // for
    } // main
} // class JobSurvey