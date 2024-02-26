package uvg.edu.gt;

import java.util.NoSuchElementException;

public interface LinkedList<T> {
    void insert(T item);
    T delete();
    boolean isEmpty();
}
