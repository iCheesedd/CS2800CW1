/**
 * Generic 'BadType' exception class
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class BadTypeException extends Exception {

    public String message;

    /**
     * Generic constructor for BadTypeException class
     *  
     * @param an error message as a string
     */
    public BadTypeException(String error) {

        super(error);
        this.message = error;
    }
}
