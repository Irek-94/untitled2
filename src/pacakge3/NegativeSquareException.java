package pacakge3;

public class NegativeSquareException extends IllegalArgumentException{

    public NegativeSquareException() {
    }

    public NegativeSquareException(String s) {
        super(s);
    }

    public NegativeSquareException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeSquareException(Throwable cause) {
        super(cause);
    }
}
