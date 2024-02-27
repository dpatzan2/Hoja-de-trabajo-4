package uvg.edu.gt;

import java.util.NoSuchElementException;

public class LinkedListStack<T> implements Stack<T> {
    private SinglyLinkedList<T> singlyLinkedListStack;
    private DoublyLinkedList<T> doublyLinkedListStack;

    public LinkedListStack(String tipo) {
        if ("SinglyLinkedList".equals(tipo)){
            singlyLinkedListStack = new SinglyLinkedList<>();
        } else if ("DoublyLinkedList".equals(tipo)) {
            doublyLinkedListStack = new DoublyLinkedList<>();
        } else {
            throw new IllegalArgumentException("Tipo de pila no válido: " + tipo);
        }
    }

    @Override
    public void push(T item) {
        if (singlyLinkedListStack != null) {
            singlyLinkedListStack.insert(item);
        } else if (doublyLinkedListStack != null) {
            doublyLinkedListStack.insert(item);
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        if (singlyLinkedListStack != null) {
            return singlyLinkedListStack.delete();
        } else if (doublyLinkedListStack != null) {
            return doublyLinkedListStack.delete();
        }
        throw new IllegalStateException("No se ha inicializado correctamente ninguna implementación de lista enlazada");
    }



    @Override
    public T peek() {
        if (singlyLinkedListStack != null) {
            if (singlyLinkedListStack.isEmpty()) {
                throw new NoSuchElementException("La pila está vacía");
            }
            return singlyLinkedListStack.peek();
        } else if (doublyLinkedListStack != null) {
            if (doublyLinkedListStack.isEmpty()) {
                throw new NoSuchElementException("La pila está vacía");
            }
            return doublyLinkedListStack.peek();
        }
        throw new IllegalStateException("No se ha inicializado correctamente ninguna implementación de lista enlazada");
    }

    @Override
    public boolean isEmpty() {
        if (singlyLinkedListStack != null) {
            return singlyLinkedListStack.isEmpty();
        } else if (doublyLinkedListStack != null) {
            return doublyLinkedListStack.isEmpty();
        }
        return true;
    }
}
