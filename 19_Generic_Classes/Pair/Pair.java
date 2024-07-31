public class Pair<T,S>{
    private T first;
    private S second;

    public Pair(T requriedFirst, S requriedSecond){
        first = requriedFirst;
        second = requriedSecond;
    }

    public T getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }
}