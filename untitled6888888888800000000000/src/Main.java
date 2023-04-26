import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers= (List<Integer>) Arrays.stream(scanner.nextLine().split(", "));

//        String[] input = scanner.nextLine().split(", ");
//        List<Integer> integers = new ArrayList<>();
//        for (int i = 0; i < input.length; i++) {
//            integers.add(Integer.parseInt(input[i]));
//        }
        integers.removeIf(element -> element % 2 != 0);
        integers.forEach(element -> System.out.print(element+" "));
        integers.sort(( x, y) -> x.compareTo(y));
        System.out.println();
        integers.forEach(element -> System.out.print(element+" "));

//        for (int i = 0; i < integers.size(); i++) {
//            if(integers.get(i) % 2 == 0){
//                System.out.print(integers.get(i) + " ");
//            }
//        }
//
//        Collections.sort(integers);
//
//        for (int i = 0; i < integers.size(); i++) {
//            if(integers.get(i) % 2 == 0){
//                System.out.print(integers.get(i) + " ");
//            }
//        }
//    }

    }
}
