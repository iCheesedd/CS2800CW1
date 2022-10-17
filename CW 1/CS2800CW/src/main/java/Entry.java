/**
 * Entry class used for Stack item entries multiple constructors for multiple entry types
 * Methods for obtaining the type, symbol, value, string for the entry
 * Exception handling based on the entry type
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class Entry {

    public float number;
    public Symbol other;
    public String str;
    public Type type;

    /**
     * Generic float constructor for the Entry class
     * 
     * @param value, a value of type float
     * 
     */
    public Entry(float value) {

        this.number = value;
        this.other = Symbol.INVALID;
        this.type = Type.NUMBER;
        this.str = "";

    }

    /**
     * Generic Symbol constructor for the Entry class
     * 
     * @param which, a value of type Symbol
     * 
     */
    public Entry(Symbol which) {

        this.number = 0;
        this.str = "";
        this.type = Type.SYMBOL;
        this.other = which;

    }

    /**
     * Generic String constructor for the Entry class
     * 
     * @param string, a value of type String
     * 
     */
    public Entry(String string) {

        this.number = 0;
        this.str = string;
        this.type = Type.STRING;
        this.other = Symbol.INVALID;
    }

    /**
     * Get type method for the Entry class
     * 
     * @return type, the type of the current the Entry
     */
    public Type getType() { return this.type; }

    /**
     * Get string method for 'Entry' class
     * 
     * @return str, the string for the current Entry
     * 
     * @exception null string BadTypeException
     */
    public String getString() throws BadTypeException {
        
        if (this.str.isEmpty()) {
            throw new BadTypeException((String) "NULL STRING");
        }
        return this.str;
    }

    /**
     * GetSymbol method for the Entry class
     * 
     * @return other, the symbol for the current Entry
     * 
     * @exception invalid symbol BadTypeException
     */
    public Symbol getSymbol() throws BadTypeException {
        
        if (this.other == Symbol.INVALID) {
            throw new BadTypeException("INVALID SYMBOL");
        }
        return this.other;
    }

    /**
     * GetValue method for the Entry class
     * 
     * @return number, the number for the current Entry
     * 
     * @exception invalid number BadTypeException
     * 
     */
    public float getValue() throws BadTypeException {
        
        if (this.type != Type.NUMBER) {
            throw new BadTypeException("INVALID NUMBER");
        }
        return this.number;
    }

    /**
     * Check if another entry is equal to the current entry
     * 
     * @param i, the entry to compare to the current entry
     * 
     * @return the boolean result of the comparison of 2 entries
     */
    public boolean equal(Entry i) {

        return (i.toString().equals(this.toString()));
    }
}