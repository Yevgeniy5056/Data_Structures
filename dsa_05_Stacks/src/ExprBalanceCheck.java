public class ExprBalanceCheck {

    public static void main(String[] args) {

        var expression = "(A*C) + ({V-M})";
        System.out.println(isBalancedCheck(expression));

    }

    public static boolean isBalancedCheck(String s) {

        CustomStack<Character> stack = new CustomStack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '(' && ch != '{' && ch != '[' && ch != ')' && ch != ']' && ch != '}') continue;
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()) return false;
            switch (ch) {
                case ')':
                    if (stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.pop() != '{') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
