package review;

public class UserLinkedList {

    User head;
    User tail;
    int size; // this will hold the number of elements in list

    public UserLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertInTheEnd(User node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void printNames() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            User curr = head;
            while (curr != null) {
                System.out.print(curr.name + " => ");
                curr = curr.next;
            }
        }
    }

    User getName(int index) {

        if (index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            User curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            return curr;
        }
    }
    void getName2(int index) {

        if (index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            User curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            System.out.println("index " + index + " is =" + curr.name);
        }
    }
}
