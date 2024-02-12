package additionalassignments;
import java.util.HashMap;
public class UniqueWords {
    public static void main(String[] args) {
            String inputString = "java is a programming language java is also a platform";

            System.out.println("Original String: " + inputString);
            System.out.println("Number of Unique Words: " + countUniqueWords(inputString));
        }

        private static int countUniqueWords(String input) {
            HashMap<String, Integer> wordCountMap = new HashMap<>();

            // Split the string into words using whitespace as a delimiter
            String[] words = input.split("\\s+");

            // Count the occurrences of each word in the string
            for (String word : words) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }

            // Count the number of unique words
            int uniqueWordCount = 0;
            for (int count : wordCountMap.values()) {
                if (count == 1) {
                    uniqueWordCount++;
                }
            }

            return uniqueWordCount;
        }
    }
