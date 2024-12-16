package fi.margokomarova.week10.task1.exception;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
    }

    public WrongLoginException(Exception cause) {
        super(cause);
    }

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException(String message, Exception cause) {
        super(message, cause);
    }

}
