/**
 * Generic 'BadType' exception class
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class BadType extends Exception {

    public String message;

    /**
     * Generic constructor for 'BadType' exception class
     * 
     * @param an errorMessage as a string
     */
    public BadType(String error) {

        super(error);
        this.message = error;
    }
}
