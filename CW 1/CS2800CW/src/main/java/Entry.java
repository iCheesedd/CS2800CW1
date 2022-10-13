/**
 * Entry class used for 'Stack' item entries
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class Entry {

    public float number;
    public Symbol other;
    public String str;
    public Type type;


    /**
     * Generic float constructor for 'Entry' class
     * 
     * @param a 'value' of type 'float'
     * 
     */
    public Entry(float value) {

        this.number = value;
        this.other = Symbol.INVALID;
        this.type = Type.NUMBER;
        this.str = null;

    }

    /**
     * Generic Symbol constructor for 'Entry' class
     * 
     * @param a 'which' of type 'Symbol'
     * 
     */
    public Entry(Symbol which) {

        this.number = 0;
        this.str = null;
        this.type = Type.SYMBOL;
        this.other = which;

    }

    /**
     * Generic String constructor for 'Entry' class
     * 
     * @param 'string' of type 'String'
     * 
     */
    public Entry(String string) {

        this.number = 0;
        this.str = string;
        this.type = Type.STRING;
        this.other = Symbol.INVALID;
    }

    /**
     * Get type method for 'Entry' class
     * 
     * @return the 'type' of the current 'Entry'
     */
    public Type getType() { return this.type; }

    /**
     * Get string method for 'Entry' class
     * 
     * @return the 'string' for the current 'Entry'
     * 
     * @exception null string BadType
     */
    public String getString() throws BadType {
        
        if (this.str.equals(null)) {
            throw new BadType("NULL STRING");
        }
        return this.str; 
    }

    /**
     * Get Symbol method for 'Entry' class
     * 
     * @return the 'symbol' for the current 'Entry'
     * 
     * @exception invalid symbol BadType
     */
    public Symbol getSymbol() throws BadType {
        
        if (this.other == Symbol.INVALID) {
            throw new BadType("INVALID SYMBOL");
        }
        return this.other;
    }

    /**
     * Get value method for 'Entry' class
     * 
     * @return the 'number' for the current 'Entry'
     * 
     */
    public float getValue() { return this.number; }
}

/**
 * Generic 'BadType' exception class
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
class BadType extends Exception {

    public String message;

    /**
     * Generic constructor for 'BadType' exception class
     * 
     * @param the errorMessage as a string
     */
    public BadType(String error) {

        super(error);
        this.message = error;
    }
}