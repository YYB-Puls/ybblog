package Day14.selfdefineexception;

public class CapacityTooBigException extends Exception {
    public CapacityTooBigException(String message){
        super(message);
    }
}
