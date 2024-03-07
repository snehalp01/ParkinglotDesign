package exception;

public class parkingLotNotFoundException extends RuntimeException{

    public parkingLotNotFoundException() {
    }

    public parkingLotNotFoundException(String message) {
        super(message);
    }
}
