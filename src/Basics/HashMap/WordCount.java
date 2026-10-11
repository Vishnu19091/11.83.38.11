import java.util.HashMap;
import java.util.TreeMap;

public class WordCount{
  static HashMap<String, Integer> countFrequencyM1(String input){
    HashMap<String, Integer> freq = new HashMap<String, Integer>();
    String[] words = input.split(" ");

    for(String word : words){
      Integer count= freq.get(word);

      if (count == null){
        freq.put(word, 1);
      }
      else {
        freq.put(word, count + 1);
      }
    }

    return freq;
  }

  static HashMap<String, Integer> countFreqM2(String input){
    input = input.toLowerCase();
    String[] words = input.split(" ");
    HashMap<String, Integer> freq = new HashMap<String, Integer>();

    for(String word : words){
      if(freq.containsKey(word)){
        freq.put(word, freq.get(word) + 1);
      }
      else{
        freq.put(word, 1);
      }
    }
    return freq;
  }

  static TreeMap<String, Integer> sortMap(HashMap<String, Integer> hm){
    TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(hm);

    return sortedMap;
  }
  public static void main(String[] args){
    HashMap<String, Integer> res = countFreqM2("Hello I am Vishnu and i am from TN");
    System.out.println(sortMap(res));
  }
}
