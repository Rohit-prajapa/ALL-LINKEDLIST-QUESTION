class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next=null;
  }
}
public class ArrToLL {
  public static Node convertArrayToLL(int[] arr) {
    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = mover.next;
    }
    return head;
  }

  public static void print(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
}
  public static int lengthLL(Node head) {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      count++;
    }
    return count;
  }

  public static boolean Search(Node head, int target) {
    Node temp = head;
    while (temp != null) {
      if (temp.data == target)
        return true;
      temp = temp.next;
    }
    return false;
  }

  public static Node RemoveHead(Node head) {
    if (head == null)
      return head;
    Node temp = head;
    head = head.next;
    return head;
  }

  public static Node removeTail(Node head) {
    if (head == null || head.next == null) {
      return null;
    }
    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;

    return head;
  }

  public static Node RemoveAtkth(Node head, int k) {
    int count = 0;
    Node temp = head;
    Node prev = null;
    if (head == null)
      return head;

    if (k == 1) {
      head = head.next;
      return head;
    }

    while (temp != null) {
      count++;
      if (count == k) {
        prev.next = prev.next.next;
        break;
      }
      prev = temp;
      temp = temp.next;
    }
    return head;
  }

  public static Node RemoveEle(Node head, int ele) {
    Node temp = head;
    Node prev = null;
    if (head == null)
      return head;

    if (head.data == ele) {
      head = head.next;
      return head;
    }

    while (temp != null) {
      if (temp.data == ele) {
        prev.next = temp.next;
        break;
      }
      prev = temp;
      temp = temp.next;
    }
    return head;
  }

  public static Node insertHead(Node head, int val) {
    Node temp = new Node(val);
    temp.next = head;
    return temp;
  }

  public static Node insertAtlast(Node head, int val) {
    if (head == null) {
      return new Node(val);
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = new Node(val);
    return head;
  }

  public static Node insertAtkth(Node head, int ele, int k) {
    if (head == null) {
      if (k == 1) {
        return new Node(ele);
      } else {
        return head;
      }
    }

    if (k == 1) {
      Node temp = new Node(ele);
      temp.next = head;
      return temp;
    }

    int count = 0;
    Node temp = head;
    while (temp != null) {
      count++;
      if (count == k - 1) {
        Node temp1 = new Node(ele);
        temp1.next = temp.next;
        temp.next = temp1;
        break;
      }
      temp = temp.next;
    }
    return head;
  }

  public static Node insertAtBefourValue(Node head, int ele, int val) {
    if (head == null) {
      return null;
    }

    if (head.data==val) {
      Node temp = new Node(ele);
      temp.next = head;
      return temp;
    }
    Node temp = head;
    while (temp != null) {
      if (temp.next.data==val) {
        Node temp1 = new Node(ele);
        temp1.next = temp.next;
        temp.next = temp1;
        break;
      }
      temp = temp.next;
    }
    return head;
  }
public static void main(String[] args) {
  int[] arr = { 10, 20, 30, 40 };
  Node head = convertArrayToLL(arr);
  // Node temp = head;
  // while (temp != null) {
  //   System.out.println(temp.data);
  //   temp = temp.next;
  // }
  // System.out.println(lengthLL(head));


  // Node Head = RemoveHead(head);

  // print(Head);

  // Node Head = removeTail(head);

  // Node Head = RemoveAtkth(head, 5);
  // Node Head = insertHead(head, 80);
  // Node Head = insertAtlast(head, 76);
  Node Head = insertAtkth(head, 34, 5);
  print(Head);

}


}
