package strings;
 public class StringRotationCheck {
        public static void main(String[] args) {
            String str1 = "JavaJ2eeStrutsHibernate";
            String str2 = "StrutsHibernateJavaJ2ee";

            boolean isRotation = isRotation(str1, str2);

            System.out.println(isRotation);
        }

        public static boolean isRotation(String str1, String str2) {
            // Check if both strings are of equal length and not empty
            if (str1.length() != str2.length() || str1.length() == 0) {
                return false;
            }

            // Concatenate str1 with itself
            String concatenatedStr = str1 + str1;

            // Check if str2 is a substring of the concatenated string
            return concatenatedStr.contains(str2);
        }
    }
