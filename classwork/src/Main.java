import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(20);
        ints.add(30);
        ints.add(1000);
        ints.add(200);

        int thousand = ints.get(3);
        
        for(Integer integer: ints)
        {
            System.out.println(integer);
        }
    }




}
