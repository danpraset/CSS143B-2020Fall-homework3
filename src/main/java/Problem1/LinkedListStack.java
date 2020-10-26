package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        data = new LinkedList<T>();
    }

    @Override
    public boolean push(T val) {
        if (this.data == null)
        {
            return false;
        }
        this.data.addFirst(val);
        return true;
    }

    @Override
    public T pop() {
        if(this.data != null)
        {
            return data.removeFirst();
        }
        return null;
    }

    @Override
    public T peek() {
        if(this.data != null)
        {
            return data.getFirst();
        }
        return null;
    }

    @Override
    public int size() {
        return data.size();
    }
}
