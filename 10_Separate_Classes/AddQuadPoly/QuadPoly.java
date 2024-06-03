// This is a class called QuadPoly used to represent a quadratic polynonomials
// eg ax^2 + bx + c
public class QuadPoly{
    // a, b and c are coeffiecients of the quadratic polynomial
    public double a, b, c;
    public QuadPoly(double requiredA, double requiredB, double requiredC){
        a = requiredA;
        b = requiredB;
        c = requiredC;
    } // QuadPoly

    // add this quadratic polynomial to other one.
    public QuadPoly add(QuadPoly other){
        return new QuadPoly(a + other.a, b + other.b, c + other.c);
    } // add
    public String toString(){
        return a + "x^2 + " + b + "x + " + c;
    } // toString
} // class QuadPoly