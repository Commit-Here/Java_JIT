public class SinTable{
    public static void main(String args[]) {
        int startDegree = Integer.parseInt(args[0]);
        int increamental = Integer.parseInt(args[1]);
        int endDegree = Integer.parseInt(args[2]);

        System.out.println("------------------------------------------");
        System.out.println("| Sin table from " + startDegree + " to " 
                            + endDegree + " in steps of " + increamental);
        System.out.println("------------------------------------------");

        while (startDegree <= endDegree) {
            System.out.println("| sin(" + startDegree + ") " 
                                + "= " + Math.sin(Math.toRadians(startDegree)));

            startDegree += increamental;
        }

        System.out.println("------------------------------------------");
        
    }
}