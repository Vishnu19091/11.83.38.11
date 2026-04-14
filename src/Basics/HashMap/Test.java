import java.util.Scanner;

public class Test{
  private class bucket{
    int key, value;
    bucket next;

    // constructor for the class bucket
    bucket(int key, int value){
      this.key = key;
      this.value = value;
    }
  }

  private final int capacity = 100000;
  private bucket[] buckets;

  // declaring public static scanner object,
  // which is accessible to all class's static methods
  public static Scanner sn = new Scanner(System.in);

  public Test(){
    // initializing the nodes to store the key & values
    buckets = new bucket[capacity];
  }

  private int getIndex(int key){
    return Integer.hashCode(key) % capacity;
  }

  private bucket find(bucket head, int key){
    // this prev holds a node at the end which will help to insert new node
    bucket prev = null;

    while(head != null && head.key != key){
      prev = head;
      head = head.next;
    }

    return prev;
  }

  public void put(){
    System.out.print("Enter Key to Insert: ");
    int key = sn.nextInt();
    
    System.out.print("Enter Value to Insert: ");
    int value = sn.nextInt();
    
    int index = getIndex(key);

    if(buckets[index] == null){
      buckets[index] = new bucket(-1,-1);
    }

    bucket prev = find(buckets[index], key);

    if(prev.next == null){
      prev.next = new bucket(key, value);
    }
    // here we are updating a certain key, value node
    // if and only if all the above condition fails
    else{
      prev.next.value = value;
    }

    System.out.println("Inserted: (" + key+ ", " + value + ")");
  }

  public int get(){
    System.out.print("Enter Key to get: ");
    int key = sn.nextInt();
    int index = getIndex(key);

    // if buckets/list is empty return -1
    if(buckets[index] == null) return -1;

    bucket prev = find(buckets[index], key);

    // if node is not present then return -1
    if(prev.next == null) return -1;
    return prev.next.value;
  }

  public void remove(){
    System.out.print("Enter Key to remove: ");
    int key = sn.nextInt();
    int index = getIndex(key);

    if(buckets[index] == null) return;
    bucket prev = find(buckets[index], key);

    if (prev.next == null) return;
    System.out.println("Removed: (" + prev.next.key + ", " + prev.next.value + ")");
    prev.next = prev.next.next;
  }

  // we have to traverse the hashmap and buckets as well
  public void traverse(){
    // todo
  }
  public static void main(String[] args){
    Test hm = new Test();

    hm.put();
    System.out.println(hm.get());
    hm.remove();
  }
}
