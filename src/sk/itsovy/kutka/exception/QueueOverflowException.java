package sk.itsovy.kutka.exception;

public class QueueOverflowException extends Exception {
    public QueueOverflowException(String message) {
        super(message);
    }
}
