class Queue {
  int[] arr;
  int front;
  int rare;
  int capacity;

  public Queue(int size) {
    arr = new int[size];
    capacity = size;
    front = 0;
    rare = -1;
  }

  void enqueue(int data) {
    if (isFull()) {
      System.out.println("Queue is Full");
      return;
    }
    arr[++rare] = data;
  }


  int dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return -1;
    }
    int ele = arr[front++];
    if (front > rare) {
      front = 0;
      rare = -1;
    }
    return ele;
  }

  int peek() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return -1;
    }
    return arr[front];
  }

  boolean isEmpty() {
    return rare == -1;
  }

  boolean isFull() {
    return rare == capacity - 1;
  }
}

public class QueueUsingArr {
  public static void main(String[] args) {
    Queue q = new Queue(5);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);

    System.out.println(q.peek());
    System.out.println(q.dequeue());
  }
}
