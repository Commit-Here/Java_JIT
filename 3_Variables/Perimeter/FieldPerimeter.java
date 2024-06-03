public class FieldPerimeter {
    public static void main(String args[]) {
        int length = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int perimeter = 2 * (length + width);
        System.out.println("The perimeter of field "
                            + "(" + width + "," + length + ") "
                            + "is " + perimeter);        
    }
}