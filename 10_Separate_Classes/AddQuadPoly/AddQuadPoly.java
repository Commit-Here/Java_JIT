// A class which adds two quadratic polynomials
public class AddQuadPoly{
    public static void main(String args[]){
        // given coefficiants to its quadratic form.
        QuadPoly quadPoly1 = new QuadPoly(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        QuadPoly quadPoly2 = new QuadPoly(Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));

        QuadPoly resultPoly = quadPoly1.add(quadPoly2);

        System.out.println("Polynomial:     " + quadPoly1.toString());
        System.out.println("added to:       " + quadPoly2.toString());
        System.out.println("results in:     " + resultPoly.toString());
    } // main
}