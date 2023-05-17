import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        Predicate<String> startsWithUpperCaseLetter = word -> Character.isUpperCase(word.charAt(0));

        List<String> wordsWithUpperCaseLetter = Arrays.stream(words).filter(startsWithUpperCaseLetter).collect(Collectors.toList());
        System.out.println(wordsWithUpperCaseLetter.size());

        wordsWithUpperCaseLetter.stream().forEach(e -> System.out.println(e));

// for(int i = 0; i < words.length; i++){
// if(Character.isUpperCase(words[i].charAt(0))){
// wordsWithUpperCaseLetter.add(words[i]);
// }
// }
//
// System.out.println(wordsWithUpperCaseLetter.size());
// for(int i = 0; i < wordsWithUpperCaseLetter.size(); i++){
// System.out.println(wordsWithUpperCaseLetter.get(i));
// }
    }
}