import java.util.Stack;
public class InfixToPostFix {

    public static int priority(char ch) {
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

    public static String infixtopostfix(String str) {

        int i = 0;
        String ans = "";

        Stack<Character> st = new Stack<>();

        while (i < str.length()) {

            char ch = str.charAt(i);

            // Operand
            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) {

                ans += ch;
            }

            // Opening bracket
            else if (ch == '(') {
                st.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }

                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            // Operators
            else {

                while (!st.isEmpty() &&
                       st.peek() != '(' &&
                       (priority(ch) < priority(st.peek()) ||
                       (priority(ch) == priority(st.peek()) && ch != '^'))) {

                    ans += st.pop();
                }

                st.push(ch);
            }

            i++;
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {

        String str = "a+b*(c^d-e)";

        System.out.println(infixtopostfix(str));
    }
}
