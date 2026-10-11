import java.util.Hashtable;
public class MyHashTable{
  public static void main(String[] args){
    Hashtable<Integer, String> ht = new Hashtable<Integer, String>(10, 0.75f);

    ht.put(987, "SpongeBob");
    ht.put(878, "PatricStar");
    ht.put(123, "TheKekado");
    ht.put(221, "TheBlavikan");
    ht.put(222, "TheBlavikan");
    ht.put(223, "TheBlavikan");
    ht.put(224, "TheBlavikan");
    ht.put(225, "TheBlavikan");
    ht.put(226, "TheBlavikan");
    ht.put(227, "TheBlavikan");

    // returns total elements occupied space inside hashTable
    int size = ht.size();

    // use for each loop to iterate HashTable
    // Syntax reference: for (<data_type> <element_Name>: array/String/<any_iterable_variable>)
    System.out.println("Size of the HashTable: " + size);
    for(Integer key : ht.keySet()){
      System.out.println("Hash: " + key.hashCode() % size + ", key: " + key + ", Value: " + ht.get(key));
    }
  }
}
