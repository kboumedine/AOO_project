package fr.pantheonsorbonne.cri.common.exceptions;

public class CalculateSecurityLevelException extends Exception{
    public CalculateSecurityLevelException(String message) {
        super(message);
    }

    public CalculateSecurityLevelException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculateSecurityLevelException(Throwable cause) {
        super(cause);
    }

    public CalculateSecurityLevelException() {
    }
    
}
