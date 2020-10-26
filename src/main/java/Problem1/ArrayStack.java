package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        this.data = (T[])new Object[capacity];
        size = 0;
    }

    @Override
    public boolean push(T val) {
        if (this.size >= this.data.length) {
            return false;
        }
        size++;
        data[size - 1] = val;
        return true;
    }

    @Override
    public T pop() {
        if (size == 0)
        {
            return null;
        }

        T val = data[size - 1];
        data[size - 1] = null;
        size--;
        return val;
    }

    @Override
    public T peek() {
        if (size == 0) {
            return null;
        }
        T val = data[size - 1];
        return val;
    }

    @Override
    public int size() {
        return size;
    }
}
