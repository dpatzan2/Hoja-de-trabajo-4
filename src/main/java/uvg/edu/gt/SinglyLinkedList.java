package uvg.edu.gt;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> extends AbstractLinkedList<T> {
    @Override
    public void insert(T item) {
        ListNode<T> newNode = new ListNode<>(item);
        if (head == null) {
            head = newNode;
        } else {
            ListNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public T delete() {
        if (isEmpty()) throw new NoSuchElementException("La lista está vacía");
        T deletedData = head.data;
        head = head.next;
        return deletedData;
    }

    public T peek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }
}
