package strings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        String inputSentence = "Java J2EE Reverse Me";
        String outputSentence = reverseWords(inputSentence);
        System.out.println(outputSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
