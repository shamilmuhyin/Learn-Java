package learnJava.Exceptions;

public class MinorException extends RuntimeException{
    public MinorException() {
        super();
    }
    public MinorException(String errMessage) {
        super(errMessage);
    }
    public MinorException(String message, Throwable cause) {
        super(message,cause);
    }

    public MinorException(Throwable cause) {
        super(cause);
    }
}
