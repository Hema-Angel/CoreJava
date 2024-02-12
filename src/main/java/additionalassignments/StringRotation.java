package additionalassignments;

public class StringRotation {
        public static void main(String[] args) {
            String str1 = "abcd";
            String str2 = "cdab";

            if (isRotation(str1, str2)) {
                System.out.println(str2 + " is a rotation of " + str1);
            } else {
                System.out.println(str2 + " is not a rotation of " + str1);
            }
        }

        private static boolean isRotation(String str1, String str2) {
            // Check if lengths are equal and not zero
            if (str1.length() != str2.length() || str1.length() == 0) {
                return false;
            }

            // Concatenate str1 with itself
            String concatenated = str1 + str1;

            // Check if str2 is a substring of the concatenated string
            return concatenated.contains(str2);
        }
    }
