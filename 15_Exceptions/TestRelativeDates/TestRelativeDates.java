// This class is used to test our impolementaition
public class TestRelativeDates{
    // main method with hard coded test data.
    public static void main(String args[]){
        try {
            Date refrenceDate = new Date(1, 1, 2020);
            Date date = refrenceDate.addYear();
            int someYear = 0;
            while (someYear < 2) {
                refrenceDate = refrenceDate.addDay();
                System.out.println(date + " " + refrenceDate);
                if (date.equals(refrenceDate)) {
                    someYear++;
                    date = date.addYear();
                }
            }
        }
        catch (Exception exception) { return ;}
        
    }
}