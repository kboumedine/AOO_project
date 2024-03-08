package fr.pantheonsorbonne.cri.common.exceptions;

public class SignalDangerousAreaException  extends Exception{
    public SignalDangerousAreaException(String message) {
        super(message);
    }

    public SignalDangerousAreaException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignalDangerousAreaException(Throwable cause) {
        super(cause);
    }

    public SignalDangerousAreaException() {
    }
    
}
