import java.util.Scanner;

class Stack {
  int[] arr;
  int top;
  int capacity;

  public Stack(int size) {
    arr = new int[10];
    capacity = size;
    int top = -1;
  }

  public void push(int data) {
    if (isFull()) {
      System.out.println("Stack is Full");
      return;
    }
    arr[++top] = data;
  }


  int pop() {
    if (isEmpty()) {
      System.out.println("stack is underFlow");
      return -1;
    }
    return arr[top--];
  }

  int peek() {
    if (isEmpty()) {
      System.out.println("Stack is UnderFlow");
      return -1;
    }
    return arr[top];
  }
   boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    void display() {
      if (isEmpty()) {
        System.out.println("Stack is Empty");
        return;
      }
      for (int i = top; i >= 0; i--) {
        System.out.println(arr[top]);
      }
    }

}
public class StackUsingArr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Stack st = new Stack(10);
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);

    System.out.println(st.pop());
    System.out.println(st.peek());

  }
}
