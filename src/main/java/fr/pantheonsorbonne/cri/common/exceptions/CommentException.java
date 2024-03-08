package fr.pantheonsorbonne.cri.common.exceptions;

public class CommentException extends Exception{
    public CommentException(String message) {
        super(message);
    }

    public CommentException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommentException(Throwable cause) {
        super(cause);
    }

    public CommentException() {
    }
}
