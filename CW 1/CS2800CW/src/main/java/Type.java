/**
 * Enumerator for a series of possible Types
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public enum Type {
    NUMBER, SYMBOL, STRING, INVALID;

    /**
     * Generic toString method for 'Type' enumorator
     * 
     * @return the name of this enumorator
     */
    public String toString() {

        return this.name();
    }
}