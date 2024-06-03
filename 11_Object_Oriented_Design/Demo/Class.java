public class Class{
    public static int a, b;
    public Class(int requiredA, int requiredB){
        a = requiredA;
        b = requiredB;
    }
    public static Class addAny(int other){
        return new Class(a + other, b + other);
    }
    public String toString(){
        return "(" + a + ", " + b + ")";
    }
}