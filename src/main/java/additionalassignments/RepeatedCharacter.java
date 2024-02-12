package additionalassignments;
import java.util.HashMap;
public class RepeatedCharacter {
    public static void main(String[] args) {
            String inputString = "programming";

            System.out.println("Original String: " + inputString);
            System.out.println("Repeated Characters: " + findRepeatedCharacters(inputString));
        }

        private static String findRepeatedCharacters(String input) {
            HashMap<Character, Integer> charCountMap = new HashMap<>();
            StringBuilder repeatedChars = new StringBuilder();

            // Count the occurrences of each character in the string
            for (char c : input.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Check for characters with counts greater than 1
            for (char c : charCountMap.keySet()) {
                if (charCountMap.get(c) > 1) {
                    repeatedChars.append(c).append(" ");
                }
            }

            return repeatedChars.toString().trim();
        }
    }
