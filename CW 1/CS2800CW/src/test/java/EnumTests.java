import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

/**
 * Base class for Enumorator testing
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class EnumTests {

    /**
     * test 1
     * 
     * attempts to call the toString method for all constructed enumorators
     * assumed the appropriate result from each constructed enumorator respectifely
     */
    @Test
    public void EnumToStringTest() {

        Type testType = Type.STRING;
        Symbol testSymbol = Symbol.MINUS;

        Assertions.assertEquals("MINUS", testSymbol.toString());
        Assertions.assertEquals("STRING", testType.toString());

    }
    
}
