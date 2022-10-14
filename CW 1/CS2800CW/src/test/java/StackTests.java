import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for Stack testing
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class StackTests {

    /**
     * test 1
     * 
     * attempt to construct a new Stack object
     * 
     * assumes this will succeed
     */
    @Test
    public void ConstructStackTest() {

        Entry entry = new Entry((float) 5.05);
        List<Entry> entries = new ArrayList<>();

        entries.add(entry);

        Assertions.assertDoesNotThrow(() -> { new Stack(entries); });
    }

    /**
     * test 2
     * 
     * attempts to call the Stack top method
     * 
     * handles exceptions respectively
     */
    @Test
    public void TopTest() {

        Entry entry = new Entry((float) 5.05);
        List<Entry> entries = new ArrayList<>();

        entries.add(entry);

        Stack stack = new Stack(entries);

        Assertions.assertDoesNotThrow(() -> { stack.top(); });
    }

    /**
     * test 2
     * 
     * attempts to call the Stack push method
     * 
     * handles exceptions respectively
     */
    @Test
    public void PushTest() {
        
        Entry entry = new Entry((float) 5.05);
        List<Entry> entries = new ArrayList<>();

        entries.add(entry);

        Stack stack = new Stack(entries);

        Entry newEntry = new Entry((String) "temp");

        Assertions.assertDoesNotThrow(() -> { stack.push(newEntry); });
    }

    /**
     * test 3
     * 
     * attempts to call the Stack pop method
     * 
     * handles exceptions resepctively
     */
    @Test
    public void PopTest() {

        Entry entry = new Entry((float) 5.05);
        List<Entry> entries = new ArrayList<>();

        entries.add(entry);

        Stack stack = new Stack(entries);

        Assertions.assertDoesNotThrow(() -> { stack.pop(); });

    }

    /**
     * test 4
     * 
     * attempts to call the size method
     * assumes the size will be 3 (int)
     * 
     * handles exceptions respectively
     */
    @Test
    public void SizeTest() {

        Entry entry = new Entry((float) 5.05);
        List<Entry> entries = new ArrayList<>();

        entries.add(entry);

        Stack stack = new Stack(entries);

        Assertions.assertDoesNotThrow(() -> { stack.size(); });
        Assertions.assertEquals((int) 1, stack.size());
    }
    
}
