class Node{
  int data;
  Node next;

  Node(int data1, Node next1){
    this.data = data1;
    this.next = next1;
  }

  Node(int data1){
    this.data = data1;
    this.next = null;
  }
}
public class LL{

  // Time Complexity: O(n)
  private static Node convArr2LL(int[] arr){
    Node head = new Node(arr[0]);
    Node mover = head;

    for(int i=1;i<arr.length;i++){
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }

    return head;
  }
  
  public static void traverseLL(Node head){
    Node temp = head;

    while(temp != null){
      System.out.println(temp.data + " ");
      temp = temp.next;
    }
  }

  private static void length(Node head){
    int length = 0;
    Node temp = head;

    while(temp != null){
      length++;
      temp = temp.next;
    }

    System.out.println(length);
  }
  public static void searchLL(Node head, int val){
    Node temp = head;
    int position = 0;
    boolean found = false;

    while(temp != null && found == false){
      if (temp.data == val){
        found = true;
      }
      temp = temp.next;
      position++;
    }
    if(found == true){
      System.out.println("Element " + val + " found at " + position + " index");
    }
    else{
      System.out.println("Element Not Found!");
    }
  }
  private static Node remHead(Node head){
    if(head == null) return head;
    head = head.next;
    //in java the GC will remove the
    //unused memory allocation of the deleted head,
    //so that we don't have to manually delete it
    return head;
  }

  private static Node remTail(Node head){
    if(head == null || head.next == null){
      return null;
    }
    Node temp = head;
    while(temp.next.next != null){
      temp = temp.next;
    }
    temp.next = null;

    return head;
  }

  public static void main(String[] args){
    int[] arr ={1,0,12,11,22,33,14,35};
    Node head = convArr2LL(arr);
    head = remTail(head);
    traverseLL(head);
  }
}
