package exceptions;

public class TooYoungException extends Exception {
    public TooYoungException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}