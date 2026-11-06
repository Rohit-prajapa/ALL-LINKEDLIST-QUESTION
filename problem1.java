

public class problem1 {
  public static void main(String[] args) {
    String s = "cadbzabcd";
    int maxlength = 0;
    for (int i = 0; i < s.length(); i++) {
      int[] hash = new int[256];
      for (int j = i; j < s.length(); j++) {
        if (hash[s.charAt(j)]==1)
          break;
       int length = j - i + 1;
       maxlength = Math.max(maxlength, length);
       hash[s.charAt(j)] = 1;
      }
    }
    System.out.println(maxlength);
  }
}
