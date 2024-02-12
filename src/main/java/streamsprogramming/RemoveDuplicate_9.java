package streamsprogramming;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate_9 {
    public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 1);

            List<Integer> distinctNumbers = numbers.stream()
                    .distinct()
                    .collect(Collectors.toList());

            System.out.println("List after removing duplicates: " + distinctNumbers);
        }
    }

