import java.util.List;
/**
 * The stack class emulates the behaviour of a stack queue system
 * contains relevant methods for a stack (pop, push, size) etc
 * 
 * exception handling if the stack is empty
 *  popping from an empty stack
 *  retrieving the top item from an empty stack
 *  
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
     * @throws empty stack EmptyStackException
     */
    public Entry pop() throws EmptyStackException {

        if (this.size() == 0) {
            throw new EmptyStackException("EMPTY STACK");
        }
        Entry popped = this.top();
        this.entries.remove(this.size() -1);
        this.size -= 1;
        return popped;
    }

    /**
     * Top method for stack queue
     * outputs the latest item on the top of the stack
     * 
     * @return the latest item on the top of the stack
     * @throws empty stack EmptyStackException
     */
    public Entry top() throws EmptyStackException {

        if(this.size() == 0) {
            throw new EmptyStackException("EMPTY STACK");
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