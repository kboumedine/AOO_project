package fr.pantheonsorbonne.cri.common.exceptions;

public class SearchException extends Exception{
    public SearchException(String message) {
        super(message);
    }

    public SearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public SearchException(Throwable cause) {
        super(cause);
    }

    public SearchException() {
    }
    
}
