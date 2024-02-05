package strings;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1:");
        String str1 = sc.next();
        System.out.print("Enter String2:");
        String str2 = sc.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int n1 = str1.length();
        int n2 = str2.length();
        if (n1 == n2) {
            char[] str1char = str1.toCharArray();
            char[] str2char = str2.toCharArray();
            Arrays.sort(str1char);
            Arrays.sort(str2char);
            boolean result =  Arrays.equals(str1char, str2char);
            if (result) {
                System.out.println("The two strings are anagram");
            }
            else{
                System.out.println("String are not anagrams");
            }
        }
        else
            System.out.println("Strings are not anagrams");

    }
}
