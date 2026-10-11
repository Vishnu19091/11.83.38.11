public class HashMapImplementation{
  private class Node{
    int key, value;
    Node next;

    Node(int key, int value){
      this.key = key;
      this.value = value;
    }
  }

  private final int SIZE = 10000;
  private Node[] nodes;

  public HashMapImplementation(){
    // creating nodes with given size
    nodes = new Node[SIZE];
  }

  private int getIndex(int key){
    return Integer.hashCode(key)%SIZE;
  }

  private Node find(Node head, int key){
    Node prev = null;
    // iterate until the given key is found
    while (head !=null && head.key != key){
      prev = head;
      head = head.next;
    }

    return prev;
  }

  public void put(int key, int value){
    int index = getIndex(key);

    // for empty node in the hashtable
    if(nodes[index] == null){
      nodes[index] = new Node(-1,-1);
    }

    // finding the insert position
    Node prev = find(nodes[index], key);
    if(prev.next == null){
      prev.next = new Node(key, value);
    }
    // if no value present in the bucket then place the value there
    else {
      prev.next.value = value;
    }
  }

  public int get(int key){
    int index = getIndex(key);
    if(nodes[index] == null) return -1;
    Node prev = find(nodes[index], key);
    if(prev.next == null) return -1;
    return prev.next.value;
  }

  public void remove(int key){
    int index = getIndex(key);
    if(nodes[index] == null) return;
    Node prev = find(nodes[index],key);
    if(prev.next == null) return;
    prev.next=prev.next.next;
  }

  public int size(){
    return SIZE;
  }

  public static void main(String[] args){
    HashMapImplementation hm = new HashMapImplementation();
    hm.put(1,102);
    hm.put(2,104);
    hm.put(3,106);
    hm.put(4,108);
    System.out.println(hm.size());
  }
}

