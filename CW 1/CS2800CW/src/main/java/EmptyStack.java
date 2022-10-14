/**
 * Generic EmptyStack exception class
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class EmptyStack extends Exception {

    public String message;

    /**
     * Generic constructor for EmptyStack exception class
     * 
     * @param an error message as a string
     */
    public EmptyStack(String error) {

        super(error);
        this.message = error;
    }
}
