import java.util.Scanner;
public class Demo{
    public static Scanner s = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter a b: ");
        int a = s.nextInt();
        int b = s.nextInt();
        Class p1 = new Class(a, b);
        Class p2 = p1.addAny(4);
        System.out.println();
        System.out.println(p1);
        System.out.println(p2);
    }
}