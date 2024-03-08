package fr.pantheonsorbonne.cri.common.exceptions;

public class ReportsException extends Exception{
    public ReportsException(String message) {
        super(message);
    }

    public ReportsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReportsException(Throwable cause) {
        super(cause);
    }

    public ReportsException() {
    }
    
}
