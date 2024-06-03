public class DegreeCategory {
    public static void main(String args[]) {
        double marks = Double.parseDouble(args[0]);
        if (marks >= 70)
            System.out.println("Honours, first class");
        else if (marks >= 60)
                System.out.println("Honours, second class, division one");
        else if (marks >= 50)
                System.out.println("Honour, second class, division two");
        else if (marks >= 40)
                System.out.println("Honours, third class");
        else if (marks >= 32)
                System.out.println("Pass / ordinary degree");
        else 
            System.out.println("Fail");  
    }
}