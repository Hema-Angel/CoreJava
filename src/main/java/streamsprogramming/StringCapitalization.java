package streamsprogramming;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Comparator;

public class StringCapitalization {
    public static void main(String[] args) {
        String[] inputArray = {"apple", "banana", "orange", "grape"};

        // Capitalize the first letter of each string using Java streams
        String[] capitalizedArray = Arrays.stream(inputArray)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .toArray(String[]::new);

        // Print the capitalized strings
        System.out.println("Capitalized Strings:");
        Arrays.stream(capitalizedArray).forEach(System.out::println);

        // Sort the strings in alphabetical order using Java streams
        String[] sortedArray = Arrays.stream(capitalizedArray)
                .sorted(Comparator.naturalOrder())
                .toArray(String[]::new);

        // Print the sorted strings
        System.out.println("\nStrings in Alphabetical Order:");
        Arrays.stream(sortedArray).forEach(System.out::println);
    }
}

