import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();

        people.put("12334353", "Ivan");
        people.put("12535456", "Kiro");
        people.put("12244563", "Motko");
        people.put("93849285", "Ivan");

        for(String key : people.keySet()){
            System.out.println(key + " - " + people.get(key));
        }


        //List<Integer> ints = new ArrayList<>();
        //ints.add(10);
        //ints.get(0);


    }
}
