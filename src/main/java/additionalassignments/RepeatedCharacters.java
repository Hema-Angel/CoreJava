package additionalassignments;
import java.util.Scanner;
public class RepeatedCharacters {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            System.out.println("Repeated characters in the string:");
            printRepeatedCharacters(inputString);

            scanner.close();
        }

        public static void printRepeatedCharacters(String inputString) {
            int[] charFrequency = new int[256]; // Assuming ASCII character set

            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                charFrequency[currentChar]++;
            }

            for (int i = 0; i < charFrequency.length; i++) {
                if (charFrequency[i] > 1) {
                    System.out.println((char) i + " appears " + charFrequency[i] + " times");
                }
            }
        }
    }



