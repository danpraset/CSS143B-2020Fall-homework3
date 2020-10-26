package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    ArrayStack<Integer> data;

    public MinStack(int size) {
        super(size);
        data = new ArrayStack<>(size);
    }

    @Override
    public boolean push(Integer val) {
        if(data.size() == 0 || data.peek() >= val)
        {
            data.push(val);
            return true;
        }
        super.push(val);
        return false;
    }

    @Override
    public Integer pop() {
        if (super.size() == 0)
        {
            return null;
        }

        if (data.peek().equals(super.pop()))
        {
            data.pop();
        }

        return super.pop();
    }

    public Integer getMin() {
        if(data.size() == 0)
        {
            return null;
        }
        return data.pop();
    }
}

