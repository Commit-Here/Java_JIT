public class Triple<T,S,M>{
    private final T first;
    private final S second;
    private final M third;

    public Triple(T requiredFirst, S requiredSecond, M requiredThird){
        first = requiredFirst;
        second = requiredSecond;
        third = requiredThird;
    }

    public T getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }

    public M getThird(){
        return third;
    }
}