package fr.pantheonsorbonne.cri.common.exceptions;

public class LogoutException extends Exception{
    public LogoutException(String message) {
        super(message);
    }

    public LogoutException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogoutException(Throwable cause) {
        super(cause);
    }

    public LogoutException() {
    }
    
}
