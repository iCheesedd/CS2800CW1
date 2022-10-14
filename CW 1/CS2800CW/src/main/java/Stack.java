import java.util.List;
/**
 * The stack class emulates the behaviour of a stack queue system
 * contains relevant methods for a stack (pop, push, size) etc
 * 
 * @author ZKAC297 Peter Ostenfeld
 */
public class Stack {

    int size;
    List<Entry> entries;

    /**
     * Generic constructor method for stack class
     * 
     * @param initial entries stack to construct
     */
    public Stack(List<Entry> entries) {

        this.entries = entries;
        this.size = entries.size();
    }

    /**
     * Push method for a stack queue
     * pushes new entries onto the top of the stack
     * 
     * @param an new entry i to push onto the stack
     */
    public void push(Entry i) {

        entries.add(i);
        this.size += 1;
    }

    /**
     * Pop method for stack queue
     * pops the latest entry of the top of the stack
     * 
     * @return the entry popped from the top of the stack
     * @throws empty stack EmptyStack
     */
    public Entry pop() throws EmptyStack {

        if (this.size() == 0) {
            throw new EmptyStack("EMPTY STACK");
        }
        Entry popped = this.entries.get(this.size() -1);
        this.entries.remove(this.size() -1);
        this.size -= 1;
        return popped;
    }

    /**
     * Top method for stack queue
     * outputs the latest item on the top of the stack
     * 
     * @return the latest item on the top of the stack
     * @throws empty stack EmptyStack
     */
    public Entry top() throws EmptyStack {

        if(this.size() == 0) {
            throw new EmptyStack("EMPTY STACK");
        }
        return this.entries.get(this.size() -1 );
    }

    /**
     * Size method for stack queue
     * outputs the current size of the stack
     * 
     * @return the size of the stack
     */
    public int size() {

        return this.size;
    }
}