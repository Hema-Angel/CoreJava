package sets;
import java.util.HashSet;
public class RemoveDuplicate {
    public static void main(String[] args) {
            String inputString = "abracadabra";
            String resultString = removeDuplicates(inputString);
            System.out.println("Original String: " + inputString);
            System.out.println("String after removing duplicates: " + resultString);
        }

        private static String removeDuplicates(String input) {
            HashSet<Character> uniqueChars = new HashSet<>();
            StringBuilder result = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (uniqueChars.add(c)) {
                    result.append(c);
                }
            }

            return result.toString();
        }
    }
