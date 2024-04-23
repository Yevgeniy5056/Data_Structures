package CustomSinglyLinkedList;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        var node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void deleteById(int id) {
        if (isEmpty()) System.out.println("List is empty");

        var prev = head;
        var curr = head;

        while (curr != null) {
            if (curr.id == id) {
                if (curr == head) {
                    head = curr.next;
                    curr.next = null;
                } else if (curr == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                }
                size--;
            }
            prev = curr;
            curr = curr.next;
        }

    }

    public int indexOf(int id) {

        if (isEmpty()) return -1;

        var pos = 0;
        var curr = head;

        while (curr != null) {
            if (curr.id != id) {
                pos++;
            } else {
                return pos;
            }
            curr = curr.next;
        }
        return -1;
    }

    public void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.println(current.id + "=> null");
            } else {
                System.out.print(current.id + "=>");
            }
            current = current.next;
        }
    }
}
