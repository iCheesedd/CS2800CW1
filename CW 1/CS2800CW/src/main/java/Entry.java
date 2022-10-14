/**
 * Entry class used for 'Stack' item entries
 * multiple constructors for multiple entry types
 * 
 * methods for obtaining the type, symbol, value, string for the entry
 * exception handling based on the entry type
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
        this.str = "";

    }

    /**
     * Generic Symbol constructor for 'Entry' class
     * 
     * @param a 'which' of type 'Symbol'
     * 
     */
    public Entry(Symbol which) {

        this.number = 0;
        this.str = "";
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
        
        if (this.str.isEmpty()) {
            throw new BadType((String) "NULL STRING");
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
     * @exception invalid number BadType
     * 
     */
    public float getValue() throws BadType {
        
        if (this.type != Type.NUMBER) {
            throw new BadType("INVALID NUMBER");
        }
        return this.number;
    }
}