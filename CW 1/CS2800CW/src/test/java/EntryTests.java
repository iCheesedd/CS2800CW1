import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

/**
 * Base class for Entry Testing
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class EntryTests {

    Entry numberEntry;
    Entry stringEntry;
    Entry symbolEntry;

    public EntryTests() {

        this.numberEntry = new Entry((float) 5.0);
        this.stringEntry = new Entry((String) "test");
        this.symbolEntry = new Entry((Symbol) Symbol.PLUS);
    }

    /**
     * test 1
     * 
     * attempts to construct 3 basic entries
     * 
     * assumes they will all succeed
     */
    @Test
    public void ConstructEntryTest() {

        Assertions.assertDoesNotThrow(() -> { this.numberEntry = new Entry((float) 5.0); });
        Assertions.assertDoesNotThrow(() -> { this.stringEntry = new Entry((String) "test"); });
        Assertions.assertDoesNotThrow(() -> { this.symbolEntry = new Entry((Symbol) Symbol.PLUS); });
    }

    /**
     * test 2
     * 
     * attempt to call the getString method(s)
     * does this for each of the constructed entries
     * 
     * handles exceptions respectively
     */
    @Test
    public void GetStringTest() {

        Assertions.assertThrows(BadType.class, () -> { this.numberEntry.getString(); });
        Assertions.assertThrows(BadType.class, () -> { this.symbolEntry.getString(); });
        Assertions.assertDoesNotThrow(() -> { this.stringEntry.getString(); });
    }
    
    /**
     * test 3
     * 
     * attempts to call the getValue method(s)
     * does this for each of the constructed entries
     * 
     * handles exceptions respectively
     */
    @Test
    public void GetValueTest() {

        Assertions.assertThrows(BadType.class, () -> { this.symbolEntry.getValue(); });
        Assertions.assertThrows(BadType.class, () -> { this.stringEntry.getValue(); });
        Assertions.assertDoesNotThrow(() -> { this.numberEntry.getValue(); });
    }

    /**
     * test 4
     * 
     * attempts to call the getSymbol method(s)
     * does this for each of the constructed entries
     * 
     * handles exceptions respectively
     */
    @Test
    public void GetSymbolTest() {

        Assertions.assertThrows(BadType.class, () -> { this.stringEntry.getSymbol(); });
        Assertions.assertThrows( BadType.class, () -> { this.numberEntry.getSymbol(); });
        Assertions.assertDoesNotThrow(() -> { this.symbolEntry.getSymbol(); });
    }

    /**
     * test 5
     * 
     * attempts to call the getType method(s)
     * does this for each of the constructed entries
     * 
     * handles exceptions respectively
     */
    @Test
    public void GetTypeTest() {

        Assertions.assertDoesNotThrow(() -> { this.stringEntry.getType(); });
        Assertions.assertDoesNotThrow(() -> { this.numberEntry.getType(); });
        Assertions.assertDoesNotThrow(() -> { this.symbolEntry.getType(); });
        Assertions.assertEquals(Type.STRING, this.stringEntry.getType());
        Assertions.assertEquals(Type.NUMBER, this.numberEntry.getType());
        Assertions.assertEquals(Type.SYMBOL, this.symbolEntry.getType());
    }
}
