/**
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class Stack {

    Entry Next;
    Entry TopItem;
    int Size;

    /**
     * Generic class constructor for 'Stack' class
     */
    public Stack () {

        this.Size = 0;
        this.TopItem = null;
    }

    /**
     * Generic push method (pushes a new item onto the top of the 'Stack')
     * 
     * @param NewEntry the new item to be pushed onto the 'Stack'
     */
    public void Push(Entry NewEntry) {

        this.Size += 1;
    }

    /**
     * Generic pop method (pops the top item of the 'Stack')
     * 
     * @return the popped item from the top of the 'Stack'
     */
    public Entry Pop() {

        this.Size -= 1;
        return this.TopItem;
    }

    /**
     * Provides the current top 'EntryItem' on the 'Stack'
     * 
     * @return the current 'Stacks' top item
     */
    public Entry Top() {

        return this.TopItem;
    }
}