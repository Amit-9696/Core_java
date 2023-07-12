package ExceptionHandling;

public class InvalidPriceException extends RuntimeException{
    public InvalidPriceException(String Message){
        super(Message);
    }
}
