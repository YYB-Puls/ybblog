package Day14.selfdefineexception;

public class CapacityTooSmallException extends Exception{
    public CapacityTooSmallException(String message){
        super(message);
    }
}
