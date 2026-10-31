class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next=null;
  }
};
public class Linkedlist{
public static Node convertArrtoLL(int[] arr){

  Node head=new Node(arr[0]);
  Node mover=head;
  for(int i=1; i<arr.length; i++){
    Node temp=new Node(arr[i]);
    mover.next=temp;
    mover=mover.next;
  }
  return head;
}
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    Node head = convertArrtoLL(arr);
   System.out.println(head.data);
  }
}
