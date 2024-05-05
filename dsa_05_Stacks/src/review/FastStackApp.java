package review;

public class FastStackApp {

    public static void main(String[] args) {

        var stack = new FastStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        stack.push(5);
        System.out.println(stack.pop());
    }
}
