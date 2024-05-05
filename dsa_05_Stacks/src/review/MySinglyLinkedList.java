package review;

import java.util.NoSuchElementException;

public class MySinglyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    T removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        T result;
        if (head == tail) {
            result = head.data;
            head = tail = null;
        } else {
            result = head.data;
            head = head.next;
        }
        size--;
        return result;
    }

    public void addFirst(T data) {

        var node = new Node<>(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void add(T data) {

        var node = new Node<>(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void printNodes() {

        var current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.println(current.data + "=> null");
            } else {
                System.out.print(current.data + "=>");
            }
            current = current.next;
        }
    }
}
