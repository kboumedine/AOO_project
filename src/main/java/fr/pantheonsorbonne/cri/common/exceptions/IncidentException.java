package fr.pantheonsorbonne.cri.common.exceptions;

public class IncidentException extends Exception{

    public IncidentException(String message) {
        super(message);
    }

    public IncidentException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncidentException(Throwable cause) {
        super(cause);
    }

    public IncidentException() {
    }
    
}
