package exception;

import java.util.Map;

public class CheckedException extends Exception {
    private Map<String, String> errors;
    public CheckedException(Map<String, String> errors) {
        this.errors = errors;
    }

    public CheckedException(String message) {
        super(message);
    }

    public Map<String, String> getErrors() {
        return errors;
    }
}
