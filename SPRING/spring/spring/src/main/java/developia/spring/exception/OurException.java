package developia.spring.exception;

public class OurException extends RuntimeException{
    private String internalMessage;
    public OurException(String message,String internalMessage){
        super(message);
        this.internalMessage=internalMessage;
    }
}
