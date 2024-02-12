package streamsprogramming;
import java.util.Comparator;
import java.util.Arrays;
public class CapitalizeFirstLetter {
        public static void main(String[] args) {
            String[] words = {"Rama", "balu", "suri", "naveen", "hema"};

            Arrays.stream(words)
                    .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);
        }
    }
