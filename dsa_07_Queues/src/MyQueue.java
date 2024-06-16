import java.util.NoSuchElementException;

public class MyQueue<T> {

    QNode<T> front;
    QNode<T> back;
    int size;

    public MyQueue() {
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(T val) {
        QNode<T> node = new QNode<>(val);
        if (isEmpty()) {
            front = back = node;
        } else {
            back.next = node;
            back = node;
        }
        size++;
    }

    T dequeue() {
        QNode<T> frontNode;
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (front == back) {
            frontNode = front;
            front = back = null;
        } else {
            frontNode = front;
            front = front.next;
        }
        size--;
        return frontNode.val;
    }

    T peek() {
        return front.val;
    }

    int size() {
        return size;
    }
}
