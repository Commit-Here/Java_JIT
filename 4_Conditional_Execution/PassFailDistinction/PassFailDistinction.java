public class PassFailDistinction{
    public static void main(String args[]){
        double marks = Double.parseDouble(args[0]);
        if (marks >= 50){
            System.out.println("Pass");
            if (marks >= 70)
                System.out.println("Distinction");
        }
    }
}