import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Map<Integer, String>> people = new TreeMap<>();

        people.put("123456", new HashMap<>());
        people.get("123456").put(123456, "Ivan");
        people.put("456", new HashMap<>());
        people.get("456").put(456, "Stoyan");



        for(String key : people.keySet()){
           Map<Integer, String> innerMap = people.get(key);
           for(Integer integerKey : innerMap.keySet()){
               System.out.println(key + " - " +  integerKey + " - " + innerMap.get(integerKey));
           }
        }


        //List<Integer> ints = new ArrayList<>();
        //ints.add(10);
        //ints.get(0);


    }
}
