package additionalassignments;
import java.util.Scanner;
public class Palindrome {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            }
            else {
                System.out.println(number + " is not a palindrome.");
            }

            scanner.close();
        }

        public static boolean isPalindrome(int number) {
            int temp = number;
            int rev = 0;

            while (number > 0) {
                int rem = number % 10;
                rev = rev * 10 + rem;
                number /= 10;
            }

            return temp == rev;
        }
    }

