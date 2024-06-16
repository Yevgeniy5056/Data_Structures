import java.util.EmptyStackException;

public class CustomStack<T> {

    public SNode<T> bottom;
    public SNode<T> top;
    public int size;

    public boolean isEmpty() {
        return bottom == null;
    }

    public void push(T val) {

        SNode<T> node = new SNode<>(val);
        if (isEmpty()) {
            bottom = top = node;
        } else {
            top.next = node;
            top = node;
        }
        size++;
    }

    public T peek() {
        return top.val;
    }

    public T pop() {

        T peekNode;
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        // stack has one element
        if (top == bottom) {
            peekNode = top.val;
            top = bottom = null;
        } else {
            //more than one element
            peekNode = top.val;
            SNode<T> curr = bottom;
            while (curr.next != top) {
                curr = curr.next;
            }
            top = curr;
        }
        size--;
        return peekNode;
    }
}
