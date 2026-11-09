
import java.util.Stack;

public class InfixToPrefix{

    static int priority(char ch) {
        switch (ch) {
            case '^':
                return 3;

            case '*':
            case '/':
                return 2;

            case '+':
            case '-':
                return 1;

            default:
                return -1;
        }
    }

    static String infixToPostfix(String str) {

        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {
                st.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }

                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            // Operator
            else {
                while (!st.isEmpty() &&
                       st.peek() != '(' &&
                       (priority(ch) < priority(st.peek()) ||
                       (priority(ch) == priority(st.peek()) && ch == '^'))) {

                    ans.append(st.pop());
                }

                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    static String infixToPrefix(String str) {

        // Step 1: Reverse expression
        StringBuilder reversed = new StringBuilder(str).reverse();

        // Step 2: Swap brackets
        for (int i = 0; i < reversed.length(); i++) {

            if (reversed.charAt(i) == '(') {
                reversed.setCharAt(i, ')');
            }
            else if (reversed.charAt(i) == ')') {
                reversed.setCharAt(i, '(');
            }
        }

        // Step 3: Convert to postfix
        String postfix = infixToPostfix(reversed.toString());

        // Step 4: Reverse postfix
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {

        String str = "a+b*(c^d-e)";

        System.out.println(infixToPrefix(str));
    }
}
