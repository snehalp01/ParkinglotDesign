package exception;

public class InvaliRequestException extends RuntimeException{
    public InvaliRequestException() {
    }

    public InvaliRequestException(String message) {
        super(message);
    }
}
