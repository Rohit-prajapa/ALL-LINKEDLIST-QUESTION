import java.util.Stack;

public class postfixtoinfix {
  public static String PostfixToInfix(String str) {
    Stack<String> st = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (Character.isLetterOrDigit(ch)) {
        st.push(String.valueOf(ch));
      } else {
        String t1 = st.pop();
        String t2 = st.pop();
        st.push("(" + t2 + ch + t1 + ")");
      }
    }
    return st.peek();
  }

  public static void main(String[] args) {
    String str = "AB-DE+F*/";
    System.out.println(PostfixToInfix(str));
  }
}
