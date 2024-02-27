package uvg.edu.gt;

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
