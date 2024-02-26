package uvg.edu.gt;

public interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
}
