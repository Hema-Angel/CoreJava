package streamsprogramming;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class GroupByLength {
        public static void main(String[] args) {
            List<String> strings = Arrays.asList("apple", "banana", "kiwi", "grape", "orange");
            Map<Integer, List<String>> groupedByLength = strings.stream().collect(Collectors.groupingBy(String::length));
            System.out.println("Strings grouped by length: " + groupedByLength);
        }
    }

