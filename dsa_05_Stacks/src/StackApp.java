public class StackApp {

    public static void main(String[] args) {

        var stack = new CustomStack<Integer>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        stack.push(10);
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }

    }
}
