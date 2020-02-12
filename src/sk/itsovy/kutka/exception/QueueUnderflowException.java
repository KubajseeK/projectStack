package sk.itsovy.kutka.exception;

public class QueueUnderflowException extends Exception {
    public QueueUnderflowException(String message) {
        super(message);
    }
}
