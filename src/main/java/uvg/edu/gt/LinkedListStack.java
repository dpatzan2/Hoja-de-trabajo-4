package uvg.edu.gt;

public class LinkedListStack<T> implements Stack<T> {
    private SinglyLinkedList<T> stack;

    public LinkedListStack() {
        stack = new SinglyLinkedList<>();
    }

    @Override
    public void push(T item) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
