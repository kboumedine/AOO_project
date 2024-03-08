package fr.pantheonsorbonne.cri.common.exceptions;

public class PublicationException extends Exception{
    public PublicationException(String message) {
        super(message);
    }

    public PublicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PublicationException(Throwable cause) {
        super(cause);
    }

    public PublicationException() {
    }
    
}