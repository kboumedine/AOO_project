package fr.pantheonsorbonne.cri.common.exceptions;

public class RegisterException extends Exception{
    public RegisterException(String message) {
        super(message);
    }

    public RegisterException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegisterException(Throwable cause) {
        super(cause);
    }

    public RegisterException() {
    }
    
}
