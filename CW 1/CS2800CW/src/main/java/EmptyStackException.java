/**
 * Generic EmptyStack exception class
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class EmptyStackException extends Exception {

    public String message;

    /**
     * Generic constructor for EmptyStackException class
     * 
     * @param an error message as a string
     */
    public EmptyStackException(String error) {

        super(error);
        this.message = error;
    }
}
