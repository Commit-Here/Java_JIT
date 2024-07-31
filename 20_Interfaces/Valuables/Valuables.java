public class Valuables {
    private final Valuable[] valuableArray;
    private int noOfValuables;

    public Valuables(int maxNoOfValuables){
        valuableArray = new Valuable[maxNoOfValuables];
        noOfValuables = 0;
    }

    public void addValuable(Valuable valuable){
        if (noOfValuables < valuableArray.length){
            valuableArray[noOfValuables] = valuable;
            noOfValuables++;
        }
    }

    public int totalValue(){
        int result = 0;
        for (Valuable valuable : valuableArray)
            result+=valuable.value();
        return result;
    }

    @Override
    public String toString(){
        if (noOfValuables==0)
            return "Nothing valuable";
        
        String result = valuableArray[0].toString();
        for (int index = 1;index < valuableArray.length;index++)
            result+=String.format("%n%s", valuableArray[index]);
        
        return result;
    }

    public static void main(String[] args){
        Valuables valuables = new Valuables(5);

        valuables.addValuable(new ValuableHouse(2, 0.5));
        valuables.addValuable(new ValuableCar(3, 0.25));
        valuables.addValuable(new ValuableCar(4, 1.0));

        valuables.addValuable(new ValuableHouse(6, 2.0));
        valuables.addValuable(new ValuableCar(12, 4.0));

        System.out.println("My valuables are worth " + valuables.totalValue());

        System.out.println(valuables);
    }
}