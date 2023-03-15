import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//     String first="Ivan";
//     String second="Gosho";
//
//     int result = first.compareTo(second);
//        System.out.println(result);
//    }

//       Integer n=10;
//       Integer m=20;
//
//       int result = n.compareTo(m);
//        System.out.println(result);

        Car car1= new Car("Mercedes", "ML", 15);
        Car car2= new Car("Opel","Astra", 20);
        Car car3 = new Car("VW", "Golf", 10);

        int result = car1.compareTo(car2);
        System.out.println(result);

    }
}