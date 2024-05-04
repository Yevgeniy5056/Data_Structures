import java.util.EmptyStackException;

public class CustomStack<T> {

    public SNode<T> bottom;
    public SNode<T> top;
    public int size;

    public boolean isEmpty() {
        return bottom == null;
    }

    public void push(T data) {

        var node = new SNode<>(data);
        if (isEmpty()) {
            bottom = top = node;
        } else {
            top.next = node;
            top = node;
        }
        size++;
    }

    public T peek() {
        return top.data;
    }

    public T pop() {

        var peekNode = top.data;
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        // stack has one element
        if (top == bottom) {
            peekNode = top.data;
            top = bottom = null;
        } else {
            //more than one element
            peekNode = top.data;
            var curr = bottom;
            while (curr.next != top) {
                curr = curr.next;
            }
            top = curr;
        }
        size--;
        return peekNode;
    }
}
