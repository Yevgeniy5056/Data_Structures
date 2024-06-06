import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsQueueProblem {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < 6; i++) {
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println(reverseFirstK(queue, 3));
    }

    static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
        return queue;
    }
}
