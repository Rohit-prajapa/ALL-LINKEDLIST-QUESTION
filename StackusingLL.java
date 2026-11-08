class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}
  class Stack {
    Node top;

    void push(int data) {
      Node temp = new Node(data);
      temp.next = top;
      top = temp;

      System.out.println(data+" inserted");
    }

    int pop() {
      if (top == null) {
        System.out.println("Stack Underflow");
        return -1;
      }
      int value = top.data;
      top = top.next;

      return value;
    }

    int peek() {
      if (top == null) {
        System.out.println("Stack Underflow");
        return -1;
      }
      return top.data;
    }

    boolean isEmpty() {
      return top == null;
    }

      void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class StackusingLL {
  public static void main(String[] args) {
    Stack st = new Stack();
    st.push(10);
    st.push(20);
    st.push(30);


    st.display();

    System.out.println(st.pop());
    System.out.println(st.peek());

    st.display();
  }
}
