import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(12);
        ints.add(13);
        String path = "C:\\Users\\KGDimitrov19\\Documents>\\txt.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(ints);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        List<Integer> deseriallizedInts = (List<Integer>) objectInputStream.readObject();
        for (int i = 0; i < deseriallizedInts.size(); i++) {
            System.out.println(deseriallizedInts.get(i));
        }
    }
}

