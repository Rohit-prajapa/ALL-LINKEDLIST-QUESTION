
import java.util.Scanner;

class Node {
  int data;
  Node next;
  Node prev;

Node(int data) {
    this.data = data;
    this.next = next;
    this.prev = prev;
  }
}

public class DoublyLinkedlist {
  public static Node deleteTail(Node head) {
    if (head == null || head.next == null)
      return null;
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    Node prev = temp.prev;
    prev.next = null;
    temp.prev = null;
    return head;
  }
  public static Node deleteHead(Node head) {
    if(head==null || head.next==null) return null;
    Node prev = head;
    head = head.next;
    head.prev = null;
    prev.next = null;
    return head;
  }
  public static void print(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
  public static Node convertArrToDLL(int[] arr) {
    if (arr.length == 0)
      return null;

    Node head = new Node(arr[0]);
    Node prev = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      prev.next = temp;
      temp.prev = prev;
      prev = prev.next;
    }
    return head;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 10, 20, 30, 40 };
    Node Head = convertArrToDLL(arr);
    // Head=deleteHead(Head);
    Head = deleteTail(Head);
    print(Head);
  }
}
