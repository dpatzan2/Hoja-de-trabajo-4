package uvg.edu.gt;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack<T> implements Stack<T> {
    private ArrayList<T> stack;

    public ArrayListStack(){
        stack = new ArrayList<>();
    }

    @Override
    public void push(T item){
        stack.add(item);
    }

    @Override
    public T pop(){
        if(isEmpty()) throw new EmptyStackException();
        return stack.remove(stack.size() - 1);
    }

    @Override
    public T peek(){
        if(isEmpty()) throw new EmptyStackException();
        return stack.get(stack.size() - 1);
    }

    @Override
    public boolean isEmpty(){
        return stack.isEmpty();
    }

}
