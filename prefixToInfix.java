import java.util.Stack;
public class prefixToInfix {
  public static String PrefixToInfix(String str) {
    Stack<String> st = new Stack();
    for (int i = str.length() - 1; i >= 0; i--) {
      char ch = str.charAt(i);
       if (Character.isLetterOrDigit(ch)) {
         st.push(String.valueOf(ch));
      } else {
        String t1 = st.pop();
        String t2 = st.pop();
        st.push("(" + t1 + ch + t2 + ")");
      }
    }
    return st.peek();
  }
  public static void main(String[] args) {
    String str = "*+pq-mn";
    System.out.println(PrefixToInfix(str));
  }
}
