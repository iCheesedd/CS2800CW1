/**
 * Enumerator for a series of possible Symbols
 * 
 * * @author ZKAC297 Peter Ostenfeld
 */
public enum Symbol {
    LEFT_BRACKET, RIGHT_BRACKET, TIMES, DIVIDE, PLUS, MINUS, INVALID;

    /**
     * Generic toString method for 'Symbol' enumorator
     * 
     * @return the name of this enumorator
     */
    public String toString() {

        return this.name();
    }
}