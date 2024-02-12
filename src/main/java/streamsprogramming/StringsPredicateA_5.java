package streamsprogramming;

import java.util.List;
import java.util.function.Predicate;
public class StringsPredicateA_5 {
        public static List<String> filterStrings(List<String> stringList, Predicate<String> predicate) {
            return stringList.stream()
                    .filter(predicate)
                    .toList();
        }
        public static void main(String[] args) {
            List<String> strings = List.of("Apple", "Banana", "Orange", "Avocado", "Grapes");

            Predicate<String> startsWithA = s -> s.startsWith("A");

            List<String> filteredStrings = filterStrings(strings, startsWithA);

            System.out.println("Strings starting with 'A': " + filteredStrings);
        }
    }
