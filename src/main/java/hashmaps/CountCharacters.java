package hashmaps;
import java.util.HashMap;
import java.util.Map;
public class CountCharacters {
    public static void main(String[] args) {
            String inputString ="test string";

            // Create a HashMap to store character frequencies
            Map<Character, Integer> charFrequencyMap = new HashMap<>();

            // Process each character in the input string
            for (char c : inputString.toCharArray()) {
                // Ignore spaces
                if (c != ' ') {
                    // Update the frequency in the HashMap
                    charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
                }
            }

            // Print the distinct characters and their frequencies
            System.out.println("Distinct Characters and their Frequencies:");
            for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
                System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }
    }
