import java.util.HashMap; // import Hashmap Class
import java.util.Scanner;

public class MyHashmap{
  
  static void SimulateHashMap(){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter no.of inputs to give in hashTable(Integer): ");
    int nipts = sn.nextInt();
    HashMap<Integer,Integer> hm = new HashMap<>();

    for(int i =0; i < nipts; i++){
      System.out.print((i+1) + ". Enter Key: ");
      int key = sn.nextInt();
      System.out.println((i+1) + ". Enter Value: ");
      int value = sn.nextInt();
      hm.put(key, value);
    }
    
    System.out.println("----------HASHMAP----------");
    System.out.println(hm);
    sn.close();
  }
  
  public static void main(String[] args){
    // creating hashmap object instance
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // to add items in hashmap
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Delhi");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    capitalCities.put("USA", "Washington DC");

    //SimulateHashMap();
    // to access a value from a hashmap, use its key value to access
    // else it will return null
    // System.out.println(capitalCities.get("UK"));
    System.out.println(capitalCities instanceof HashMap);

    // using for-each loop to iterate the map interface
    // and to get keys use Map.entry()
    // for (HashMap.Entry mapElement : capitalCities.entrySet()){
    //  System.out.println("Key: " + mapElement.getKey() + ", Value: " + mapElement.getValue());
    // }
    //System.out.println(capitalCities.entrySet());
    //capitalCities.clear();
    //System.out.println(capitalCities.isEmpty());
    //System.out.println("Contains key: "+capitalCities.containsKey("Norway"));
    //System.out.println("Contains Value: "+capitalCities.containsValue("Oslo"));
    //System.out.println("Size: "+capitalCities.size());
    //System.out.println("Key Set: "+capitalCities.keySet());
    //System.out.println("Values: "+capitalCities.values());

  }
}
