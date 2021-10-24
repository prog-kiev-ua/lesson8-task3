package ua.kovalev;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] array;
    private int top = -1;

    public void push(Object o) {
        if (array == null) {
            array = new Object[1];
        }
        if ((array.length - 1) == top) {
            array = Arrays.copyOf(array, array.length + (array.length / 2 + 1));
        }
        array[++top] = o;
    }

    public boolean empty() {
        return top < 0;
    }

    public Object pop() {
        if (empty())
            throw new EmptyStackException();
        Object o = array[top];
        array[top] = null;
        top--;
        return o;
    }

    public Object peek() {
        if (empty())
            throw new EmptyStackException();
        return array[top];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(array == null ? new Object[1] : array).filter(o -> o != null).toArray());
    }
}
