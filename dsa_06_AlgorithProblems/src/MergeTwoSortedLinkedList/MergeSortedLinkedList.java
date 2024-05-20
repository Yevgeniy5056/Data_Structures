package MergeTwoSortedLinkedList;

public class MergeSortedLinkedList {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + " " + next;
        }
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head1.next = node2;
        node2.next = node4;
        node4.next = null;

        head2.next = node3;
        node3.next = node5;
        node5.next = null;

        System.out.println(merge(head1, head2));
    }

    private static ListNode merge(ListNode head1, ListNode head2) {

        ListNode dummy = new ListNode();
        ListNode prev = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                prev.next = head1;
                head1 = head1.next;
            } else {
                prev.next = head2;
                head2 = head2.next;
            }
            prev = prev.next;
        }
        if (head1 == null) prev.next = head2;
        else prev.next = head1;
        return dummy.next;
    }
}