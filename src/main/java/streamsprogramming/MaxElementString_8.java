package streamsprogramming;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class MaxElementString_8 {
    public static void main(String[] args) {
            List<String> strings = Arrays.asList("apple", "orange", "banana", "grape", "kiwi");
            Optional<String> maxElement = strings.stream().max(String::compareTo);
            System.out.println(maxElement.isPresent() ? "Maximum element: " + maxElement.get() : "List is empty.");
        }
    }
