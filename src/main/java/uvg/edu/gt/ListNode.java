package uvg.edu.gt;

public class ListNode<T> {
    public T prev;
    T data;
    ListNode<T> next;

    public ListNode(T data){
        this.data = data;
        this.next = null;
    }
}
