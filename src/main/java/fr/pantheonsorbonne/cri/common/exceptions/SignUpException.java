package fr.pantheonsorbonne.cri.common.exceptions;

public class SignUpException extends Exception{
    public SignUpException(String message) {
        super(message);
    }

    public SignUpException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignUpException(Throwable cause) {
        super(cause);
    }

    public SignUpException() {
    }
}
