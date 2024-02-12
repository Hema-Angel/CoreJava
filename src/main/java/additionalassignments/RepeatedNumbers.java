package additionalassignments;
import java.util.HashMap;
public class RepeatedNumbers {
        public static void main(String[] args) {
            int inputNumber = 1223345;

            System.out.println("Original Number: " + inputNumber);
            System.out.println("Repeated Digits: " + findRepeatedDigits(inputNumber));
        }

        private static String findRepeatedDigits(int number) {
            String numberString = Integer.toString(number);
            HashMap<Character, Integer> digitCountMap = new HashMap<>();
            StringBuilder repeatedDigits = new StringBuilder();

            for (char digit : numberString.toCharArray()) {
                digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);
            }

            for (char digit : digitCountMap.keySet()) {
                if (digitCountMap.get(digit) > 1) {
                    repeatedDigits.append(digit).append(" ");
                }
            }

            return repeatedDigits.toString().trim();
        }
    }
