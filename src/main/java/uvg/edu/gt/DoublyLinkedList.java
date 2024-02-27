package uvg.edu.gt;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> extends AbstractLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    @Override
    public void insert(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    @Override
    public T delete() {
        if (isEmpty()) throw new NoSuchElementException("La lista está vacía");
        T deletedData = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return deletedData;
    }
}
