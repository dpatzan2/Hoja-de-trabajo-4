package uvg.edu.gt;

public abstract class AbstractLinkedList<T> implements LinkedList<T> {
    protected ListNode<T> head;

    public AbstractLinkedList() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
