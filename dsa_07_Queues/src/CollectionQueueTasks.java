import java.util.*;

public class CollectionQueueTasks {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

        Deque<Integer> q = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(q);
        int k = 4;
        System.out.println(reverse(q, k));
    }

    private static Queue<Integer> reverse(Deque<Integer> q, int k) {

        LinkedList<Integer> stack = new LinkedList<>();

        int i = 1;
        while (i <= k) {
            stack.addFirst(q.pop());
            i++;
        }
        stack.add(q.pop());
        return stack;
    }
}
