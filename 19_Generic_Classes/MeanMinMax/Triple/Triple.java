public class Triple{
    private final Object first, second, third;

    public Triple(Object requiredFirst, Object requiredSecond, Object requiredThird){
        first = requiredFirst;
        second = requiredSecond;
        third = requiredThird;
    } 

    public Object getFirst(){
        return first;
    }

    public Object getSecond(){
        return second;
    }

    public Object getThird(){
        return third;
    }
} 